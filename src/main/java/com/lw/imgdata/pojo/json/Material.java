package com.lw.imgdata.pojo.json;

/**
 * Created by asus on 2018/1/18.
 */
public class Material {
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String otherText;
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private Integer type;
    /**
     *
     */
    private String keyword;

    public String getName() {
        return name;
    }

    public String getOtherText() {
        return otherText;
    }

    public Integer getId() {
        return id;
    }

    public Integer getType() {
        return type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtherText(String otherText) {
        this.otherText = otherText;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", otherText='" + otherText + '\'' +
                ", id=" + id +
                ", type=" + type +
                ", keyword='" + keyword + '\'' +
                '}';
    }

    public Material(String name, String otherText, Integer id, Integer type, String keyword) {
        this.name = name;
        this.otherText = otherText;
        this.id = id;
        this.type = type;
        this.keyword = keyword;
    }

    public Material() {
        super();
    }
}
