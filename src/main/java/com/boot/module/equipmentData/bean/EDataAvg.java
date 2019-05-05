package com.boot.module.equipmentData.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "e_data_avg")
@ApiModel(value = "EDataAvg", description = "平均数据")
public class EDataAvg {
    
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "e_data_avg_id")
    @ApiModelProperty(value = "数据流水号")
	private String eDataAvgId;
	
    @Column(name = "e_mac")
    @ApiModelProperty(value = "数据来源设备mac地址")
	private String eMac;
    
    @Column(name = "e_avg_pressure")
    @ApiModelProperty(value = "平均压力")
    private String eAvgPressure;
	
    @Column(name = "e_avg_temperature")
    @ApiModelProperty(value = "平均温度")
	private String eAvgTemperature;
	
    @Column(name = "e_avg_humidity")
    @ApiModelProperty(value = "平均湿度")
	private String eAvgHumidity;
    
    @Column(name = "start_time")
    @ApiModelProperty(value = "设备压力")
    private Date startTime;
    
    @Column(name = "end_time")
    @ApiModelProperty(value = "设备温度")
    private Date endTime;

	public String geteDataAvgId() {
		return eDataAvgId;
	}

	public void seteDataAvgId(String eDataAvgId) {
		this.eDataAvgId = eDataAvgId;
	}

	public String geteMac() {
		return eMac;
	}

	public void seteMac(String eMac) {
		this.eMac = eMac;
	}

	public String geteAvgPressure() {
		return eAvgPressure;
	}

	public void seteAvgPressure(String eAvgPressure) {
		this.eAvgPressure = eAvgPressure;
	}

	public String geteAvgTemperature() {
		return eAvgTemperature;
	}

	public void seteAvgTemperature(String eAvgTemperature) {
		this.eAvgTemperature = eAvgTemperature;
	}

	public String geteAvgHumidity() {
		return eAvgHumidity;
	}

	public void seteAvgHumidity(String eAvgHumidity) {
		this.eAvgHumidity = eAvgHumidity;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}