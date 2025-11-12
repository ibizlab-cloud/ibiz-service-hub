package net.ibizsys.central.cloud.core.log;

import java.io.Serializable;

import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@Plugin(name = "PSStudioConsole", 
category = Core.CATEGORY_NAME, 
elementType = Appender.ELEMENT_TYPE, 
printObject = true)
public class PSStudioConsoleAppender extends AbstractAppender {

	private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
	

	public PSStudioConsoleAppender(String name, Filter filter, Layout<? extends Serializable> layout, boolean ignoreExceptions, Property[] properties) {
		super(name, filter, layout, ignoreExceptions, properties);

	}
	
	@Override
	public void append(LogEvent event) {
		ISystemRuntime iSystemRuntime =	SystemRuntimeHolder.peek();
		if(iSystemRuntime == null) {
			return;
		}
		
		String strPSDevSlnSysId = iSystemRuntime.getPSDevSlnSysId();
		if(!StringUtils.hasLength(strPSDevSlnSysId)) {
			return;
		}
		
		ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = this.getSysCloudLogUtilRuntime();
		if(iSysCloudLogUtilRuntime == null) {
			return;
		}
		
		//this.getLayout().
		
		System.out.println(event.toString());
	}

	protected ISysCloudLogUtilRuntime getSysCloudLogUtilRuntime() {
		if(this.iSysCloudLogUtilRuntime == null) {
			if(ServiceHub.getInstance(true) != null) {
				if(ServiceHub.getInstance().getHubSystemRuntime(true) != null) {
					this.iSysCloudLogUtilRuntime = ServiceHub.getInstance().getHubSystemRuntime(false).getSysUtilRuntime(ISysCloudLogUtilRuntime.class, true);
				}
			}
		}
		return this.iSysCloudLogUtilRuntime;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	 // 3. 使用 @PluginFactory 注解的静态方法，用于创建 Appender 实例
    @PluginFactory
    public static PSStudioConsoleAppender createAppender(
            @PluginAttribute("name") String name,
            @PluginElement("Filter") Filter filter,
            @PluginElement("Layout") Layout<? extends Serializable> layout) {

        if (name == null) {
            LOGGER.error("No name provided for PSStudioConsoleAppender");
            return null;
        }
        if (layout == null) {
            // 可以设置一个默认的布局格式
            layout = PatternLayout.createDefaultLayout();
        }
        return new PSStudioConsoleAppender(name, filter, layout, true, Property.EMPTY_ARRAY);
    }
}
