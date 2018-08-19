import cn.jx.common.pageutil.Page;
import cn.jx.customer.dao.CustomerDao;
import cn.jx.customer.entity.CustomerEntity;
import cn.jx.customer.entity.CustomerQueryModel;
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
    private  CustomerDao dao ;

    @Test

    public void main() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");

        CustomerEntity cm = new CustomerEntity();
        cm.setCustomerid("c1");
        cm.setPwd("c1");
        cm.setRegistertime("111");
        cm.setShowname("colin");
//        System.out.println(s);
        s.setDao(dao);
        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setNowPage(2);
        cqm.getPage().setPageShow(2);

        Page<CustomerEntity> page= s.getByConditionPage(cqm);
        System.out.println(page);
    }
}
