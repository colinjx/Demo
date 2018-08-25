
import cn.jx.goods.dao.GoodsDao;
import cn.jx.goods.model.Goods;
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
    private GoodsDao dao ;

    @Test
    public void main() {

        Goods goods = new Goods();
        goods.setName("111");
        dao.insert(goods);


    }
}
