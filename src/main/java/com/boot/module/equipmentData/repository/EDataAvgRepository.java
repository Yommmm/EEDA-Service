package com.boot.module.equipmentData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.module.equipmentData.bean.EDataAvg;

@Repository
public interface EDataAvgRepository extends JpaRepository<EDataAvg, String> {
	
	@Query(value = "SELECT t.* FROM e_data_avg t "
			+ "WHERE t.e_mac = :eMac "
			+ "ORDER BY t.end_time DESC LIMIT 1", nativeQuery = true)
	EDataAvg findListByEMac(@Param("eMac") String eMac);
	
}