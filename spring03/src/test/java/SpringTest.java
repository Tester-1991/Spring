import com.shiyan.spring03.dao.UserDao;
import com.shiyan.spring03.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private UserDao userDaoImpl;

    @Test
    public void test1(){
        userDaoImpl.save();
    }
}
