package net.ibizsys.central.util.converter;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public abstract class DocumentConverterBase implements IDocumentConverter {

	@Override
	public boolean convert(InputStream inputStream, OutputStream outputStream, Map<String, Object> params, boolean tryMode) throws Throwable {

		
		
		return false;
	}

	@Override
	public String convert(String input, Map<String, Object> params, boolean tryMode) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	
}
