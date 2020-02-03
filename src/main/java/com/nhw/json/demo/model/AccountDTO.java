package com.nhw.json.demo.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.nhw.json.demo.model.view.JsonViews;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@Builder
@FieldNameConstants
public class AccountDTO {

	@JsonView(JsonViews.Internal.class)
	private String accountNumber;

	@JsonView(JsonViews.Public.class)
	private Integer accountType;
}
