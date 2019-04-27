package com.boot.module.equipmentInfo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "equipment_info")
@ApiModel(value = "EquipmentInfo", description = "设备信息实体")
public class EquipmentInfo {
    
	/**
	 * 环保设备流水号
	 */
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "e_id")
    @ApiModelProperty(value = "环保设备流水号")
	private String eId;
	
	/**
	 * 环保设备MAC地址
	 */
    @Column(name = "e_mac")
    @ApiModelProperty(value = "环保设备MAC地址")
	private String eMac;
	
	/**
	 * 所属省
	 */
    @Column(name = "e_province")
    @ApiModelProperty(value = "所属省")
	private String eProvince;
	
	/**
	 * 所属市
	 */
    @Column(name = "e_city")
    @ApiModelProperty(value = "所属市")
	private String eCity;
	
	/**
	 * 所属区
	 */
    @Column(name = "e_district")
    @ApiModelProperty(value = "所属区")
	private String eDistrict;
    
    @Column(name = "e_cmd")
    @ApiModelProperty(value = "当前设备控制命令")
    private String eCmd;

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteMac() {
		return eMac;
	}

	public void seteMac(String eMac) {
		this.eMac = eMac;
	}

	public String geteProvince() {
		return eProvince;
	}

	public void seteProvince(String eProvince) {
		this.eProvince = eProvince;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public String geteDistrict() {
		return eDistrict;
	}

	public void seteDistrict(String eDistrict) {
		this.eDistrict = eDistrict;
	}

	public String geteCmd() {
		return eCmd;
	}

	public void seteCmd(String eCmd) {
		this.eCmd = eCmd;
	}
	
}