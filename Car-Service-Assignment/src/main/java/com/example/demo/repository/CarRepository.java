package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Car;
//import com.example.demo.models.Customer;

import java.util.*;
@Repository
public class CarRepository {
     
	@Autowired
	private JdbcTemplate template;
	
   
    
    public int addCar(Car entity) {
        
        SimpleJdbcInsert inserter=new SimpleJdbcInsert(template);
        
        inserter.withTableName("car").usingColumns("model","year","kilometers","brand","status");
        BeanPropertySqlParameterSource sql =new BeanPropertySqlParameterSource(entity);
        return inserter.execute(sql);
        
    }
    
        public List<Car> getAllCars(){
        
        String sql="select * from car";
        
        List<Car> carList=
                template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
        
        return carList;
        
        }
        
        public List<Car> getCarsforSale(){
            
            String sql="select * from car where status='UNSOLD'";
            
            List<Car> carList=
                    template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
            
            return carList;
            
            }
        public List<Car> getBrand(String car_brand)
    	{
    		String sql = "select * from car where brand=?";
    		List<Car> car =template.query(sql, new Object[]{car_brand},new BeanPropertyRowMapper<>(Car.class));
    		return car;
    	}
        
        
    	public String[] getTotalBrand() {
    		String sql = "select distinct(brand) from car";
    		List<String> lst = template.queryForList(sql, String.class);
    		String[] brandAll = lst.toArray(new String[lst.size()]);
    	
    		return brandAll;
    	}
}