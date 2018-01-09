package com.dev.web.core;

import com.dev.web.Entity.UserRequest;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.mapper.ObjectMapperType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.ResponseBodyExtractionOptions;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by cosxt on 10/9/2017.
 */
@Component
public class UserQueue {


    public UserQueue() {

    }

    public void startQueue(RequestContext requestContext, UserRequest userRequest) {

        final String desiredTrain = userRequest.getDesiredTrain();
        String desiredClass = userRequest.getDesiredClass()[0];

        while (true) {

            JsonPath execute = execute(requestContext, userRequest);

                /*if (execute.get("value").toString().contains("\"error\":true")) {
                    System.out.println("Interrupted!!");
                    break;
                }*/ //TODO >><<

            try {
                List<Object> value = execute.getList("value");

                Optional<Object> any = value.stream().filter(o -> o.toString().contains(desiredTrain)).findAny();
                if (any.isPresent()) {
                    String s = String.valueOf(any.get());
                    if (s.contains(String.format("id=%s", desiredClass))) {
                        System.out.println(s);
                        break;
                    }
                }
                Thread.sleep(5000);
            } catch (ClassCastException e) {
                System.out.println(execute.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Send request >>");
    }

}

    private JsonPath execute(RequestContext requestContext, UserRequest userRequest) {

        return given().when()
                .contentType(ContentType.URLENC)

                .request().header(new Header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:46.0) Gecko/20100101 Firefox/46.0"))
                .request().header(new Header("Accept-Language", "en-GB,en;q=0.5"))
                .request().header(new Header("GV-Ajax", "1"))
                .request().header(new Header("GV-Screen", "1920x1080"))
                .request().header(new Header("GV-Referer", "http://booking.uz.gov.ua/ru/"))
                .request().redirects().follow(false)
                .request().urlEncodingEnabled(true)
                //.log().body()
                .body(requestContext.generateQueueRequest(userRequest))
                .post(requestContext.getUrl())
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath();
    }
}
