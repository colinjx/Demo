package cn.jx.customer.servise;

import cn.jx.common.service.BaseService;
import cn.jx.customer.dao.CustomerDao;
import cn.jx.customer.entity.CustomerEntity;
import cn.jx.customer.entity.CustomerQueryModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerService extends BaseService<CustomerEntity,CustomerQueryModel> implements ICustomerService {




    private void setDao( CustomerDao dao){
        super.setDao(dao);
    }

}
