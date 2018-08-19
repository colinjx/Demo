package cn.jx.common.Entity;

import cn.jx.common.pageutil.Page;

public class BaseEntity<M> {
    private Page<M> page= new Page<M>();

    public Page<M> getPage() {
        return page;
    }

    public void setPage(Page<M> page) {
        this.page = page;
    }


}
