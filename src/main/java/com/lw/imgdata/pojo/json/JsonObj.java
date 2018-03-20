package com.lw.imgdata.pojo.json;

import java.util.List;

/**
 * Created by asus on 2018/1/18.
 */
public class JsonObj {
    private CostType costType;
    private List<TacheHistory> tacheHistory;
    private TacheNow tacheNow;

    public CostType getCostType() {
        return costType;
    }

    public void setCostType(CostType costType) {
        this.costType = costType;
    }

    public List<TacheHistory> getTacheHistory() {
        return tacheHistory;
    }

    public void setTacheHistory(List<TacheHistory> tacheHistory) {
        this.tacheHistory = tacheHistory;
    }

    public TacheNow getTacheNow() {
        return tacheNow;
    }

    public void setTacheNow(TacheNow tacheNow) {
        this.tacheNow = tacheNow;
    }

    public JsonObj(CostType costType, List<TacheHistory> tacheHistory) {
        this.costType = costType;
        this.tacheHistory = tacheHistory;
    }

    public JsonObj() {
        super();
    }

    @Override
    public String toString() {
        return "JsonObj{" +
                "costType=" + costType +
                ", tacheHistory=" + tacheHistory +
                '}';
    }
}
