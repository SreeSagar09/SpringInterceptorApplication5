package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/action")
public class ActionHandlerController {	
	
	@RequestMapping(path = "/actionHandler1")
	public ResponseEntity<Map<String, Object>> actionHandler1(){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> data = null;
		try {
			System.out.println("From actionHandler1 method in ActionHandlerController class");
			data = new LinkedHashMap<>();
			data.put("status", "success");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			data = new LinkedHashMap<>();
			data.put("status", "failed");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/actionHandler2")
	public ResponseEntity<Map<String, Object>> actionHandler2(){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> data = null;
		try {
			System.out.println("From actionHandler2 method in ActionHandlerController class");
			data = new LinkedHashMap<>();
			data.put("status", "success");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			data = new LinkedHashMap<>();
			data.put("status", "failed");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/actionHandler3")
	public ResponseEntity<Map<String, Object>> actionHandler3(){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> data = null;
		try {
			System.out.println("From actionHandler3 method in ActionHandlerController class");
			data = new LinkedHashMap<>();
			data.put("status", "success");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			data = new LinkedHashMap<>();
			data.put("status", "failed");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/actionHandler4")
	public ResponseEntity<Map<String, Object>> actionHandler4(){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> data = null;
		try {
			System.out.println("From actionHandler4 method in ActionHandlerController class");
			data = new LinkedHashMap<>();
			data.put("status", "success");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			data = new LinkedHashMap<>();
			data.put("status", "failed");
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
}
