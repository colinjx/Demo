package cn.jx.customer.servise;

import cn.jx.common.service.BaseService;
import cn.jx.customer.mapper.CustomerMapper;
import cn.jx.customer.entity.Customer;
import cn.jx.customer.entity.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerService extends BaseService<Customer,CustomerQueryModel> implements ICustomerService {

	@Autowired
	private CustomerMapper mapper ;

	@Autowired
	private void setDao(){
		super.setMapper(mapper);
	}

    private void setDao(CustomerMapper dao){
        super.setMapper(mapper);
    }

}
