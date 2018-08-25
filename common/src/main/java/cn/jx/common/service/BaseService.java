package cn.jx.common.service;

import cn.jx.common.model.Base;
import cn.jx.common.dao.BaseDao;
import cn.jx.common.pageutil.Page;

import java.util.List;

public class BaseService<M,QM extends Base>  implements IBaseService<M,QM>{

    private BaseDao dao = null;


    public void setDao(BaseDao dao){
        this.dao = dao;
    }


    @Override
    public void insert(M m) {
        dao.insert(m);
    }

    @Override
    public void updateByPrimaryKey(M m) {
        dao.updateByPrimaryKey(m);
    }

    @Override
    public void deleteByPrimaryKey(Integer primaryKey) {
        dao.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public M getByPrimaryKey(Integer primaryKey) {
        return (M) dao.selectByPrimaryKey(primaryKey);
    }


    @Override
    public Page<M> getByConditionPage(QM qm) {
        List<M> list = dao.getByConditionPage(qm);
        qm.getPage().setResult(list);
        return qm.getPage();
    }


}
