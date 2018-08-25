package cn.jx.cart.model;

import cn.jx.common.model.Base;

public class Cart extends Base {
    /** */
    private Integer uuid;

    /** */
    private Integer customerUuid;

    /** */
    private Integer goodsUuid;

    /** */
    private Integer buyNum;

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

    public Integer getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(Integer goodsUuid) {
        this.goodsUuid = goodsUuid;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", customerUuid=").append(customerUuid);
        sb.append(", goodsUuid=").append(goodsUuid);
        sb.append(", buyNum=").append(buyNum);
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
        Cart other = (Cart) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCustomerUuid() == null ? other.getCustomerUuid() == null : this.getCustomerUuid().equals(other.getCustomerUuid()))
            && (this.getGoodsUuid() == null ? other.getGoodsUuid() == null : this.getGoodsUuid().equals(other.getGoodsUuid()))
            && (this.getBuyNum() == null ? other.getBuyNum() == null : this.getBuyNum().equals(other.getBuyNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getCustomerUuid() == null) ? 0 : getCustomerUuid().hashCode());
        result = prime * result + ((getGoodsUuid() == null) ? 0 : getGoodsUuid().hashCode());
        result = prime * result + ((getBuyNum() == null) ? 0 : getBuyNum().hashCode());
        return result;
    }
}