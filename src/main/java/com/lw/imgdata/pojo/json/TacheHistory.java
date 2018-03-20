package com.lw.imgdata.pojo.json;

import java.util.List;

/**
 * Created by asus on 2018/1/18.
 */
public class TacheHistory {
    private List<FormMessage> formAudit;
    private List<Submit> submitList;
    private String name;
    private String businessName;
    private Integer jumpFlag;
    private List<FormMessage> formBusiness;
    private String auditName;

    public List<FormMessage> getFormAudit() {
        return formAudit;
    }

    public void setFormAudit(List<FormMessage> formAudit) {
        this.formAudit = formAudit;
    }

    public List<Submit> getSubmitList() {
        return submitList;
    }

    public void setSubmitList(List<Submit> submitList) {
        this.submitList = submitList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getJumpFlag() {
        return jumpFlag;
    }

    public void setJumpFlag(Integer jumpFlag) {
        this.jumpFlag = jumpFlag;
    }

    public List<FormMessage> getFormBusiness() {
        return formBusiness;
    }

    public void setFormBusiness(List<FormMessage> formBusiness) {
        this.formBusiness = formBusiness;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public TacheHistory(List<FormMessage> formAudit, List<Submit> submitList, String name1, String businessName, Integer jumpFlag, List<FormMessage> formBusiness, String auditName) {
        this.formAudit = formAudit;
        this.submitList = submitList;
        this.name = name1;
        this.businessName = businessName;
        this.jumpFlag = jumpFlag;
        this.formBusiness = formBusiness;
        this.auditName = auditName;
    }

    public TacheHistory() {
        super();
    }

    @Override
    public String toString() {
        return "TacheHistory{" +
                "formAudit=" + formAudit +
                ", submitList=" + submitList +
                ", name='" + name + '\'' +
                ", businessName='" + businessName + '\'' +
                ", jumpFlag=" + jumpFlag +
               ", formBusiness=" + formBusiness +
                ", auditName='" + auditName + '\'' +
                '}';
    }
}
