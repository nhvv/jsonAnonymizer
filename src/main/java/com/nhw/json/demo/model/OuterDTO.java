package com.nhw.json.demo.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.nhw.json.demo.model.view.JsonViews;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@Builder
@JsonView(JsonViews.Public.class)
@FieldNameConstants
public class OuterDTO {

	private String firstName;
	private String lastName;
	private AccountDTO account;
}
