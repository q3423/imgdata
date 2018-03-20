package com.lw.imgdata.pojo;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.List;

/**
 * @Title: SchemeItemsOrderMessage
 * @Author:LiMan
 * @Date:2018/3/20 14:01
 * @Description:
 */
public class SchemeItemsOrderMessage implements Serializable{
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

    private Long outstandingPay;//未执行金额

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

    private Integer orderId;

    private String itemsCodeList;//项目编号集，逗号隔开

    private String orderJsonData;

    private String costType;//费用类型

    /**
     * 终端信息start
     **/

    private Integer baseInfoId;//终端id
    private String orderTerminalAddress;//工作单终端地址
    private String newType;//终端类别
    private String newLevel;//终端级别
    private String newKeeper;//店主
    private String newAddress;//地址
    private String newPhone;//电话

    /**终端信息end**/
    /**
     * 人员信息start
     **/
    private String personnelProvince;//省份
    private String personnelCity;//城市
    private String personnelName;//人员名称
    private String personnelCDCard;//人员身份证
    private String personnelPhone;//人员电话
    private String personnelStatus;//上下岗状态
    /**人员信息end**/
    /**
     * 品鉴会信息start
     **/
    private String hotelAddredd;//酒店地址
    private List<String> attendeesImgList;//参会者名单图片名称
    private String executorName;//品鉴会执行人姓名
    private String executorPhone;//品鉴会执行人电话
    /**品鉴会信息end**/
    /**
     * 普通消费者start
     **/
    private String customerProvince;//省份
    private String customerCity;//城市
    private String customerName;//名称
    private String customerPhone;//电话
    private String customerCompany;//单位
    private String customerPost;//职务
    private String customerAddress;//地址
    /**普通消费者end**/
    /**
     * VIPstart
     **/
    private String vipProvince;//省份
    private String vipCity;//城市
    private String vipCounty;//县
    private String vipName;//名称
    private String vipPhone;//电话
    private String vipCompany;//单位
    private String vipPost;//职务
    private String vipAddress;//地址
    /**VIPend**/
    /**
     * 终端品牌顾问start
     **/
    private String terminalProvince;//省份
    private String terminalCity;//城市
    private String terminalCounty;//县
    private String terminalName;//名称
    private String terminalPhone;//电话
    private String terminalCompany;//单位
    private String terminalPost;//职务
    private String terminalAddress;//地址
    /**终端品牌顾问end**/
    /**
     * 活动酒店start
     **/

    private String activityHotelProvince;//省份
    private String activityHotelCity;//城市
    private String activityHotelCounty;//县
    private String activityHotelName;//酒店名称
    private String activityHotelPhone;//电话
    private String activityHotelAddress;//酒店地址
    /**活动酒店end**/
    /**
     * 广告供应商start
     **/
    private String advertisementProvince;//省份
    private String advertisementCity;//城市
    private String advertisementCounty;//县
    private String advertisementCompany;//广告公司名称
    private String advertisementLinkman;//联系人
    private String advertisementPhone;//电话
    private String advertisementAddress;//地址

    /**
     * 广告供应商end
     **/

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

    public String getCostTypeCode() {
        return costTypeCode;
    }

    public void setCostTypeCode(String costTypeCode) {
        this.costTypeCode = costTypeCode;
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

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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

    public Long getDeductPay() {
        return deductPay;
    }

    public void setDeductPay(Long deductPay) {
        this.deductPay = deductPay;
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

    public Integer getBaseInfoId() {
        return baseInfoId;
    }

    public void setBaseInfoId(Integer baseInfoId) {
        this.baseInfoId = baseInfoId;
    }

    public String getOrderTerminalAddress() {
        return orderTerminalAddress;
    }

    public void setOrderTerminalAddress(String orderTerminalAddress) {
        this.orderTerminalAddress = orderTerminalAddress;
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

    public String getNewKeeper() {
        return newKeeper;
    }

    public void setNewKeeper(String newKeeper) {
        this.newKeeper = newKeeper;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
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

    public String getHotelAddredd() {
        return hotelAddredd;
    }

    public void setHotelAddredd(String hotelAddredd) {
        this.hotelAddredd = hotelAddredd;
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

    public String getCustomerProvince() {
        return customerProvince;
    }

    public void setCustomerProvince(String customerProvince) {
        this.customerProvince = customerProvince;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerCompany() {
        return customerCompany;
    }

    public void setCustomerCompany(String customerCompany) {
        this.customerCompany = customerCompany;
    }

    public String getCustomerPost() {
        return customerPost;
    }

    public void setCustomerPost(String customerPost) {
        this.customerPost = customerPost;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getVipProvince() {
        return vipProvince;
    }

    public void setVipProvince(String vipProvince) {
        this.vipProvince = vipProvince;
    }

    public String getVipCity() {
        return vipCity;
    }

    public void setVipCity(String vipCity) {
        this.vipCity = vipCity;
    }

    public String getVipCounty() {
        return vipCounty;
    }

    public void setVipCounty(String vipCounty) {
        this.vipCounty = vipCounty;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getVipPhone() {
        return vipPhone;
    }

    public void setVipPhone(String vipPhone) {
        this.vipPhone = vipPhone;
    }

    public String getVipCompany() {
        return vipCompany;
    }

    public void setVipCompany(String vipCompany) {
        this.vipCompany = vipCompany;
    }

    public String getVipPost() {
        return vipPost;
    }

    public void setVipPost(String vipPost) {
        this.vipPost = vipPost;
    }

    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public String getTerminalProvince() {
        return terminalProvince;
    }

    public void setTerminalProvince(String terminalProvince) {
        this.terminalProvince = terminalProvince;
    }

    public String getTerminalCity() {
        return terminalCity;
    }

    public void setTerminalCity(String terminalCity) {
        this.terminalCity = terminalCity;
    }

    public String getTerminalCounty() {
        return terminalCounty;
    }

    public void setTerminalCounty(String terminalCounty) {
        this.terminalCounty = terminalCounty;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getTerminalPhone() {
        return terminalPhone;
    }

    public void setTerminalPhone(String terminalPhone) {
        this.terminalPhone = terminalPhone;
    }

    public String getTerminalCompany() {
        return terminalCompany;
    }

    public void setTerminalCompany(String terminalCompany) {
        this.terminalCompany = terminalCompany;
    }

    public String getTerminalPost() {
        return terminalPost;
    }

    public void setTerminalPost(String terminalPost) {
        this.terminalPost = terminalPost;
    }

    public String getTerminalAddress() {
        return terminalAddress;
    }

    public void setTerminalAddress(String terminalAddress) {
        this.terminalAddress = terminalAddress;
    }

    public String getActivityHotelProvince() {
        return activityHotelProvince;
    }

    public void setActivityHotelProvince(String activityHotelProvince) {
        this.activityHotelProvince = activityHotelProvince;
    }

    public String getActivityHotelCity() {
        return activityHotelCity;
    }

    public void setActivityHotelCity(String activityHotelCity) {
        this.activityHotelCity = activityHotelCity;
    }

    public String getActivityHotelCounty() {
        return activityHotelCounty;
    }

    public void setActivityHotelCounty(String activityHotelCounty) {
        this.activityHotelCounty = activityHotelCounty;
    }

    public String getActivityHotelName() {
        return activityHotelName;
    }

    public void setActivityHotelName(String activityHotelName) {
        this.activityHotelName = activityHotelName;
    }

    public String getActivityHotelPhone() {
        return activityHotelPhone;
    }

    public void setActivityHotelPhone(String activityHotelPhone) {
        this.activityHotelPhone = activityHotelPhone;
    }



    public String getAdvertisementProvince() {
        return advertisementProvince;
    }

    public void setAdvertisementProvince(String advertisementProvince) {
        this.advertisementProvince = advertisementProvince;
    }

    public String getAdvertisementCity() {
        return advertisementCity;
    }

    public void setAdvertisementCity(String advertisementCity) {
        this.advertisementCity = advertisementCity;
    }

    public String getAdvertisementCounty() {
        return advertisementCounty;
    }

    public void setAdvertisementCounty(String advertisementCounty) {
        this.advertisementCounty = advertisementCounty;
    }

    public String getAdvertisementCompany() {
        return advertisementCompany;
    }

    public void setAdvertisementCompany(String advertisementCompany) {
        this.advertisementCompany = advertisementCompany;
    }

    public String getAdvertisementLinkman() {
        return advertisementLinkman;
    }

    public void setAdvertisementLinkman(String advertisementLinkman) {
        this.advertisementLinkman = advertisementLinkman;
    }

    public String getAdvertisementPhone() {
        return advertisementPhone;
    }

    public void setAdvertisementPhone(String advertisementPhone) {
        this.advertisementPhone = advertisementPhone;
    }

    public Long getOutstandingPay() {
        return outstandingPay;
    }

    public void setOutstandingPay(Long outstandingPay) {
        this.outstandingPay = outstandingPay;
    }

    public String getActivityHotelAddress() {
        return activityHotelAddress;
    }

    public void setActivityHotelAddress(String activityHotelAddress) {
        this.activityHotelAddress = activityHotelAddress;
    }

    public String getAdvertisementAddress() {
        return advertisementAddress;
    }

    public void setAdvertisementAddress(String advertisementAddress) {
        this.advertisementAddress = advertisementAddress;
    }
}
