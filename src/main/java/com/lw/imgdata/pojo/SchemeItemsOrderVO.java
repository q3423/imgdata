package com.lw.imgdata.pojo;

import java.util.List;


@SuppressWarnings("serial")
public class SchemeItemsOrderVO extends SchemeItems {
	private Integer orderId;
	
	private String itemsCodeList;//项目编号集，逗号隔开
	
	private String orderJsonData; 
	
	private String costType;//费用类型
	
	/**终端信息start**/
	List<BaseInfo> baseInfoList;//终端信息
	/**终端信息end**/

	/**人员信息start**/
	private List<BaseInfo> personnelList;
	/**人员信息end**/
	
	/**品鉴会信息start**/
	private String hotelAddress;//酒店地址
	private List<String> attendeesImgList;//参会者名单图片名称
	private String executorName;//品鉴会执行人姓名
	private String executorPhone;//品鉴会执行人电话
	/**品鉴会信息end**/
	
	/**普通消费者start**/
	private List<BaseInfo> customerList;
	/**普通消费者end**/
	/**VIPstart**/
	private List<BaseInfo> vipList;
	/**VIPend**/
	/**终端品牌顾问start**/
	private List<BaseInfo> terminalList;
	/**终端品牌顾问end**/
	/**活动酒店start**/
	private List<BaseInfo> activityHotelList;
	/**活动酒店end**/
	/**广告供应商start**/
	private List<BaseInfo> advertisementList;
	/**广告供应商end**/

	private Integer maxCount;//合并行数

	public Integer getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getItemsCodeList() {
		return itemsCodeList;
	}

	public void setItemsCodeList(String itemsCodeList) {
		this.itemsCodeList = itemsCodeList;
	}
	public String getOrderJsonData() {
		return orderJsonData;
	}

	public void setOrderJsonData(String orderJsonData) {
		this.orderJsonData = orderJsonData;
	}

	public String getCostType() {
		return costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
	}



	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}


	public List<String> getAttendeesImgList() {
		return attendeesImgList;
	}

	public void setAttendeesImgList(List<String> attendeesImgList) {
		this.attendeesImgList = attendeesImgList;
	}

	public String getExecutorName() {
		return executorName;
	}

	public void setExecutorName(String executorName) {
		this.executorName = executorName;
	}

	public String getExecutorPhone() {
		return executorPhone;
	}

	public void setExecutorPhone(String executorPhone) {
		this.executorPhone = executorPhone;
	}

	



	public List<BaseInfo> getBaseInfoList() {
		return baseInfoList;
	}
	public void setBaseInfoList(List<BaseInfo> baseInfoList) {
		this.baseInfoList = baseInfoList;
	}

	public List<BaseInfo> getPersonnelList() {
		return personnelList;
	}

	public void setPersonnelList(List<BaseInfo> personnelList) {
		this.personnelList = personnelList;
	}

	public List<BaseInfo> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<BaseInfo> customerList) {
		this.customerList = customerList;
	}

	public List<BaseInfo> getVipList() {
		return vipList;
	}

	public void setVipList(List<BaseInfo> vipList) {
		this.vipList = vipList;
	}

	public List<BaseInfo> getTerminalList() {
		return terminalList;
	}

	public void setTerminalList(List<BaseInfo> terminalList) {
		this.terminalList = terminalList;
	}

	public List<BaseInfo> getActivityHotelList() {
		return activityHotelList;
	}

	public void setActivityHotelList(List<BaseInfo> activityHotelList) {
		this.activityHotelList = activityHotelList;
	}

	public List<BaseInfo> getAdvertisementList() {
		return advertisementList;
	}

	public void setAdvertisementList(List<BaseInfo> advertisementList) {
		this.advertisementList = advertisementList;
	}

	@Override
	public String toString() {
		return "SchemeItemsOrderVO{" +
				"orderId=" + orderId +
				", itemsCodeList='" + itemsCodeList + '\'' +
				", orderJsonData='" + orderJsonData + '\'' +
				", costType='" + costType + '\'' +
				", baseInfoList=" + baseInfoList +
				", personnelList=" + personnelList +
				", hotelAddress='" + hotelAddress + '\'' +
				", attendeesImgList=" + attendeesImgList +
				", executorName='" + executorName + '\'' +
				", executorPhone='" + executorPhone + '\'' +
				", customerList=" + customerList +
				", vipList=" + vipList +
				", terminalList=" + terminalList +
				", activityHotelList=" + activityHotelList +
				", advertisementList=" + advertisementList +
				'}';
	}
}
