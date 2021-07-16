package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Car;
//import com.example.demo.models.Car;
//import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private Car cars;
	
	@Autowired
	private CarRepository repo;
	
	@RequestMapping(value="/cars",method = RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("command", cars);
		return "addcar";
	}

	@RequestMapping(value="/cars",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Car car,Model model) {
		
		 int rowAdded = repo.addCar(car);
		 model.addAttribute("rowAdded",rowAdded);
	   // System.out.println(customer);
		return "addcar";
	}
	
	@RequestMapping(value="/cars/all",method = RequestMethod.GET)
	public String findAllForm(Model model) {
		
		List<Car> list = repo.getAllCars();
		model.addAttribute("list", list);
		return "showcar";
	}
	
	@RequestMapping(value="/cars/viewall",method = RequestMethod.GET)
	public String findAllCar(Model model) {
		
		List<Car> list = repo.getCarsforSale();
		model.addAttribute("list", list);
		return "carforsale";
	}
	
	/*@ModelAttribute("brands")
	public String[] brands() {
		
		return new String[] {"Maruti","Benz","Audi","Tata","Mahindra","Lamburgini"};
	}*/
	

	@RequestMapping(value = "/cars/brand", method = RequestMethod.POST)
	public String findCarsByBrand(@ModelAttribute("command") @RequestParam("brand")String brand,Model model) {

	List<Car> list=repo.getsCarsByBrand(brand);	
	
    model.addAttribute("list", list);
		return "carsByBrand";

	}

 
	@RequestMapping(value = "/cars/showByBrand", method = RequestMethod.GET)
   	public String initFormBrand(Model model) {

   	model.addAttribute("command",cars);
   		
   		return "selectBrand";

   	}
   	@ModelAttribute("brands")
	public String[] brand() {
   		String[] brands=repo.getBrand();
   	
		//return new String[] { "Maruti","TATA","Mahindra" };
  return brands;
   	}
}
