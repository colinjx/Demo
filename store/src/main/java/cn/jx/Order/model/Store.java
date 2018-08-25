package cn.jx.Order.model;

public class Store {
    private Integer uuid;

    private Integer goodsUuid;

    private Integer storeNum;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(Integer goodsUuid) {
        this.goodsUuid = goodsUuid;
    }

    public Integer getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", goodsUuid=").append(goodsUuid);
        sb.append(", storeNum=").append(storeNum);
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
        Store other = (Store) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getGoodsUuid() == null ? other.getGoodsUuid() == null : this.getGoodsUuid().equals(other.getGoodsUuid()))
            && (this.getStoreNum() == null ? other.getStoreNum() == null : this.getStoreNum().equals(other.getStoreNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getGoodsUuid() == null) ? 0 : getGoodsUuid().hashCode());
        result = prime * result + ((getStoreNum() == null) ? 0 : getStoreNum().hashCode());
        return result;
    }
}