package com.products.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.PurchaseReports;
import com.products.repository.PurchaseReportsRepository;
import com.products.service.PurchaseReportsSearchService;

@Service
public class PurchaseReportsSearchServiceImpl implements PurchaseReportsSearchService{

	@Autowired
	private PurchaseReportsRepository purchaseRepo;
	@Override
	public List<PurchaseReports> getAll() {
		
		return purchaseRepo.findAll();
	}

	

}
