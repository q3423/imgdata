package com.lw.imgdata.pojo.json;

import java.util.List;

/**
 * Created by asus on 2018/1/18.
 */
public class Tache {

    private String name;
    private Integer jumpFlag;
    private List<FormMessage> formAudit;
    private List<FormMessage> formBusiness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJumpFlag() {
        return jumpFlag;
    }

    public void setJumpFlag(Integer jumpFlag) {
        this.jumpFlag = jumpFlag;
    }

    public List<FormMessage> getFormAudit() {
        return formAudit;
    }

    public void setFormAudit(List<FormMessage> formAudit) {
        this.formAudit = formAudit;
    }

    public List<FormMessage> getFormBusiness() {
        return formBusiness;
    }

    public void setFormBusiness(List<FormMessage> formBusiness) {
        this.formBusiness = formBusiness;
    }

    public Tache() {
        super();
    }

    public Tache(String name, Integer jumpFlag, List<FormMessage> formAudit, List<FormMessage> formBusiness) {
        this.name = name;
        this.jumpFlag = jumpFlag;
        this.formAudit = formAudit;
        this.formBusiness = formBusiness;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "name='" + name + '\'' +
                ", jumpFlag=" + jumpFlag +
                ", formAudit=" + formAudit +
                ", formBusiness=" + formBusiness +
                '}';
    }
}
