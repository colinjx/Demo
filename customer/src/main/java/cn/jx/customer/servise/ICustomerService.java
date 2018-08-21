package cn.jx.customer.servise;

import cn.jx.common.service.IBaseService;
import cn.jx.customer.entity.Customer;
import cn.jx.customer.entity.CustomerQueryModel;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IBaseService<Customer,CustomerQueryModel> {

}
