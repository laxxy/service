/*import com.dev.web.Configuration.HibernateConfig;
import com.dev.web.Entity.User;
import com.dev.web.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HibernateConfig.class)
@WebAppConfiguration
public class TestGet {

    @Autowired
    private UserService userService;

    @Test
    public void testGet() {
        User userByEmail = userService.getUserByEmail("asd@asd.com");
        System.out.println(userByEmail.getEmail() + " <<>><<>><<>>");
    }
}
*/