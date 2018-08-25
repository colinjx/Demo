package cn.jx.Order.dao;
import cn.jx.Order.model.Order;
import cn.jx.common.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends BaseDao<Order,Order> {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);


    @Override
    List<Order> getByConditionPage(Order order);
}