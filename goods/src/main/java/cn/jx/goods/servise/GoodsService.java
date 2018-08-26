package cn.jx.goods.servise;

import cn.jx.common.service.BaseService;
import cn.jx.goods.dao.GoodsDao;
import cn.jx.goods.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
@Transactional
public class GoodsService extends BaseService<Goods,Goods> implements IGoodsService {

	@Autowired
	private GoodsDao dao ;

	@Autowired
	private void setDao(){
		super.setDao(dao);
	}

    private void setDao(GoodsDao dao){
        super.setDao(dao);
    }


}
