package com.net.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="SP_DATA_MOVIE")
public class Movie implements Serializable{
	
	@Id
	@Column(name="MID")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer mid;
	@Column(name="MNAME",length=20)
	private String mname;
	@Column(name="YEAR",length=20)
	private String year;
	@Column(name="RATING")
	private Float rating;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	
	

}
