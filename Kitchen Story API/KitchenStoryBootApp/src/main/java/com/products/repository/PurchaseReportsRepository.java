package com.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.PurchaseReports;


public interface PurchaseReportsRepository extends JpaRepository<PurchaseReports, Integer>{
	
	//public List<PurchaseReports> findByCategory(String category);
	//public List<PurchaseReports> findByCreatedate(String createdate);

}
