package cn.jx.common.service;

import cn.jx.common.model.Base;
import cn.jx.common.dao.BaseMapper;
import cn.jx.common.pageutil.Page;

import java.util.List;

public class BaseService<M,QM extends Base>  implements IBaseService<M,QM>{

    private BaseMapper mapper = null;


    public void setMapper(BaseMapper mapper){
        this.mapper = mapper;
    }


    @Override
    public void insert(M m) {
        mapper.insert(m);
    }

    @Override
    public void updateByPrimaryKey(M m) {
        mapper.updateByPrimaryKey(m);
    }

    @Override
    public void deleteByPrimaryKey(Integer primaryKey) {
        mapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public M getByPrimaryKey(Integer primaryKey) {
        return (M) mapper.selectByPrimaryKey(primaryKey);
    }


    @Override
    public Page<M> getByConditionPage(QM qm) {
        List<M> list = mapper.getByConditionPage(qm);
        qm.getPage().setResult(list);
        return qm.getPage();
    }


}
