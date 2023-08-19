package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.service.IApiInterfImp;

@RestController
@RequestMapping("/policy")
public class ApiControlller {

	@Autowired
	private IApiInterfImp apiservice;

	
	@GetMapping("/getall")
	public List<Policy> getAll() {

		return (List<Policy>) apiservice.getall();

	}

	@PostMapping("/create")
	public void createpolicy(@RequestBody Policy policy) {
		apiservice.create(policy);
	}

	@PutMapping("/update/{id}")
	public void updatepolicy(@PathVariable("id") Integer id, @RequestBody Policy policy ) {
		apiservice.update(id, policy);
	}

	@DeleteMapping("/delete/{id}")
	public void deletepolicy(@PathVariable("id")Integer id) {
		apiservice.delete(id);
	}

}
