package cn.jx.common.service;

import cn.jx.common.pageutil.Page;

public interface IBaseService<M,QM> {

    void insert(M m);

    void updateByPrimaryKey(Integer primaryKey);

    void deleteByPrimaryKey(Integer primaryKey);

    M getByPrimaryKey(Integer primaryKey);

    Page<M> getByConditionPage(QM qm);
}
