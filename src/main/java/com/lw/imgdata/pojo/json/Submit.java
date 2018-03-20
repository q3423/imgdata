package com.lw.imgdata.pojo.json;

import java.util.List;

/**
 * Created by asus on 2018/1/18.
 */
public class Submit {
    private List<FormMessage> formAudit;
    private User business;
    private User audit;
    private Long startTime;
    private Long endTime;
    private List<Item> itemsList;
    private List<FormMessage> formBusiness;

    public List<FormMessage> getFormAudit() {
        return formAudit;
    }

    public void setFormAudit(List<FormMessage> formAudit) {
        this.formAudit = formAudit;
    }

    public User getBusiness() {
        return business;
    }

    public void setBusiness(User business) {
        this.business = business;
    }

    public User getAudit() {
        return audit;
    }

    public void setAudit(User audit) {
        this.audit = audit;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public List<FormMessage> getFormBusiness() {
        return formBusiness;
    }

    public void setFormBusiness(List<FormMessage> formBusiness) {
        this.formBusiness = formBusiness;
    }

    public Submit(List<FormMessage> formAudit, User business, User audit, Long startTime, Long endTime, List<Item> itemsList, List<FormMessage> formBusiness) {
        this.formAudit = formAudit;
        this.business = business;
        this.audit = audit;
        this.startTime = startTime;
        this.endTime = endTime;
        this.itemsList = itemsList;
        this.formBusiness = formBusiness;
    }

    public Submit() {
        super();
    }

    @Override
    public String toString() {
        return "Submit{" +
                "formAudit=" + formAudit +
                ", business=" + business +
                ", audit=" + audit +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", itemsList=" + itemsList +
                ", formBusiness=" + formBusiness +
                '}';
    }
}
