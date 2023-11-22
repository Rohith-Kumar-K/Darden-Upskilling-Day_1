package com.cg.university.results;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ResultService {

	@Autowired
	private ResultRepository repo;	
	
	//To List All
		public List<Result> listAll() {
			return repo.findAll();
		}
	
		//To save 
		public void save(Result result) {
			repo.save(result);
		}
		
		//To retrieve by management
		public Result get(Integer id) {
	       return repo.findById(id).get();		
	}
		
		       //To retrieve  by candidate
				public Result getbyid(Integer id) {
			       return repo.findById(id).get();		
			}
		
		//To delete
		public void delete(Integer id) {
			repo.deleteById(id);
		}
}
