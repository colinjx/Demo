package cn.jx.customer.servise;

import cn.jx.common.service.BaseService;
import cn.jx.customer.dao.CustomerDao;
import cn.jx.customer.model.Customer;
import cn.jx.customer.model.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerService extends BaseService<Customer,CustomerQueryModel> implements ICustomerService {

	@Autowired
	private CustomerDao mapper ;

	@Autowired
	private void setDao(){
		super.setDao(mapper);
	}

    private void setDao(CustomerDao dao){
        super.setDao(mapper);
    }

}
