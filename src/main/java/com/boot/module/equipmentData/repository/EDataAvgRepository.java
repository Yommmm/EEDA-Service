package com.boot.module.equipmentData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.module.equipmentData.bean.EDataAvg;

@Repository
public interface EDataAvgRepository extends JpaRepository<EDataAvg, String> {
	
}