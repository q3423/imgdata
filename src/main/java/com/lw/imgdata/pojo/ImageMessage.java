package com.lw.imgdata.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @Description: 实体
 * @author liman
 * @company 龙万科技有限公司
 * @date 2018-01-19 11:33:31
 *
 */
@SuppressWarnings("serial")
public class ImageMessage implements Serializable {

	// id
	private Long imageMessageId;

	// 方案编号
	private String schemeCode;

	// 行项目id
	private Long itemId;

	// 开始时间
	private Long startTime;

	// 结束时间
	private Long endTime;

	// 受益对象
	private String beneficiary;

	// 公司Id
	private String companyId;

	// 公司名称
	private String companyName;

	// 品牌
	private String brand;

	// 地区
	private String region;

	// 费用类型
	private String expenseType;

	// 费用管控类型
	private String expenseManagementType;

	// 扩展
	private List<ImageInfo> imgList;

	/**
	 *
	 * @return id
	 */
	public Long getImageMessageId() {
		return imageMessageId;
	}

	/**
	 * 
	 * @param imageMessageId
	 *            id
	 */
	public void setImageMessageId(Long imageMessageId) {
		this.imageMessageId = imageMessageId;
	}

	/**
	 *
	 * @return 方案编号
	 */
	public String getSchemeCode() {
		return schemeCode;
	}

	/**
	 * 
	 * @param schemeCode
	 *            方案编号
	 */
	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
		if("null".equals(schemeCode)) {
			this.schemeCode = null;
		}
	}

	/**
	 *
	 * @return 行项目id
	 */
	public Long getItemId() {
		return itemId;
	}

	/**
	 * 
	 * @param itemId
	 *            行项目id
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	/**
	 *
	 * @return 开始时间
	 */
	public Long getStartTime() {
		return startTime;
	}

	/**
	 * 
	 * @param startTime
	 *            开始时间
	 */
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	/**
	 *
	 * @return 结束时间
	 */
	public Long getEndTime() {
		return endTime;
	}

	/**
	 * 
	 * @param endTime
	 *            结束时间
	 */
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	/**
	 *
	 * @return 受益对象
	 */
	public String getBeneficiary() {
		return beneficiary;
	}

	/**
	 * 
	 * @param beneficiary
	 *            受益对象
	 */
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
		if("null".equals(beneficiary)) {
			this.beneficiary = null;
		}
	}

	/**
	 *
	 * @return 公司Id
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * 
	 * @param companyId
	 *            公司Id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	/**
	 *
	 * @return 公司名称
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * 
	 * @param companyName
	 *            公司名称
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if("null".equals(companyName)) {
			this.companyName = null;
		}
	}

	/**
	 *
	 * @return 品牌
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * 
	 * @param brand
	 *            品牌
	 */
	public void setBrand(String brand) {
		this.brand = brand;
		if("null".equals(brand)) {
			this.brand = null;
		}
	}

	/**
	 *
	 * @return 地区
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * 
	 * @param region
	 *            地区
	 */
	public void setRegion(String region) {
		this.region = region;
		if("null".equals(region)) {
			this.region = null;
		}
	}

	/**
	 *
	 * @return 费用类型
	 */
	public String getExpenseType() {
		return expenseType;
	}

	/**
	 * 
	 * @param expenseType
	 *            费用类型
	 */
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	/**
	 *
	 * @return
	 */
	public String getExpenseManagementType() {
		return expenseManagementType;
	}

	/**
	 * 
	 * @param expenseManagementType
	 */
	public void setExpenseManagementType(String expenseManagementType) {
		this.expenseManagementType = expenseManagementType;
		if("null".equals(expenseManagementType)) {
			this.expenseManagementType = null;
		}
	}

	public List<ImageInfo> getImgList() {
		return imgList;
	}

	public void setImgList(List<ImageInfo> imgList) {
		this.imgList = imgList;
	}

	public ImageMessage() {
		super();
	}

	public ImageMessage(Long imageMessageId, String schemeCode, Long itemId, Long startTime, Long endTime,
			String beneficiary, String companyId, String companyName, String brand, String region, String expenseType,
			String expenseManagementType) {
		super();
		this.imageMessageId = imageMessageId;
		this.schemeCode = schemeCode;
		this.itemId = itemId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.beneficiary = beneficiary;
		this.companyId = companyId;
		this.companyName = companyName;
		this.brand = brand;
		this.region = region;
		this.expenseType = expenseType;
		this.expenseManagementType = expenseManagementType;
	}

	@Override
	public String toString() {
		return "ImageMessage [imageMessageId=" + imageMessageId + ", schemeCode=" + schemeCode + ", itemId=" + itemId
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", beneficiary=" + beneficiary + ", companyId="
				+ companyId + ", companyName=" + companyName + ", brand=" + brand + ", region=" + region
				+ ", expenseType=" + expenseType + ", expenseManagementType=" + expenseManagementType + ", imgList="
				+ imgList + "]";
	}

	
}