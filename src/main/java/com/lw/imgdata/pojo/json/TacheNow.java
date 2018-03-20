package com.lw.imgdata.pojo.json;

import java.util.List;

/**
 *@Title: TacheNow
 *@Author:LiMan
 *@Date:2018/3/19 11:56
 *@Description: 
 */
public class TacheNow {
    private String name;
    private Submit submit;
    private Integer jumpFlag;
    private String auditName;
    private List<FormMessage> formAudit;
    private String businessName;
    private List<FormMessage> formBusiness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Submit getSubmit() {
        return submit;
    }

    public void setSubmit(Submit submit) {
        this.submit = submit;
    }

    public Integer getJumpFlag() {
        return jumpFlag;
    }

    public void setJumpFlag(Integer jumpFlag) {
        this.jumpFlag = jumpFlag;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public List<FormMessage> getFormAudit() {
        return formAudit;
    }

    public void setFormAudit(List<FormMessage> formAudit) {
        this.formAudit = formAudit;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public List<FormMessage> getFormBusiness() {
        return formBusiness;
    }

    public void setFormBusiness(List<FormMessage> formBusiness) {
        this.formBusiness = formBusiness;
    }

    @Override
    public String toString() {
        return "TacheNow{" +
                "name='" + name + '\'' +
                ", submit=" + submit +
                ", jumpFlag=" + jumpFlag +
                ", auditName='" + auditName + '\'' +
                ", formAudit=" + formAudit +
                ", businessName='" + businessName + '\'' +
                ", formBusiness=" + formBusiness +
                '}';
    }
}
