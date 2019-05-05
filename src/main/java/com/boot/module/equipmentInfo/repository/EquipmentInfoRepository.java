package com.boot.module.equipmentInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.module.equipmentInfo.bean.EquipmentInfo;

@Repository
public interface EquipmentInfoRepository extends JpaRepository<EquipmentInfo, String> {
	
	EquipmentInfo findByEMac(String eMac);
	
	@Modifying
	@Query("update EquipmentInfo set eCmd = :command where 1 = 1")
	void updateAllCmd(@Param("command") String command);
	
	@Query(value = "select t.e_mac from equipment_info t", nativeQuery = true)
	List<String> findAllEMac();
	
}
