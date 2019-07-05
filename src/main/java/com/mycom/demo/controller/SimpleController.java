package com.mycom.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.demo.model.Board;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
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
		log.info(list.toString());
		return list;
		
	}
	
	@GetMapping("/version")
	public String version(){
		log.info("version 7.17");
		return "version 7.17";
		
	}
	
	@PostMapping("/update")
	public Board update(Board param) {
		Board board = new Board();
		board.setNum(param.getNum());
		board.setTitle(param.getTitle());
		board.setContents(param.getContents());
		return board;
		
	}
	

}
