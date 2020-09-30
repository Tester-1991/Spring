import com.shiyan.spring03.anno.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_anno.xml")
public class SpringTest2 {

    @Autowired
    private UserDao userDao;

    @Test
    public void test1() {
        userDao.save();
    }
}
