package net.ibizsys.runtime.res;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 默认系统值函数运行时实现
 * @author lionlau
 *
 */
public class DefaultSysValueFuncRuntime extends SysValueFuncRuntimeBase {

	
	@Override
	public void convert(ISearchContextBase iSearchContextBase, IPSDEFSearchMode iPSDEFSearchMode, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime) {
	
		Assert.notNull(iSearchContextBase, "搜索上下文对象无效");
		Assert.notNull(iPSDEFSearchMode, "属性搜索模式对象无效");
		Assert.notNull(iPSDEField, "属性对象无效");
		Assert.notNull(iDataEntityRuntime, "实体运行时对象无效");
		
		if(!StringUtils.hasLength(iPSDEFSearchMode.getValueFunc())) {
			return;
		}
		
		Object objValue = iDataEntityRuntime.getSearchCondition(iSearchContextBase, iPSDEField, iPSDEFSearchMode);
		if(ObjectUtils.isEmpty(objValue)) {
			return ;
		}
		
		if(PREDEFINED_DATEDIFFNOW.equalsIgnoreCase(iPSDEFSearchMode.getValueFunc())) {
			int nDays = 0;
			try {
				nDays = DataTypeUtils.getIntegerValue(objValue, 0);
			} catch (Exception e) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("转化天数[%1$s]发生异常", objValue));
			}
			java.sql.Timestamp curTime = new java.sql.Timestamp(System.currentTimeMillis());
			long nTime = System.currentTimeMillis() / 86400000 * 86400000;
			
			nTime = nTime - 86400000 * nDays;
			java.sql.Timestamp realTime = new java.sql.Timestamp(nTime);
			
			if(Conditions.LTANDEQ.equals(iPSDEFSearchMode.getValueOP())) {
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.GTANDEQ, realTime);
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.LTANDEQ, curTime);
				return;				
			}
			
			if(Conditions.GTANDEQ.equals(iPSDEFSearchMode.getValueOP())) {
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.LTANDEQ, realTime);
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.LTANDEQ, curTime);
				return;	
			}
		}
		
		if(PREDEFINED_DATEDIFFNOW2.equalsIgnoreCase(iPSDEFSearchMode.getValueFunc())) {
			int nDays = 0;
			try {
				nDays = DataTypeUtils.getIntegerValue(objValue, 0);
			} catch (Exception e) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("转化天数[%1$s]发生异常", objValue));
			}
			java.sql.Timestamp curTime = new java.sql.Timestamp(System.currentTimeMillis());
			long nTime = System.currentTimeMillis() / 86400000 * 86400000;
		
			
			nTime = nTime + 86400000 * nDays;
			java.sql.Timestamp realTime = new java.sql.Timestamp(nTime);
			
			if(Conditions.LTANDEQ.equals(iPSDEFSearchMode.getValueOP())) {
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.LTANDEQ, realTime);
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.GTANDEQ, curTime);
				return;				
			}
			
			if(Conditions.GTANDEQ.equals(iPSDEFSearchMode.getValueOP())) {
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.GTANDEQ, realTime);
				iDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.GTANDEQ, curTime);
				return;	
			}
		}
		
		
		
		
		throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法识别的搜索模式[%1$s]值函数条件[%2$s]", iPSDEFSearchMode.getName(), iPSDEFSearchMode.getValueFunc()));
	}

	
}
