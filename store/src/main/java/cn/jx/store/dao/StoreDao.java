package cn.jx.store.dao;
import cn.jx.common.dao.BaseDao;
import cn.jx.store.model.Store;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreDao extends BaseDao<Store,Store> {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);

    @Override
    List<Store> getByConditionPage(Store store);
}