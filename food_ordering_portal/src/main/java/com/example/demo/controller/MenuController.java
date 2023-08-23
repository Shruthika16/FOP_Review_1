package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Menu;
import com.example.demo.service.MenuService;

@RestController
public class MenuController {
	@Autowired
	MenuService mser;
	
	@PostMapping("addmenuitem")
	public Menu add(@RequestBody Menu m)
	{
		return mser.saveinfo(m);
	}
	@PostMapping("addmenuitems")
	public List<Menu> addn(@RequestBody List<Menu> m)
	{
		return mser.saveinfo(m);
	}
	
	
	
	@GetMapping("showmenu")
	public List<Menu> show()
	{
		return mser.showinfo();
	}
	@GetMapping("showmenybyid/{id}")
	public Optional<Menu> showid(@PathVariable int id) 
	{
		return mser.showbyid(id);
	}
	
	
	
	@PutMapping("updatemenu")
	public Menu modify(@RequestBody Menu m)
	{
		return mser.changeinfo(m);
	}
	@PutMapping("updatemenubyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Menu m) 
	{
		return mser.updateinfobyid(id, m);
	}
	
	
	
	@DeleteMapping("deletemenuitem")
	public String del(@RequestBody Menu m)
	{
		mser.deleteinfo(m);
		return "Deleted Successfully";
	}
	@DeleteMapping("deletemenuitembyid/{id}")
	public void deletemyid(@PathVariable int id) 
	{
		mser.deleteid(id);
	}
	@DeleteMapping("deletemenuitembyparamid")
	public void deletemyparamid(@RequestParam int id) 
	{
		mser.deletepid(id);
	}
}
