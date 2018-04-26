package com.jilit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jilit.entity.FeeHeads;


@Repository
public interface FeeHeadsDAO extends 
JpaRepository<FeeHeads, String> {

	
}
