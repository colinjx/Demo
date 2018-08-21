package cn.jx.customer.entity;

import cn.jx.common.Entity.BaseEntity;

public class Customer extends BaseEntity{
    private Integer uuid;

    private String customerId;

    private String pwd;

    private String showName;

    private String trueName;

    private String registerTime;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", customerId=").append(customerId);
        sb.append(", pwd=").append(pwd);
        sb.append(", showName=").append(showName);
        sb.append(", trueName=").append(trueName);
        sb.append(", registerTime=").append(registerTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getShowName() == null ? other.getShowName() == null : this.getShowName().equals(other.getShowName()))
            && (this.getTrueName() == null ? other.getTrueName() == null : this.getTrueName().equals(other.getTrueName()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getShowName() == null) ? 0 : getShowName().hashCode());
        result = prime * result + ((getTrueName() == null) ? 0 : getTrueName().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        return result;
    }
}