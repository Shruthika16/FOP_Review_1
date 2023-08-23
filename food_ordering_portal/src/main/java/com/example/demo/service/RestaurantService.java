package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepo;


@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepo rr;
	
	public Restaurant saveinfo(Restaurant r)
	{
		return rr.save(r);
	}
	public List<Restaurant> saveinfo(List<Restaurant> r)
	{
		return rr.saveAll(r);
	}
	public List<Restaurant> showinfo()
	{
		return rr.findAll();
	}
	public Restaurant changeinfo(Restaurant r)
	{
		return rr.saveAndFlush(r);
	}
	public void deleteinfo(Restaurant r)
	{
		rr.delete(r);
	}
	public void deleteid(int id) {

		rr.deleteById(id);

	}

	public void deletepid(int id) {

		rr.deleteById(id);

	}

	public Optional<Restaurant> showbyid(int id){

		return rr.findById(id);

	}

	public String updateinfobyid(int id,Restaurant r) {

		rr.saveAndFlush(r);

		if(rr.existsById(id)) {

			return "updated";

			

		}

		else {

			return "enter valid id";

		}

	}

}
