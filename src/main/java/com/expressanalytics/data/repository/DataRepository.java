package com.expressanalytics.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.expressanalytics.data.models.Datas;

public interface DataRepository extends CrudRepository<Datas, String> {
	
}
