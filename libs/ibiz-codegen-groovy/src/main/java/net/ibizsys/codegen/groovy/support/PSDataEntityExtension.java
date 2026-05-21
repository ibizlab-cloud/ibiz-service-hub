package net.ibizsys.codegen.groovy.support;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.codegen.core.util.StdDataTypeUtils;
import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.CodeListType;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType;
import net.ibizsys.model.PSModelEnums.DEMethodDTOType;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.PSModelException;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSDataEntityObject;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupObjectDEField;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.model.util.JsonUtils;

public class PSDataEntityExtension {

	public static String getPKGCodeName(IPSDataEntity self) {
		IPSSystemModule iPSSystemModule = self.getPSSystemModuleMust();
		return PSSystemExtension.getPKGCodeName(iPSSystemModule);
	}

	public static String getPKGCodeName(IPSDataEntityObject self) {
		IPSDataEntity iPSDataEntity = self.getParentPSModelObject(IPSDataEntity.class);
		String strPKGCodeName = getPKGCodeName(iPSDataEntity);
		return String.format("%1$s.dataentity.%2$s", strPKGCodeName, PSSystemExtension.getUpperCamelCodeName(iPSDataEntity).toLowerCase());
	}


	public static String getJsonSchema(IPSAppDataEntity iPSAppDataEntity) {

		IPSApplication iPSApplication =	iPSAppDataEntity.getParentPSModelObject(IPSApplication.class, false);

		Map<String, IPSAppDataEntity> psAppDataEntityMap = new HashMap<String, IPSAppDataEntity>();

		if(!ObjectUtils.isEmpty(iPSApplication.getAllPSAppDataEntities())) {
			for(IPSAppDataEntity item : iPSApplication.getAllPSAppDataEntities()) {
				IPSDataEntity iPSDataEntity = item.getPSDataEntity();
				if(iPSDataEntity != null) {
					psAppDataEntityMap.put(iPSDataEntity.getId(), item);
				}
				else {
					psAppDataEntityMap.put(item.getName(), item);
				}
			}
		}




		IPSDataEntity iPSDataEntity = iPSAppDataEntity.getPSDataEntity();

		if(iPSDataEntity!=null) {
			IPSDEMethodDTO defaultPSDEMethodDTO = null;
			if(!ObjectUtils.isEmpty(iPSDataEntity.getAllPSDEMethodDTOs())) {
				for(IPSDEMethodDTO iPSDEMethodDTO : iPSDataEntity.getAllPSDEMethodDTOs()) {
					if(!DEMethodDTOType.DEFAULT.value.equalsIgnoreCase(iPSDEMethodDTO.getType())){
						continue;
					}
					if(iPSDEMethodDTO.isDefaultMode()) {
						defaultPSDEMethodDTO  = iPSDEMethodDTO;
						break;
					}
				}
			}

			if(defaultPSDEMethodDTO == null) {
				throw new PSModelException(iPSDataEntity, String.format("实体未定义默认DTO对象"));
			}

			Map<String, IPSDERBase> majorPSDERMap = new LinkedHashMap<String, IPSDERBase>();
			Map<String, IPSDERBase> minorPSDERMap = new LinkedHashMap<String, IPSDERBase>();

			if(!ObjectUtils.isEmpty(iPSDataEntity.getMajorPSDERs())) {
				for(IPSDERBase iPSDERBase : iPSDataEntity.getMajorPSDERs()) {
					majorPSDERMap.put(iPSDERBase.getId(), iPSDERBase);
				}
			}

			if(!ObjectUtils.isEmpty(iPSDataEntity.getMinorPSDERs())) {
				for(IPSDERBase iPSDERBase : iPSDataEntity.getMinorPSDERs()) {
					minorPSDERMap.put(iPSDERBase.getId(), iPSDERBase);
				}
			}

			ObjectNode objectNode = JsonUtils.createObjectNode();

			objectNode.put("type", "object");
			objectNode.put("title", iPSAppDataEntity.getLogicName());

			ObjectNode properties = objectNode.putObject("properties");

			if(!ObjectUtils.isEmpty(defaultPSDEMethodDTO.getPSDEMethodDTOFields())) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : defaultPSDEMethodDTO.getPSDEMethodDTOFields()) {

					IPSDEField iPSDEField = iPSDEMethodDTOField.getPSDEField();
					String codeName = iPSDEMethodDTOField.getCodeName();
					if(!StringUtils.hasLength(codeName)) {
						codeName = iPSDEMethodDTOField.getName();
					}

//					if(iPSDEField instanceof IPSLinkDEField) {
//
//						continue;
//					}

					DEMethodDTOFieldType deMethodDTOFieldType = DEMethodDTOFieldType.from(iPSDEMethodDTOField.getType());
					switch (deMethodDTOFieldType) {
						case SIMPLE:
						{
							StdDataType stdDataType = StdDataType.from(iPSDEMethodDTOField.getStdDataType());
							String strDataType = iPSDEField.getDataType();
							ObjectNode property = properties.putObject(codeName.toLowerCase());

							if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
									|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
								property.put("type", "number");
							}
							else {
								property.put("type", GroovyUtils.getJavaScriptType(stdDataType));
							}

							property.put("description", iPSDEMethodDTOField.getLogicName());

							if (StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
								if(StringUtils.hasLength(strDataType)) {
									if(DEFDataType.DATE.value.equals(strDataType)) {
										property.put("format", "date");
									}
									else
										if(DEFDataType.TIME.value.equals(strDataType)) {
											property.put("format", "time");
										}
										else {
											property.put("format", "date-time");
										}
								}
								else {
									if (stdDataType == StdDataType.DATE) {
										property.put("format", "date");
									}
									else
									if (stdDataType == StdDataType.TIME) {
										property.put("format", "time");
									}
									else {
										property.put("format", "date-time");
									}
								}
							}

							if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
								property.put("enumSource", iPSDEField.getPSCodeList().getCodeListTag());
							}
							//补充外键值属性信息
							if(iPSDEField!=null) {
								DEFDataType defDataType = DEFDataType.from(iPSDEField.getDataType());
								if(defDataType == DEFDataType.PICKUP ) {
									IPSDERBase iPSDERBase = ((IPSPickupDEField)iPSDEField).getPSDERMust();
									DERType derType = DERType.from(iPSDERBase.getDERType());
									if (derType == DERType.DER1N) {
										if (!StringUtils.hasLength(iPSDERBase.getCodeName())) {
											continue;
										}

										if (properties.has(iPSDERBase.getCodeName().toLowerCase())) {
											continue;
										}

										IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getId());
										if (refPSAppDataEntity == null) {
											refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getName());
										}

										if (refPSAppDataEntity == null) {
											continue;
										}

										property.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
										continue;
									}

									if (derType == DERType.DERCUSTOM) {
										IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
										if (!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
											continue;
										}

										if (!StringUtils.hasLength(iPSDERBase.getCodeName())) {
											continue;
										}

										if (properties.has(iPSDERBase.getCodeName().toLowerCase())) {
											continue;
										}

										IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getId());
										if (refPSAppDataEntity == null) {
											refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getName());
										}

										if (refPSAppDataEntity == null) {
											continue;
										}

										property.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));

										continue;
									}
								}
							}
						}
						break;
						case SIMPLES:
						{
							ObjectNode property = properties.putObject(codeName.toLowerCase());
							property.put("type", "array");
							ObjectNode items =  property.putObject("items");

							StdDataType stdDataType = StdDataType.from(iPSDEMethodDTOField.getStdDataType());
							if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
									|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
								items.put("type", "number");
							}
							else {
								items.put("type", GroovyUtils.getJavaScriptType(stdDataType));
							}
							if(StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
								if(stdDataType == StdDataType.DATE) {
									items.put("format", "date");
								}
								else {
									items.put("format", "date-time");
								}
							}

							property.put("description", iPSDEMethodDTOField.getLogicName());
							if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
								property.put("enumSource", iPSDEField.getPSCodeList().getCodeListTag());
							}
						}
						break;
						case DTO:
						{
							//从属性构建
							if(iPSDEField instanceof IPSOne2OneDataDEField) {
								IPSOne2OneDataDEField iPSOne2OneDataDEField = (IPSOne2OneDataDEField)iPSDEField;
								IPSDERBase iPSDERBase = iPSOne2OneDataDEField.getPSDER();
								if(iPSDERBase == null) {
									continue;
								}

								majorPSDERMap.remove(iPSDERBase.getId());

								IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getId());
								if(refPSAppDataEntity == null) {
									refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getName());
								}

								if(refPSAppDataEntity == null) {
									continue;
								}

								ObjectNode property = properties.putObject(codeName.toLowerCase());
								property.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
								property.put("description", iPSDEMethodDTOField.getLogicName());

								continue;
							}
							else
							if(iPSDEField instanceof IPSPickupObjectDEField) {
								IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField)iPSDEField;
								IPSDERBase iPSDERBase = iPSPickupObjectDEField.getPSDER();
								if(iPSDERBase == null) {
									continue;
								}

								minorPSDERMap.remove(iPSDERBase.getId());

								IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getId());
								if(refPSAppDataEntity == null) {
									refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getName());
								}

								if(refPSAppDataEntity == null) {
									continue;
								}

								ObjectNode property = properties.putObject(codeName.toLowerCase());
								property.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
								property.put("description", iPSDEMethodDTOField.getLogicName());
							}
							else
								continue;
						}
						break;
						case DTOS:
						{
							IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
							if(iPSDERBase == null && iPSDEField!=null) {
								//从属性构建
								if(!(iPSDEField instanceof IPSOne2ManyDataDEField)) {
									continue;
								}

								IPSOne2ManyDataDEField iPSOne2ManyDataDEField = (IPSOne2ManyDataDEField)iPSDEField;
								iPSDERBase = iPSOne2ManyDataDEField.getPSDER();
							}
							if(iPSDERBase == null) {
								continue;
							}

							majorPSDERMap.remove(iPSDERBase.getId());

							IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getId());
							if(refPSAppDataEntity == null) {
								refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getName());
							}

							if(refPSAppDataEntity == null) {
								continue;
							}

							ObjectNode property = properties.putObject(codeName.toLowerCase());
							property.put("type", "array");
							ObjectNode items =  property.putObject("items");
							items.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
							property.put("description", iPSDEMethodDTOField.getLogicName());

						}

						break;

						default:
							break;
					}

				}
			}

			for(IPSDERBase iPSDERBase : majorPSDERMap.values()) {
				DERType derType = DERType.from(iPSDERBase.getDERType());
				if(derType == DERType.DER1N) {
					if(!StringUtils.hasLength(iPSDERBase.getMinorCodeName())) {
						continue;
					}

					if(properties.has(iPSDERBase.getMinorCodeName().toLowerCase())) {
						continue;
					}

					IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getId());
					if(refPSAppDataEntity == null) {
						refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getName());
					}

					if(refPSAppDataEntity == null) {
						continue;
					}

					ObjectNode property = properties.putObject(iPSDERBase.getMinorCodeName().toLowerCase());
					property.put("type", "array");
					ObjectNode items =  property.putObject("items");
					items.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
					//property.put("description", iPSDEMethodDTOField.getLogicName());

					continue;
				}

				if(derType == DERType.DERCUSTOM) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
					if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
						continue;
					}


					if(!StringUtils.hasLength(iPSDERBase.getMinorCodeName())) {
						continue;
					}

					if(properties.has(iPSDERBase.getMinorCodeName().toLowerCase())) {
						continue;
					}

					IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getId());
					if(refPSAppDataEntity == null) {
						refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMinorPSDataEntityMust().getName());
					}

					if(refPSAppDataEntity == null) {
						continue;
					}

					ObjectNode property = properties.putObject(iPSDERBase.getMinorCodeName().toLowerCase());
					property.put("type", "array");
					ObjectNode items =  property.putObject("items");
					items.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
					//property.put("description", iPSDEMethodDTOField.getLogicName());

					continue;
				}
			}

			for(IPSDERBase iPSDERBase : minorPSDERMap.values()) {
				DERType derType = DERType.from(iPSDERBase.getDERType());
				if(derType == DERType.DER1N) {
					if(!StringUtils.hasLength(iPSDERBase.getCodeName())) {
						continue;
					}

					if(properties.has(iPSDERBase.getCodeName().toLowerCase())) {
						continue;
					}

					IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getId());
					if(refPSAppDataEntity == null) {
						refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getName());
					}

					if(refPSAppDataEntity == null) {
						continue;
					}

					ObjectNode property = properties.putObject(iPSDERBase.getCodeName().toLowerCase());
					property.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
					property.put("description", iPSDERBase.getLogicName());

					continue;
				}

				if(derType == DERType.DERCUSTOM) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
					if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
						continue;
					}

					if(!StringUtils.hasLength(iPSDERBase.getCodeName())) {
						continue;
					}

					if(properties.has(iPSDERBase.getCodeName().toLowerCase())) {
						continue;
					}

					IPSAppDataEntity refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getId());
					if(refPSAppDataEntity == null) {
						refPSAppDataEntity = psAppDataEntityMap.get(iPSDERBase.getMajorPSDataEntityMust().getName());
					}

					if(refPSAppDataEntity == null) {
						continue;
					}

					ObjectNode property = properties.putObject(iPSDERBase.getCodeName().toLowerCase());
					property.put("$ref", String.format("%1$s.json", refPSAppDataEntity.getCodeName()));
					property.put("description", iPSDERBase.getLogicName());

					continue;
				}
			}


			return objectNode.toPrettyString();

		}


		throw new PSModelException(iPSDataEntity, String.format("应用实体未绑定实体定义默认DTO对象"));

	}
	
	public static String getJsonSchema(IPSDataEntity iPSDataEntity) {

		IPSDEMethodDTO defaultPSDEMethodDTO = null;
		if(!ObjectUtils.isEmpty(iPSDataEntity.getAllPSDEMethodDTOs())) {
			for(IPSDEMethodDTO iPSDEMethodDTO : iPSDataEntity.getAllPSDEMethodDTOs()) {
				if(!DEMethodDTOType.DEFAULT.value.equalsIgnoreCase(iPSDEMethodDTO.getType())){
					continue;
				}
				if(iPSDEMethodDTO.isDefaultMode()) {
					defaultPSDEMethodDTO  = iPSDEMethodDTO;
					break;
				}
			}
		}

		if(defaultPSDEMethodDTO == null) {
			throw new PSModelException(iPSDataEntity, String.format("实体未定义默认DTO对象"));
		}

		Map<String, IPSDERBase> majorPSDERMap = new LinkedHashMap<String, IPSDERBase>();
		Map<String, IPSDERBase> minorPSDERMap = new LinkedHashMap<String, IPSDERBase>();

		if(!ObjectUtils.isEmpty(iPSDataEntity.getMajorPSDERs())) {
			for(IPSDERBase iPSDERBase : iPSDataEntity.getMajorPSDERs()) {
				majorPSDERMap.put(iPSDERBase.getId(), iPSDERBase);
			}
		}

		if(!ObjectUtils.isEmpty(iPSDataEntity.getMinorPSDERs())) {
			for(IPSDERBase iPSDERBase : iPSDataEntity.getMinorPSDERs()) {
				minorPSDERMap.put(iPSDERBase.getId(), iPSDERBase);
			}
		}

		ObjectNode objectNode = JsonUtils.createObjectNode();

		objectNode.put("type", "object");
		objectNode.put("title", iPSDataEntity.getLogicName());

		ObjectNode properties = objectNode.putObject("properties");

		if(!ObjectUtils.isEmpty(defaultPSDEMethodDTO.getPSDEMethodDTOFields())) {
			for(IPSDEMethodDTOField iPSDEMethodDTOField : defaultPSDEMethodDTO.getPSDEMethodDTOFields()) {

				IPSDEField iPSDEField = iPSDEMethodDTOField.getPSDEField();
//				if(iPSDEField!=null) {
//					DEFDataType defDataType = DEFDataType.from(iPSDEField.getDataType());
//					if(defDataType == DEFDataType.PICKUP ) {
//					//if(defDataType == DEFDataType.PICKUP || defDataType == DEFDataType.PICKUPTEXT || defDataType == DEFDataType.PICKUPDATA) {
//						continue;
//					}
//				}

				String codeName = iPSDEMethodDTOField.getCodeName();
				if(!StringUtils.hasLength(codeName)) {
					codeName = iPSDEMethodDTOField.getName();
				}

//				if(iPSDEField instanceof IPSLinkDEField) {
//
//					continue;
//				}

				DEMethodDTOFieldType deMethodDTOFieldType = DEMethodDTOFieldType.from(iPSDEMethodDTOField.getType());
				switch (deMethodDTOFieldType) {
					case SIMPLE:
					{
						StdDataType stdDataType = StdDataType.from(iPSDEMethodDTOField.getStdDataType());
						String strDataType = iPSDEField!=null?iPSDEField.getDataType():null;
						ObjectNode property = properties.putObject(codeName.toLowerCase());

						if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
								|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
							property.put("type", "number");
						}
						else {
							property.put("type", GroovyUtils.getJavaScriptType(stdDataType));
						}

						property.put("description", iPSDEMethodDTOField.getLogicName());

						if (StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
							if(StringUtils.hasLength(strDataType)) {
								if(DEFDataType.DATE.value.equals(strDataType)) {
									property.put("format", "date");
								}
								else
									if(DEFDataType.TIME.value.equals(strDataType)) {
										property.put("format", "time");
									}
									else {
										property.put("format", "date-time");
									}
							}
							else {
								if (stdDataType == StdDataType.DATE) {
									property.put("format", "date");
								}
								else
								if (stdDataType == StdDataType.TIME) {
									property.put("format", "time");
								}
								else {
									property.put("format", "date-time");
								}
							}
						}

						if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
							property.put("enumSource", iPSDEField.getPSCodeList().getCodeListTag());
						}
						//补充外键值属性信息
						if(iPSDEField!=null) {
							DEFDataType defDataType = DEFDataType.from(iPSDEField.getDataType());
							if(defDataType == DEFDataType.PICKUP ) {
								IPSDERBase iPSDERBase = ((IPSPickupDEField)iPSDEField).getPSDERMust();
								DERType derType = DERType.from(iPSDERBase.getDERType());
								if (derType == DERType.DER1N) {
									if (!StringUtils.hasLength(iPSDERBase.getCodeName())) {
										continue;
									}

									if (properties.has(iPSDERBase.getCodeName().toLowerCase())) {
										continue;
									}

									property.put("$ref", String.format("%1$s.json", iPSDERBase.getMajorPSDataEntityMust().getCodeName()));
									continue;
								}

								if (derType == DERType.DERCUSTOM) {
									IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
									if (!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
										continue;
									}

									if (!StringUtils.hasLength(iPSDERBase.getCodeName())) {
										continue;
									}

									if (properties.has(iPSDERBase.getCodeName().toLowerCase())) {
										continue;
									}

									property.put("$ref", String.format("%1$s.json", iPSDERBase.getMajorPSDataEntityMust().getCodeName()));

									continue;
								}
							}
						}
					}
					break;
					case SIMPLES:
					{
						ObjectNode property = properties.putObject(codeName.toLowerCase());
						property.put("type", "array");
						ObjectNode items =  property.putObject("items");

						StdDataType stdDataType = StdDataType.from(iPSDEMethodDTOField.getStdDataType());
						if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
								|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
							items.put("type", "number");
						}
						else {
							items.put("type", GroovyUtils.getJavaScriptType(stdDataType));
						}
						if(StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
							if(stdDataType == StdDataType.DATE) {
								items.put("format", "date");
							}
							else {
								items.put("format", "date-time");
							}
						}

						property.put("description", iPSDEMethodDTOField.getLogicName());
						if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
							property.put("enumSource", iPSDEField.getPSCodeList().getCodeListTag());
						}
					}
					break;
					case DTO:
					{
						//从属性构建
						if(iPSDEField instanceof IPSOne2OneDataDEField) {
							IPSOne2OneDataDEField iPSOne2OneDataDEField = (IPSOne2OneDataDEField)iPSDEField;
							IPSDERBase iPSDERBase = iPSOne2OneDataDEField.getPSDER();
							if(iPSDERBase == null) {
								continue;
							}

							majorPSDERMap.remove(iPSDERBase.getId());

							ObjectNode property = properties.putObject(codeName.toLowerCase());
							property.put("$ref", String.format("%1$s.json", iPSDERBase.getMinorPSDataEntityMust().getCodeName()));
							property.put("description", iPSDEMethodDTOField.getLogicName());

							continue;
						}
						else
						if(iPSDEField instanceof IPSPickupObjectDEField) {
							IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField)iPSDEField;
							IPSDERBase iPSDERBase = iPSPickupObjectDEField.getPSDER();
							if(iPSDERBase == null) {
								continue;
							}

							minorPSDERMap.remove(iPSDERBase.getId());

							ObjectNode property = properties.putObject(codeName.toLowerCase());
							property.put("$ref", String.format("%1$s.json", iPSDERBase.getMajorPSDataEntityMust().getCodeName()));
							property.put("description", iPSDEMethodDTOField.getLogicName());
						}
						else
							continue;
					}
					break;
					case DTOS:
					{
						IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
						if(iPSDERBase == null && iPSDEField!=null) {
							//从属性构建
							if(!(iPSDEField instanceof IPSOne2ManyDataDEField)) {
								continue;
							}

							IPSOne2ManyDataDEField iPSOne2ManyDataDEField = (IPSOne2ManyDataDEField)iPSDEField;
							iPSDERBase = iPSOne2ManyDataDEField.getPSDER();
						}
						if(iPSDERBase == null) {
							continue;
						}

						majorPSDERMap.remove(iPSDERBase.getId());


						ObjectNode property = properties.putObject(codeName.toLowerCase());
						property.put("type", "array");
						ObjectNode items =  property.putObject("items");
						items.put("$ref", String.format("%1$s.json", iPSDERBase.getMinorPSDataEntityMust().getCodeName()));
						property.put("description", iPSDEMethodDTOField.getLogicName());

					}

					break;

					default:
						break;
				}

			}
		}

		for(IPSDERBase iPSDERBase : majorPSDERMap.values()) {
			DERType derType = DERType.from(iPSDERBase.getDERType());
			if(derType == DERType.DER1N) {
				if(!StringUtils.hasLength(iPSDERBase.getMinorCodeName())) {
					continue;
				}

				if(properties.has(iPSDERBase.getMinorCodeName().toLowerCase())) {
					continue;
				}

				ObjectNode property = properties.putObject(iPSDERBase.getMinorCodeName().toLowerCase());
				property.put("type", "array");
				ObjectNode items =  property.putObject("items");
				items.put("$ref", String.format("%1$s.json", iPSDERBase.getMinorPSDataEntityMust().getCodeName()));
				//property.put("description", iPSDEMethodDTOField.getLogicName());

				continue;
			}

			if(derType == DERType.DERCUSTOM) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
				if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
					continue;
				}


				if(!StringUtils.hasLength(iPSDERBase.getMinorCodeName())) {
					continue;
				}

				if(properties.has(iPSDERBase.getMinorCodeName().toLowerCase())) {
					continue;
				}

				ObjectNode property = properties.putObject(iPSDERBase.getMinorCodeName().toLowerCase());
				property.put("type", "array");
				ObjectNode items =  property.putObject("items");
				items.put("$ref", String.format("%1$s.json", iPSDERBase.getMinorPSDataEntityMust().getCodeName()));
				//property.put("description", iPSDEMethodDTOField.getLogicName());

				continue;
			}
		}

		for(IPSDERBase iPSDERBase : minorPSDERMap.values()) {
			DERType derType = DERType.from(iPSDERBase.getDERType());
			if(derType == DERType.DER1N) {
				if(!StringUtils.hasLength(iPSDERBase.getCodeName())) {
					continue;
				}

				if(properties.has(iPSDERBase.getCodeName().toLowerCase())) {
					continue;
				}

				ObjectNode property = properties.putObject(iPSDERBase.getCodeName().toLowerCase());
				property.put("$ref", String.format("%1$s.json", iPSDERBase.getMajorPSDataEntityMust().getCodeName()));
				property.put("description", iPSDERBase.getLogicName());

				continue;
			}

			if(derType == DERType.DERCUSTOM) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
				if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
					continue;
				}

				if(!StringUtils.hasLength(iPSDERBase.getCodeName())) {
					continue;
				}

				if(properties.has(iPSDERBase.getCodeName().toLowerCase())) {
					continue;
				}


				ObjectNode property = properties.putObject(iPSDERBase.getCodeName().toLowerCase());
				property.put("$ref", String.format("%1$s.json", iPSDERBase.getMajorPSDataEntityMust().getCodeName()));
				property.put("description", iPSDERBase.getLogicName());

				continue;
			}
		}


		return objectNode.toPrettyString();

	}
	
	public static String getPSDEMethodDTOJsonSchema(IPSDEMethodDTO iPSDEMethodDTO) {
		
		Assert.notNull(iPSDEMethodDTO, "传入实体方法DTO对象无效");
		
		ObjectNode objectNode = JsonUtils.createObjectNode();

		objectNode.put("type", "object");
		String strLogicName = iPSDEMethodDTO.getLogicName();
		if(ObjectUtils.isEmpty(strLogicName)) {
			strLogicName = iPSDEMethodDTO.getName();
		}
		objectNode.put("title", strLogicName);

		ObjectNode properties = objectNode.putObject("properties");
		ArrayNode required = objectNode.putArray("required");
		
		boolean bDefaultDTO = DEMethodDTOType.DEFAULT.value.equals(iPSDEMethodDTO.getType());
		
		if(!ObjectUtils.isEmpty(iPSDEMethodDTO.getPSDEMethodDTOFields())) {
			for(IPSDEMethodDTOField iPSDEMethodDTOField : iPSDEMethodDTO.getPSDEMethodDTOFields()) {
				
				if(iPSDEMethodDTOField.isIgnoreOutput()) {
					continue;
				}

				IPSDEField iPSDEField = null;
				if(bDefaultDTO) {
					//仅默认DTO支持属性
					iPSDEField = iPSDEMethodDTOField.getPSDEField();
				}

				String codeName = iPSDEMethodDTOField.getCodeName();
				if(!StringUtils.hasLength(codeName)) {
					codeName = iPSDEMethodDTOField.getName();
				}
				
				boolean bReadonly =  iPSDEMethodDTOField.isReadOnly();
//				if(iPSDEField instanceof IPSLinkDEField) {
//
//					continue;
//				}

				DEMethodDTOFieldType deMethodDTOFieldType = DEMethodDTOFieldType.from(iPSDEMethodDTOField.getType());
				switch (deMethodDTOFieldType) {
					case SIMPLE:
					{
						StdDataType stdDataType = StdDataType.from(iPSDEMethodDTOField.getStdDataType());
						String strDataType = iPSDEField!=null?iPSDEField.getDataType():null;
						
						ObjectNode property = properties.putObject(codeName.toLowerCase());
						

						if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
								|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
							property.put("type", "number");
						}
						else {
							property.put("type", GroovyUtils.getJavaScriptType(stdDataType));
						}
						
						
						if (StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
							if(StringUtils.hasLength(strDataType)) {
								if(DEFDataType.DATE.value.equals(strDataType)) {
									property.put("format", "date");
								}
								else
									if(DEFDataType.TIME.value.equals(strDataType)) {
										property.put("format", "time");
									}
									else {
										property.put("format", "date-time");
									}
							}
							else {
								if (stdDataType == StdDataType.DATE) {
									property.put("format", "date");
								}
								else
								if (stdDataType == StdDataType.TIME) {
									property.put("format", "time");
								}
								else {
									property.put("format", "date-time");
								}
							}
						}
						
						String strDescription = iPSDEMethodDTOField.getLogicName();
						if(StringUtils.hasLength(iPSDEMethodDTOField.getMemo())) {
							strDescription += String.format("，%1$s", iPSDEMethodDTOField.getMemo());
						}

						if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
							property.put("enumSource", iPSDEField.getPSCodeList().getCodeListTag());
						}
						//补充外键值属性信息
						if(iPSDEField!=null) {
							DEFDataType defDataType = DEFDataType.from(iPSDEField.getDataType());
							if(defDataType == DEFDataType.PICKUP ) {
								IPSDERBase iPSDERBase = ((IPSPickupDEField)iPSDEField).getPSDERMust();
								DERType derType = DERType.from(iPSDERBase.getDERType());
								if (derType == DERType.DER1N) {
									strDescription += String.format("。外键属性，引用实体`%1$s`(%2$s)", iPSDERBase.getMajorPSDataEntityMust().getLogicName(), PSModelUtils.calcFullUniqueTag2(iPSDERBase.getMajorPSDataEntityMust()));
								}
								else
								if (derType == DERType.DERCUSTOM) {
									IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
									if (DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
										strDescription += String.format("。外键属性，引用实体`%1$s`(%2$s)", iPSDERBase.getMajorPSDataEntityMust().getLogicName(), PSModelUtils.calcFullUniqueTag2(iPSDERBase.getMajorPSDataEntityMust()));
									}
								}
							}
						}
						
						if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
							if(CodeListType.STATIC.value.equals(iPSDEField.getPSCodeList().getCodeListType()) && !ObjectUtils.isEmpty(iPSDEField.getPSCodeList().getPSCodeItems())) {
								strDescription +="。枚举定义：";
								boolean bFirst = true;
								for(IPSCodeItem iPSCodeItem : iPSDEField.getPSCodeList().getPSCodeItems()) {
									if(bFirst) {
										bFirst = false;
									}
									else {
										strDescription += "、";
									}
									strDescription += String.format("%1$s(%2$s)", iPSCodeItem.getValue(), iPSCodeItem.getText());
								}
								strDescription += "。";
							}
						}
						
						property.put("description", strDescription);
						if(bReadonly) {
							property.put("readonly", true);
						}
						else {
							if(!iPSDEMethodDTOField.isAllowEmpty() && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValue()) && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValueType())) {
								if(iPSDEField == null || !iPSDEField.isKeyDEField())
									required.add(codeName.toLowerCase());
							}
							if(StdDataTypeUtils.isStringDataType(stdDataType)) {
								//TODO: 正则式
								//property.put("pattern", strDescription);
								if(iPSDEMethodDTOField.getMinStringLength() > 0) {
									property.put("minLength", iPSDEMethodDTOField.getMinStringLength());
								}
								if(iPSDEMethodDTOField.getStringLength() > 0) {
									property.put("maxLength", iPSDEMethodDTOField.getStringLength());
								}
							}
							else if(StdDataTypeUtils.isNumberDataType(stdDataType)){
									if(StringUtils.hasLength(iPSDEMethodDTOField.getMinValueString())) {
										if(iPSDEMethodDTOField.getMinValueString().indexOf(".") == -1) {
											long value = Long.valueOf(iPSDEMethodDTOField.getMinValueString());
											if(value <= Integer.MAX_VALUE) 
												property.put("minimum", (int) value);
											else
												property.put("minimum", value);
										}
										else {
											property.put("minimum", Double.valueOf(iPSDEMethodDTOField.getMinValueString()));
										}
									}
									
									if(StringUtils.hasLength(iPSDEMethodDTOField.getMaxValueString())) {
										if(iPSDEMethodDTOField.getMaxValueString().indexOf(".") == -1) {
											long value = Long.valueOf(iPSDEMethodDTOField.getMaxValueString());
											if(value <= Integer.MAX_VALUE) 
												property.put("maximum", (int) value);
											else
												property.put("maximum", value);
										}
										else {
											property.put("maximum", Double.valueOf(iPSDEMethodDTOField.getMaxValueString()));
										}
									}
							}
						}
					}
					break;
					case SIMPLES:
					{
						ObjectNode property = properties.putObject(codeName.toLowerCase());
						property.put("type", "array");
						ObjectNode items =  property.putObject("items");

						StdDataType stdDataType = StdDataType.from(iPSDEMethodDTOField.getStdDataType());
						if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)
								|| StdDataTypeUtils.isBigIntDataType(stdDataType)) {
							items.put("type", "number");
						}
						else {
							items.put("type", GroovyUtils.getJavaScriptType(stdDataType));
						}
						if(StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
							if(stdDataType == StdDataType.DATE) {
								items.put("format", "date");
							}
							else {
								items.put("format", "date-time");
							}
						}
						
						String strDescription = iPSDEMethodDTOField.getLogicName();
						if(StringUtils.hasLength(iPSDEMethodDTOField.getMemo())) {
							strDescription += String.format("，%1$s", iPSDEMethodDTOField.getMemo());
						}
						if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
							property.put("enumSource", iPSDEField.getPSCodeList().getCodeListTag());
						}
						if(iPSDEField!=null && iPSDEField.getPSCodeList()!=null) {
							if(CodeListType.STATIC.value.equals(iPSDEField.getPSCodeList().getCodeListType()) && !ObjectUtils.isEmpty(iPSDEField.getPSCodeList().getPSCodeItems())) {
								strDescription +="。枚举定义：";
								boolean bFirst = true;
								for(IPSCodeItem iPSCodeItem : iPSDEField.getPSCodeList().getPSCodeItems()) {
									if(bFirst) {
										bFirst = false;
									}
									else {
										strDescription += "、";
									}
									strDescription += String.format("%1$s(%2$s)", iPSCodeItem.getValue(), iPSCodeItem.getText());
								}
								strDescription += "。";
							}
						}
						property.put("description", strDescription);
						if(bReadonly) {
							property.put("readonly", true);
						}
						else {
							if(!iPSDEMethodDTOField.isAllowEmpty() && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValue()) && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValueType())) {
								required.add(codeName.toLowerCase());
							}
						}
					}
					break;
					case DTO:
					{
						IPSDEMethodDTO refPSDEMethodDTO = iPSDEMethodDTOField.getRefPSDEMethodDTO();
						if(refPSDEMethodDTO != null) {
							ObjectNode property = properties.putObject(codeName.toLowerCase());
							property.put("$ref", String.format("%1$s.json", refPSDEMethodDTO.getCodeName()));
							String strDescription = iPSDEMethodDTOField.getLogicName();
							if(StringUtils.hasLength(iPSDEMethodDTOField.getMemo())) {
								strDescription += String.format("，%1$s", iPSDEMethodDTOField.getMemo());
							}
							property.put("description", strDescription);
							if(bReadonly) {
								property.put("readonly", true);
							}
							else {
								if(!iPSDEMethodDTOField.isAllowEmpty() && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValue()) && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValueType())) {
									required.add(codeName.toLowerCase());
								}
							}
						}
					}
					break;
					case DTOS:
					{
						IPSDEMethodDTO refPSDEMethodDTO = iPSDEMethodDTOField.getRefPSDEMethodDTO();
						if(refPSDEMethodDTO != null) {
							ObjectNode property = properties.putObject(codeName.toLowerCase());
							property.put("type", "array");
							ObjectNode items =  property.putObject("items");
							items.put("$ref", String.format("%1$s.json", refPSDEMethodDTO.getCodeName()));
							String strDescription = iPSDEMethodDTOField.getLogicName();
							if(StringUtils.hasLength(iPSDEMethodDTOField.getMemo())) {
								strDescription += String.format("，%1$s", iPSDEMethodDTOField.getMemo());
							}
							property.put("description", strDescription);
							if(bReadonly) {
								property.put("readonly", true);
							}
							else {
								if(!iPSDEMethodDTOField.isAllowEmpty() && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValue()) && ObjectUtils.isEmpty(iPSDEMethodDTOField.getDefaultValueType())) {
									required.add(codeName.toLowerCase());
								}
							}
						}
					}
					break;

					default:
						break;
				}

			}
		}

		return objectNode.toPrettyString();
	}

	
}
