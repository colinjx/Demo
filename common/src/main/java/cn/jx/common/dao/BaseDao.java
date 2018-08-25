package cn.jx.common.dao;

import java.util.List;

public interface BaseDao<M,QM> {

    int deleteByPrimaryKey(Integer uuid);

    int insert(M m);

    int insertSelective(M m);

    M selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(M m);

    int updateByPrimaryKey(M m);

    List<M> getByConditionPage(QM qm);


}
