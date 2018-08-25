package cn.jx.Order.servise;

import cn.jx.Order.dao.OrderDao;
import cn.jx.Order.model.Order;
import cn.jx.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
@Transactional
public class OrderService extends BaseService<Order,Order> implements IOrderService {

	@Autowired
	private OrderDao dao ;

	@Autowired
	private void setDao(){
		super.setDao(dao);
	}

    private void setDao(OrderDao dao){
        super.setDao(dao);
    }

}
