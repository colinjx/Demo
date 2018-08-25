import cn.jx.Order.dao.OrderDao;
import cn.jx.Order.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class Client {


    @Autowired
    private OrderDao dao ;

    @Test
    public void main() {
        Order order = new Order();
        order.setCustomerUuid(111);
        order.setOrderTime("111");
        dao.insert(order);
    }
}
