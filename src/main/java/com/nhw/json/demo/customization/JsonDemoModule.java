package com.nhw.json.demo.customization;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.nhw.json.demo.model.AccountDTO;

@Component
public class JsonDemoModule extends SimpleModule {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6100207420668434789L;

	public JsonDemoModule() {
		addSerializer(AccountDTO.class, new AccountDTOSerializer());
	}
}