package net.ibizsys.central.cloud.core.spring.configuration;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import net.ibizsys.central.cloud.core.IServiceHub;

@Configuration
public class ServletAppConfig {

	@Autowired
	IServiceHub serviceHub;
	
	@Bean
	public SimpleUrlHandlerMapping faviconHandlerMapping() {
		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		mapping.setOrder(Integer.MIN_VALUE + 1);
		mapping.setUrlMap(Collections.singletonMap(String.format("/%1$s/**", serviceHub.getServletAppBaseUrl()), webResourceHttpRequestHandler()));
		return mapping;
	}

	@Bean
	public ResourceHttpRequestHandler webResourceHttpRequestHandler() {
		ResourceHttpRequestHandler requestHandler = new ResourceHttpRequestHandler( );
		requestHandler.setResourceResolvers(Arrays.asList(new net.ibizsys.central.cloud.core.app.util.PathResourceResolver(serviceHub)));
		return requestHandler;
	}

}
