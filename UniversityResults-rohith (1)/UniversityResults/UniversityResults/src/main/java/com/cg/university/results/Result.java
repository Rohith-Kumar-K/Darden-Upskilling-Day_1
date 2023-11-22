package com.cg.university.results;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Result {
	
	@Id
	private Integer id;
	private String name;
    private int score;
    private String results;
    
    
	public Result() {
		
	}


	public Result(Integer id, String name, int score, String results) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.results = results;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getResults() {
		return results;
	}


	public void setResults(String results) {
		this.results = results;
	}


	@Override
	public String toString() {
		return "Results [id=" + id + ", name=" + name + ", score=" + score + ", results=" + results + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getScore()=" + getScore() + ", getResults()=" + getResults()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
    

}
