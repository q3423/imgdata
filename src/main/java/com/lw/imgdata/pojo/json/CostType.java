package com.lw.imgdata.pojo.json;

/**
 * Created by asus on 2018/1/18.
 */
public class CostType {
    private Long upId;
    /**
     * 类型
     */
    private String upName;
    private JsonData jsonData;
    private Long createTime;
    private String name;
    private Integer id;
    private Integer type;


    public Long getUpId() {
        return upId;
    }

    public void setUpId(Long upId) {
        this.upId = upId;
    }

    public String getUpName() {
        return upName;
    }

    public void setUpName(String upName) {
        this.upName = upName;
    }

    public JsonData getJsonData() {
        return jsonData;
    }

    public void setJsonData(JsonData jsonData) {
        this.jsonData = jsonData;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CostType() {
        super();
    }

    public CostType(Long upId, String upName, JsonData jsonData, Long createTime, String name, Integer id, Integer type) {
        this.upId = upId;
        this.upName = upName;
        this.jsonData = jsonData;
        this.createTime = createTime;
        this.name = name;
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "CostType{" +
                "upId=" + upId +
                ", upName='" + upName + '\'' +
                ", jsonData=" + jsonData +
                ", createTime=" + createTime +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", type=" + type +
                '}';
    }
}
