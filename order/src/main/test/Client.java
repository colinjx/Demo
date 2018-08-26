import cn.jx.common.util.redis.JedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class Client {




    @Test
    public void main() {
        JedisUtils.getInstence();
        System.out.println(JedisUtils.getJedis());
    }
}
