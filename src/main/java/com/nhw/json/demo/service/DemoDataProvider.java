package com.nhw.json.demo.service;

import org.springframework.stereotype.Service;

import com.nhw.json.demo.model.AccountDTO;
import com.nhw.json.demo.model.OuterDTO;

@Service
public class DemoDataProvider {

	private static OuterDTO DATA = buildData();

	public OuterDTO getData() {
		return DATA;
	}

	private static OuterDTO buildData() {
		AccountDTO inner = AccountDTO.builder().accountNumber("1245871119").accountType(1).build();
		OuterDTO outer = OuterDTO.builder().firstName("Qba").lastName("Walat").account(inner).build();
		return outer;
	}
}
