package net.ibizsys.central.cloud.kb.core.spring.controller;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.jackrabbit.core.RepositoryImpl;
import org.apache.jackrabbit.core.config.ConfigurationException;
import org.apache.jackrabbit.core.config.RepositoryConfig;
import org.apache.jackrabbit.webdav.simple.SimpleWebdavServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import net.ibizsys.central.cloud.core.IServiceHub;

//@Component
public class KBWebdavServlet extends SimpleWebdavServlet {

	private static final Log log = LogFactory.getLog(KBWebdavServlet.class);

	@Autowired
	IServiceHub iServiceHub;

	// @Autowired
	// private DavResourceFactory davResourceFactory;
	//
	// @Autowired
	// private DavSessionProvider davSessionProvider;
	//
	// @Autowired
	// private DavLocatorFactory davLocatorFactory;
	
//	private DavSessionProvider davSessionProvider = new KBDavSessionProvider();
//	
//	private DavLocatorFactory locatorFactory = new KBDavLocatorFactory("/kb/webdav/");

	private Repository repository = null; 
	/**
	 * 重写 init 方法，启用 Spring 的自动注入
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// 关键：让 Spring 处理这个 Servlet 中的 @Autowired 注解
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<Repository>\r\n" + 
				"    <!-- 全局文件系统 -->\r\n" + 
				"    <FileSystem class=\"org.apache.jackrabbit.core.fs.local.LocalFileSystem\">\r\n" + 
				"        <param name=\"path\" value=\"${rep.home}/repository\"/>\r\n" + 
				"    </FileSystem>\r\n" + 
				"\r\n" + 
				"    <!-- 安全配置（使用默认的 SimpleLoginModule） -->\r\n" + 
				"    <Security appName=\"Jackrabbit\">\r\n" + 
				//"        <LoginModule class=\"org.apache.jackrabbit.core.security.simple.SimpleLoginModule\">\r\n" + 
				"        <LoginModule class=\"net.ibizsys.central.cloud.kb.core.util.jackrabbit.KBDavLoginModule\">\r\n" +
				"            <param name=\"anonymousId\" value=\"anonymous\"/>\r\n" + 
				"            <param name=\"adminId\" value=\"admin\"/>\r\n" + 
				"        </LoginModule>\r\n" + 
				"    </Security>\r\n" + 
				"\r\n" + 
				"    <!-- 工作空间目录 -->\r\n" + 
				"    <Workspaces rootPath=\"${rep.home}/workspaces\" defaultWorkspace=\"default\"/>\r\n" + 
				"\r\n" + 
				"    <Workspace name=\"${wsp.name}\">\r\n" + 
				"        <FileSystem class=\"net.ibizsys.central.cloud.kb.core.util.jackrabbit.KBDavFileSystem\">\r\n" + 
				"            <param name=\"path\" value=\"${wsp.home}\"/>\r\n" + 
				"        </FileSystem>\r\n" + 
				"        <PersistenceManager class=\"net.ibizsys.central.cloud.kb.core.util.jackrabbit.KBDavBundlePersistenceManager\">\r\n" + 
				"        </PersistenceManager>\r\n" + 
				"    </Workspace>\r\n" + 
				"\r\n" + 
				"    <!-- 版本存储 -->\r\n" + 
				"    <Versioning rootPath=\"${rep.home}/version\">\r\n" + 
				"        <FileSystem class=\"org.apache.jackrabbit.core.fs.local.LocalFileSystem\">\r\n" + 
				"            <param name=\"path\" value=\"${rep.home}/version\"/>\r\n" + 
				"        </FileSystem>\r\n" + 
				"        <PersistenceManager class=\"net.ibizsys.central.cloud.kb.core.util.jackrabbit.KBDavBundlePersistenceManager\">\r\n" + 
				"        </PersistenceManager>\r\n" + 
				
				"    </Versioning>\r\n" + 
				"</Repository>");
		
		
		RepositoryConfig repositoryConfig;
		try {
			repositoryConfig = RepositoryConfig.create(new ByteArrayInputStream(sb.toString().getBytes(StandardCharsets.UTF_8)), "D:\\test");
		} catch (ConfigurationException e) {
			throw new ServletException(e);
		}
		
		try {
			this.repository = RepositoryImpl.create(repositoryConfig);
		} catch (RepositoryException e) {
			throw new ServletException(e);
		}
		
		log.debug(String.format("Cloud知识库Webdav服务已经启动"));
		iServiceHub.registerIgnoreAuthPattern("/kb/webdav/**");
	}

	@Override
	public String getInitParameter(String name) {
		if(INIT_PARAM_RESOURCE_PATH_PREFIX.equals(name)) {
			return "/kb/webdav/";
		}
		return super.getInitParameter(name);
	}

	@Override
	public Repository getRepository() {
		return this.repository;
	}
}
