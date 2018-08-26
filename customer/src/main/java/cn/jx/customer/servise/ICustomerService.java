package cn.jx.customer.servise;

import cn.jx.common.service.IBaseService;
import cn.jx.customer.model.Customer;


public interface ICustomerService extends IBaseService<Customer,Customer> {
    public Customer getByCustomerId(String customerId);
}
