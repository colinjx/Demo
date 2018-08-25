import cn.jx.common.pageutil.Page;
import cn.jx.customer.model.Customer;
import cn.jx.customer.model.CustomerQueryModel;
import cn.jx.customer.dao.CustomerDao;
import cn.jx.customer.servise.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class Client {

    @Autowired()
    private CustomerService s ;

    @Autowired
    private CustomerDao mapper ;

    @Test

    public void main() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");

        Customer cm = new Customer();
        cm.setCustomerId("c1");
        cm.setPwd("c1");
        cm.setRegisterTime("111");
        cm.setShowName("colin");
//        System.out.println(s);
        s.setDao(mapper);
        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setNowPage(2);
        cqm.getPage().setPageShow(2);

        Page<Customer> page= s.getByConditionPage(cqm);
        System.out.println(page);
    }
}
