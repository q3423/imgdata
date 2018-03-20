package com.lw.imgdata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lw.imgdata.mapper.BaseInfoMapper;
import com.lw.imgdata.mapper.SchemeItemsMapper;
import com.lw.imgdata.pojo.BaseInfo;
import com.lw.imgdata.pojo.SchemeItemsOrderMessage;
import com.lw.imgdata.pojo.SchemeItemsOrderVO;
import com.lw.imgdata.pojo.json.*;
import com.lw.imgdata.service.SchemeItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchemeItemsServiceImpl implements SchemeItemsService{
	@Autowired
	SchemeItemsMapper schemeItemDao;
	@Autowired
	BaseInfoMapper baseInfoDao;
	public List<SchemeItemsOrderMessage> findSchemeItemMsg(Integer orderId) throws Exception {
	    List<SchemeItemsOrderMessage> sioList = new ArrayList<SchemeItemsOrderMessage>();
		List<SchemeItemsOrderVO> list = schemeItemDao.findSchemeItemsMsg(orderId);
		for (SchemeItemsOrderVO schemeItemsOrderVO : list) {
			List<Integer> baseInfoIds = new ArrayList<Integer>();
			JsonObj jo = JSONObject.parseObject(schemeItemsOrderVO.getOrderJsonData(), JsonObj.class);  
			if(jo == null) {
				return null;
			}
			CostType costType = jo.getCostType();
			schemeItemsOrderVO.setCostType(jo.getCostType().getName());
			TacheNow tacheNow = jo.getTacheNow();
			if(tacheNow != null){
				Submit sb = tacheNow.getSubmit();
				if (sb != null){
					arrangeMessage(schemeItemsOrderVO, baseInfoIds, costType, sb);
				}
			}
			List<TacheHistory> historyList = jo.getTacheHistory();
			if(historyList != null && historyList.size() > 0){
				for (TacheHistory tacheHistory : historyList) {
					List<Submit> submitList = tacheHistory.getSubmitList();
					for (Submit submit : submitList) {
						arrangeMessage(schemeItemsOrderVO, baseInfoIds, costType, submit);
					}
				}
			}
		}
		for (SchemeItemsOrderVO vo : list) {
		    int num = 1;
            if(vo.getBaseInfoList() != null && vo.getBaseInfoList().size() > num ){
                    num = vo.getBaseInfoList().size();
            }
            if(vo.getPersonnelList() != null && vo.getPersonnelList().size() > num){
                num = vo.getPersonnelList().size();
            }
            if(vo.getCustomerList() != null && vo.getCustomerList().size() > num){
                num = vo.getCustomerList().size();
            }
            if(vo.getVipList() != null && vo.getVipList().size() > num){
                num = vo.getVipList().size();
            }
            if(vo.getTerminalList() != null && vo.getTerminalList().size() > num){
                num = vo.getTerminalList().size();
            }
            if(vo.getActivityHotelList() != null && vo.getActivityHotelList().size() > num){
                num = vo.getActivityHotelList().size();
            }
            if(vo.getAdvertisementList() != null && vo.getAdvertisementList().size() > num){
                num = vo.getAdvertisementList().size();
            }
            vo.setMaxCount(num);
        }








		//查询集合size最大的值

		/*
		//包含行项目的单独成一列
        for (SchemeItemsOrderVO svo : list) {
            //终端信息
            if(svo.getBaseInfoList() != null && svo.getBaseInfoList().size() > 0){
                for (BaseInfo ba :  svo.getBaseInfoList() ) {
                    SchemeItemsOrderMessage sio = new SchemeItemsOrderMessage();
                    getSchemeBaseInfo(svo, sio);
                    //工作单终端地址
                    sio.setOrderTerminalAddress(ba.getNewProvince() + ba.getNewCity() + ba.getNewCounty());
                    //终端类别
                    sio.setNewType(ba.getNewType());
                    //终端级别
                    sio.setNewLevel(ba.getNewLevel());
                    //店主
                    sio.setNewKeeper(ba.getNewKeeper());
                    //地址
                    sio.setNewAddress(ba.getNewAddress());
                    //电话
                    sio.setNewPhone(ba.getNewPhone());
                    sioList.add(sio);
                }
            }
        }
        */
		return sioList;
	}

   /* private void getSchemeBaseInfo(SchemeItemsOrderVO svo, SchemeItemsOrderMessage sio) {
        //品牌
        //省份、城市
        sio.setRegion(svo.getRegion());
        //区县
        sio.setDistrictName(svo.getDistrictName());
        //执行案编号
        sio.setSchemeCode(svo.getSchemeCode());
        //执行案行项目
        sio.setId(svo.getId());
        //活动名称
        sio.setActivityTheme(svo.getActivityTheme());
        //方案费用类型
        sio.setSchemeCostType(svo.getSchemeCostType());
        //费用兑付方式
        sio.setCashType(svo.getCashType());
        //预算管控类型
        sio.setBudgetType(svo.getBudgetType());
        //受益对象名称
        sio.setBenefitObj(svo.getBenefitObj());
        //执行对象名称
        sio.setExecuteObj(svo.getExecuteObj());
        //审批金额
        sio.setAuditPay(svo.getAuditPay());
        //实发金额
        sio.setRealPay(svo.getRealPay());
        //扣减金额
        sio.setDeductPay(svo.getDeductPay());
        //未执行金额
        sio.setOutstandingPay(svo.getAuditPay() - svo.getRealPay() - svo.getDeductPay());
        //对应工作单编号
        sio.setOrderId(svo.getOrderId());
        //对应行项目编号
        sio.setItemsCodeList(svo.getItemsCodeList());
        //费用类型
        sio.setCostType(svo.getCostType());
    }
*/
    private void arrangeMessage(SchemeItemsOrderVO schemeItemsOrderVO, List<Integer> baseInfoIds, CostType costType, Submit submit) {
		List<FormMessage> messageList = submit.getFormBusiness();
        BaseInfo advertisement = new BaseInfo();
        boolean advertisementAdd = false;
        BaseInfo activityHotel = new BaseInfo();
        boolean activityHotelAdd = false;
		for (FormMessage formMessage : messageList) {

            //获取终端id
            if(formMessage.getName().equals("终端[单选]") ||
                    formMessage.getName().equals("终端[可多选]")) {
				List<BaseInfo> baseInfoList = (List<BaseInfo>) formMessage.getValue();
				schemeItemsOrderVO.setBaseInfoList(baseInfoList);
            }
            //人员信息
            if(formMessage.getName().equals("人员[可多选]")){
                List<BaseInfo> personnelList = (List<BaseInfo>) formMessage.getValue();
                schemeItemsOrderVO.setPersonnelList(personnelList);
            }
            //vip
            if(formMessage.getName().equals("VIP[含团购单位][多选]") || formMessage.getName().equals("基础信息表格[多选]")) {
                List<BaseInfo> vipList = (List<BaseInfo>) formMessage.getValue();
                schemeItemsOrderVO.setVipList(vipList);
            }
            //广告供应商
            if(formMessage.getName().equals("广告公司名称")) {
                advertisement.setNewName(formMessage.getValue()+"");
                //schemeItemsOrderVO.setAdvertisementCompany();
                advertisementAdd = true;
            }
            if(formMessage.getName().equals("广告公司负责人")) {
                advertisement.setNewKeeper(formMessage.getValue()+"");
            }
            if(formMessage.getName().equals("广告公司地址")) {
                advertisement.setNewAddress(formMessage.getValue()+"");
            }
            if(formMessage.getName().equals("广告公司电话")) {
                advertisement.setNewPhone(formMessage.getValue()+"");
            }

            //活动酒店
            if(formMessage.getName().equals("酒店名称")) {
                advertisement.setNewName(formMessage.getValue()+"");
                advertisementAdd = true;
            }
            if(formMessage.getName().equals("酒店电话")) {
                advertisement.setNewPhone(formMessage.getValue()+"");
            }
            if(formMessage.getName().equals("酒店地址")) {
                advertisement.setNewAddress(formMessage.getValue()+"");
            }

            //品鉴会信息
            if(costType.getName().equals("品鉴会")) {
                if(formMessage.getName().equals("酒店地址")) {
                    schemeItemsOrderVO.setHotelAddress(formMessage.getValue()+"");
                }
            }
            if(formMessage.getName().equals("执行人姓名")) {
                schemeItemsOrderVO.setExecutorName(formMessage.getValue()+"");
            }
            if(formMessage.getName().equals("执行人电话")) {
                schemeItemsOrderVO.setExecutorPhone(formMessage.getValue()+"");
            }

            if(formMessage.getName().equals("参会人员信息表")) {
                List<String> imgs = new ArrayList<String>();
                imgs = (List<String>) formMessage.getValue();
                schemeItemsOrderVO.setAttendeesImgList(imgs);
            }

            //基础信息
            if(formMessage.getName().equals("基础信息表格[可多选]")) {
                List<BaseInfo> personnelList = (List<BaseInfo>) formMessage.getValue();
                //0终端 1 人员 2经销商 3 分销商 4 普通消费者 5VIP(含团购单位) 6终端品牌顾问 7 广告供应商 8活动酒店
                for (BaseInfo ba: personnelList) {
                    if(ba != null){
                        //0终端  2经销商 3 分销商 放终端里面
                        if(ba.getType() == 0 || ba.getType() == 2 || ba.getType() == 3){
                            if(schemeItemsOrderVO.getBaseInfoList() == null ){
                                schemeItemsOrderVO.setBaseInfoList(new ArrayList<BaseInfo>());
                            }
                            schemeItemsOrderVO.getBaseInfoList().add(ba);
                        }
                        if(ba.getType() == 1 ){
                            if(schemeItemsOrderVO.getPersonnelList() == null ){
                                schemeItemsOrderVO.setPersonnelList(new ArrayList<BaseInfo>());
                            }
                            schemeItemsOrderVO.getPersonnelList().add(ba);
                        }
                        //4 普通消费者
                        if(ba.getType() == 4 ){
                            if(schemeItemsOrderVO.getCustomerList() == null ){
                                schemeItemsOrderVO.setCustomerList(new ArrayList<BaseInfo>());
                            }
                            schemeItemsOrderVO.getCustomerList().add(ba);
                        }
                        //5 VIP(含团购单位)
                        if(ba.getType() == 5 ){
                            if(schemeItemsOrderVO.getVipList() == null ){
                                schemeItemsOrderVO.setVipList(new ArrayList<BaseInfo>());
                            }
                            schemeItemsOrderVO.getVipList().add(ba);
                        }
                        //6 终端品牌顾问
                        if(ba.getType() == 6 ){
                            if(schemeItemsOrderVO.getTerminalList() == null ){
                                schemeItemsOrderVO.setTerminalList(new ArrayList<BaseInfo>());
                            }
                            schemeItemsOrderVO.getTerminalList().add(ba);
                        }
                        //7 广告供应商
                        if(ba.getType() == 7 ){
                            if(schemeItemsOrderVO.getAdvertisementList() == null ){
                                schemeItemsOrderVO.setAdvertisementList(new ArrayList<BaseInfo>());
                            }
                            schemeItemsOrderVO.getAdvertisementList().add(ba);
                        }
                        //8活动酒店
                        if(ba.getType() == 8 ){
                            if(schemeItemsOrderVO.getActivityHotelList() == null ){
                                schemeItemsOrderVO.setActivityHotelList(new ArrayList<BaseInfo>());
                            }
                            schemeItemsOrderVO.getActivityHotelList().add(ba);
                        }
                    }
                }
            }
        }
        //广告供应商
        if(advertisementAdd){
            if(schemeItemsOrderVO.getAdvertisementList() == null ){
                schemeItemsOrderVO.setAdvertisementList(new ArrayList<BaseInfo>());
            }
            schemeItemsOrderVO.getAdvertisementList().add(advertisement);
        }
       //活动酒店
        if(activityHotelAdd){
            if(schemeItemsOrderVO.getActivityHotelList() == null ){
                schemeItemsOrderVO.setActivityHotelList(new ArrayList<BaseInfo>());
            }
            schemeItemsOrderVO.getActivityHotelList().add(activityHotel);
        }
	}
}
