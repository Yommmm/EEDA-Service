package com.boot.module.equipmentData.repository;

import java.util.List;
import java.util.Map;

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
	
	@Query(value = "SELECT t.* FROM equipment_data t WHERE t.e_mac = :eMac ORDER BY t.CREATE_TIME DESC LIMIT 1", nativeQuery = true)
	EquipmentData findLast(@Param("eMac") String eMac);
	
	@Query(value = "SELECT AVG(t.e_pressure) as e_pressure, AVG(t.e_temperature) as e_temperature, AVG(t.e_humidity) as e_humidity "
			+ "FROM equipment_data t "
			+ "WHERE t.e_mac = :eMac "
			+ "and t.create_time < :time", 
			nativeQuery = true)
	Map<String, Object> queryAvgLast10Min(@Param("eMac") String eMac, @Param("time") String time);
	
	@Query(value = "SELECT t.* FROM equipment_data t "
			+ "WHERE t.e_mac = :eMac "
			+ "and t.create_time < :time", 
			nativeQuery = true)
	List<EquipmentData> queryLast10Min(@Param("eMac") String eMac, @Param("time") String time);
	
}
