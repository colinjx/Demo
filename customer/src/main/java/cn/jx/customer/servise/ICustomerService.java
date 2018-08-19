package cn.jx.customer.servise;

import cn.jx.common.service.IBaseService;
import cn.jx.customer.entity.CustomerQueryModel;
import cn.jx.customer.entity.CustomerEntity;
import org.springframework.stereotype.Service;


public interface ICustomerService extends IBaseService<CustomerEntity,CustomerQueryModel> {

}
