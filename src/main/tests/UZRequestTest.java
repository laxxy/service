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

    private static final String LVIV = "Львов";
    private static final String LVIV_ID = "2218000";
    private static final String KYIV = "Киев";
    private static final String KYIV_ID = "2200001";
    private static final String RIVNE = "Ровно";
    private static final String RIVNE_ID = "2218400";
    private static final String DATE_DEP = "27.10.2017";
    private static final String TRAIN = "097К";
    private static final String CLASS = "П";
    private static final String CLASS_2 = "K";

    @Before
    public void prepare() {
        userRequest = new UserRequest();
        userRequest.setStation_from(KYIV);
        userRequest.setStation_till(RIVNE);
        userRequest.setDateDep(DATE_DEP);
        userRequest.setDesiredTrain(TRAIN);
        userRequest.setDesiredClass(CLASS);
        userRequest.setStationIdFrom(KYIV_ID);
        userRequest.setStationIdTo(RIVNE_ID);

    }

    @Test
    public void testGetAll() throws MalformedURLException {
        RequestContext requestContext = new RequestContext();
        UserQueue userQueue = new UserQueue();

        userQueue.startQueue(requestContext, userRequest);
    }
}
