package com.lw.imgdata.pojo;
import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;


public class Order  implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;//工作单ID
	private Long createTime;//创建时间
	private String jsonData;//json对象
	private String districtCode;//片区编号
	private String districtName;//片区名称
	private String schemeCode;//方案编号
	private Integer state;//状态 参考OrderState
	
	private String companyId;
	private String company;
	private String regionId;
	private String region;
	private Integer userId;
	
	//扩展字段
	private String username;
	private String brand;
	private String executeObj;
	private String schemeCodeSplit;
	private String oid;
	private String name;
	private Long startTime;
	private Long endTime;
	
	private String schemeCostType;
	private String budgetType;
	private String benefitObj;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getExecuteObj() {
		return executeObj;
	}
	public void setExecuteObj(String executeObj) {
		this.executeObj = executeObj;
	}
	public String getSchemeCodeSplit() {
		return schemeCodeSplit;
	}
	public void setSchemeCodeSplit(String schemeCodeSplit) {
		this.schemeCodeSplit = schemeCodeSplit;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	public String getJsonData() {
		return jsonData;
	}
	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getSchemeCode() {
		return schemeCode;
	}
	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}

	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getSchemeCostType() {
		return schemeCostType;
	}
	public void setSchemeCostType(String schemeCostType) {
		this.schemeCostType = schemeCostType;
	}
	public String getBudgetType() {
		return budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}
	public String getBenefitObj() {
		return benefitObj;
	}
	public void setBenefitObj(String benefitObj) {
		this.benefitObj = benefitObj;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", createTime=" + createTime + ", jsonData=" + jsonData + ", districtCode="
				+ districtCode + ", districtName=" + districtName + ", schemeCode=" + schemeCode + ", state=" + state
				+ ", companyId=" + companyId + ", company=" + company + ", regionId=" + regionId + ", region=" + region
				+ ", userId=" + userId + ", username=" + username + ", brand=" + brand + ", executeObj=" + executeObj
				+ ", schemeCodeSplit=" + schemeCodeSplit + ", oid=" + oid + ", name=" + name + ", startTime="
				+ startTime + ", endTime=" + endTime + ", schemeCostType=" + schemeCostType + ", budgetType="
				+ budgetType + ", benefitObj=" + benefitObj + "]";
	}
	
	
	
	
}