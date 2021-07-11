package com.example.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	String model;
	String year;
	long kilometers;
	String brand;
	String status;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String model, String year, long kilometers, String brand, String status) {
		super();
		this.model = model;
		this.year = year;
		this.kilometers = kilometers;
		this.brand = brand;
		this.status = status;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public long getKilometers() {
		return kilometers;
	}
	public void setKilometers(long kilometers) {
		this.kilometers = kilometers;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
