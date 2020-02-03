package com.nhw.json.demo.customization;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.nhw.json.demo.model.AccountDTO;
import com.nhw.json.demo.model.view.JsonViews;

public class AccountAnynymizingSerializerDelegate extends JsonSerializer<AccountDTO> {

	@Override
	public void serialize(final AccountDTO value, final JsonGenerator gen, final SerializerProvider serializers)
			throws IOException {
		gen.writeNumberField("type", value.getAccountType());
		Class<?> activeView = serializers.getActiveView();
		if (activeView.equals(JsonViews.Public.class)) {
			gen.writeStringField("accountNumber", anonymizeAccountNumber(value.getAccountNumber()));
		} else {
			gen.writeStringField("accountNumber", value.getAccountNumber());
		}
	}

	private String anonymizeAccountNumber(String accountNumber) {
		return StringUtils.abbreviate(accountNumber, 4);
	}
}