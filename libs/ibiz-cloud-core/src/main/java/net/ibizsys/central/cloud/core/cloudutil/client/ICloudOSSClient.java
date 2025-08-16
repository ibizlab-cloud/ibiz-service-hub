package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.util.ISearchContext;

public interface ICloudOSSClient {

	@RequestMapping(method = RequestMethod.POST, value = "/oss/object/{db}/{table}")
	String createObject(@PathVariable("db") String db, @PathVariable("table") String table, @RequestBody Map params);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/oss/object/{db}/{table}/{key}")
	Integer updateObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key, @RequestBody Map params);

	@RequestMapping(method = RequestMethod.DELETE, value = "/oss/object/{db}/{table}/{key}")
	Integer deleteObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.GET, value = "/oss/object/{db}/{table}/{key}")
	Map getObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/oss/object/{db}/{table}/fetch")
	Page<Map> fetchObjects(@PathVariable("db") String db, @PathVariable("table") String table, @RequestBody ISearchContext iSearchContext);
}
