package com.nhw.json.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.nhw.json.demo.model.OuterDTO;
import com.nhw.json.demo.model.view.JsonViews;
import com.nhw.json.demo.service.DemoDataProvider;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DemoDataController {

	private final DemoDataProvider dataProvider;

	@JsonView(JsonViews.Public.class)
	@GetMapping("/public")
	public OuterDTO publicPath() {
		return dataProvider.getData();
	}

	@JsonView(JsonViews.Internal.class)
	@GetMapping("/internal")
	public OuterDTO internalPath() {
		return dataProvider.getData();
	}

}
