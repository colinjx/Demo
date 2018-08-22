package cn.jx.common.model;

import cn.jx.common.pageutil.Page;

public class Base<M> {
    private Page<M> page= new Page<M>();

    public Page<M> getPage() {
        return page;
    }

    public void setPage(Page<M> page) {
        this.page = page;
    }


}
