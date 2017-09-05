import com.dev.web.Configuration.HibernateConfig;
import com.dev.web.Entity.User;
import com.dev.web.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by cosxt on 9/4/2017.
 */
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HibernateConfig.class)
@WebAppConfiguration
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testCreate() {
        User user = new User();
        user
                .setEmail("asd@asd.com")
                .setPassword("123456789");

        userService.add(user);


        List<User> users = userService.listUsers();
        System.out.println(users.size() + "<<<<<<<<<<<<<<<<<<<<<");
    }
}
