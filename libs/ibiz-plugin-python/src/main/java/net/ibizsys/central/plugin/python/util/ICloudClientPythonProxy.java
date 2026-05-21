package net.ibizsys.central.plugin.python.util;

import java.util.Map;

import net.ibizsys.central.service.client.IWebClientRep;

public interface ICloudClientPythonProxy {

	IWebClientRep<String> get(String url, Map<String, Object> kwargs);
	
	IWebClientRep<String> post(String url, Map<String, Object> kwargs);
		
	IWebClientRep<String> put(String url, Map<String, Object> kwargs);
	
	IWebClientRep<String> delete(String url, Map<String, Object> kwargs);
}
