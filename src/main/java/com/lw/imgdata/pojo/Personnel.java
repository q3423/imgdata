package com.lw.imgdata.pojo;
/**
 * 
 * @ClassName:  Personnel   
 * @Description:人员信息  
 * @author: liman
 * @date:   2018年3月15日 上午10:01:35
 */
public class Personnel {
	private Integer personnelId;//人员ID
	private Integer personnelType;// 0终端  1人员  2经销商  3分销售 4普通消费者 5VIP 6终端品牌顾问
	private String personnelProvince;//省份
	private String personnelCity;//城市
	private String personnelCounty;//县
	private String personnelCompany;//单位
	private String personnelPost;//职务
	private String personnelAddress;//地址
	private String personnelName;//人员名称
	private String personnelCDCard;//人员身份证
	private String personnelPhone;//人员电话
	private String personnelStatus;//上下岗状态
	public Integer getPersonnelId() {
		return personnelId;
	}
	public void setPersonnelId(Integer personnelId) {
		this.personnelId = personnelId;
	}
	public Integer getPersonnelType() {
		return personnelType;
	}
	public void setPersonnelType(Integer personnelType) {
		this.personnelType = personnelType;
	}
	public String getPersonnelProvince() {
		return personnelProvince;
	}
	public void setPersonnelProvince(String personnelProvince) {
		this.personnelProvince = personnelProvince;
	}
	public String getPersonnelCity() {
		return personnelCity;
	}
	public void setPersonnelCity(String personnelCity) {
		this.personnelCity = personnelCity;
	}
	public String getPersonnelCounty() {
		return personnelCounty;
	}
	public void setPersonnelCounty(String personnelCounty) {
		this.personnelCounty = personnelCounty;
	}
	public String getPersonnelCompany() {
		return personnelCompany;
	}
	public void setPersonnelCompany(String personnelCompany) {
		this.personnelCompany = personnelCompany;
	}
	public String getPersonnelPost() {
		return personnelPost;
	}
	public void setPersonnelPost(String personnelPost) {
		this.personnelPost = personnelPost;
	}
	public String getPersonnelAddress() {
		return personnelAddress;
	}
	public void setPersonnelAddress(String personnelAddress) {
		this.personnelAddress = personnelAddress;
	}
	public String getPersonnelName() {
		return personnelName;
	}
	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}
	public String getPersonnelCDCard() {
		return personnelCDCard;
	}
	public void setPersonnelCDCard(String personnelCDCard) {
		this.personnelCDCard = personnelCDCard;
	}
	public String getPersonnelPhone() {
		return personnelPhone;
	}
	public void setPersonnelPhone(String personnelPhone) {
		this.personnelPhone = personnelPhone;
	}
	public String getPersonnelStatus() {
		return personnelStatus;
	}
	public void setPersonnelStatus(String personnelStatus) {
		this.personnelStatus = personnelStatus;
	}
	@Override
	public String toString() {
		return "Personnel [personnelId=" + personnelId + ", personnelType=" + personnelType + ", personnelProvince="
				+ personnelProvince + ", personnelCity=" + personnelCity + ", personnelCounty=" + personnelCounty
				+ ", personnelCompany=" + personnelCompany + ", personnelPost=" + personnelPost + ", personnelAddress="
				+ personnelAddress + ", personnelName=" + personnelName + ", personnelCDCard=" + personnelCDCard
				+ ", personnelPhone=" + personnelPhone + ", personnelStatus=" + personnelStatus + "]";
	}
	
	

}
