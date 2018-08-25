package cn.jx.cart.dao;

import cn.jx.cart.model.Cart;
import cn.jx.common.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends BaseDao<Cart,Cart> {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    @Override
    List<Cart> getByConditionPage(Cart cart);
}