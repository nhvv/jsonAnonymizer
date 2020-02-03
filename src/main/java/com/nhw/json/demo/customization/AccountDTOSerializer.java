package com.nhw.json.demo.customization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.nhw.json.demo.model.AccountDTO;

public class AccountDTOSerializer extends JsonSerializer<AccountDTO> {

	private final JsonSerializer<AccountDTO> delegate = new AccountAnynymizingSerializerDelegate();

	@Override
	public void serialize(final AccountDTO value, final JsonGenerator gen, final SerializerProvider serializers)
			throws IOException {
		gen.writeStartObject();
		this.delegate.serialize(value, gen, serializers);
		gen.writeEndObject();
	}

}