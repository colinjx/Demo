package cn.jx.common.model;

import cn.jx.common.pageutil.Page;

import java.io.Serializable;

public class Base<M> implements Serializable {
    private Page<M> page= new Page<M>();

    public Page<M> getPage() {
        return page;
    }

    public void setPage(Page<M> page) {
        this.page = page;
    }


}
