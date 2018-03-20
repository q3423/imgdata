package com.lw.imgdata.pojo;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class BaseInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String code;

    private Long createTime;

    private Integer synType;

    private JSONObject jsonData;

    private Integer userId;

    private Integer type; //0终端 1 人员 2经销商 3 分销商 4 普通消费者 5VIP(含团购单位) 6终端品牌顾问 7 广告供应商 8活动酒店
    private String company; 
    private String companyId;
    
    private String newCity;
    private String newName;
    private String newType;
	private String newLevel;
    private String newPhone;
    private String newCounty;
    private String newGender;
    private String newIdCard;
    private String newKeeper;
    private String newSupply;
    private String newAddress;
	private String newProvince;
    private String newBrand;
    private String img;
    private String userState;
    private String unit;
    private String post;
    private String newOption;
    private String finalModifier;
	private Long finalModifyTime;
	private Date joinDate;
	private Date leaveDate;
	private String postType;
	
	
    public String getFinalModifier() {
		return finalModifier;
	}

	public void setFinalModifier(String finalModifier) {
		this.finalModifier = finalModifier;
	}

	public Long getFinalModifyTime() {
		return finalModifyTime;
	}

	public void setFinalModifyTime(Long finalModifyTime) {
		this.finalModifyTime = finalModifyTime;
	}


    public String getUnit() {
 		return unit;
 	}

 	public void setUnit(String unit) {
 		this.unit = unit;
 	}

 	public String getPost() {
 		return post;
 	}

 	public void setPost(String post) {
 		this.post = post;
 	}

    
    public String getNewOption() {
		return newOption;
	}

	public void setNewOption(String newOption) {
		this.newOption = newOption;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getNewBrand() {
  		return newBrand;
  	}

  	public void setNewBrand(String newBrand) {
  		this.newBrand = newBrand;
  	}
    
    
    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNewCity() {
		return newCity;
	}

	public void setNewCity(String newCity) {
		this.newCity = newCity;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public String getNewType() {
		return newType;
	}

	public void setNewType(String newType) {
		this.newType = newType;
	}

	public String getNewLevel() {
		return newLevel;
	}

	public void setNewLevel(String newLevel) {
		this.newLevel = newLevel;
	}

	public String getNewPhone() {
		return newPhone;
	}

	public void setNewPhone(String newPhone) {
		this.newPhone = newPhone;
	}

	public String getNewCounty() {
		return newCounty;
	}

	public void setNewCounty(String newCounty) {
		this.newCounty = newCounty;
	}

	public String getNewGender() {
		return newGender;
	}

	public void setNewGender(String newGender) {
		this.newGender = newGender;
	}

	public String getNewIdCard() {
		return newIdCard;
	}

	public void setNewIdCard(String newIdCard) {
		this.newIdCard = newIdCard;
	}

	public String getNewKeeper() {
		return newKeeper;
	}

	public void setNewKeeper(String newKeeper) {
		this.newKeeper = newKeeper;
	}

	public String getNewSupply() {
		return newSupply;
	}

	public void setNewSupply(String newSupply) {
		this.newSupply = newSupply;
	}

	public String getNewAddress() {
		return newAddress;
	}

	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}

	public String getNewProvince() {
		return newProvince;
	}

	public void setNewProvince(String newProvince) {
		this.newProvince = newProvince;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getSynType() {
        return synType;
    }

    public void setSynType(Integer synType) {
        this.synType = synType;
    }

    public JSONObject getJsonData() {
		return jsonData;
	}

	public void setJsonData(JSONObject jsonData) {
		this.jsonData = jsonData;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	@Override
	public String toString() {
		return "BaseInfo [id=" + id + ", code=" + code + ", createTime="
				+ createTime + ", synType=" + synType + ", jsonData="
				+ jsonData + ", userId=" + userId + ", type=" + type + ",companyId="+companyId+",company="+company+"]";
	}
	
	
}