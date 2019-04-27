package com.boot.module.equipmentInfo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "EquipmentInfoVO", description = "TODO")
public class EquipmentInfoVO {
    
    /**
	 * 环保设备流水号
	 */
	@ApiModelProperty(value = "环保设备流水号")
	private String eId;
	
    /**
	 * 环保设备MAC地址
	 */
	@ApiModelProperty(value = "环保设备MAC地址")
	private String eMac;
	
    /**
	 * 所属省
	 */
	@ApiModelProperty(value = "所属省")
	private String eProvince;
	
    /**
	 * 所属市
	 */
	@ApiModelProperty(value = "所属市")
	private String eCity;
	
    /**
	 * 所属区
	 */
	@ApiModelProperty(value = "所属区")
	private String eDistrict;

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
	
}