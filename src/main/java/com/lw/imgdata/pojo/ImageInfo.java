package com.lw.imgdata.pojo;

import java.io.Serializable;

/**
 * 
 * @Description: 实体
 * @author liman
 * @company 龙万科技有限公司
 * @date 2018-01-19 11:33:31
 *
 */
@SuppressWarnings("serial")
public class ImageInfo implements Serializable {

	// Id
	private Long imageInfoId;

	// id
	private Long imageMessageId;

	// 图片上传时间
	private Long uploadTime;

	// 相机设备型号
	private String equipmentModel;

	// 相机设备制作商
	private String equipmentManufacturer;

	// 拍照时间
	private Long photoOp;

	// 图片指纹
	private String imageFingerprint;

	// 图片路径
	private String imageUrl;

	// 提交人id
	private Long submitUserId;

	// 提交人
	private String submitUser;

	/**
	 *
	 * @return Id
	 */
	public Long getImageInfoId() {
		return imageInfoId;
	}

	/**
	 * 
	 * @param imageInfoId
	 *            Id
	 */
	public void setImageInfoId(Long imageInfoId) {
		this.imageInfoId = imageInfoId;
	}

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
	 * @return 图片上传时间
	 */
	public Long getUploadTime() {
		return uploadTime;
	}

	/**
	 * 
	 * @param uploadTime
	 *            图片上传时间
	 */
	public void setUploadTime(Long uploadTime) {
		this.uploadTime = uploadTime;
	}

	/**
	 *
	 * @return 相机设备型号
	 */
	public String getEquipmentModel() {
		return equipmentModel;
	}

	/**
	 * 
	 * @param equipmentModel
	 *            相机设备型号
	 */
	public void setEquipmentModel(String equipmentModel) {
		this.equipmentModel = equipmentModel;
		if("null".equals(equipmentModel)) {
			this.equipmentModel = null;
		}
	}

	/**
	 *
	 * @return 相机设备制作商
	 */
	public String getEquipmentManufacturer() {
		return equipmentManufacturer;
	}

	/**
	 * 
	 * @param equipmentManufacturer
	 *            相机设备制作商
	 */
	public void setEquipmentManufacturer(String equipmentManufacturer) {
		this.equipmentManufacturer = equipmentManufacturer;
		if("null".equals(equipmentManufacturer)) {
			this.equipmentManufacturer = null;
		}
	}

	/**
	 *
	 * @return 拍照时间
	 */
	public Long getPhotoOp() {
		return photoOp;
	}

	/**
	 * 
	 * @param photoOp
	 *            拍照时间
	 */
	public void setPhotoOp(Long photoOp) {
		this.photoOp = photoOp;
	}

	/**
	 *
	 * @return 图片指纹
	 */
	public String getImageFingerprint() {
		return imageFingerprint;
	}

	/**
	 * 
	 * @param imageFingerprint
	 *            图片指纹
	 */
	public void setImageFingerprint(String imageFingerprint) {
		this.imageFingerprint = imageFingerprint;
		if("null".equals(imageFingerprint)) {
			this.imageFingerprint = null;
		}
	}

	/**
	 *
	 * @return 图片路径
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * 
	 * @param imageUrl
	 *            图片路径
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 *
	 * @return 提交人id
	 */
	public Long getSubmitUserId() {
		return submitUserId;
	}

	/**
	 * 
	 * @param submitUserId
	 *            提交人id
	 */
	public void setSubmitUserId(Long submitUserId) {
		this.submitUserId = submitUserId;
	}

	/**
	 *
	 * @return 提交人
	 */
	public String getSubmitUser() {
		return submitUser;
	}

	/**
	 * 
	 * @param submitUser
	 *            提交人
	 */
	public void setSubmitUser(String submitUser) {
		this.submitUser = submitUser;
	}

	public ImageInfo() {
		super();
	}

	public ImageInfo(Long imageInfoId, Long imageMessageId, Long uploadTime, String equipmentModel,
			String equipmentManufacturer, Long photoOp, String imageFingerprint, String imageUrl, Long submitUserId,
			String submitUser) {
		super();
		this.imageInfoId = imageInfoId;
		this.imageMessageId = imageMessageId;
		this.uploadTime = uploadTime;
		this.equipmentModel = equipmentModel;
		this.equipmentManufacturer = equipmentManufacturer;
		this.photoOp = photoOp;
		this.imageFingerprint = imageFingerprint;
		this.imageUrl = imageUrl;
		this.submitUserId = submitUserId;
		this.submitUser = submitUser;
	}

	@Override
	public String toString() {
		return "ImageInfo{" + "imageInfoId=" + imageInfoId + ", imageMessageId=" + imageMessageId + ", uploadTime="
				+ uploadTime + ", equipmentModel='" + equipmentModel + '\'' + ", equipmentManufacturer='"
				+ equipmentManufacturer + '\'' + ", photoOp=" + photoOp + ", imageFingerprint='" + imageFingerprint
				+ '\'' + ", imageUrl='" + imageUrl + '\'' + ", submitUserId=" + submitUserId + ", submitUser='"
				+ submitUser + '\'' + '}';
	}
}