package net.ibizsys.codegen.groovy.support;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.codegen.core.util.StdDataTypeUtils;
import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType;
import net.ibizsys.model.PSModelEnums.DEMethodDTOType;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.PSModelException;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
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

//			StringBuilder sb = new StringBuilder();

			ObjectMapper mapper = new ObjectMapper();
			ObjectNode objectNode = mapper.createObjectNode();

			objectNode.put("type", "object");
			objectNode.put("title", iPSAppDataEntity.getLogicName());

			ObjectNode properties = objectNode.putObject("properties");

			if(!ObjectUtils.isEmpty(defaultPSDEMethodDTO.getPSDEMethodDTOFields())) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : defaultPSDEMethodDTO.getPSDEMethodDTOFields()) {

					IPSDEField iPSDEField = iPSDEMethodDTOField.getPSDEField();
//					if(iPSDEField!=null) {
//						DEFDataType defDataType = DEFDataType.from(iPSDEField.getDataType());
//						if(defDataType == DEFDataType.PICKUP ) {
//						//if(defDataType == DEFDataType.PICKUP || defDataType == DEFDataType.PICKUPTEXT || defDataType == DEFDataType.PICKUPDATA) {
//							continue;
//						}
//					}

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
									IPSDERBase iPSDERBase = ((IPSPickupDEField)iPSDEField).getPSDER();
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

//		StringBuilder sb = new StringBuilder();

		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();

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
								IPSDERBase iPSDERBase = ((IPSPickupDEField)iPSDEField).getPSDER();
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

}
