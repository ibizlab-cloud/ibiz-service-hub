package net.ibizsys.central.dataentity.logic;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.der.DER1NDEFMapTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;

public abstract class DELogicParamRuntimeBase extends ModelRuntimeBase implements IDELogicParamRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicParamRuntimeBase.class);
	
	private IDELogicRuntimeContext iDELogicRuntimeContext = null;
	private IPSDELogicParam iPSDELogicParam = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private String strCodeName = null;
	private IScriptDELogicParam iScriptDELogicParam = null;

	@Override
	public void init(IDELogicRuntimeContext iDELogicRuntimeContext, IPSDELogicParam iPSDELogicParam) throws Exception {
		Assert.notNull(iDELogicRuntimeContext, "实体处理逻辑上下文对象无效");
		Assert.notNull(iPSDELogicParam, "实体处理逻辑参数模型对象无效");
		this.iDELogicRuntimeContext = iDELogicRuntimeContext;
		this.iPSDELogicParam = iPSDELogicParam;
		this.strCodeName = this.iPSDELogicParam.getCodeName();
		this.onInit();
	}
	
	
	@Override
	protected void onInit() throws Exception {
		if(this.getPSDELogicParam().getParamPSDataEntity() != null) {
			if(this.getPSDELogicParam().getParamPSDataEntity().getId().equals(this.getDELogicRuntimeContext().getDataEntityRuntime().getId())) {
				iDataEntityRuntime = this.getDELogicRuntimeContext().getDataEntityRuntime();
			}
			else {
				iDataEntityRuntime = this.getDELogicRuntimeContext().getSystemRuntime().getDataEntityRuntime(this.getPSDELogicParam().getParamPSDataEntity().getId(), false);
			}
		}
		super.onInit();
	}

	@Override
	public IPSDELogicParam getPSDELogicParam() {
		return this.iPSDELogicParam;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDELogicParam();
	}
	
	protected IDELogicRuntimeContext getDELogicRuntimeContext() {
		return this.iDELogicRuntimeContext;
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getDELogicRuntimeContext().getSystemRuntime();
	}
	
	@Override
	public IDELogicRuntime getDELogicRuntime() {
		return getDELogicRuntimeContext().getDELogicRuntime();
	}
	
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	@Override
	public String getCodeName() {
		return this.strCodeName;
	}
	

	

	@Override
	public void beginSession(IDELogicSession IDELogicSession) throws Throwable {
		this.onBeginSession(IDELogicSession);
	}
	
	protected void onBeginSession(IDELogicSession IDELogicSession) throws Throwable {
		
	}
	
	@Override
	public void endSession(IDELogicSession IDELogicSession){
		this.onEndSession(IDELogicSession);
	}
	
	protected void onEndSession(IDELogicSession IDELogicSession) {
		
	}

	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		return iDELogicSession.getParamObject(this.getCodeName());
	}

	@Override
	public Map<String, Object> any(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof net.ibizsys.central.util.IEntity) {
			return ((net.ibizsys.central.util.IEntity)objParam).any();
		}
		
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持any操作", getCodeName()));
	}

//	@Override
//	public void set(IDELogicSession iDELogicSession, String strName, String strValue) throws Throwable {
//		Object objParam = getParamObject(iDELogicSession);
//		if(objParam instanceof net.ibizsys.central.util.IEntity) {
//			((net.ibizsys.central.util.IEntity)objParam).set(strName, strValue);
//			return;
//		}
//		
//
//		if(objParam instanceof IEntity) {
//			((IEntity)objParam).set(strName, strValue);
//			return;
//		}
//		
//		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持set操作", getCodeName()));
//	}

	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		
		if(ObjectUtils.isEmpty(strName)) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]set操作未指定属性", getCodeName()));
		}
		
		this.onSet(iDELogicSession, strName, objValue);		
	}

	protected void onSet(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objValue instanceof String) {
			//优先以字符串形式写入
			if(objParam instanceof net.ibizsys.central.util.IEntity) {
				((net.ibizsys.central.util.IEntity)objParam).set(strName, (String)objValue);
				return;
			}
		}
		if(objParam instanceof IEntity) {
			((IEntity)objParam).set(strName, objValue);
			return;
		}
		
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持set操作", getCodeName()));
	}
	
	@Override
	public void reset(IDELogicSession iDELogicSession, String strName) throws Throwable {
		if(ObjectUtils.isEmpty(strName)) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]reset操作未指定属性", getCodeName()));
		}
		this.onReset(iDELogicSession, strName);
	}
	
	protected void onReset(IDELogicSession iDELogicSession, String strName) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntity) {
			((IEntity)objParam).reset(strName);
			return;
		}
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持reset操作", getCodeName()));
	}

	@Override
	public void resetAll(IDELogicSession iDELogicSession) throws Throwable {
		this.onResetAll(iDELogicSession);
	}
	
	protected void onResetAll(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntity) {
			((IEntity)objParam).resetAll();
			return;
		}
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持resetAll操作", getCodeName()));
	}


	@Override
	public Object get(IDELogicSession iDELogicSession, String strName) throws Throwable {
		
		if(ObjectUtils.isEmpty(strName)) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]get操作未指定属性", getCodeName()));
		}
		
		return this.onGet(iDELogicSession, strName);
	}
	
	public Object onGet(IDELogicSession iDELogicSession, String strName) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntity) {
			return ((IEntity)objParam).get(strName);
		}
		
		if(PARAM_TOTAL.equalsIgnoreCase(strName)) {
			if(objParam instanceof Page) {
				return ((Page)objParam).getTotalElements();
			}
		}
		else if(PARAM_SIZE.equalsIgnoreCase(strName)
				|| PARAM_LENGTH.equalsIgnoreCase(strName)) {
			List list = asList(objParam);
			if(list != null) {
				return list.size();
			}
		}
		else {
			List list = asList(objParam);
			if(list != null) {
				try {
					int nPos = Integer.parseInt(strName);
					if(nPos <0 || nPos >= list.size()) {
						throw new Exception(String.format("无效的位置[%1$s]",nPos));
					}
					return list.get(nPos);
				}
				catch(Exception ex) {
					throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]get操作发生异常，%2$s", getCodeName(), ex.getMessage()), ex);
				}
			}
		}
			
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持get[%2$s]操作", getCodeName(), strName));
	}

	@Override
	public boolean contains(IDELogicSession iDELogicSession, String strName) throws Throwable {
		if(ObjectUtils.isEmpty(strName)) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]contains操作未指定属性", getCodeName()));
		}
		return this.onContains(iDELogicSession, strName);
	}

	protected boolean onContains(IDELogicSession iDELogicSession, String strName) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntity) {
			return ((IEntity)objParam).contains(strName);
		}
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持contains操作", getCodeName()));
	}
	
	
	@Override
	public void copyTo(IDELogicSession iDELogicSession, Object dstParam) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntity && dstParam instanceof IEntity) {
			((IEntity)objParam).copyTo((IEntity)dstParam);
			return;
		}
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持copyTo操作", getCodeName()));
	}

	

	@Override
	public void copyTo(Object dstParam, List<String> fieldList, boolean bCopyIfNotExists) throws Throwable {
		this.copyTo(DELogicSession.getCurrentMust(), dstParam, fieldList, bCopyIfNotExists);
	}
	
	@Override
	public void copyTo(IDELogicSession iDELogicSession, Object dstParam, List<String> fieldList, boolean bCopyIfNotExists) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntity && dstParam instanceof IEntity) {
			IEntity srcEntity = (IEntity)objParam;
			IEntity dstEntity = (IEntity)dstParam;
			if(ObjectUtils.isEmpty(fieldList)) {
				if(bCopyIfNotExists) {
//					if(srcEntity instanceof IEntityDTO) {
//						((IEntityDTO)srcEntity).copyToIf(dstEntity);
//					}
//					else {
//						throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持copyTo操作", getCodeName()));
//					}
					srcEntity.copyToIf(dstEntity);
				}
				else {
					srcEntity.copyTo(dstEntity);
				}
			}
			else {
				for(String strField : fieldList) {
					if(!srcEntity.contains(strField)) {
						continue;
					}
					
					if(bCopyIfNotExists) {
						if(dstEntity.contains(strField)) {
							continue;
						}
					}
					
					dstEntity.set(strField, srcEntity.get(strField));
				}
			}
			return;
		}
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持copyTo操作", getCodeName()));
	}




	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		if(this.iScriptDELogicParam == null){
			this.iScriptDELogicParam = this.createScriptDELogicParam();
		}
		return this.iScriptDELogicParam;
	}
	
	
	
	protected IScriptDELogicParam createScriptDELogicParam() {
		return new ScriptDELogicParam(this);
	}
	
	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		iDELogicSession.setParamObject(this.getCodeName(), paramObject);
	}


	@Override
	public void renew(IDELogicSession iDELogicSession) throws Throwable {
		iDELogicSession.setParamObject(this.getCodeName(), null);
	}
	
	

	@Override
	public void append(IDELogicSession iDELogicSession, int nPos, Object paramObject, int nSrcPos, int nSrcLength) throws Throwable {
		Object obj = this.getParamObject(iDELogicSession);
		if (!(obj instanceof List)) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是数据对象列表类型", getCodeName()));
		}
		
		List list = (List)obj;
		
		List srcList = asList(paramObject);
		if(srcList!=null) {
			int nLength = srcList.size();
			if(nSrcPos >= 0) {
				if(nSrcLength>0) {
					if(nSrcPos + nSrcLength > nLength) {
						throw new Exception("列表长度溢出");
					}
					
					nLength = nSrcPos + nSrcLength;
				}
			}
			
			int nInsertPos = nPos;
			if(nPos > list.size() ) {
				throw new Exception("插入位置溢出");
			}
			for(int i = nSrcPos; i< nLength; i++) {
				if(nInsertPos>=0) {
					list.add(nInsertPos, srcList.get(i));
					nInsertPos++;
				}
				else {
					list.add(srcList.get(i));
				}
			}
		}
		else {
			if(nPos >=0) {
				if(nPos > list.size() ) {
					throw new Exception("插入位置溢出");
				}
				list.add(nPos, paramObject);
			}
			else {
				list.add(paramObject);
			}
		}
		
		//throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持appendParamObject操作", getCodeName()));
	}

	@Override
	public void sort(IDELogicSession iDELogicSession, String strField, String strSortDir) throws Throwable {
		Object obj = this.getParamObject(iDELogicSession);
		if (!(obj instanceof List)) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是数据对象列表类型", getCodeName()));
		}
		
		List list = (List)obj;
		
		boolean bSortDesc = "desc".equalsIgnoreCase(strSortDir);
		Collections.sort(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				IEntity e1 = (IEntity)o1;
				IEntity e2 = (IEntity)o2;
				Object v1 = e1.get(strField);
				Object v2 = e2.get(strField);
				
				if(v1 == null && v2 == null) {
					return 0;
				}
				
				if(v1 != null && v2 == null) {
					return 1;
				}
				
				if(v1 == null && v2 != null) {
					return -1;
				}
				
				return (int)DataTypeUtils.compare(DataTypeUtils.getObjectDataType(v1), v1, v2);
			}
		});
		
		if(bSortDesc) {
			Collections.reverse(list);
		}
		
		//throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持sortParamObject操作", getCodeName()));
	}
	
	@Override
	public int count(IDELogicSession iDELogicSession) throws Throwable {
		
		Object obj = this.getParamObject(iDELogicSession);
		if(obj == null) {
			return 0;
		}
		
		if (!(obj instanceof List)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持count操作", getCodeName()));
		}
		
		return ((List)obj).size();
		
	}

	


	@Override
	public Object aggregate(IDELogicSession iDELogicSession, String strField, String strAggMode) throws Throwable {
	
		Object obj = this.getParamObject(iDELogicSession);
		if (!(obj instanceof List)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持aggregate操作", getCodeName()));
		}
		return DELogicEntityListParamRuntime.aggregate(strAggMode, (List)obj, strField);
	}
	
	@Override
	public Object aggregate(String strField, String strAggMode) throws Throwable {
	
		return this.aggregate(DELogicSession.getCurrentMust(), strField, strAggMode);
	}
	
	
	@Override
	public void debug(IDELogicSession iDELogicSession, ObjectNode objectNode) {
		Object objValue = null;
		try {
			objValue = iDELogicSession.getParamObject(this.getCodeName(), true);
		}
		catch(Throwable ex) {
			objectNode.put("info", String.format("获取逻辑参数[%1$s]实际值发生异常，%2$s", this.getCodeName(), ex.getMessage()));
		}
		if(objValue == null) {
			objectNode.putNull("data");
		}
		else {
			try {
				Object objData = this.getSystemRuntime().serialize(objValue);
				if(objData instanceof String) {
					objectNode.put("data", (String)objData);
				}
				else {
					objectNode.put("data", objData.toString());
				}
			}
			catch(Throwable ex) {
				if(objValue instanceof String) {
					objectNode.put("data", (String)objValue);
				}
				else {
					objectNode.put("data", objValue.toString());
				}
			}
		}
		
	}
	
	
	@Override
	public Object getReal(IDELogicSession iDELogicSession) throws Throwable {
		return this.getParamObject(iDELogicSession);
	}
	
	@Override
	public Object getReal() throws Throwable {
		return this.getReal(DELogicSession.getCurrentMust());
	}
	
	
	
	
	@Override
	public Map<String, Object> any() throws Throwable {
		return this.any(DELogicSession.getCurrentMust());
	}


	@Override
	public void set(String strName, Object objValue) throws Throwable {
		this.set(DELogicSession.getCurrentMust(), strName, objValue);
	}


	@Override
	public void reset(String strName) throws Throwable {
		this.reset(DELogicSession.getCurrentMust(), strName);
	}


	@Override
	public void resetAll() throws Throwable {
		this.resetAll(DELogicSession.getCurrentMust());
	}


	@Override
	public void copyTo(Object dstParam) throws Throwable {
		this.copyTo(DELogicSession.getCurrentMust(), dstParam);
	}


	@Override
	public Object get(String strName) throws Throwable {
		return this.get(DELogicSession.getCurrentMust(), strName);
	}


	@Override
	public boolean contains(String strName) throws Throwable {
		return this.contains(DELogicSession.getCurrentMust(), strName);
	}


	@Override
	public void bind(Object paramObject) throws Throwable {
		this.bind(DELogicSession.getCurrentMust(), paramObject);
	}


	@Override
	public void renew() throws Throwable {
		this.renew(DELogicSession.getCurrentMust());
	}


	@Override
	public void append(int nPos, Object paramObject, int nSrcPos, int nSrcLength) throws Throwable {
		this.append(DELogicSession.getCurrentMust(), nPos, paramObject, nSrcPos, nSrcLength);
	}


	@Override
	public void sort(String strField, String strSortDir) throws Throwable {
		this.sort(DELogicSession.getCurrentMust(), strField, strSortDir);
	}


	@Override
	public int count() throws Throwable {
		return this.count(DELogicSession.getCurrentMust());
	}


	/**
	 * 将传入对象转化为列表对象
	 * @param object
	 * @return
	 */
	public static List asList(Object object) {
		if(object instanceof List) {
			return (List)object;
		}
		
		if(object instanceof Page) {
			return ((Page)object).getContent();
		}
		
		return null;
	}
	
	/**
	 * 将传入对象转化为Map对象
	 * @param object
	 * @return
	 */
	public static Map asMap(Object object) {
		if(object instanceof Map) {
			return (Map)object;
		}

		return null;
	}
	
	
	
	
	/**
	 *  计算列表指定属性的最大值
	 * @param list
	 * @param strField
	 * @param iDataEntityRuntime
	 * @return
	 * @throws Throwable
	 */
	public static Object max(List list, String strField) throws Throwable{
		if( list == null || list.size() == 0 ) {
			return null;
		}
		
		Object maxValue = null;
		for(Object objItem : list) {
			if(!(objItem instanceof IEntity)) {
				throw new Exception(String.format("列表项不是数据对象类型"));
			}
			IEntity iEntity = (IEntity)objItem;
			Object objValue = iEntity.get(strField);
			if(objValue == null) {
				continue;
			}
			if(maxValue == null) {
				maxValue = objValue;
			}
			else {
				if(DataTypeUtils.compare(DataTypeUtils.getObjectDataType(maxValue), maxValue, objValue)<0) {
					maxValue = objValue ;
				}
			}
		}
		
		return maxValue;
	}
	
	
	/**
	 * 计算列表指定属性的最小值
	 * @param list
	 * @param strField
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static Object min(List list, String strField) throws Throwable{
		if( list == null || list.size() == 0 ) {
			return null;
		}
		
		Object minValue = null;
		for(Object objItem : list) {
			if(!(objItem instanceof IEntity)) {
				throw new Exception(String.format("列表项不是数据对象类型"));
			}
			IEntity iEntity = (IEntity)objItem;
			Object objValue = iEntity.get(strField);
			if(minValue == null) {
				minValue = objValue;
			}
			else {
				if(DataTypeUtils.compare(DataTypeUtils.getObjectDataType(minValue), minValue, objValue)>0) {
					minValue = objValue ;
				}
			}
		}
		
		return minValue;
	}
	
	
	/**
	 * 计算列表指定属性的合计值
	 * @param list
	 * @param strField
	 * @param iDataEntityRuntime
	 * @return
	 * @throws Throwable
	 */
	public static java.math.BigDecimal sum(List list, String strField) throws Throwable{
		if( list == null || list.size() == 0 ) {
			return null;
		}
		
		java.math.BigDecimal sumValue = null;
		for(Object objItem : list) {
			if(!(objItem instanceof IEntity)) {
				throw new Exception(String.format("列表项不是数据对象类型"));
			}
			IEntity iEntity = (IEntity)objItem;
			Object objValue = iEntity.get(strField);
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
	 * @param strField
	 * @param iDataEntityRuntime
	 * @return
	 * @throws Throwable
	 */
	public static java.math.BigDecimal avg(List list, String strField) throws Throwable{
		if( list == null || list.size() == 0 ) {
			return null;
		}
		
		java.math.BigDecimal sumvalue = sum(list, strField);
		if(sumvalue == null) {
			return null;
		}
		
		return sumvalue.divide(BigDecimal.valueOf(list.size()));
	}
	

	/**
	 *  指定计算类型对列表的属性值进行计算
	 * @param strCalcType
	 * @param list
	 * @param strField
	 * @param iDataEntityRuntime
	 * @return
	 * @throws Throwable
	 */
	public static Object aggregate(String strCalcType, List list, String strField) throws Throwable{
		
		if(DER1NDEFMapTypes.COUNT.equalsIgnoreCase(strCalcType)) {
			if( list == null ) {
				return 0;
			}
			return list.size();
		}
		
		if(DER1NDEFMapTypes.MAX.equalsIgnoreCase(strCalcType)){
			return max(list, strField);
		}
		
		if(DER1NDEFMapTypes.MIN.equalsIgnoreCase(strCalcType)){
			return min(list, strField);
		}
		
		if(DER1NDEFMapTypes.SUM.equalsIgnoreCase(strCalcType)){
			return sum(list, strField);
		}
		
		if(DER1NDEFMapTypes.AVG.equalsIgnoreCase(strCalcType)){
			return avg(list, strField);
		}
		
		
		throw new Exception(String.format("无法识别的计算类型[%1$s]", strCalcType));
	}
	
	
	/**
	 * 将传入对象转化为简单数据类型对象
	 * @param object
	 * @return
	 */
	public static Object asSimple(Object object) {
		if((object instanceof String)
				|| (object instanceof Number)
				|| (object instanceof Boolean)
				|| (object instanceof Character)) {
			return object;
		}
		
		if(object instanceof java.util.Date){
			return ((java.util.Date)object).clone();
		}
		
		return null;
	}
	
}
