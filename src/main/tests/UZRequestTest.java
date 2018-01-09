import com.dev.web.Entity.UserRequest;
import com.dev.web.core.Constants;
import com.dev.web.core.RequestContext;
import com.dev.web.core.UserQueue;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * Created by cosxt on 10/21/2017.
 */
public class UZRequestTest {

    private UserRequest userRequest;

    @Before
    public void prepare() {
        userRequest = new UserRequest();
        userRequest.setStation_from(Constants.KOVEL);
        userRequest.setStation_till(Constants.KYIV);
        userRequest.setDateDep(Constants.DATE_DEP);
        userRequest.setDesiredTrain(Constants.TRAIN_098Л);
        userRequest.setDesiredClass(Constants.CLASS);
        userRequest.setStationIdFrom(Constants.KOVEL_ID);
        userRequest.setStationIdTo(Constants.KYIV_ID);

    }

    @Test
    public void testGetAll() throws MalformedURLException {
        RequestContext requestContext = new RequestContext();
        UserQueue userQueue = new UserQueue();

        userQueue.startQueue(requestContext, userRequest);
    }
}
