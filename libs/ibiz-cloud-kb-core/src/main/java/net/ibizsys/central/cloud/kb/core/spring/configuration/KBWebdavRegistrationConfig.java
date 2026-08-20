package net.ibizsys.central.cloud.kb.core.spring.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.ibizsys.central.cloud.kb.core.spring.controller.KBWebdavServlet;

//@Configuration
public class KBWebdavRegistrationConfig {

	@Bean
	public ServletRegistrationBean<KBWebdavServlet> kbWebdavServlet(KBWebdavServlet myWebdavServlet) {
		ServletRegistrationBean<KBWebdavServlet> bean = new ServletRegistrationBean<>(myWebdavServlet, "/kb/webdav/*");
		bean.setName("KBWebdavServlet");
		// 可以设置初始化参数，例如认证头信息
		// bean.addInitParameter("www-authenticate", "Basic realm=\"My
		// WebDAV\"");
		return bean;
	}
}
