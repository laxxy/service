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
        userRequest.setDateDep(Constants.DATE_DEP);
        userRequest.setDesiredTrain(Constants.TRAIN_806Ш);
        userRequest.setDesiredClass(Constants.CLASS_IC_C2);
        userRequest.setStationIdFrom(Constants.RIVNE_ID);
        userRequest.setStationIdTo(Constants.LVIV_ID);

    }

    @Test
    public void testGetAll() throws MalformedURLException {
        RequestContext requestContext = new RequestContext();
        UserQueue userQueue = new UserQueue();

        userQueue.startQueue(requestContext, userRequest);
    }
}
