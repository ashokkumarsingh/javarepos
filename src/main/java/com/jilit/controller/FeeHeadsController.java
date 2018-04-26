package com.jilit.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jilit.dao.FeeHeadsDAO;
import com.jilit.entity.FeeHeads;
 

@RestController
public class FeeHeadsController {

	 
	@Autowired
	FeeHeadsDAO fHeadDAO;
	
		 
		@GetMapping(value="/feehead/{id}")
				
		public Optional<FeeHeads> feeHeadsById(
			@PathVariable String id) throws Exception
		{
			Optional<FeeHeads> fheads = fHeadDAO.findById(id);
			if(fheads.isPresent())
			{	  
				System.out.println("Following emp are loaded:");			 
				return fheads;
			}
			else
				throw new Exception("No object found for the Id: "+id);
		}
		
	//method to fetch all department using their job
	@GetMapping(value="/feeheads")		
	public Iterable<FeeHeads> getAllFeeHeads() 
		{
		try
		{
			return fHeadDAO.findAll();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		}	
		
	
		
}

