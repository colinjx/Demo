package cn.jx.cart.servise;

import cn.jx.cart.dao.CartDao;
import cn.jx.cart.model.Cart;
import cn.jx.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
@Transactional
public class CartService extends BaseService<Cart,Cart> implements ICartService {

	@Autowired
	private CartDao dao ;

	@Autowired
	private void setDao(){
		super.setDao(dao);
	}

    private void setDao(CartDao dao){
        super.setDao(dao);
    }

}
