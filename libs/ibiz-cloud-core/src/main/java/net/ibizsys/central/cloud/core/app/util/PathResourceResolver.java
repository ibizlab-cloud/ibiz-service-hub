package net.ibizsys.central.cloud.core.app.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.Resource;
import org.springframework.web.servlet.resource.ResourceResolverChain;
import org.springframework.web.util.UrlPathHelper;

import net.ibizsys.central.cloud.core.IServiceHub;

public class PathResourceResolver extends org.springframework.web.servlet.resource.PathResourceResolver {

	private IServiceHub serviceHub = null;
	public PathResourceResolver(IServiceHub serviceHub) {
		this.serviceHub = serviceHub;
	}
	
	@Override
	public void setAllowedLocations(Resource... locations) {
		// TODO Auto-generated method stub
		super.setAllowedLocations(locations);
	}

	@Override
	public Resource[] getAllowedLocations() {
		// TODO Auto-generated method stub
		return super.getAllowedLocations();
	}

	@Override
	public void setLocationCharsets(Map<Resource, Charset> locationCharsets) {
		// TODO Auto-generated method stub
		super.setLocationCharsets(locationCharsets);
	}

	@Override
	public Map<Resource, Charset> getLocationCharsets() {
		// TODO Auto-generated method stub
		return super.getLocationCharsets();
	}

	@Override
	public void setUrlPathHelper(UrlPathHelper urlPathHelper) {
		// TODO Auto-generated method stub
		super.setUrlPathHelper(urlPathHelper);
	}

	@Override
	public UrlPathHelper getUrlPathHelper() {
		// TODO Auto-generated method stub
		return super.getUrlPathHelper();
	}

	@Override
	protected Resource resolveResourceInternal(HttpServletRequest request, String requestPath, List<? extends Resource> locations, ResourceResolverChain chain) {
		// TODO Auto-generated method stub
		//return super.resolveResourceInternal(request, requestPath, locations, chain);
		return this.serviceHub.resolveWebResource(request, requestPath);
	}

	@Override
	protected String resolveUrlPathInternal(String resourcePath, List<? extends Resource> locations, ResourceResolverChain chain) {
		// TODO Auto-generated method stub
		return super.resolveUrlPathInternal(resourcePath, locations, chain);
	}

	@Override
	protected Resource getResource(String resourcePath, Resource location) throws IOException {
		// TODO Auto-generated method stub
		return super.getResource(resourcePath, location);
	}

	@Override
	protected boolean checkResource(Resource resource, Resource location) throws IOException {
		// TODO Auto-generated method stub
		return super.checkResource(resource, location);
	}

}
