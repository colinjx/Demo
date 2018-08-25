package cn.jx.Order.model;

import cn.jx.common.model.Base;

public class Order extends Base {
    private Integer uuid;

    private Integer customerUuid;

    private String orderTime;

    private Double totalMoney;

    private Double saveMoney;

    private Integer state;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(Integer customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Double getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(Double saveMoney) {
        this.saveMoney = saveMoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", customerUuid=").append(customerUuid);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", totalMoney=").append(totalMoney);
        sb.append(", saveMoney=").append(saveMoney);
        sb.append(", state=").append(state);
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
        Order other = (Order) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCustomerUuid() == null ? other.getCustomerUuid() == null : this.getCustomerUuid().equals(other.getCustomerUuid()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getTotalMoney() == null ? other.getTotalMoney() == null : this.getTotalMoney().equals(other.getTotalMoney()))
            && (this.getSaveMoney() == null ? other.getSaveMoney() == null : this.getSaveMoney().equals(other.getSaveMoney()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getCustomerUuid() == null) ? 0 : getCustomerUuid().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getTotalMoney() == null) ? 0 : getTotalMoney().hashCode());
        result = prime * result + ((getSaveMoney() == null) ? 0 : getSaveMoney().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}