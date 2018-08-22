package cn.jx.common.model;

public class BaseWeb {
    private String queryJsonStr = "";
    private int nowPage = 1;
    private int PageShow = 0;

    public String getQueryJsonStr() {
        return queryJsonStr;
    }

    public void setQueryJsonStr(String queryJsonStr) {
        this.queryJsonStr = queryJsonStr;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getPageShow() {
        return PageShow;
    }

    public void setPageShow(int pageShow) {
        PageShow = pageShow;
    }

    @Override
    public String toString() {
        return "CustomerWeb{" +
                "queryJsonStr='" + queryJsonStr + '\'' +
                ", nowPage=" + nowPage +
                ", PageShow=" + PageShow +
                '}';
    }
}
