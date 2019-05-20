package com.mycom.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.demo.model.Board;



@RestController
public class SimpleController {
	
	@GetMapping("/")
	public String home(){
		return "hello world";
		
	}
	@GetMapping("/hello")
	public List<Board> listBoard(){
		List<Board> list = new ArrayList<>();
		
		for(int i=0 ; i< 10;i++) {
			list.add(new Board(i+1,"test-"+i, "contents-"+i));
			System.out.println("for "+i);
		}
		return list;
		
	}
	
	@GetMapping("/version")
	public String version(){
		System.out.println("======= version: v3.0");
		return "version 3.0";
		
	}
	

}
