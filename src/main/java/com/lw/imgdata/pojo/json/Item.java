package com.lw.imgdata.pojo.json;

/**
 * Created by asus on 2018/1/18.
 */
public class Item {

     private String code;
     private Double auditMoney;
     private Double applyMoney;
     private String schemeCostType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getAuditMoney() {
        return auditMoney;
    }

    public void setAuditMoney(Double auditMoney) {
        this.auditMoney = auditMoney;
    }

    public Double getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(Double applyMoney) {
        this.applyMoney = applyMoney;
    }

    public String getSchemeCostType() {
        return schemeCostType;
    }

    public void setSchemeCostType(String schemeCostType) {
        this.schemeCostType = schemeCostType;
    }

    public Item(String code, Double auditMoney, Double applyMoney, String schemeCostType) {
        this.code = code;
        this.auditMoney = auditMoney;
        this.applyMoney = applyMoney;
        this.schemeCostType = schemeCostType;
    }

    public Item() {
        super();
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", auditMoney=" + auditMoney +
                ", applyMoney=" + applyMoney +
                ", schemeCostType='" + schemeCostType + '\'' +
                '}';
    }
}
