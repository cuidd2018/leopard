package io.leopard.web.mvc;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import io.leopard.burrow.lang.inum.Onum;

/**
 * Onum Json序列化.
 * 
 * @author 谭海潮
 *
 */
public class OnumJsonSerializer extends StdSerializer<Onum<?, ?>> {

	private static final long serialVersionUID = 1L;

	public OnumJsonSerializer() {
		super(Onum.class, false);
	}

	@Override
	public void serialize(Onum<?, ?> value, JsonGenerator generator, SerializerProvider provider) throws IOException {
		generator.writeStartObject();
		generator.writeFieldName("key");
		generator.writeNumber("abc");
		generator.writeFieldName("desc");
		generator.writeString("中文名称");
		generator.writeEndObject();
	}

}
