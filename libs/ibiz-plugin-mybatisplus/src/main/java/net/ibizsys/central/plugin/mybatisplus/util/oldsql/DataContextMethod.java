package net.ibizsys.central.plugin.mybatisplus.util.oldsql;

import java.util.List;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

/**
 * 数据上下文值计算方法
 * 
 * @author Administrator
 *
 */
public class DataContextMethod implements TemplateMethodModel {
	public Object exec(List arg0) throws TemplateModelException {
		try {
			if (arg0.size() == 0) {
				throw new Exception(String.format("没有指定当前数据参数"));
			}
			return String.format("#{ctx.datacontext.%1$s}", arg0.get(0)).toLowerCase();
		} catch (Exception ex) {
			throw new TemplateModelException(ex);
		}
	}

	
}
