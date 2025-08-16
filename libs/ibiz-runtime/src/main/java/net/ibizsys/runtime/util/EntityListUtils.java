package net.ibizsys.runtime.util;

import java.math.BigDecimal;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.der.DER1NDEFMapTypes;

/**
 * 数据对象列表功能
 * @author lionlau
 *
 */
public class EntityListUtils {

	
	/**
	 * 计算列表指定属性的最大值
	 * @param list
	 * @param iPSDEField
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static Object max(IEntityBase[] list, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime){
		if( list == null || list.length == 0 ) {
			return null;
		}
		
		Object maxValue = null;
		for(IEntityBase iEntityBase : list) {
			Object objValue = iDataEntityRuntime.getFieldValue(iEntityBase, iPSDEField);
			//java.math.BigDecimal curValue = DataTypeUtils.getBigDecimalValue(objValue, null);
			if(objValue == null) {
				continue;
			}
			if(maxValue == null) {
				maxValue = objValue;
			}
			else {
				if(DataTypeUtils.compare(iPSDEField.getStdDataType(), maxValue, objValue)<0) {
					maxValue = objValue ;
				}
			}
		}
		
		return maxValue;
	}
	
	/**
	 * 计算列表指定属性的最小值
	 * @param list
	 * @param iPSDEField
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static Object min(IEntityBase[] list, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime){
		if( list == null || list.length == 0) {
			return null;
		}
		
		Object minValue = null;
		for(IEntityBase iEntityBase : list) {
			Object objValue = iDataEntityRuntime.getFieldValue(iEntityBase, iPSDEField);
			//java.math.BigDecimal curValue = DataTypeUtils.getBigDecimalValue(objValue, null);
			if(objValue == null) {
				continue;
			}
			if(minValue == null) {
				minValue = objValue;
			}
			else {
				if(DataTypeUtils.compare(iPSDEField.getStdDataType(), minValue, objValue)>0) {
					minValue = objValue ;
				}
			}
		}
		
		return minValue;
	}
	
	
	/**
	 * 计算列表指定属性的合计值
	 * @param list
	 * @param iPSDEField
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static java.math.BigDecimal sum(IEntityBase[] list, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime){
		if( list == null || list.length == 0) {
			return null;
		}
		
		java.math.BigDecimal sumValue = null;
		for(IEntityBase iEntityBase : list) {
			Object objValue = iDataEntityRuntime.getFieldValue(iEntityBase, iPSDEField);
			java.math.BigDecimal curValue = DataTypeUtils.getBigDecimalValue(objValue, null);
			if(curValue == null) {
				continue;
			}
			if(sumValue == null) {
				sumValue = curValue;
			}
			else {
				sumValue = sumValue.add(curValue);
			}
		}
		
		return sumValue;
	}
	
	
	/**
	 * 计算列表指定属性的平均值
	 * @param list
	 * @param iPSDEField
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static java.math.BigDecimal avg(IEntityBase[] list, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime){
		if( list == null || list.length == 0) {
			return null;
		}
		
		java.math.BigDecimal sumvalue = sum(list, iPSDEField, iDataEntityRuntime);
		if(sumvalue == null) {
			return null;
		}
		
		return sumvalue.divide(BigDecimal.valueOf(list.length));
	}
	
	/**
	 * 指定计算类型对列表的属性值进行计算
	 * @param strCalcType
	 * @param list
	 * @param iPSDEField
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static Object calc(String strCalcType, IEntityBase[] list, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime){
		
		if(DER1NDEFMapTypes.COUNT.equalsIgnoreCase(strCalcType)) {
			if(list == null ) {
				return 0;
			}
			return list.length;
		}
		
		if(DER1NDEFMapTypes.EXISTS.equalsIgnoreCase(strCalcType)) {
			if(list == null ) {
				return 0;
			}
			return (list.length > 0)?1:0;
		}
		
		if(DER1NDEFMapTypes.NOTEXISTS.equalsIgnoreCase(strCalcType)) {
			if(list == null ) {
				return 1;
			}
			return (list.length > 0)?0:1;
		}
		
		if(DER1NDEFMapTypes.MAX.equalsIgnoreCase(strCalcType)){
			return max(list, iPSDEField, iDataEntityRuntime);
		}
		
		if(DER1NDEFMapTypes.MIN.equalsIgnoreCase(strCalcType)){
			return min(list, iPSDEField, iDataEntityRuntime);
		}
		
		if(DER1NDEFMapTypes.SUM.equalsIgnoreCase(strCalcType)){
			return sum(list, iPSDEField, iDataEntityRuntime);
		}
		
		if(DER1NDEFMapTypes.AVG.equalsIgnoreCase(strCalcType)){
			return avg(list, iPSDEField, iDataEntityRuntime);
		}
		
		throw new RuntimeException(String.format("无法识别的计算类型[%1$s]", strCalcType));
		
	}
	
}
