package net.ibizsys.central.plugin.mybatisplus.util.oldsql;

import java.util.List;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

/**
 * System上下文
 * 
 * @author Administrator
 *
 */
public class SystemContextMethod implements TemplateMethodModel {


	public Object exec(List arg0) throws TemplateModelException {
		try {
			if (arg0.size() == 0) {
				throw new Exception(String.format("没有指定当前数据参数"));
			}
			return String.format("#{ctx.systemcontext.%1$s}", arg0.get(0)).toLowerCase();
		} catch (Exception ex) {
			throw new TemplateModelException(ex);
		}
	}
}
