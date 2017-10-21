import com.dev.web.Entity.UserRequest;
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

    private final String LVIV = "Львов";
    private final String KYIV = "Киев";
    private final String DATE_DEP = "22.10.2017";
    private final String TRAIN = "743Л";
    private final String CLASS = "С2";

    @Before
    public void prepare() {
        userRequest = new UserRequest();
        userRequest.setStation_from(KYIV);
        userRequest.setStation_till(LVIV);
        userRequest.setDateDep(DATE_DEP);
        userRequest.setDesiredTrain(TRAIN);
        userRequest.setDesiredClass(CLASS);
    }

    @Test
    public void testGetAll() throws MalformedURLException {
        RequestContext requestContext = new RequestContext();
        UserQueue userQueue = new UserQueue();

        userQueue.startQueue(requestContext, userRequest);
    }
}
