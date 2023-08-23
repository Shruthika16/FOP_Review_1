package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Menu;
import com.example.demo.repository.MenuRepo;

@Service
public class MenuService {
	@Autowired
	MenuRepo mr;
	
	public Menu saveinfo(Menu m)
	{
		return mr.save(m);
	}
	public List<Menu> saveinfo(List<Menu> m)
	{
		return mr.saveAll(m);
	}
	public List<Menu> showinfo()
	{
		return mr.findAll();
	}
	public Menu changeinfo(Menu r)
	{
		return mr.saveAndFlush(r);
	}
	public void deleteinfo(Menu r)
	{
		mr.delete(r);
	}
	public void deleteid(int id) {

		mr.deleteById(id);

	}

	public void deletepid(int id) {

		mr.deleteById(id);

	}

	public Optional<Menu> showbyid(int id){

		return mr.findById(id);

	}

	public String updateinfobyid(int id,Menu m) {

		mr.saveAndFlush(m);

		if(mr.existsById(id)) {

			return "updated";

			

		}

		else {

			return "enter valid id";

		}

	}
	
}
