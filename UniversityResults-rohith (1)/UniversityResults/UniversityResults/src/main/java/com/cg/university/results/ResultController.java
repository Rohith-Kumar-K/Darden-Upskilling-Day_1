package com.cg.university.results;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService service;	
    
    //Restful API methods for Retrieval operation
    @GetMapping("/management/all")
    public List<Result>listAll(){
    	return service.listAll();
    }
    
    //To retrieval by management through id
    @GetMapping("/management/{id}")
    public ResponseEntity<Result> get(@PathVariable Integer id) {
        try {
        	Result result = service.get(id);
			return new ResponseEntity<Result> (result, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Result> (HttpStatus.NOT_FOUND);
		}
    }
    
    
     //To retrieval by candidate through id
    @GetMapping("/candidate/{id}")
    public ResponseEntity<Result> getbyid(@PathVariable Integer id) {
        try {
        	Result result = service.get(id);
			return new ResponseEntity<Result> (result, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Result> (HttpStatus.NOT_FOUND);
		}
    }
    
    //To data the add the data to database
    @PostMapping("/management")
    public void add(@RequestBody Result result) {
    	service.save(result);
    	}
    
    //To update data in database
    @PutMapping("/management/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Result result) {
        try {
        	Result existingResult = service.get(id);
			service.save(result);
			return new  ResponseEntity<> (HttpStatus.OK);
		} catch (Exception e) {
			return new  ResponseEntity<> (HttpStatus.NOT_FOUND);
		}
       
    }
    
    
    //To delete data in data base
    @DeleteMapping("/management/{id}")
    public void delete(@PathVariable Integer id) {
    		service.delete(id);
 
    }
	
}
