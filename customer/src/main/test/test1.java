import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test1
{
    @Autowired
    DruidDataSource dataSource;

    @Test
    public void test(){
        System.out.println(dataSource);
    }
}
