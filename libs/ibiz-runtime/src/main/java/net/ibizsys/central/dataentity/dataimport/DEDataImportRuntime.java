package net.ibizsys.central.dataentity.dataimport;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.codelist.IDynamicCodeListRuntime;
import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntity;

public class DEDataImportRuntime extends DataEntityModelRuntimeBase implements IDEDataImportRuntime {

	private static final Log log = LogFactory.getLog(DEDataImportRuntime.class);
	private IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext = null;
	private IPSDEDataImport iPSDEDataImport = null;

	@Override
	public void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEDataImport iPSDEDataImport) throws Exception {
		this.iDataEntityRuntimeBaseContext = iDataEntityRuntimeBaseContext;
		this.iPSDEDataImport = iPSDEDataImport;
		this.setDataEntityRuntimeBase(this.iDataEntityRuntimeBaseContext.getDataEntityRuntime());
		this.onInit();
	}

	@Override
	public IPSDEDataImport getPSDEDataImport() {
		return this.iPSDEDataImport;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEDataImport();
	}

	protected IUserContext getUserContext() {
		return UserContext.getCurrent();
	}

	@Override
	public Map<Integer, EntityError> importData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv) throws Throwable {
		return importData(baseEntity, list, bTestPriv, null, null);
	}

	@Override
	public Map<Integer, EntityError> importFile(IEntity baseEntity, File file, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			try(InputStream inputStream = new FileInputStream(file)){
				return importStream(baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);
			}
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			return this.onImportStream(baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据流发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Map<Integer, EntityError> onImportStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, null, Errors.NOTIMPL);
	}

	@Override
	public Map<Integer, EntityError> importData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			return this.onImportData(baseEntity, list, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Map<Integer, EntityError> onImportData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {

		if (ObjectUtils.isEmpty(list)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, "没有传入导入数据");
		}

		Map<Integer, EntityError> entityErrorMap = new TreeMap<>();
		boolean bIgnoreError = this.isIgnoreError();

		Map<String, IPSDEDataImportItem> psDEDataImportItemMap = getPSDEDataImportItems();
		if (psDEDataImportItemMap == null || psDEDataImportItemMap.size() == 0) {
			throw new Exception(String.format("没有定义任何导入项"));
		}

		Map<String, Object> activeDataMap = null;
		if(parentDataEntityRuntime!=null && StringUtils.hasLength(strParentKey)) {
			activeDataMap = new LinkedHashMap<String, Object>();
			activeDataMap.put(parentDataEntityRuntime.getLowerCaseName(), strParentKey);
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSession();

		Map<String, ISysTranslatorRuntime> sysTranslatorRuntimeMap = new HashMap<>();
		Map<String, ICodeListRuntime> codeListRuntimeMap = new HashMap<>();
		Map<String, IPSDERBase> psDERBaseMap = new HashMap<>();
		Map<String, IPSLinkDEField> relatedPSDEFieldMap = new HashMap<>();

		Map<String, IPSDEField> psDEFieldMap = new HashMap<>();

		Map<String, IPSDEField> uniquePSDEFieldMap = new HashMap<>();

		if(actionSession != null) {
			actionSession.updateActionStep("正在构建导入数据模型", 10.0);
		}

		for (java.util.Map.Entry<String, IPSDEDataImportItem> entry : psDEDataImportItemMap.entrySet()) {
			psDEFieldMap.put(entry.getValue().getPSDEFieldMust().getLowerCaseName(), entry.getValue().getPSDEFieldMust());
			if (entry.getValue().isUniqueItem()) {

				//
				IPSDEField iPSDEField = entry.getValue().getPSDEFieldMust();
				if(DEFDataTypes.PICKUPDATA.equals(iPSDEField.getDataType()) || DEFDataTypes.PICKUPTEXT.equals(iPSDEField.getDataType())) {
					//调整为连接属性
					IPSDERBase iPSDERBase = ((IPSLinkDEField)iPSDEField).getPSDERMust();
					if(iPSDERBase instanceof IPSDER1N) {
						iPSDEField = ((IPSDER1N)iPSDERBase).getPSPickupDEFieldMust();
					}
				}

				uniquePSDEFieldMap.put(iPSDEField.getLowerCaseName(), iPSDEField);
			}
		}

		// 准备导入项配置
		for (java.util.Map.Entry<String, IPSDEDataImportItem> entry : psDEDataImportItemMap.entrySet()) {
			if (entry.getValue().getPSSysTranslator() != null) {
				ISysTranslatorRuntime iSysTranslatorRuntime = this.getSystemRuntimeBase().getSysTranslatorRuntime(entry.getValue().getPSSysTranslator());
				sysTranslatorRuntimeMap.put(entry.getKey(), iSysTranslatorRuntime);
				continue;
			}

			if (entry.getValue().getPSCodeList() != null) {
				ICodeListRuntime iCodeListRuntime = this.getSystemRuntimeBase().getCodeListRuntime(entry.getValue().getPSCodeList());
				if(!ObjectUtils.isEmpty(activeDataMap)) {
					if(iCodeListRuntime instanceof IDynamicCodeListRuntime) {
						iCodeListRuntime = ((IDynamicCodeListRuntime)iCodeListRuntime).getInstance(activeDataMap);
					}
				}
				codeListRuntimeMap.put(entry.getKey(), iCodeListRuntime);
				continue;
			}
		}

		// 准备外键
		for (java.util.Map.Entry<String, IPSDEDataImportItem> entry : psDEDataImportItemMap.entrySet()) {
			IPSDEField iPSDEField = entry.getValue().getPSDEFieldMust();
			if (!(iPSDEField instanceof IPSLinkDEField)) {
				continue;
			}
			IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
			IPSDERBase iPSDERBase = null;
			if (DEFDataTypes.INHERIT.equals(iPSLinkDEField.getDataType())) {
				IPSDEField relatedPSDEField = iPSLinkDEField.getRelatedPSDEFieldMust();
				while (relatedPSDEField != null) {
					if (relatedPSDEField instanceof IPSLinkDEField) {
						if (DEFDataTypes.INHERIT.endsWith(relatedPSDEField.getDataType())) {
							// 继续递归
							relatedPSDEField = ((IPSLinkDEField) relatedPSDEField).getRelatedPSDEFieldMust();
						} else {
							iPSDERBase = ((IPSLinkDEField) relatedPSDEField).getPSDERMust();
							psDERBaseMap.put(entry.getKey(), iPSDERBase);
							relatedPSDEFieldMap.put(entry.getKey(), (IPSLinkDEField) relatedPSDEField);
							break;
						}
					} else {
						break;
					}
				}
			} else {
				iPSDERBase = iPSLinkDEField.getPSDERMust();
				psDERBaseMap.put(entry.getKey(), iPSDERBase);
				relatedPSDEFieldMap.put(entry.getKey(), iPSLinkDEField);
			}
		}

		if(actionSession != null) {
			actionSession.updateActionStep("正在分析导入数据", 20.0);
		}

		Map<String, Object> fieldValueCacheMap = new HashMap<>();

		Map<Integer, IEntity> entityMap = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			boolean bError = false;
			IEntity iEntity = this.getDataEntityRuntime().createEntity();
			Map<String, Object> map = list.get(i);
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				if (ObjectUtils.isEmpty(entry.getValue())) {
					continue;
				}
				String strTag = entry.getKey();
				if (ObjectUtils.isEmpty(strTag)) {
					if (bIgnoreError) {
						bError = true;
						EntityError entityError = new EntityError();
						entityError.setErrorInfo(String.format("没有指定导入标记"));
						entityErrorMap.put(i, entityError);
						break;
					} else {
						throw new Exception(String.format("导入数据[%1$s]没有导入标记", i));
					}
				}

				strTag = strTag.toUpperCase();
				IPSDEDataImportItem iPSDEDataImportItem = psDEDataImportItemMap.get(strTag);
				if (iPSDEDataImportItem == null) {
					if(this.getPSDEDataImport().isEnableCustomized()){
						continue;
					}
					if (bIgnoreError) {
						bError = true;
						EntityError entityError = new EntityError();
						entityError.setErrorInfo(String.format("无法获取指定标记[%1$s]对应的导入项", strTag));
						entityErrorMap.put(i, entityError);
						break;
					} else {
						throw new Exception(String.format("导入数据[%1$s]指定标记[%2$s]无法识别", i, strTag));
					}
				}

				IPSDEField iPSDEField = iPSDEDataImportItem.getPSDEFieldMust();
				String strContent = String.valueOf(entry.getValue());


				ISysTranslatorRuntime iSysTranslatorRuntime = sysTranslatorRuntimeMap.get(strTag);
				if (iSysTranslatorRuntime != null) {
					if(!StringUtils.hasLength(strContent)) {
						continue;
					}

					String strCacheTag = String.format("%1$s|%2$s", iPSDEField.getLowerCaseName(), strContent);
					if (fieldValueCacheMap.containsKey(strCacheTag)) {
						Object objRealValue = fieldValueCacheMap.get(strCacheTag);
						this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, objRealValue);
						continue;
					}

					try {
						Object objRealValue = iSysTranslatorRuntime.translate(strContent, true, iEntity, iPSDEField, this.getDataEntityRuntime());
						this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, objRealValue);
						fieldValueCacheMap.put(strCacheTag, objRealValue);
					}
					catch (Throwable ex) {
						if (bIgnoreError) {
							log.error(ex);
							bError = true;
							EntityError entityError = new EntityError();
							//entityError.setErrorInfo(String.format("导入数据[%1$s]项[%2$s]值[%3$s]无法被代码表[%4$s]识别", i, strTag, strContent, iCodeListRuntime.getName()));
							entityError.setErrorInfo(String.format("项[%1$s]值[%2$s]转换器[%3$s]处理发生异常，%4$s", strTag, strContent, iSysTranslatorRuntime.getName(), ex.getMessage()));
							entityErrorMap.put(i, entityError);
							break;
						} else {
							throw new Exception(String.format("导入数据[%1$s]项[%2$s]值[%3$s]转换器[%4$s]处理发生异常，%5$s", i, strTag, strContent, iSysTranslatorRuntime.getName(), ex.getMessage()), ex);
						}
					}
					continue;
				}

				ICodeListRuntime iCodeListRuntime = codeListRuntimeMap.get(strTag);
				if (iCodeListRuntime != null) {
					String strCacheTag = String.format("%1$s|%2$s", iPSDEField.getLowerCaseName(), strContent);
					if (fieldValueCacheMap.containsKey(strCacheTag)) {
						Object objRealValue = fieldValueCacheMap.get(strCacheTag);
						this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, objRealValue);
						continue;
					}

					// 进一步判断代码项的类型
					String strDataType = iPSDEField.getDataType();
					if (DEFDataTypes.NMCODELIST.equals(strDataType) || DEFDataTypes.SMCODELIST.equals(strDataType)) {
						boolean bNumberMode = DEFDataTypes.NMCODELIST.equals(strDataType);
						int nRealValue = 0;
						String strRealValue = "";
						// 数值多选，判断有没有分割符号
						String strNewContent = strContent;
						strNewContent = strNewContent.replace("|", ";");
						strNewContent = strNewContent.replace(",", ";");
						strNewContent = strNewContent.replace("，", ";");
						strNewContent = strNewContent.replace("、", ";");

						String[] items = strNewContent.split("[;]");
						boolean bValueMode = false;
						for (int l = 0; l < items.length; l++) {
							String strText = items[l];
							IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItemByText(strText, this.getUserContext(), true);
							if (iPSCodeItem == null) {
								// 没有办法找到对应的文本
								bValueMode = true;
								break;
							} else {
								if (bNumberMode) {
									nRealValue |= Integer.parseInt(iPSCodeItem.getValue());
								} else {
									if (!ObjectUtils.isEmpty(strRealValue)) {
										strRealValue += iCodeListRuntime.getValueSeparator();
									}
									strRealValue += iPSCodeItem.getValue();
								}
							}

							if (bValueMode) {
								if (bNumberMode) {
									nRealValue = Integer.parseInt(String.valueOf(entry.getValue()));
									this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, nRealValue);
									fieldValueCacheMap.put(strCacheTag, nRealValue);
								} else {
									strRealValue = strNewContent.replace(";", iCodeListRuntime.getValueSeparator());
									this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, strRealValue);
									fieldValueCacheMap.put(strCacheTag, strRealValue);
								}
							} else {
								if (bNumberMode) {
									this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, nRealValue);
									fieldValueCacheMap.put(strCacheTag, nRealValue);
								} else {
									iEntity.set(iPSDEField.getLowerCaseName(), strRealValue);
									this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, strRealValue);
									fieldValueCacheMap.put(strCacheTag, strRealValue);
								}
							}

						}
					} else {
						IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItemByText(strContent, this.getUserContext(), true);
						if (iPSCodeItem == null) {
							iPSCodeItem = iCodeListRuntime.getPSCodeItem(strContent, true);
							if (iPSCodeItem == null) {
								// 判断是否为空值
								if (!strContent.equalsIgnoreCase(iCodeListRuntime.getEmptyText())) {
									if (bIgnoreError) {
										bError = true;
										EntityError entityError = new EntityError();
										//entityError.setErrorInfo(String.format("导入数据[%1$s]项[%2$s]值[%3$s]无法被代码表[%4$s]识别", i, strTag, strContent, iCodeListRuntime.getName()));
										entityError.setErrorInfo(String.format("项[%1$s]值[%2$s]无法被代码表[%3$s]识别", strTag, strContent, iCodeListRuntime.getName()));
										entityErrorMap.put(i, entityError);
										break;
									} else {
										throw new Exception(String.format("导入数据[%1$s]项[%2$s]值[%3$s]无法被代码表[%4$s]识别", i, strTag, strContent, iCodeListRuntime.getName()));
									}
								}
							}
						} else {
							Object objRealValue = this.getDataEntityRuntime().convertValue(iPSDEField.getStdDataType(), iPSCodeItem.getValue());
							this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, objRealValue);
							fieldValueCacheMap.put(strCacheTag, objRealValue);

						}
					}
					continue;
				}

				// 外键处理
				IPSDERBase iPSDERBase = psDERBaseMap.get(strTag);
				if (iPSDERBase != null) {

					IPSLinkDEField iPSLinkPSDEField = relatedPSDEFieldMap.get(strTag);
					if (DEFDataTypes.PICKUP.equals(iPSLinkPSDEField.getDataType())) {
						this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, this.getDataEntityRuntime().convertValue(iPSDEField.getStdDataType(), strContent));
					} else if (DEFDataTypes.PICKUPTEXT.equals(iPSLinkPSDEField.getDataType()) || (isEnablePickupDataField() && DEFDataTypes.PICKUPDATA.equals(iPSLinkPSDEField.getDataType()))) {
						if (iPSDERBase instanceof IPSDER1N) {
							IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;

							if (isFillPickupTextField()) {
								this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, this.getDataEntityRuntime().convertValue(iPSDEField.getStdDataType(), strContent));
							}

							// 判断导入数据是否包括外键
							if (psDEFieldMap.containsKey(iPSDER1N.getPSPickupDEFieldMust().getLowerCaseName())) {
								continue;
							}

							// 枚举全部属性
							IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntityMust().getId());
							ISearchContextDTO iSearchContextDTO = majorDataEntityRuntime.createSearchContext();
							// 增加过滤条件
							SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSLinkPSDEField.getRelatedPSDEFieldMust().getLowerCaseName(), Conditions.EQ, strContent, null);
							// 放入额外条件
							for (java.util.Map.Entry<String, IPSDERBase> entry2 : psDERBaseMap.entrySet()) {
								if (entry2.getKey().equals(strTag)) {
									continue;
								}
								if (entry2.getValue().getId().equals(iPSDERBase.getId())) {
									IPSLinkDEField iPSLinkPSDEField2 = relatedPSDEFieldMap.get(entry2.getKey());
									if (iPSLinkPSDEField2 != null) {
										Object conten2 = map.get(entry2.getKey());
										if (conten2 == null) {
											continue;
										}
										String strContent2 = String.valueOf(conten2);
										SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSLinkPSDEField2.getRelatedPSDEFieldMust().getLowerCaseName(), Conditions.EQ, strContent2, null);
									}
								}
							}

							// 计算外键标记
							String strCacheTag = iPSDER1N.getPSPickupDEFieldMust().getLowerCaseName() + ";";
							Assert.notNull(iSearchContextDTO.any(), "搜索过滤器直接变量对象无效");
							for (java.util.Map.Entry<String, Object> entry2 : iSearchContextDTO.any().entrySet()) {
								strCacheTag += String.format("%1$s|%2$s;", entry2.getKey(), entry2.getValue());
							}

							if (fieldValueCacheMap.containsKey(strCacheTag)) {
								Object objRealValue = fieldValueCacheMap.get(strCacheTag);
								this.getDataEntityRuntime().setFieldValue(iEntity, iPSDER1N.getPSPickupDEFieldMust(), objRealValue);
								continue;
							}

							// 设置最大查询2条
							majorDataEntityRuntime.setSearchPaging(iSearchContextDTO, ISearchContextDTO.STARTPAGE, 2);

							List<IEntityDTO> entityList = majorDataEntityRuntime.select(iSearchContextDTO);
							if (entityList == null || entityList.size() != 1) {
								if (bIgnoreError) {
									bError = true;
									EntityError entityError = new EntityError();
									//entityError.setErrorInfo(String.format("导入数据[%1$s]项[%2$s]值[%3$s]无法被实体[%4$s]识别", i, strTag, strContent, majorDataEntityRuntime.getPSDataEntity().getLogicName()));
									entityError.setErrorInfo(String.format("项[%1$s]值[%2$s]无法被实体[%3$s]识别", strTag, strContent, majorDataEntityRuntime.getPSDataEntity().getLogicName()));
									entityErrorMap.put(i, entityError);
									break;
								} else {
									throw new Exception(String.format("导入数据[%1$s]项[%2$s]值[%3$s]无法被实体[%4$s]识别", i, strTag, strContent, majorDataEntityRuntime.getPSDataEntity().getLogicName()));
								}
							}

							Object objRealValue = majorDataEntityRuntime.getFieldValue(entityList.get(0), majorDataEntityRuntime.getKeyPSDEField());
							this.getDataEntityRuntime().setFieldValue(iEntity, iPSDER1N.getPSPickupDEFieldMust(), objRealValue);
							fieldValueCacheMap.put(strCacheTag, objRealValue);
						}
					}

					continue;
				}

				Object objRealValue;
				try {
					objRealValue = this.getDataEntityRuntime().convertValue(iPSDEField.getStdDataType(), strContent);
				} catch (Exception e) {
					if (bIgnoreError) {
						bError = true;
						EntityError entityError = new EntityError();
						entityError.setErrorInfo(String.format("项[%1$s]值[%2$s]不符合格式要求", strTag, strContent));
						entityErrorMap.put(i, entityError);
						break;
					} else {
						throw new Exception(String.format("项[%1$s]值[%2$s]不符合格式要求", strTag, strContent));
					}
				}
				this.getDataEntityRuntime().setFieldValue(iEntity, iPSDEField, objRealValue);

			}
			if (bError) {
				continue;
			}
			entityMap.put(i, iEntity);
		}

		this.doImportData(baseEntity, list, bTestPriv, parentDataEntityRuntime, strParentKey, entityMap, uniquePSDEFieldMap, entityErrorMap);

//		if(actionSession != null) {
//			actionSession.updateActionStep("导入数据完成", 100.0);
//		}

		if (entityErrorMap.size() == 0) {
			return null;
		}

		return entityErrorMap;
	}

	protected void doImportData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, Map<Integer, IEntity> entityMap, Map<String, IPSDEField> uniquePSDEFieldMap, Map<Integer, EntityError> entityErrorMap) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();

//		if(entityErrorMap == null) {
//			entityErrorMap = new LinkedHashMap<Integer, EntityError>();
//		}

		if(actionSession != null) {
			actionSession.updateActionStep("正在导入数据", 30.0);
		}

		Map<String, IPSDEDataImportItem> psDEDataImportItemMap = getPSDEDataImportItems();
		if (psDEDataImportItemMap == null || psDEDataImportItemMap.size() == 0) {
			throw new Exception(String.format("没有定义任何导入项"));
		}

		Map<String, IPSDEDataImportItem> psDEFieldImportItemMap = new HashMap<String, IPSDEDataImportItem>();
		for(IPSDEDataImportItem iPSDEDataImportItem : psDEDataImportItemMap.values()) {
			psDEFieldImportItemMap.put(iPSDEDataImportItem.getPSDEFieldMust().getLowerCaseName(), iPSDEDataImportItem);
		}

		int nStep = list.size() / 7;

		for (int i = 0; i < list.size(); i++) {

			if(actionSession != null && nStep != 0) {
				if(i != 0 && (i % nStep == 0)) {
					actionSession.updateActionStep("正在导入数据", 30.0 + (i / nStep) * 10);
				}
			}

			IEntity iEntity = entityMap.get(i);
			if (iEntity == null) {
				continue;
			}

			if (baseEntity != null) {
				baseEntity.copyTo(iEntity);
			}

			// 判断新建还是更新
			boolean bCreate = true;
			if (uniquePSDEFieldMap.size() > 0) {

				for (java.util.Map.Entry<String, IPSDEField> entry : uniquePSDEFieldMap.entrySet()) {
					Object objValue = iEntity.get(entry.getValue().getLowerCaseName());
					if (!ObjectUtils.isEmpty(objValue)) {
						continue;
					}

					//唯一标记属性使用新建默认值处理
					IPSDEDataImportItem iPSDEDataImportItem = psDEDataImportItemMap.get(entry.getValue().getLowerCaseName());
					if(iPSDEDataImportItem != null &&
							(StringUtils.hasLength(iPSDEDataImportItem.getCreateDVT())
									|| StringUtils.hasLength(iPSDEDataImportItem.getCreateDV()))) {
						objValue = this.getDataEntityRuntime().getDefaultValue(iPSDEDataImportItem.getCreateDVT(), iPSDEDataImportItem.getCreateDV(), iEntity, entry.getValue().getStdDataType());
						iEntity.set(entry.getValue().getLowerCaseName(), objValue);
					}
				}



				boolean bSearch = true;
				ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
				for (java.util.Map.Entry<String, IPSDEField> entry : uniquePSDEFieldMap.entrySet()) {
					Object objValue = iEntity.get(entry.getValue().getLowerCaseName());
					if (ObjectUtils.isEmpty(objValue)) {
						bSearch = false;
						break;
					}
					SearchContextDTO.addSearchFieldCond(iSearchContextDTO, entry.getValue().getLowerCaseName(), Conditions.EQ, objValue, null);
				}
				if (bSearch) {
					// 设置最大查询2条
					this.getDataEntityRuntime().setSearchPaging(iSearchContextDTO, ISearchContextDTO.STARTPAGE, 2);
					List<IEntityDTO> entityList = this.getDataEntityRuntime().selectSimple(iSearchContextDTO);
					if (entityList != null) {
						if (entityList.size() > 1) {
							if (entityErrorMap!=null) {
								EntityError entityError = new EntityError();
								entityError.setErrorInfo(String.format("导入数据[%1$s]识别标记无法确定唯一数据", i));
								entityErrorMap.put(i, entityError);
								continue;
							} else {
								throw new Exception(String.format("导入数据[%1$s]识别标记无法确定唯一数据", i));
							}
						} else if (entityList.size() == 1) {
							bCreate = false;
							this.getDataEntityRuntime().setFieldValue(iEntity, this.getDataEntityRuntime().getKeyPSDEField(), this.getDataEntityRuntime().getFieldValue(entityList.get(0), this.getDataEntityRuntime().getKeyPSDEField()));
						}
					}
				}
			}

			try {
				if (bTestPriv) {
					if (bCreate) {
						this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(this.getUserContext(), parentDataEntityRuntime, strParentKey, null, (IEntityDTO) iEntity, this.getPSDEDataImport().getCreateDataAccessAction());
					} else {
						this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(this.getUserContext(), parentDataEntityRuntime, strParentKey, this.getDataEntityRuntime().getFieldValue(iEntity, this.getDataEntityRuntime().getKeyPSDEField()), (IEntityDTO) iEntity, this.getPSDEDataImport().getUpdateDataAccessAction());
					}
				}

				//填充默认值
				for(java.util.Map.Entry<String, IPSDEDataImportItem> entry : psDEDataImportItemMap.entrySet()) {
					Object objValue = iEntity.get(entry.getKey());
					if(!ObjectUtils.isEmpty(objValue)) {
						continue;
					}

					if(bCreate) {
						if(StringUtils.hasLength(entry.getValue().getCreateDVT())
								|| StringUtils.hasLength(entry.getValue().getCreateDV())) {
							IPSDEField psdeField = entry.getValue().getPSDEFieldMust();
							objValue = this.getDataEntityRuntime().getDefaultValue(entry.getValue().getCreateDVT(), entry.getValue().getCreateDV(), iEntity, psdeField.getStdDataType());
							iEntity.set(psdeField.getLowerCaseName(), objValue);
						}
					}
					else {
						if(StringUtils.hasLength(entry.getValue().getUpdateDVT())
								|| StringUtils.hasLength(entry.getValue().getUpdateDV())) {
							IPSDEField psdeField = entry.getValue().getPSDEFieldMust();
							objValue = this.getDataEntityRuntime().getDefaultValue(entry.getValue().getUpdateDVT(), entry.getValue().getUpdateDV(), iEntity, psdeField.getStdDataType());
							iEntity.set(psdeField.getLowerCaseName(), objValue);
						}
					}
				}

				if (bCreate) {
					if (this.getPSDEDataImport().getCreatePSDEAction() != null) {
						this.getDataEntityRuntime().executeAction(this.getPSDEDataImport().getCreatePSDEAction().getName(), this.getPSDEDataImport().getCreatePSDEAction(), new Object[] { iEntity });
					} else {
						this.getDataEntityRuntime().create(iEntity);
					}
				} else {
					if (this.getPSDEDataImport().getUpdatePSDEAction() != null) {
						this.getDataEntityRuntime().executeAction(this.getPSDEDataImport().getUpdatePSDEAction().getName(), this.getPSDEDataImport().getUpdatePSDEAction(), new Object[] { iEntity });
					} else {
						this.getDataEntityRuntime().update(iEntity);
					}
				}
			} catch (Throwable ex) {
				if (entityErrorMap!=null) {
					EntityError entityError = new EntityError();
					entityError.setErrorInfo(String.format("导入数据[%1$s]发生异常，%2$s", i, ex.getMessage()));
					entityErrorMap.put(i, entityError);
					continue;
				} else {
					throw new Exception(String.format("导入数据[%1$s]发生异常，%2$s", i, ex.getMessage()), ex);
				}
			}
		}
	}

	protected Map<String, IPSDEDataImportItem> getPSDEDataImportItems() throws Throwable {
		IUserContext iUserContext = this.getUserContext();
		return this.getPSDEDataImportItems(iUserContext);
	}

	protected Map<String, IPSDEDataImportItem> getPSDEDataImportItems(IUserContext iUserContext) throws Throwable {
		Map<String, IPSDEDataImportItem> psDEDataImportItemMap = new HashMap<String, IPSDEDataImportItem>();
		List<IPSDEDataImportItem> psDEDataImportItems = this.getPSDEDataImport().getPSDEDataImportItems();
		if (psDEDataImportItems != null) {
			for (IPSDEDataImportItem iPSDEDataImportItem : psDEDataImportItems) {
				String strImportTag = null;
				if (iUserContext != null && iPSDEDataImportItem.getCapPSLanguageRes() != null) {
					strImportTag = iUserContext.getLocalization(iPSDEDataImportItem.getCapPSLanguageRes().getLanResTag(), iPSDEDataImportItem.getCaption());
				} else {
					strImportTag = iPSDEDataImportItem.getCaption();
				}

				strImportTag = strImportTag.toUpperCase();
				if (psDEDataImportItemMap.containsKey(strImportTag)) {
					throw new Exception(String.format("出现重复的导入标识[%1$s]", strImportTag));
				}
				if (iPSDEDataImportItem.getPSDEField() == null) {
					throw new Exception(String.format("导入项[%1$s]没有指定属性", strImportTag));
				}
				psDEDataImportItemMap.put(strImportTag, iPSDEDataImportItem);
			}
		}

		return psDEDataImportItemMap;
	}

	/***
	 * 是否支持外键附加数据属性
	 *
	 * @return
	 */
	public boolean isEnablePickupDataField() {
		return true;
	}

	/**
	 * 是否对外键值文本及附加数据进行填充
	 *
	 * @return
	 */
	public boolean isFillPickupTextField() {
		return false;
	}

	/**
	 * 是否忽略导入错误
	 *
	 * @return
	 */
	public boolean isIgnoreError() {
		return this.getPSDEDataImport().isIgnoreError();
	}

	@Override
	public Map<Integer, EntityError> importData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv, net.ibizsys.runtime.dataentity.IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		return this.importData(baseEntity, list, bTestPriv, (IDataEntityRuntime)parentDataEntityRuntime, strParentKey);
	}

	@Override
	public Map<Integer, EntityError> importFile(IEntity baseEntity, File file, boolean bTestPriv, net.ibizsys.runtime.dataentity.IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		return importFile(baseEntity, file, bTestPriv, (IDataEntityRuntime)parentDataEntityRuntime, strParentKey);
	}

	@Override
	public Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, net.ibizsys.runtime.dataentity.IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		return importStream(baseEntity, inputStream, bTestPriv, (IDataEntityRuntime)parentDataEntityRuntime, strParentKey);
	}

	@Override
	public void getImportTemplate(String strImportTag, OutputStream outputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		throw new Exception("没有实现");
	}

	protected String getImportParam(String strKey, String strDefault) {
		if (this.getPSDEDataImport().getImpParams() != null) {
			JsonNode node = this.getPSDEDataImport().getImpParams().get(strKey);
			if (node != null) {
				return node.asText(strDefault);
			}
		}
		return strDefault;
	}

	protected int getImportParam(String strKey, int nDefault) {
		if (this.getPSDEDataImport().getImpParams() != null) {
			JsonNode node = this.getPSDEDataImport().getImpParams().get(strKey);
			if (node != null) {
				return node.asInt(nDefault);
			}
		}
		return nDefault;
	}

	protected double getImportParam(String strKey, double fDefault) {
		if (this.getPSDEDataImport().getImpParams() != null) {
			JsonNode node = this.getPSDEDataImport().getImpParams().get(strKey);
			if (node != null) {
				return node.asDouble(fDefault);
			}
		}
		return fDefault;
	}


	protected boolean getImportParam(String strKey, boolean bDefault) {
		if (this.getPSDEDataImport().getImpParams() != null) {
			JsonNode node = this.getPSDEDataImport().getImpParams().get(strKey);
			if (node != null) {
				return node.asBoolean(bDefault);
			}
		}
		return bDefault;
	}
}
