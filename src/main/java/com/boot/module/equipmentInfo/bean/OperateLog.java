package com.boot.module.equipmentInfo.bean;

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
@Table(name = "operate_log")
@ApiModel(value = "OperateLog", description = "设备操作日志")
public class OperateLog {
    
	/**
	 * 环保设备流水号
	 */
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "log_id")
    @ApiModelProperty(value = "环保设备流水号")
	private String logId;
	
	@Column(name = "e_id")
    @ApiModelProperty(value = "环保设备ID")
	private String eId;
	
    @Column(name = "e_cmd")
    @ApiModelProperty(value = "当前设备控制命令")
    private String eCmd;

    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteCmd() {
		return eCmd;
	}

	public void seteCmd(String eCmd) {
		this.eCmd = eCmd;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}