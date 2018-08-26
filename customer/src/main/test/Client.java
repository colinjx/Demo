import cn.jx.common.pageutil.Page;
import cn.jx.customer.model.Customer;
import cn.jx.customer.servise.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-redis.xml"})
public class Client {

    @Autowired()
    private ICustomerService s ;


    @Test
    public void main() {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
//
//        Customer cm = new Customer();
//        cm.setCustomerId("c1");
//        cm.setPwd("c1");
//        cm.setRegisterTime("111");
//        cm.setShowName("colin");
////        System.out.println(s);
//        s.setDao(mapper);
        Customer cqm = new Customer();
        cqm.getPage().setNowPage(1);
        cqm.getPage().setPageShow(10);
        cqm.setCustomerId("1");
        Page<Customer> page= s.getByConditionPage(cqm);
        System.out.println(page);
        try {
            Thread.sleep(1000);
            System.out.println("====================================");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Page<Customer> page2= s.getByConditionPage(cqm);
        System.out.println(page2);
//        JedisUtils.getInstence();
//
//        System.out.println(JedisUtils.getJedis());

    }
}
