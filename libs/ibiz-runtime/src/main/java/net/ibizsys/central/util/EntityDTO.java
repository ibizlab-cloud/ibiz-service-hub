package net.ibizsys.central.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTO;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.service.DEMethodDTOFieldTypes;
import net.ibizsys.runtime.dataentity.service.DEMethodDTOTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

@SuppressWarnings("serial")
public class EntityDTO extends EntityBase implements IEntityDTO {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(EntityDTO.class);
	
	@JsonIgnore
	private transient IDEMethodDTORuntime iDEMethodDTORuntime = null;
	
	@JsonIgnore
	private transient boolean bActionInputDTO = false;

	@JsonIgnore
	private transient boolean bEnableAny = false;
	
//	@JsonIgnore
//	private boolean bMarkFullInfo = false;
	
	@Override
	public void init(IDEMethodDTORuntime iDEMethodDTORuntime, Object dtoData, boolean bDTOData, boolean bIn) throws Exception {
		this.iDEMethodDTORuntime = iDEMethodDTORuntime;
		if(this.getDEMethodDTORuntime() == null) {
			throw new Exception("传入实体方法DTO运行时对象无效");
		}
		bEnableAny = this.getDEMethodDTORuntime().isEnableAny();
		if(DEMethodDTOTypes.DEACTIONINPUT.equals(this.getDEMethodDTORuntime().getPSDEMethodDTO().getType())) {
			bActionInputDTO = true;
		}
		reload(dtoData, bDTOData, bIn);
		onInit();
	}
	

	@Override
	public void init(IDEMethodDTORuntime iDEMethodDTORuntime, Object dtoData, boolean bDTOData) throws Exception {
		init(iDEMethodDTORuntime, dtoData, bDTOData, false);
	}
	
	@Override
	@JsonIgnore
	protected Map<String, Object> createAny() {
		return new LinkedHashMap<String, Object>();
	}
	
	
	@JsonAnyGetter(enabled=false)
	@Override
	public Map<String, Object> any() {
		return super.any();
	}
	
	
	@Override
	@JsonIgnore
	public Map<String, Object> any(boolean bJsonFormat) {
		Map<String, Object> map = super.any();
		if(!bJsonFormat || this.getDEMethodDTORuntime() == null || ObjectUtils.isEmpty(map)) {
			return map;
		}
		
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		//先填充属性
		List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
		if(psDEMethodDTOFieldList != null) {
			for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
				if(!map.containsKey(iPSDEMethodDTOField.getLowerCaseName())) {
					continue;
				}

				Object value = map.get(iPSDEMethodDTOField.getLowerCaseName());
				if(value != null 
						&& StringUtils.hasLength(iPSDEMethodDTOField.getJsonFormat()) 
						&& iPSDEMethodDTOField.getStdDataType() != StdDataType.UNKNOWN.value) {
					try {
						value = this.getDEMethodDTORuntime().getSystemRuntime().writeValue(iPSDEMethodDTOField.getStdDataType(), value, iPSDEMethodDTOField.getJsonFormat());
					}
					catch (Exception ex) {
						log.error(ex);
					}
				}
				params.put(iPSDEMethodDTOField.getLowerCaseName(), value);
			}
		}
		
		//进一步填充未定义属性
		for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			if(params.containsKey(entry.getKey())) {
				continue;
			}
			
			params.put(entry.getKey(), entry.getValue());
		}
		
		return params;
	}


	@JsonAnyGetter
	public Map<String, Object> getAny() {
		return any(true);
	}

	protected void onInit() throws Exception {

	}
	
	@Override
	@JsonIgnore
	public void setDEMethodDTORuntime(IDEMethodDTORuntime iDEMethodDTORuntime) {
		this.iDEMethodDTORuntime = iDEMethodDTORuntime;
		this.bEnableAny = false;
		this.bActionInputDTO = false;
		if(this.getDEMethodDTORuntime() != null) {
			bEnableAny = this.getDEMethodDTORuntime().isEnableAny();
			if(DEMethodDTOTypes.DEACTIONINPUT.equals(this.getDEMethodDTORuntime().getPSDEMethodDTO().getType())) {
				bActionInputDTO = true;
			}
		}
	}

	@JsonIgnore
	private boolean isActionInputDTO() {
		return this.bActionInputDTO;
	}
	
	
	@Override
	@JsonIgnore
	public IDEMethodDTORuntime getDEMethodDTORuntime() {
		return this.iDEMethodDTORuntime;
	}

	@Override
	@JsonIgnore
	public void reload(Object objData, boolean bDTOData) throws Exception{
		reload(objData, bDTOData, false);
	}

	@Override
	@JsonIgnore
	public void reload(Object objData, boolean bDTOData, boolean bIn) throws Exception{
		if(objData == null) {
			this.setAny(null);
			return;
		}
		if(bDTOData) {
			//DTO 数据为直接缓存
			if (objData instanceof IEntityDTO) {
				//需要判断DTO是否一致
				IEntityDTO srcEntityDTO = (IEntityDTO)objData;
				if(srcEntityDTO.getDEMethodDTORuntime()!=null && this.getDEMethodDTORuntime() !=null && this.getDEMethodDTORuntime().getId().equals(srcEntityDTO.getDEMethodDTORuntime().getId())) {
					this.setAny(((IEntityDTO) objData).any(), true);
				}
				else {
					//不一致，使用复制方式
					this.setAny(null);
					if(getDEMethodDTORuntime()!=null) {
						List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
						if(psDEMethodDTOFieldList != null) {
							for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
								
								Object objValue = null;
								IPSDEField iPSDEField = iPSDEMethodDTOField.getPSDEField();
								if(iPSDEField != null){
									if(srcEntityDTO.contains(iPSDEField.getLowerCaseName())) {
										objValue = srcEntityDTO.get(iPSDEField.getLowerCaseName());
									}
									else {
										continue;
									}	
								}
								else {
									if(srcEntityDTO.contains(iPSDEMethodDTOField.getLowerCaseName())) {
										objValue = srcEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
									}
									else {
										continue;
									}
								}
								
								//进行值转化
								if(objValue != null) {
									if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())
												||DEMethodDTOFieldTypes.SIMPLES.equals(iPSDEMethodDTOField.getType())) {
										int nStdDataType = iPSDEMethodDTOField.getStdDataType();
										if(nStdDataType != DataTypes.UNKNOWN){
											try {
												if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())) {
													objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertValue(nStdDataType, objValue);
												}
												else {
													objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertListValue(nStdDataType, objValue);
												}
												
											} catch (Exception ex) {
												throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime() ,String.format("转化数据[%1$s]至[%2$s]发生异常，%3$s", objValue, DataTypeUtils.getTypeName(nStdDataType), ex.getMessage())	,ex);
											}
										}
									}
									
								}
								
								
								super.set(iPSDEMethodDTOField.getLowerCaseName(), objValue);
							}
						}
						
						//复制非DTO属性
						if(srcEntityDTO.any()!=null) {
							for(java.util.Map.Entry<String ,Object> entry:srcEntityDTO.any().entrySet()) {
								String strName = entry.getKey().toLowerCase();
								if(!super.contains(strName)) {
									super.set(strName, entry.getValue());
								}
							}
						}
					}
					else {
						this.setAny(((IEntityDTO) objData).any(), true);
					}
				}
			}
			else {
				Map<String,Object> srcmap = null;
				if (objData instanceof Map) {
					srcmap = (Map<String,Object>)objData;
				}
				else
					if (objData instanceof IEntity) {
						srcmap = ((IEntity)objData).any();
					}
					else {
						throw new Exception(String.format("无法识别的数据对象[%1$s]", objData));
					}
				
				Map<String, Object> map = this.createAny();
				map.putAll(srcmap);
				
				
				//对成员数据进行转化
				if(getDEMethodDTORuntime() != null) {
					List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
					if(psDEMethodDTOFieldList != null) {
						for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
							Object dtoData = map.get(iPSDEMethodDTOField.getLowerCaseName());
							if(DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType())
									||DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
								if(dtoData != null) {
									if(iPSDEMethodDTOField.getRefPSDataEntity() == null) {
										if(DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
											if(iPSDEMethodDTOField.isListMap()) {
												
												if(!(dtoData instanceof Map)) {
													//执行序列化，此处代码有问题
													dtoData = this.getDEMethodDTORuntime().getSystemRuntime().deserialize(dtoData, Map.class);
												}
												
												Map srcMap = (Map)dtoData;
												Map dtoMap = new LinkedHashMap();
												for(Object key : srcMap.keySet()) {
													Object item = srcMap.get(key);
													IEntity iEntity = null;
													if(item instanceof IEntity) {
														iEntity = (IEntity)item;
													}
													else
														if(item instanceof Map) {
															iEntity = new Entity(item);
														}
													if(iEntity == null) {
														throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
													}
													dtoMap.put(key, iEntity);
												}
												
												map.put(iPSDEMethodDTOField.getLowerCaseName(), dtoMap);
											}
											else {
												//列表模式
												if(!(dtoData instanceof List)) {
													dtoData = this.getDEMethodDTORuntime().getSystemRuntime().deserialize(dtoData, List.class);
													//throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
												
												List list = (List)dtoData;
												List dtoList=  new ArrayList();
												for(Object item : list) {
													IEntity iEntity = null;
													if(item instanceof IEntity) {
														iEntity = (IEntity)item;
													}
													else
														if(item instanceof Map) {
															iEntity = new Entity(item);
														}
													if(iEntity == null) {
														throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
													}
													
													dtoList.add(iEntity);
													
												}
												map.put(iPSDEMethodDTOField.getLowerCaseName(), dtoList);
											}
										}
										else {
											
											IEntity iEntity = null;
											if(dtoData instanceof IEntity) {
												iEntity = (IEntity)dtoData;
											}
											else
												if(dtoData instanceof Map) {
													iEntity = new Entity(dtoData);
												}
												else {
													iEntity = new Entity(this.getDEMethodDTORuntime().getSystemRuntime().deserialize(dtoData, Map.class));
												}
											
											if(iEntity == null) {
												throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
											}
											
											map.put(iPSDEMethodDTOField.getLowerCaseName(), iEntity);
										}
									}
									else {
										IDataEntityRuntime refDataEntityRuntime = this.getDEMethodDTORuntime().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
										if(DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
											if(iPSDEMethodDTOField.isListMap()) {
												
												if(!(dtoData instanceof Map)) {
													//执行序列化，此处代码有问题
													dtoData = refDataEntityRuntime.getSystemRuntime().deserialize(dtoData, Map.class);
												}
												
												Map srcMap = (Map)dtoData;
												Map dtoMap = new LinkedHashMap();
												for(Object key : srcMap.keySet()) {
													IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), srcMap.get(key));
													dtoMap.put(key, iDEMethodDTO);
												}
												
												map.put(iPSDEMethodDTOField.getLowerCaseName(), dtoMap);
											}
											else {
												//列表模式
												if(!(dtoData instanceof List)) {
													dtoData = refDataEntityRuntime.getSystemRuntime().deserialize(dtoData, List.class);
													//throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
												
												List list = (List)dtoData;
												List dtoList=  new ArrayList();
												for(Object item : list) {
													IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), item);
													dtoList.add(iDEMethodDTO);
													
												}
												map.put(iPSDEMethodDTOField.getLowerCaseName(), dtoList);
											}
										}
										else {
											
											if(!(dtoData instanceof Map) && !(dtoData instanceof IEntity)) {
												//执行序列化，此处代码有问题
												dtoData = refDataEntityRuntime.getSystemRuntime().deserialize(dtoData, Map.class);
											}
											
											
											IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), dtoData);
											map.put(iPSDEMethodDTOField.getLowerCaseName(), iDEMethodDTO);
										}
									}
								}
								continue;
							}
							else 
								if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())
										||DEMethodDTOFieldTypes.SIMPLES.equals(iPSDEMethodDTOField.getType())) {
									//进行值转化
									if(dtoData != null) {
										int nStdDataType = iPSDEMethodDTOField.getStdDataType();
										if(nStdDataType != DataTypes.UNKNOWN){
											try {
												if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())) {
													dtoData = this.getDEMethodDTORuntime().getSystemRuntime().convertValue(nStdDataType, dtoData);
												}
												else {
													dtoData = this.getDEMethodDTORuntime().getSystemRuntime().convertListValue(nStdDataType, dtoData);
												}
											} catch (Exception ex) {
												throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime() ,String.format("转化数据[%1$s]至[%2$s]发生异常，%3$s", dtoData, DataTypeUtils.getTypeName(nStdDataType), ex.getMessage())	,ex);
											}
											map.put(iPSDEMethodDTOField.getLowerCaseName(), dtoData);
										}
									}
									continue;
								}
								else {
									throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime() ,String.format("无法识别的DTO属性类型[%1$s]", iPSDEMethodDTOField.getType()));
								}
						}
					}
				}
				
				this.setAny(map);
			}
			
		}
		else {
			this.setAny(null);
			//需要进行转化
			Map<String,Object> srcmap = null;
			if (objData instanceof Map) {
				srcmap = (Map<String,Object>)objData;
			}
			else
				if (objData instanceof IEntity) {
					srcmap = ((IEntity)objData).any();
				}
				else {
					throw new Exception(String.format("无法识别的数据对象[%1$s]", objData));
				}
			
			Map<String, Object> map = this.createAny();
			map.putAll(srcmap);
			
			if (map!=null) {
				if(getDEMethodDTORuntime()!=null) {
					List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
					if(psDEMethodDTOFieldList != null) {
						for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
							Object objValue = null;
							IPSDEField iPSDEField = iPSDEMethodDTOField.getPSDEField();
							if(iPSDEField != null){
								if(map.containsKey(iPSDEField.getLowerCaseName())) {
									objValue = map.remove(iPSDEField.getLowerCaseName());
								}
								else
									if(map.containsKey(iPSDEField.getName())) {
										objValue = map.remove(iPSDEField.getName());
									}
									else {
										continue;
									}
							}
							else {
								if(map.containsKey(iPSDEMethodDTOField.getLowerCaseName())) {
									objValue = map.remove(iPSDEMethodDTOField.getLowerCaseName());
								}
								else {
									continue;
								}
							}
							
							//进行值转化
							if(objValue != null) {
								if(DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType())
										||DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
									
									if(iPSDEMethodDTOField.getRefPSDataEntity() == null) {
										if(DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
											if(iPSDEMethodDTOField.isListMap()) {
												Map srcMap = null;
												if(!(objValue instanceof Map)) {
													//执行序列化，此处代码有问题
													srcMap = this.getDEMethodDTORuntime().getSystemRuntime().deserialize(objValue, Map.class);
												}
												else {
													srcMap = (Map)objValue;
												}
												
												Map dtoMap=  new LinkedHashMap();
												for(Object key : srcMap.keySet()) {
													Object item = srcMap.get(key);
													IEntity iEntity = null;
													if(item instanceof IEntity) {
														iEntity = (IEntity)item;
													}
													else
														if(item instanceof Map) {
															iEntity = new Entity(item);
														}
													if(iEntity == null) {
														throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
													}
													dtoMap.put(key, iEntity);
												}
												
												objValue = dtoMap;
											}
											else {
												//列表模式
												List list = null;
												if(!(objValue instanceof List)) {
													//执行序列化，此处代码有问题
													list = this.getDEMethodDTORuntime().getSystemRuntime().deserialize(objValue, List.class);
												}
												else {
													list = (List)objValue;
												}
												
												List dtoList=  new ArrayList();
												for(Object item : list) {
													IEntity iEntity = null;
													if(item instanceof IEntity) {
														iEntity = (IEntity)item;
													}
													else
														if(item instanceof Map) {
															iEntity = new Entity(item);
														}
													if(iEntity == null) {
														throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
													}
													dtoList.add(iEntity);
												}
												objValue = dtoList;
											}
											
										}
										else {
											
											IEntity iEntity = null;
											if(objValue instanceof IEntity) {
												iEntity = (IEntity)objValue;
											}
											else
												if(objValue instanceof Map) {
													iEntity = new Entity(objValue);
												}
												else {
													iEntity = new Entity(this.getDEMethodDTORuntime().getSystemRuntime().deserialize(objValue, Map.class));
												}
											
											if(iEntity == null) {
												throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
											}
											
											objValue = iEntity;
										}
									}
									else {
										IDataEntityRuntime refDataEntityRuntime = this.getDEMethodDTORuntime().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
										if(DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
											if(iPSDEMethodDTOField.isListMap()) {
												Map srcMap = null;
												if(!(objValue instanceof Map)) {
													//执行序列化，此处代码有问题
													srcMap = refDataEntityRuntime.getSystemRuntime().deserialize(objValue, Map.class);
												}
												else {
													srcMap = (Map)objValue;
												}
												
												Map dtoMap=  new LinkedHashMap();
												for(Object key : srcMap.keySet()) {
													IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), srcMap.get(key), false);
													dtoMap.put(key, iDEMethodDTO);
												}
												
												objValue = dtoMap;
											}
											else {
												//列表模式
												List list = null;
												
												if(!(objValue instanceof List)) {
													//执行序列化，此处代码有问题
													list = refDataEntityRuntime.getSystemRuntime().deserialize(objValue, List.class);
												}
												else {
													list = (List)objValue;
												}
												
												List dtoList=  new ArrayList();
												for(Object item : list) {
													IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), item, false);
													dtoList.add(iDEMethodDTO);
												}
												
												objValue = dtoList;
											}
											
										}
										else {
											//Map模式
											if(!(objValue instanceof Map) && !(objValue instanceof IEntity)) {
												//执行序列化，此处代码有问题
												objValue = refDataEntityRuntime.getSystemRuntime().deserialize(objValue, Map.class);
											}
											
											objValue = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), objValue, false);
										}
									}
								}
								else
								if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())
										||DEMethodDTOFieldTypes.SIMPLES.equals(iPSDEMethodDTOField.getType())) {
									int nStdDataType = iPSDEMethodDTOField.getStdDataType();
									if(nStdDataType != DataTypes.UNKNOWN){
										try {
											if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())) {
												objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertValue(nStdDataType, objValue);
											}
											else {
												objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertListValue(nStdDataType, objValue);
											}
										} catch (Exception ex) {
											throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime() ,String.format("转化数据[%1$s]至[%2$s]发生异常，%3$s", objValue, DataTypeUtils.getTypeName(nStdDataType), ex.getMessage())	,ex);
										}
									}
								}
							}
							
							super.set(iPSDEMethodDTOField.getLowerCaseName(), objValue);
						}
					}
					
					//复制非DTO属性
					for(java.util.Map.Entry<String ,Object> entry:map.entrySet()) {
						String strName = entry.getKey().toLowerCase();
						if(!super.contains(strName)) {
							super.set(strName, entry.getValue());
						}
					}
				}
				else {
					this.setAny(map);
				}
				
			}
			
		}
		
		if(bIn) {
			this.resetReadOnlyFields();
		}
	}
	
	

	@Override
	public Object get(String strName) {
		
		Assert.hasLength(strName, "传入属性名无效");
		
		if(this.getDEMethodDTORuntime() != null) {
			if(isActionInputDTO()) {
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						return super.get(strName.toLowerCase());
					}
					return null;
				}
				return super.get(iPSDEMethodDTOField.getLowerCaseName());
			}
			else{
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						return super.get(strName.toLowerCase());
					}
					return null;
				}
				return super.get(iPSDEMethodDTOField.getLowerCaseName());
			}
		}
		else {
			return super.get(strName);
		}
	}

	@Override
	public void set(String strName, Object objValue) {
		
		Assert.hasLength(strName, "传入属性名无效");
		
		if(this.getDEMethodDTORuntime() != null) {
			if(isActionInputDTO()) {
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						super.set(strName.toLowerCase(), objValue);
					}
					else {
						log.warn(String.format("DTO对象[%1$s]不支持属性[%2$s]，无法设置值", this.getDEMethodDTORuntime().getId(), strName));
					}
				}
				else {
					//进行值转化
					if(objValue != null) {
						if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())
								||DEMethodDTOFieldTypes.SIMPLES.equals(iPSDEMethodDTOField.getType())) {
							int nStdDataType = iPSDEMethodDTOField.getStdDataType();
							if(nStdDataType != DataTypes.UNKNOWN){
								try {
									if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())) {
										objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertValue(nStdDataType, objValue);
									}
									else {
										objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertListValue(nStdDataType, objValue);
									}
								} catch (Exception ex) {
									throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime() ,String.format("转化数据[%1$s]至[%2$s]发生异常，%3$s", objValue, DataTypeUtils.getTypeName(nStdDataType), ex.getMessage())	,ex);
								}
							}
						}
					}
					super.set(iPSDEMethodDTOField.getLowerCaseName(), objValue);
				}
			}
			else{
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						super.set(strName.toLowerCase(), objValue);
					}
					else {
						log.warn(String.format("DTO对象[%1$s]不支持属性[%2$s]，无法设置值", this.getDEMethodDTORuntime().getId(), strName));
					}
				}
				else {
					if(objValue != null) {
						if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())
								||DEMethodDTOFieldTypes.SIMPLES.equals(iPSDEMethodDTOField.getType())) {
							int nStdDataType = iPSDEMethodDTOField.getStdDataType();
							if(nStdDataType != DataTypes.UNKNOWN){
								try {
									if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())) {
										objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertValue(nStdDataType, objValue);
									}
									else {
										objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertListValue(nStdDataType, objValue);
									}
								} catch (Exception ex) {
									throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime() ,String.format("转化数据[%1$s]至[%2$s]发生异常，%3$s", objValue, DataTypeUtils.getTypeName(nStdDataType), ex.getMessage())	,ex);
								}
							}
						}
					}
					super.set(iPSDEMethodDTOField.getLowerCaseName(), objValue);
				}
					
			}
		}
		else {
			super.set(strName, objValue);
			return;
		}
	}

	@Override
	public boolean contains(String strName) {
		
		Assert.hasLength(strName, "传入属性名无效");
		
		if(this.getDEMethodDTORuntime() != null) {
			if(isActionInputDTO()) {
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						return super.contains(strName.toLowerCase());
					}
					return false;
				}
				return super.contains(iPSDEMethodDTOField.getLowerCaseName());
			}
			else {
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						return super.contains(strName.toLowerCase());
					}
					return false;
				}
				return super.contains(iPSDEMethodDTOField.getLowerCaseName());
			}
		}
		else {
			return super.contains(strName);
		}
		
		
	}

	@Override
	public void reset(String strName) {
		
		Assert.hasLength(strName, "传入属性名无效");
		
		if(this.getDEMethodDTORuntime() != null) {
			if(isActionInputDTO()) {
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						super.reset(strName.toLowerCase());
					}
					else {
						log.warn(String.format("DTO对象[%1$s]不支持属性[%2$s]，无法重置值", this.getDEMethodDTORuntime().getId(), strName));
					}
				}
				else
					super.reset(iPSDEMethodDTOField.getLowerCaseName());
			}
			else {
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(strName, true);
				if(iPSDEMethodDTOField == null) {
					if(this.isEnableAny()) {
						super.reset(strName.toLowerCase());
					}
					else {
						log.warn(String.format("DTO对象[%1$s]不支持属性[%2$s]，无法重置值", this.getDEMethodDTORuntime().getId(), strName));
					}
				}
				else
					super.reset(iPSDEMethodDTOField.getLowerCaseName());
			}
		}
		else {
			super.reset(strName);
		}
		
		
	}
	
	@Override
	@JsonIgnore
	public void resetReadOnlyFields() {
		if(getDEMethodDTORuntime()!=null) {
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if(psDEMethodDTOFieldList != null) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					if(iPSDEMethodDTOField.isReadOnly()) {
						super.reset(iPSDEMethodDTOField.getLowerCaseName());
					}
					else {
						IPSDEMethodDTO refPSDEMethodDTO = iPSDEMethodDTOField.getRefPSDEMethodDTO();
						if(refPSDEMethodDTO == null) {
							continue;
						}
						Object objValue = super.get(iPSDEMethodDTOField.getLowerCaseName());
						if(objValue != null) {
							if(DEMethodDTOFieldType.DTO.value.equals(iPSDEMethodDTOField.getType())) {
								if(objValue instanceof IEntityDTO) {
									((IEntityDTO)objValue).resetReadOnlyFields();
								}
							}
							else
								if(DEMethodDTOFieldType.DTOS.value.equals(iPSDEMethodDTOField.getType())) {
									if(iPSDEMethodDTOField.isListMap()) {
										Map<String, ?> src = (Map<String, ?>)objValue;
										for(java.util.Map.Entry<String, ?> entry : src.entrySet()) {
											Object value = entry.getValue();
											if(value instanceof IEntityDTO) {
												((IEntityDTO)value).resetReadOnlyFields();
											}
										}
									}
									else {
										List<?> src = (List<?>)objValue;
										for(Object value : src) {
											if(value instanceof IEntityDTO) {
												((IEntityDTO)value).resetReadOnlyFields();
											}
										}
									}
								}
						}
					}
				}
			}
		}
	}
	

	@Override
	@JsonIgnore
	protected boolean isLowerCaseName() {
		if(this.getDEMethodDTORuntime() == null) {
			return super.isLowerCaseName();
		}
		return true;
	}

	//@Override
	@JsonIgnore
	private boolean isEnableAny() {
		
		return this.bEnableAny;
	}

	//@Override
	@JsonIgnore
	private void setEnableAny(boolean bEnableAny) {
		this.bEnableAny = bEnableAny;
	}

	@Override
	public void copyTo(IEntity iEntity) {
		copyTo(iEntity, false);
	}
	
	
	@Override
	public void copyTo(IEntity iEntity, boolean bDTOData) {
		Assert.notNull(iEntity, "传入目标对象无效");
		if(!bDTOData && getDEMethodDTORuntime() != null) {
			Map<String, Object> any = this.any();
			if(any == null || any.size() == 0) {
				return ;
			}
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.putAll(any);
			
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if(psDEMethodDTOFieldList != null) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					String strFieldName = iPSDEMethodDTOField.getLowerCaseName();
					if(!map.containsKey(strFieldName)) {
						continue;
					}
					
					Object objValue = map.remove(strFieldName);
					if(objValue != null && iPSDEMethodDTOField.getRefPSDEMethodDTO() != null) {
						if(DEMethodDTOFieldType.DTO.value.equals(iPSDEMethodDTOField.getType())) {
							if(objValue instanceof IEntityDTO) {
								Entity entity = new Entity();
								((IEntityDTO)objValue).copyTo(entity);
								objValue = entity;
							}
						}
						else
							if(DEMethodDTOFieldType.DTOS.value.equals(iPSDEMethodDTOField.getType())) {
								if(iPSDEMethodDTOField.isListMap()) {
									Map<String, ?> src = (Map<String, ?>)objValue;
									Map<String, Object> newMap = new LinkedHashMap<String, Object>();
									for(java.util.Map.Entry<String, ?> entry : src.entrySet()) {
										Object value = entry.getValue();
										if(value instanceof IEntityDTO) {
											Entity entity = new Entity();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newMap.put(entry.getKey(), value);
									}
									objValue = newMap;
								}
								else {
									List<?> src = (List<?>)objValue;
									List<Object> newList = new ArrayList<>();
									for(Object value : src) {
										if(value instanceof IEntityDTO) {
											Entity entity = new Entity();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newList.add(value);
									}
									objValue = newList;
								}
							}
					}
					
					if(iPSDEMethodDTOField.getPSDEField() != null) {
						iEntity.set(iPSDEMethodDTOField.getPSDEField().getLowerCaseName(), objValue);
					}
					else {
						iEntity.set(strFieldName, objValue);
					}
				}
			}
			
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				iEntity.set(entry.getKey(), entry.getValue());
			}
		}
		else {
			super.copyTo(iEntity);
		}
	}
	
	@Override
	public void copyToIf(IEntity iEntity) {
		this.copyToIf(iEntity, false);
	}
	
	@Override
	public void copyToIf(IEntity iEntity, boolean bDTOData) {
		Assert.notNull(iEntity, "传入目标对象无效");
		if(!bDTOData && getDEMethodDTORuntime() != null) {
			Map<String, Object> any = this.any();
			if(any == null || any.size() == 0) {
				return ;
			}
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.putAll(any);
			
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if(psDEMethodDTOFieldList != null) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					String strFieldName = iPSDEMethodDTOField.getLowerCaseName();
					if(!map.containsKey(strFieldName)) {
						continue;
					}
					
					Object objValue = map.remove(strFieldName);
					
					if(objValue != null && iPSDEMethodDTOField.getRefPSDEMethodDTO() != null) {
						if(DEMethodDTOFieldType.DTO.value.equals(iPSDEMethodDTOField.getType())) {
							if(objValue instanceof IEntityDTO) {
								Entity entity = new Entity();
								((IEntityDTO)objValue).copyTo(entity);
								objValue = entity;
							}
						}
						else
							if(DEMethodDTOFieldType.DTOS.value.equals(iPSDEMethodDTOField.getType())) {
								if(iPSDEMethodDTOField.isListMap()) {
									Map<String, ?> src = (Map<String, ?>)objValue;
									Map<String, Object> newMap = new LinkedHashMap<String, Object>();
									for(java.util.Map.Entry<String, ?> entry : src.entrySet()) {
										Object value = entry.getValue();
										if(value instanceof IEntityDTO) {
											Entity entity = new Entity();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newMap.put(entry.getKey(), value);
									}
									objValue = newMap;
								}
								else {
									List<?> src = (List<?>)objValue;
									List<Object> newList = new ArrayList<>();
									for(Object value : src) {
										if(value instanceof IEntityDTO) {
											Entity entity = new Entity();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newList.add(value);
									}
									objValue = newList;
								}
							}
					}
					
					if(iPSDEMethodDTOField.getPSDEField() != null) {
						if(iEntity.contains(iPSDEMethodDTOField.getPSDEField().getLowerCaseName())) {
							continue;
						}
						iEntity.set(iPSDEMethodDTOField.getPSDEField().getLowerCaseName(), objValue);
					}
					else {
						if(iEntity.contains(strFieldName)) {
							continue;
						}
						iEntity.set(strFieldName, objValue);
					}
				}
			}
			
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				if(iEntity.contains(entry.getKey())) {
					continue;
				}
				iEntity.set(entry.getKey(), entry.getValue());
			}
		}
		else {
			Map<String, Object> any = this.any();
			if(any == null || any.size() == 0) {
				return ;
			}
			
			for (java.util.Map.Entry<String, Object> entry : any.entrySet()) {
				if(iEntity.contains(entry.getKey())) {
					continue;
				}
				iEntity.set(entry.getKey(), entry.getValue());
			}
		}
	}
	
	
	@Override
	public void copyToIf(Map<String, Object> destMap) {
		this.copyToIf(destMap, false);
	}


	@Override
	public void copyToIf(Map<String, Object> destMap, boolean bDTOData) {
		Assert.notNull(destMap, "传入目标对象无效");
		if(!bDTOData && getDEMethodDTORuntime() != null) {
			Map<String, Object> any = this.any();
			if(any == null || any.size() == 0) {
				return ;
			}
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.putAll(any);
			
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if(psDEMethodDTOFieldList != null) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					String strFieldName = iPSDEMethodDTOField.getLowerCaseName();
					if(!map.containsKey(strFieldName)) {
						continue;
					}
					
					Object objValue = map.remove(strFieldName);
					if(objValue != null && iPSDEMethodDTOField.getRefPSDEMethodDTO() != null) {
						if(DEMethodDTOFieldType.DTO.value.equals(iPSDEMethodDTOField.getType())) {
							if(objValue instanceof IEntityDTO) {
								Map<String, Object> entity = new LinkedHashMap<String, Object>();
								((IEntityDTO)objValue).copyTo(entity);
								objValue = entity;
							}
						}
						else
							if(DEMethodDTOFieldType.DTOS.value.equals(iPSDEMethodDTOField.getType())) {
								if(iPSDEMethodDTOField.isListMap()) {
									Map<String, ?> src = (Map<String, ?>)objValue;
									Map<String, Object> newMap = new LinkedHashMap<String, Object>();
									for(java.util.Map.Entry<String, ?> entry : src.entrySet()) {
										Object value = entry.getValue();
										if(value instanceof IEntityDTO) {
											Map<String, Object> entity = new LinkedHashMap<String, Object>();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newMap.put(entry.getKey(), value);
									}
									objValue = newMap;
								}
								else {
									List<?> src = (List<?>)objValue;
									List<Object> newList = new ArrayList<>();
									for(Object value : src) {
										if(value instanceof IEntityDTO) {
											Map<String, Object> entity = new LinkedHashMap<String, Object>();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newList.add(value);
									}
									objValue = newList;
								}
							}
					}
					
					if(iPSDEMethodDTOField.getPSDEField() != null) {
						if(destMap.containsKey(iPSDEMethodDTOField.getPSDEField().getLowerCaseName())) {
							continue;
						}
						destMap.put(iPSDEMethodDTOField.getPSDEField().getLowerCaseName(), objValue);
					}
					else {
						if(destMap.containsKey(strFieldName)) {
							continue;
						}
						destMap.put(strFieldName, objValue);
					}
				}
			}
			
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				
				if(destMap.containsKey(entry.getKey())) {
					continue;
				}
				
				destMap.put(entry.getKey(), entry.getValue());
			}
		}
		else {
			Map<String, Object> any = this.any();
			if(any == null || any.size() == 0) {
				return ;
			}
			
			for (java.util.Map.Entry<String, Object> entry : any.entrySet()) {
				if(destMap.containsKey(entry.getKey())) {
					continue;
				}
				destMap.put(entry.getKey(), entry.getValue());
			}
		}
	}





	@Override
	public void copyTo(Map<String, Object> destMap) {
		this.copyTo(destMap, false);
	}
	
	@Override
	public void copyTo(Map<String, Object> destMap, boolean bDTOData) {
		Assert.notNull(destMap, "传入目标对象无效");
		if(!bDTOData && getDEMethodDTORuntime() != null) {
			Map<String, Object> any = this.any();
			if(any == null || any.size() == 0) {
				return ;
			}
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.putAll(any);
			
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if(psDEMethodDTOFieldList != null) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					String strFieldName = iPSDEMethodDTOField.getLowerCaseName();
					if(!map.containsKey(strFieldName)) {
						continue;
					}
					
					Object objValue = map.remove(strFieldName);
					
					if(objValue != null && iPSDEMethodDTOField.getRefPSDEMethodDTO() != null) {
						if(DEMethodDTOFieldType.DTO.value.equals(iPSDEMethodDTOField.getType())) {
							if(objValue instanceof IEntityDTO) {
								Map<String, Object> entity = new LinkedHashMap<String, Object>();
								((IEntityDTO)objValue).copyTo(entity);
								objValue = entity;
							}
						}
						else
							if(DEMethodDTOFieldType.DTOS.value.equals(iPSDEMethodDTOField.getType())) {
								if(iPSDEMethodDTOField.isListMap()) {
									Map<String, ?> src = (Map<String, ?>)objValue;
									Map<String, Object> newMap = new LinkedHashMap<String, Object>();
									for(java.util.Map.Entry<String, ?> entry : src.entrySet()) {
										Object value = entry.getValue();
										if(value instanceof IEntityDTO) {
											Map<String, Object> entity = new LinkedHashMap<String, Object>();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newMap.put(entry.getKey(), value);
									}
									objValue = newMap;
								}
								else {
									List<?> src = (List<?>)objValue;
									List<Object> newList = new ArrayList<>();
									for(Object value : src) {
										if(value instanceof IEntityDTO) {
											Map<String, Object> entity = new LinkedHashMap<String, Object>();
											((IEntityDTO)value).copyTo(entity);
											value = entity;
										}
										newList.add(value);
									}
									objValue = newList;
								}
							}
					}
					
					if(iPSDEMethodDTOField.getPSDEField() != null) {
						destMap.put(iPSDEMethodDTOField.getPSDEField().getLowerCaseName(), objValue);
					}
					else {
						destMap.put(strFieldName, objValue);
					}
				}
			}
			
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				destMap.put(entry.getKey(), entry.getValue());
			}
		}
		else {
			Map<String, Object> any = this.any();
			if(any == null || any.size() == 0) {
				return ;
			}
			destMap.putAll(any);
		}
	}
	
	
//	@Override
//	public void copyTo(Object destObject) {
//		Assert.notNull(destObject, "传入目标对象无效");
//		if(destObject instanceof IEntity) {
//			this.copyTo((IEntity)destObject);
//			return;
//		}
//		
//		if(destObject instanceof Map) {
//			this.copyTo((Map)destObject);
//			return;
//		}
//		
//	
//		BeanCopier.create(this.getClass(), destObject.getClass(), false).copy(this, destObject, null);
//	}
	
	
	
	@Override
	public void set(String strName, String strValue) {
		
		Assert.hasLength(strName, "传入属性名无效");
		
//		if(this.getDEMethodDTORuntime() != null) {
//			IPSDEMethodDTOField iPSDEMethodDTOField = null;
//			if(isActionInputDTO()) {
//				iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
//			}
//			else{
//				 iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(strName, true);
//			}
//			if(iPSDEMethodDTOField != null) {
//				int nStdDataType = iPSDEMethodDTOField.getStdDataType();
//				if(nStdDataType != DataTypes.UNKNOWN && !DataTypeUtils.isStringDataType(nStdDataType)) {
//					Object objValue = null;
//					try {
//						objValue = this.getDEMethodDTORuntime().getSystemRuntime().convertValue(nStdDataType, strValue);
//					} catch (Exception ex) {
//						throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime()
//								,String.format("转化数据[%1$s]至[%2$s]发生异常，%3$s", strValue, DataTypeUtils.getTypeName(nStdDataType), ex.getMessage())
//								,ex);
//					}
//					set(strName, objValue);
//					return ;
//				}
//			}
//			
//		}
		set(strName, (Object)strValue);
	}
	
	protected void _set(String strName, Object objValue) {
		super.set(strName, objValue);
	}
	
	protected Object _get(String strName) {
		return super.get(strName);
	}
	
	protected boolean _contains(String strName) {
		return super.contains(strName);
	}
	
	protected void _reset(String strName) {
		super.reset(strName);
	}


	@Override
	public IEntityDTO put(String strName, Object objValue) {
		this.set(strName, objValue);
		return this;
	}

	@Override
	public IEntityDTO put(String strName, String strValue) {
		this.set(strName, strValue);
		return this;
	}

	@Override
	public Timestamp getTimestamp(String strName, Timestamp def) {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public BigDecimal getBigDecimal(String strName, BigDecimal fDefault) {
		try {
			return DataTypeUtils.getBigDecimalValue(this.get(strName), fDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public BigInteger getBigInteger(String strName, BigInteger nDefault) {
		try {
			return DataTypeUtils.getBigIntegerValue(this.get(strName), nDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Boolean getBoolean(String strName, Boolean def) {
		try {
			return DataTypeUtils.getBooleanValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Double getDouble(String strName, Double def) {
		try {
			return DataTypeUtils.getDoubleValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Float getFloat(String strName, Float def) {
		try {
			return DataTypeUtils.getFloatValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Integer getInteger(String strName, Integer def) {
		try {
			return DataTypeUtils.getIntegerValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@Override
	public Long getLong(String strName, Long def) {
		try {
			return DataTypeUtils.getLongValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	


	@Override
	public String getString(String strName, String strDefault) {
		try {
			Object value = this.get(strName);
			if(value instanceof String) {
				return (String)value;
			}
			if(value != null && this.getDEMethodDTORuntime() != null && !isActionInputDTO()) {
				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(strName, true);
				if(iPSDEMethodDTOField!=null) {
					if(StringUtils.hasLength(iPSDEMethodDTOField.getJsonFormat()) 
							&& iPSDEMethodDTOField.getStdDataType() != StdDataType.UNKNOWN.value) {
						try {
							value = this.getDEMethodDTORuntime().getSystemRuntime().writeValue(iPSDEMethodDTOField.getStdDataType(), value, iPSDEMethodDTOField.getJsonFormat());
						}
						catch (Exception ex) {
							log.error(ex);
						}
					}
				}
			}	
			return DataTypeUtils.getStringValue(value, strDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@Override
	public String toString() {
		if(this.getDEMethodDTORuntime() != null) {
			return (String)this.getDEMethodDTORuntime().getDataEntityRuntime().serializeEntity(this);
		}
		else {
			return JsonUtils.toString(this);
		}
	}
	
}


