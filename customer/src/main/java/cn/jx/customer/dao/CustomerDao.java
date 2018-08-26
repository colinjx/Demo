package cn.jx.customer.dao;

import cn.jx.common.dao.BaseDao;
import cn.jx.customer.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends BaseDao {

    Customer getByCustomerId(String customerId);

}