package cn.jx.store.servise;

import cn.jx.common.service.BaseService;
import cn.jx.store.dao.StoreDao;
import cn.jx.store.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
@Transactional
public class StoreService extends BaseService<Store,Store> implements IStoreService {

	@Autowired
	private StoreDao dao ;

	@Autowired
	private void setDao(){
		super.setDao(dao);
	}

    private void setDao(StoreDao dao){
        super.setDao(dao);
    }

}
