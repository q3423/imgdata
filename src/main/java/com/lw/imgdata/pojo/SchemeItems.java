package com.lw.imgdata.pojo;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

public class SchemeItems implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String schemeCode;

    private String activityTheme;

    private String activityText;

    private String costTypeCode;
    
    private String schemeCostType;

    private String cashType;

    private String budgetType;

    private String benefitObj;

    private String executeObj;

    private String districtCode;
    
    private String districtName;

    private Long applyPay;

    private Long realPay;

    private Long auditPay;
    
    private Long deductPay;
    

    

    private Long startTime;

    private Long endTime;

    private String code;

    private Integer state;//0未实发1审核中100已实发
    
    private JSONObject jsonData;
    
    private Long createTime;
    
    private String companyId;
	private String company;
	private String regionId;
	private String region;
    
	private String ywid;
	
    public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public JSONObject getJsonData() {
		return jsonData;
	}

	public void setJsonData(JSONObject jsonData) {
		this.jsonData = jsonData;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public String getActivityTheme() {
        return activityTheme;
    }

    public void setActivityTheme(String activityTheme) {
        this.activityTheme = activityTheme;
    }

    public String getActivityText() {
        return activityText;
    }

    public void setActivityText(String activityText) {
        this.activityText = activityText;
    }

    public String getSchemeCostType() {
        return schemeCostType;
    }

    public void setSchemeCostType(String schemeCostType) {
        this.schemeCostType = schemeCostType;
    }

    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType;
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

    public String getExecuteObj() {
        return executeObj;
    }

    public void setExecuteObj(String executeObj) {
        this.executeObj = executeObj;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public Long getApplyPay() {
        return applyPay;
    }

    public void setApplyPay(Long applyPay) {
        this.applyPay = applyPay;
    }

    public Long getRealPay() {
        return realPay;
    }

    public void setRealPay(Long realPay) {
        this.realPay = realPay;
    }

    public Long getAuditPay() {
        return auditPay;
    }

    public void setAuditPay(Long auditPay) {
        this.auditPay = auditPay;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
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

	public String getYwid() {
		return ywid;
	}

	public void setYwid(String ywid) {
		this.ywid = ywid;
	}

	public String getCostTypeCode() {
		return costTypeCode;
	}

	public void setCostTypeCode(String costTypeCode) {
		this.costTypeCode = costTypeCode;
	}

	public Long getDeductPay() {
		return deductPay;
	}

	public void setDeductPay(Long deductPay) {
		this.deductPay = deductPay;
	}
	
	
}