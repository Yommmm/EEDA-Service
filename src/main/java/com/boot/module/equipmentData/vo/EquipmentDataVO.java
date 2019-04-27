package com.boot.module.equipmentData.vo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "EquipmentDataVO", description = "数据实体")
public class EquipmentDataVO {

	/**
	 * 数据流水号
	 */
	@ApiModelProperty(value = "数据流水号")
	private String eDataId;

	/**
	 * 数据来源设备mac地址
	 */
	@ApiModelProperty(value = "数据来源设备mac地址")
	private String eMac;

	/**
	 * 数据来源设备IP地址
	 */
	@ApiModelProperty(value = "数据来源设备IP地址")
	private String eIp;

	/**
	 * 设备数据
	 */
	@ApiModelProperty(value = "设备数据")
	private String eData;

	@ApiModelProperty(value = "设备压力")
	private String ePressure;

	@ApiModelProperty(value = "设备温度")
	private String eTemperature;

	@ApiModelProperty(value = "设备湿度")
	private String eHumidity;

	@ApiModelProperty(value = "采集时间")
	private Date createTime;

	public String geteDataId() {
		return eDataId;
	}

	public void seteDataId(String eDataId) {
		this.eDataId = eDataId;
	}

	public String geteMac() {
		return eMac;
	}

	public void seteMac(String eMac) {
		this.eMac = eMac;
	}

	public String geteIp() {
		return eIp;
	}

	public void seteIp(String eIp) {
		this.eIp = eIp;
	}

	public String geteData() {
		return eData;
	}

	public void seteData(String eData) {
		this.eData = eData;
	}

	public String getePressure() {
		return ePressure;
	}

	public void setePressure(String ePressure) {
		this.ePressure = ePressure;
	}

	public String geteTemperature() {
		return eTemperature;
	}

	public void seteTemperature(String eTemperature) {
		this.eTemperature = eTemperature;
	}

	public String geteHumidity() {
		return eHumidity;
	}

	public void seteHumidity(String eHumidity) {
		this.eHumidity = eHumidity;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}