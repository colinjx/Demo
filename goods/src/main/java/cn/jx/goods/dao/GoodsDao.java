package cn.jx.goods.dao;

import cn.jx.common.dao.BaseDao;
import cn.jx.goods.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GoodsDao extends BaseDao <Goods,Goods>{
    int deleteByPrimaryKey(Integer uuid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    @Override
    List<Goods> getByConditionPage(Goods goods);
}