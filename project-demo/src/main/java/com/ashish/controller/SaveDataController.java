package com.ashish.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.dto.ListOfString;
import com.ashish.exception.EmptyStringException;
import com.ashish.repository.SaveDataRepository;

@RestController
public class SaveDataController {

	@Autowired
	private SaveDataRepository saveDataRepository;
	@PostMapping("/save")
	public ResponseEntity returnOddNumber(@RequestBody ListOfString listOfString)throws EmptyStringException {
		
		ListOfString list = saveDataRepository.save(listOfString);
		
		
		
		if("".equalsIgnoreCase(list.getS1()) || "".equalsIgnoreCase(list.getS2())) {
				throw new EmptyStringException("String cant be empty..");
		}
		
		String[] s1 = list.getS1().split(",");
		String[] s2 = list.getS2().split(",");
		
		List<Integer> listOfOddNumber = new ArrayList<>();
		
		for(String ss : s1) {
			int i = Integer.parseInt(ss);
			if(i%2 != 0) {
				listOfOddNumber.add(i);
			}
		}
		
		for(String ss : s2) {
			int i = Integer.parseInt(ss);
			if(i%2 != 0) {
				listOfOddNumber.add(i);
			}
		}
		
		return new ResponseEntity(listOfOddNumber, HttpStatus.OK);
	}
}
