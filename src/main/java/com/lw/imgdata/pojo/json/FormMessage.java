package com.lw.imgdata.pojo.json;

import java.util.List;

/**
 * Created by asus on 2018/1/18.
 */
public class FormMessage {

    private Boolean showOptionEdit;
    private String name;
    private Material material;
    private Boolean auditFlag;
    private String text;
    private Object value;
    private String optionEdit;
    private List<String> options;


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Boolean getShowOptionEdit() {
        return showOptionEdit;
    }

    public void setShowOptionEdit(Boolean showOptionEdit) {
        this.showOptionEdit = showOptionEdit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Boolean getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(Boolean auditFlag) {
        this.auditFlag = auditFlag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOptionEdit() {
        return optionEdit;
    }

    public void setOptionEdit(String optionEdit) {
        this.optionEdit = optionEdit;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public FormMessage() {
        super();
    }

    public FormMessage(Boolean showOptionEdit, String name, Material material, Boolean auditFlag, String text, Object value, String optionEdit, List<String> options) {
        this.showOptionEdit = showOptionEdit;
        this.name = name;
        this.material = material;
        this.auditFlag = auditFlag;
        this.text = text;
        this.value = value;
        this.optionEdit = optionEdit;
        this.options = options;
    }

    @Override
    public String toString() {
        return "FormMessage{" +
                "showOptionEdit=" + showOptionEdit +
                ", name=" + name +
                ", material=" + material +
                ", auditFlag=" + auditFlag +
                ", text=" + text +
                ", value=" + value +
                ", optionEdit=" + optionEdit +
                ", options=" + options +
                '}';
    }
}
