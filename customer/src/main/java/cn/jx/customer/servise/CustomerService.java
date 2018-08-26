package cn.jx.customer.servise;

import cn.jx.common.dao.BaseDao;
import cn.jx.common.pageutil.Page;
import cn.jx.common.service.BaseService;
import cn.jx.customer.dao.CustomerDao;
import cn.jx.customer.model.Customer;
import cn.jx.customer.model.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerService extends BaseService<Customer,Customer> implements ICustomerService {

	@Autowired
	private CustomerDao mapper ;

	@Autowired
	private void setDao(){
		super.setDao(mapper);
	}

    private void setDao(CustomerDao dao){
        super.setDao(mapper);
    }

	@Override
	public void setDao(BaseDao dao) {
		super.setDao(dao);
	}

    @CacheEvict(value= {"getByPrimaryKey","getByConditionPage"},allEntries=true)//清空缓存，allEntries变量表示所有对象的缓存都清除
	@Override
	public void insert(Customer customer) {
		super.insert(customer);
	}

    @CacheEvict(value= {"getByPrimaryKey","getByConditionPage"},allEntries=true)//清空缓存，allEntries变量表示所有对象的缓存都清除
	@Override
	public void updateByPrimaryKey(Customer customer) {
		super.updateByPrimaryKey(customer);
	}

    @CacheEvict(value= {"getByPrimaryKey","getByConditionPage"},allEntries=true)//清空缓存，allEntries变量表示所有对象的缓存都清除
	@Override
	public void deleteByPrimaryKey(Integer primaryKey) {
		super.deleteByPrimaryKey(primaryKey);
	}


    @Cacheable("getByPrimaryKey")
	@Override
	public Customer getByPrimaryKey(Integer primaryKey) {
		return super.getByPrimaryKey(primaryKey);
	}

    @Cacheable("getByConditionPage")
	@Override
	public Page<Customer> getByConditionPage(Customer customer) {

		return super.getByConditionPage(customer);
	}

    @Override
	@Cacheable("getByCustomerId")
    public Customer getByCustomerId(String customerId) {
        return mapper.getByCustomerId(customerId);
    }
}
