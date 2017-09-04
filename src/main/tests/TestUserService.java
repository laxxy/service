import com.dev.web.Configuration.HibernateConfig;
import com.dev.web.Entity.User;
import com.dev.web.Service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by cosxt on 9/4/2017.
 */
public class TestUserService {

    @Test
    public void testCreate() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HibernateConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user = new User();
        user
                .setEmail("asd@asd.com")
                .setPassword("123456789");

        userService.add(user);


        List<User> users = userService.listUsers();
        System.out.println(users.size() + "<<<<<<<<<<<<<<<<<<<<<");

        context.close();
    }
}
