package com.seileen.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seileen.springbootbackend.model.Phone;
import com.seileen.springbootbackend.model.User;
import com.seileen.springbootbackend.repository.PhoneRepository;
import com.seileen.springbootbackend.repository.UserRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("phone/")
public class PhoneController {
	
	@Autowired
	private PhoneRepository phoneRepository;
	
	@GetMapping("phones")
	public List<Phone> getPhones()
	{
		return this.phoneRepository.findAll();
	}
}
