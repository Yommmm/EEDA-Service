package com.boot.module.equipmentData.bean;

import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "equipment_data")
@ApiModel(value = "EquipmentData", description = "数据实体")
public class EquipmentData {
    
	/**
	 * 数据流水号
	 */
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "e_data_id")
    @ApiModelProperty(value = "数据流水号")
	private String eDataId;
	
	/**
	 * 数据来源设备mac地址
	 */
    @Column(name = "e_mac")
    @ApiModelProperty(value = "数据来源设备mac地址")
	private String eMac;
    
    @Column(name = "e_name")
    @ApiModelProperty(value = "数据来源设备名称")
    private String eName;
	
	/**
	 * 数据来源设备IP地址
	 */
    @Column(name = "e_ip")
    @ApiModelProperty(value = "数据来源设备IP地址")
	private String eIp;
	
	/**
	 * 设备数据
	 */
    @Column(name = "e_data")
    @ApiModelProperty(value = "设备数据")
	private String eData;
    
    @Column(name = "e_pressure")
    @ApiModelProperty(value = "设备压力")
    private String ePressure;
    
    @Column(name = "e_temperature")
    @ApiModelProperty(value = "设备温度")
    private String eTemperature;
    
    @Column(name = "e_humidity")
    @ApiModelProperty(value = "设备湿度")
    private String eHumidity;
    
    @Column(name = "create_time")
    @ApiModelProperty(value = "采集时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
}