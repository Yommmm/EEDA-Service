package com.boot.module.equipmentData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.module.equipmentData.bean.EquipmentData;

@Repository
public interface EquipmentDataRepository extends JpaRepository<EquipmentData, String> {
	
	@Query("SELECT t FROM EquipmentData t ORDER BY t.createTime DESC")
	List<EquipmentData> findEdDesc();
	
	List<EquipmentData> findEquipmentDataByEMacOrderByCreateTimeDesc(String eMac);
	
}
