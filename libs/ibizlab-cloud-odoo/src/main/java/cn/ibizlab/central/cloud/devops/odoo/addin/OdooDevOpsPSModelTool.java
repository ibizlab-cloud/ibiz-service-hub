package cn.ibizlab.central.cloud.devops.odoo.addin;

import static java.util.Arrays.asList;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.devops.core.addin.DevOpsPSModelToolBase;
import net.ibizsys.centralstudio.dto.PSCodeItemDTO;
import net.ibizsys.centralstudio.dto.PSCodeListDTO;
import net.ibizsys.centralstudio.dto.PSDEFieldDTO;
import net.ibizsys.centralstudio.dto.PSDERDTO;
import net.ibizsys.centralstudio.dto.PSDataEntityDTO;
import net.ibizsys.centralstudio.dto.PSModuleDTO;
import net.ibizsys.centralstudio.dto.PSSubSysServiceAPIDTO;
import net.ibizsys.centralstudio.filter.PSCodeListFilter;
import net.ibizsys.centralstudio.filter.PSDEFieldFilter;
import net.ibizsys.centralstudio.filter.PSDERFilter;
import net.ibizsys.centralstudio.filter.PSDataEntityFilter;
import net.ibizsys.centralstudio.filter.PSModuleFilter;
import net.ibizsys.centralstudio.filter.PSSubSysServiceAPIFilter;
import net.ibizsys.centralstudio.util.PSModelServiceSession;
import net.ibizsys.centralstudio.util.PSModelServiceUtils;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.runtime.codelist.CodeListTypes;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.dataentity.defield.DEFTypes;
import net.ibizsys.runtime.dataentity.der.DERRemoveActionTypes;
import net.ibizsys.runtime.dataentity.der.DERSubTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;



public class OdooDevOpsPSModelTool extends DevOpsPSModelToolBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OdooDevOpsPSModelTool.class);

	public final static String APITAG_ODOOCLIENT = "ODOOCLIENT";

	/**
	 * select 'public final static String FIELD_TTYPE_' || UPPER(value) || ' =
	 * "'||value||'";' from public.ir_model_fields_selection where field_id =30
	 */
	public final static String FIELD_TTYPE_BINARY = "binary";
	public final static String FIELD_TTYPE_BOOLEAN = "boolean";
	public final static String FIELD_TTYPE_CHAR = "char";
	public final static String FIELD_TTYPE_DATE = "date";
	public final static String FIELD_TTYPE_DATETIME = "datetime";
	public final static String FIELD_TTYPE_FLOAT = "float";
	public final static String FIELD_TTYPE_HTML = "html";
	public final static String FIELD_TTYPE_INTEGER = "integer";
	public final static String FIELD_TTYPE_MANY2MANY = "many2many";
	public final static String FIELD_TTYPE_MANY2ONE = "many2one";
	public final static String FIELD_TTYPE_MANY2ONE_REFERENCE = "many2one_reference";
	public final static String FIELD_TTYPE_MONETARY = "monetary";
	public final static String FIELD_TTYPE_ONE2MANY = "one2many";
	public final static String FIELD_TTYPE_REFERENCE = "reference";
	public final static String FIELD_TTYPE_SELECTION = "selection";
	public final static String FIELD_TTYPE_TEXT = "text";

	// select 'public final static String FIELD_ONDELETE_' || UPPER(value) || '
	// = "'||value||'";' from public.ir_model_fields_selection where field_id
	// =42

	public final static String FIELD_ONDELETE_CASCADE = "cascade";
	public final static String FIELD_ONDELETE_SETNULL = "set null";
	public final static String FIELD_ONDELETE_RESTRICT = "restrict";

	public final static Map<String, PSDEFieldDTO> predefinedPSDEFieldMap = new HashMap<String, PSDEFieldDTO>();
	static {
		if (true) {
			PSDEFieldDTO psDEFieldDTO = new PSDEFieldDTO();
			psDEFieldDTO.setPSDEFieldName("ID");
			psDEFieldDTO.setCodeName("Id");
			psDEFieldDTO.setPKey(1);
			psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
			psDEFieldDTO.setAllowEmpty(0);
			psDEFieldDTO.setPSDataTypeId(DEFDataTypes.ACID);
			psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.ACID));
			predefinedPSDEFieldMap.put("ID", psDEFieldDTO);
		}

		if (true) {
			PSDEFieldDTO psDEFieldDTO = new PSDEFieldDTO();
			psDEFieldDTO.setPSDEFieldName("NAME");
			psDEFieldDTO.setCodeName("Name");
			psDEFieldDTO.setMajorField(1);
			psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
			psDEFieldDTO.setAllowEmpty(1);
			psDEFieldDTO.setPSDataTypeId(DEFDataTypes.TEXT);
			psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.TEXT));
			psDEFieldDTO.setLength(200);
			predefinedPSDEFieldMap.put(psDEFieldDTO.getPSDEFieldName(), psDEFieldDTO);
		}

		if (true) {
			PSDEFieldDTO psDEFieldDTO = new PSDEFieldDTO();
			psDEFieldDTO.setPSDEFieldName("CREATE_DATE");
			psDEFieldDTO.setCodeName("Create_date");
			psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
			psDEFieldDTO.setAllowEmpty(1);
			psDEFieldDTO.setPSDataTypeId(DEFDataTypes.DATETIME);
			psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.DATETIME));
			psDEFieldDTO.setPreDefineType(PredefinedFieldType.CREATEDATE.value);
			predefinedPSDEFieldMap.put(psDEFieldDTO.getPSDEFieldName(), psDEFieldDTO);
		}

		if (true) {
			PSDEFieldDTO psDEFieldDTO = new PSDEFieldDTO();
			psDEFieldDTO.setPSDEFieldName("WRITE_DATE");
			psDEFieldDTO.setCodeName("Write_date");
			psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
			psDEFieldDTO.setAllowEmpty(1);
			psDEFieldDTO.setPSDataTypeId(DEFDataTypes.DATETIME);
			psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.DATETIME));
			psDEFieldDTO.setPreDefineType(PSModelEnums.PredefinedFieldType.UPDATEDATE.value);
			predefinedPSDEFieldMap.put(psDEFieldDTO.getPSDEFieldName(), psDEFieldDTO);
		}
		
		

		// if (true) {
		// PSDEFieldDTO psDEFieldDTO = new PSDEFieldDTO();
		// psDEFieldDTO.setPSDEFieldName("__LAST_UPDATE");
		// psDEFieldDTO.setCodeName("Write_date");
		// psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
		// psDEFieldDTO.setAllowEmpty(1);
		// psDEFieldDTO.setPSDataTypeId(DEFDataTypes.DATETIME);
		// psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.DATETIME));
		// psDEFieldDTO.setPreDefineType(PSModelEnums.PredefinedFieldType.UPDATEDATE);
		// predefinedPSDEFieldMap.put(psDEFieldDTO.getPSDEFieldName(),
		// psDEFieldDTO);
		// }

		if (true) {
			PSDEFieldDTO psDEFieldDTO = new PSDEFieldDTO();
			psDEFieldDTO.setPSDEFieldName("CREATE_UID");
			psDEFieldDTO.setCodeName("Create_uid");
			psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
			psDEFieldDTO.setAllowEmpty(1);
			psDEFieldDTO.setPSDataTypeId(DEFDataTypes.INT);
			psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.INT));
			psDEFieldDTO.setPreDefineType(PSModelEnums.PredefinedFieldType.CREATEMAN.value);
			predefinedPSDEFieldMap.put(psDEFieldDTO.getPSDEFieldName(), psDEFieldDTO);
		}

		if (true) {
			PSDEFieldDTO psDEFieldDTO = new PSDEFieldDTO();
			psDEFieldDTO.setPSDEFieldName("WRITE_UID");
			psDEFieldDTO.setCodeName("Write_uid");
			psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
			psDEFieldDTO.setAllowEmpty(1);
			psDEFieldDTO.setPSDataTypeId(DEFDataTypes.INT);
			psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.INT));
			psDEFieldDTO.setPreDefineType(PSModelEnums.PredefinedFieldType.UPDATEMAN.value);
			predefinedPSDEFieldMap.put(psDEFieldDTO.getPSDEFieldName(), psDEFieldDTO);
		}

	}

	@Override
	protected void onSyncPSModels(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {

		String strPSDevSlnSysId = this.getPSDevSlnSysId(dcSystem, iPSSystemService);
		if (!StringUtils.hasLength(strPSDevSlnSysId)) {
			throw new Exception(String.format("未指定绑定的平台开发系统标识"));
		}

		OpenAccess openAccess = getOdooOpenAccess(dcSystem, false);

		PSModelServiceSession psModelSessionSession = this.getContext().openPSModelServiceSession();
		psModelSessionSession.setPSDevSlnSysId(strPSDevSlnSysId);
		try {

			syncOdooPSModels(openAccess, dcSystem, iPSSystemService, params);

			// PSModelServiceUtils.getInstance().searchAllpssub)

			PSModelServiceSession.close(true);
		} catch (Throwable ex) {
			PSModelServiceSession.close(false);
			throw ex;
		}

		// 根据模块同步实体

	}

	protected void syncOdooPSModels(OpenAccess openAccess, DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		// 获取默认客户端
		PSSubSysServiceAPIDTO odooPSSubSysServiceAPIDTO = null;
		List<PSSubSysServiceAPIDTO> psSubSysServiceAPIDTOList = PSModelServiceUtils.getInstance().searchAllPSSubSysServiceAPIs(new PSSubSysServiceAPIFilter());
		if (!ObjectUtils.isEmpty(psSubSysServiceAPIDTOList)) {
			for (PSSubSysServiceAPIDTO psSubSysServiceAPIDTO : psSubSysServiceAPIDTOList) {
				if (APITAG_ODOOCLIENT.equalsIgnoreCase(psSubSysServiceAPIDTO.getAPITag())) {
					odooPSSubSysServiceAPIDTO = psSubSysServiceAPIDTO;
					break;
				}
			}
			if (odooPSSubSysServiceAPIDTO == null) {
				for (PSSubSysServiceAPIDTO psSubSysServiceAPIDTO : psSubSysServiceAPIDTOList) {
					if (APITAG_ODOOCLIENT.equalsIgnoreCase(psSubSysServiceAPIDTO.getCodeName())) {
						odooPSSubSysServiceAPIDTO = psSubSysServiceAPIDTO;
						break;
					}
				}
			}
		}

		if (odooPSSubSysServiceAPIDTO == null) {
			// 新建
			odooPSSubSysServiceAPIDTO = new PSSubSysServiceAPIDTO();
			odooPSSubSysServiceAPIDTO.setAPIType("RESTFUL");
			odooPSSubSysServiceAPIDTO.setCodeName("OdooClient");
			odooPSSubSysServiceAPIDTO.setAPITag(APITAG_ODOOCLIENT);
			odooPSSubSysServiceAPIDTO.setPSSubSysServiceAPIName("Odoo客户端对象");
			PSModelServiceUtils.getInstance().createPSSubSysServiceAPI(odooPSSubSysServiceAPIDTO);
		}

		// 获取模块清单
		PSModuleFilter moduleSearchContext = new PSModuleFilter();
		//moduleSearchContext.like("psmodulename", "模块");
		List<PSModuleDTO> psModuleDTOList = PSModelServiceUtils.getInstance().searchAllPSModules(moduleSearchContext);
		Map<String, PSModuleDTO> psModuleDTOMap = new HashMap<String, PSModuleDTO>();
		if (!ObjectUtils.isEmpty(psModuleDTOList)) {
			for (PSModuleDTO psModuleDTO : psModuleDTOList) {
				if (!StringUtils.hasLength(psModuleDTO.getCodeName())) {
					continue;
				}
				psModuleDTOMap.put(psModuleDTO.getCodeName().toLowerCase(), psModuleDTO);
				psModuleDTOMap.put(psModuleDTO.getPSModuleId(), psModuleDTO);
			}
		}

		// 列出实体
		Map<String, PSDataEntityDTO> psDataEntityDTOMap = new HashMap<String, PSDataEntityDTO>();
		List<PSDataEntityDTO> psDataEntityDTOList = PSModelServiceUtils.getInstance().searchAllPSDataEntities(new PSDataEntityFilter());
		if (!ObjectUtils.isEmpty(psDataEntityDTOList)) {
			for (PSDataEntityDTO psDataEntityDTO : psDataEntityDTOList) {
				if (!StringUtils.hasLength(psDataEntityDTO.getPSDataEntityName())) {
					continue;
				}
				psDataEntityDTOMap.put(psDataEntityDTO.getPSDataEntityName().toUpperCase(), psDataEntityDTO);
			}
		}

		// 列出代码表
		Map<String, PSCodeListDTO> psCodeListDTOMap = new HashMap<String, PSCodeListDTO>();
		List<PSCodeListDTO> psCodeListDTOList = PSModelServiceUtils.getInstance().searchAllPSCodeLists(new PSCodeListFilter());
		if (!ObjectUtils.isEmpty(psCodeListDTOList)) {
			for (PSCodeListDTO psCodeListDTO : psCodeListDTOList) {
				if (!StringUtils.hasLength(psCodeListDTO.getCodeName())) {
					continue;
				}
				psCodeListDTOMap.put(psCodeListDTO.getCodeName().toUpperCase(), psCodeListDTO);
			}
		}

		// 列出实体关系
		Map<String, PSDERDTO> psDERDTOMap = new HashMap<String, PSDERDTO>();
		List<PSDERDTO> psDERDTOList = PSModelServiceUtils.getInstance().searchAllPSDERs(new PSDERFilter());
		if (!ObjectUtils.isEmpty(psDERDTOList)) {
			for (PSDERDTO psDERDTO : psDERDTOList) {
				if (!StringUtils.hasLength(psDERDTO.getPSDERName())) {
					continue;
				}
				psDERDTOMap.put(psDERDTO.getPSDERName().toUpperCase(), psDERDTO);
				if(DERTypes.DER1N.equals(psDERDTO.getDERType())) {
					String strDERTag = null;
					if (StringUtils.hasLength(psDERDTO.getDERFieldName())) {
						strDERTag = String.format("%1$s|%2$s|%3$s|%4$s", psDERDTO.getDERType(), psDERDTO.getMajorPSDEName(), psDERDTO.getMinorPSDEName(), psDERDTO.getDERFieldName()).toUpperCase();
					} else {
						strDERTag = String.format("%1$s|%2$s|%3$s|-NONE-", psDERDTO.getDERType(), psDERDTO.getMajorPSDEName(), psDERDTO.getMinorPSDEName()).toUpperCase();
					}
					psDERDTOMap.put(strDERTag, psDERDTO);
				}
			}
		}

		// 列出Odoo实体
		String url = openAccess.getRedirectUri();
		String db = openAccess.getRegionId();
		String username = openAccess.getAccessKey();
		String password = openAccess.getSecretKey();
		final XmlRpcClient client = new XmlRpcClient() {
			{
				setConfig(new XmlRpcClientConfigImpl() {
					{
						setServerURL(new URL(String.format("%s/xmlrpc/2/common", url)));
					}
				});
			}
		};

		int uid = (int) client.execute("authenticate", Arrays.asList(db, username, password, new HashMap<>()));

		final XmlRpcClient models = new XmlRpcClient() {
			{
				setConfig(new XmlRpcClientConfigImpl() {
					{
						setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
					}
				});
			}
		};

		Map<Integer, List<PSCodeItemDTO>> psCodeItemsMap = new HashMap<Integer, List<PSCodeItemDTO>>();

		if (true) {
			// 检索代码表
			List list2 = asList((Object[]) models.execute("execute_kw", asList(db, uid, password, "ir.model.fields.selection", "search_read", asList(asList()),

					new HashMap() {
						{
							put("fields", asList("id", "value", "name", "field_id", "sequence"));
							// put("limit", 1000);
						}
					})));

			if (!ObjectUtils.isEmpty(list2)) {
				for (Object item2 : list2) {

					Map<String, Object> map2 = (Map<String, Object>) item2;

					Object field_id = map2.get("field_id");
					if (field_id == null) {
						continue;
					}

					int nFieldId = getDataId(field_id);

					Object name = map2.get("name");
					Object value = map2.get("value");
					Object sequence = map2.get("sequence");

					List<PSCodeItemDTO> psCodeItemDTOList = psCodeItemsMap.get(nFieldId);
					if (psCodeItemDTOList == null) {
						psCodeItemDTOList = new ArrayList<PSCodeItemDTO>();
						psCodeItemsMap.put(nFieldId, psCodeItemDTOList);
					}

					if (ObjectUtils.isEmpty(value)) {
						continue;
					}

					PSCodeItemDTO psCodeItemDTO = new PSCodeItemDTO();
					psCodeItemDTO.setPSCodeItemName((String) name);

					psCodeItemDTO.setCodeItemValue((String) value);
					psCodeItemDTO.setOrderValue((int) sequence);
					psCodeItemDTOList.add(psCodeItemDTO);

				}
			}
		}

		Map<String, Map<String, String>> moduleTranslatorMap = new HashMap<String, Map<String, String>>();
		Map<Object, List> fieldListMap = new HashMap<Object, List>();
		Map<String, Map<String, PSDEFieldDTO>> psDEFieldsMap = new HashMap<String, Map<String, PSDEFieldDTO>>();

		if (true) {
			List list = asList((Object[]) models.execute("execute_kw", asList(db, uid, password, "ir.model", "search_read", asList(asList()), new HashMap() {
				{
					put("fields", asList("name", "id", "model", "state"));
					// put("limit", 1000);
				}
			})));

			if (!ObjectUtils.isEmpty(list)) {
				for (Object item : list) {
					Map<String, Object> map = (Map<String, Object>) item;
					String strModel = (String) map.get("model");
					if (!StringUtils.hasLength(strModel)) {
						continue;
					}
					String[] items = strModel.split("[.]");
					String strModuleName = String.format("odoo_%1$s", items[0]).toLowerCase();
					PSModuleDTO psModuleDTO = psModuleDTOMap.get(strModuleName);
					if (psModuleDTO == null) {
						// log.warn(String.format("Odoo模型[%1$s]无对应系统模块，忽略",
						// strModel));
						// continue;
						psModuleDTO = new PSModuleDTO();
						psModuleDTO.setPSModuleName(String.format("odoo（%1$s）", items[0].toUpperCase()));
						psModuleDTO.setCodeName(strModuleName);
						psModuleDTO.setModTag(items[0].toLowerCase());

						PSModelServiceUtils.getInstance().createPSModule(psModuleDTO);

						psModuleDTOMap.put(psModuleDTO.getCodeName().toLowerCase(), psModuleDTO);
						psModuleDTOMap.put(psModuleDTO.getPSModuleId(), psModuleDTO);
					}

					Map<String, String> translatorMap = moduleTranslatorMap.get(items[0].toLowerCase());
					if (translatorMap == null) {
						List list2 = asList((Object[]) models.execute("execute_kw", asList(db, uid, password, "ir.translation", "search_read", asList(asList(asList("lang", "=", "zh_CN"), asList("type", "=", "model"), asList("module", "=", items[0].toLowerCase()))),

								new HashMap() {
									{
										put("fields", asList("src", "value", "name", "lang", "module", "type", "state"));
										// put("limit", 1000);
									}
								})));

						translatorMap = new HashMap<String, String>();
						moduleTranslatorMap.put(items[0].toLowerCase(), translatorMap);
						if (!ObjectUtils.isEmpty(list2)) {
							for (Object item2 : list2) {
								Map<String, Object> map2 = (Map<String, Object>) item2;
								String strTag = String.format("%1$s|%2$s", map2.get("name"), map2.get("src"));
								translatorMap.put(strTag, (String) map2.get("value"));
							}
						}
					}

					List fieldlist = asList((Object[]) models.execute("execute_kw", asList(db, uid, password, "ir.model.fields", "search_read", asList(asList(asList("model_id", "=", map.get("id")))),

							new HashMap() {
								{
									put("fields", asList("id", "name", "ttype", "field_description", "copied", "related", "required", "readonly", "store", "relation", "relation_field", "size", "on_delete","relation_table","column1","column2"));
									// put("limit", 1000);
								}
							})));

					fieldListMap.put(map.get("id"), fieldlist);

					boolean bHasId = false;
					if (!ObjectUtils.isEmpty(fieldlist)) {
						for (Object item2 : fieldlist) {
							Map<String, Object> map2 = (Map<String, Object>) item2;
							String strFieldName = (String) map2.get("name");
							if ("id".equals(strFieldName)) {
								bHasId = true;
								break;
							}
						}
					}

					if (!bHasId) {
						log.warn(String.format("Odoo模型[%1$s]未定义主键，忽略", strModel));
						continue;
					}

					// 判断实体是否存在
					String strDEName = strModel.replace(".", "_").toUpperCase();
					PSDataEntityDTO psDataEntityDTO = psDataEntityDTOMap.get(strDEName);
					if (psDataEntityDTO == null) {
						psDataEntityDTO = new PSDataEntityDTO();
						psDataEntityDTO.setPSDataEntityName(strDEName);
						psDataEntityDTO.setPSModuleId(psModuleDTO.getPSModuleId());
						psDataEntityDTO.setPSModuleName(psModuleDTO.getPSModuleName());
						psDataEntityDTO.setStorageMode(PSModelEnums.DEStorageType.SERVICEAPI.value);
						psDataEntityDTO.setPSSubSysServiceAPIId(odooPSSubSysServiceAPIDTO.getPSSubSysServiceAPIId());
						psDataEntityDTO.setPSSubSysServiceAPIName(odooPSSubSysServiceAPIDTO.getPSSubSysServiceAPIName());
						psDataEntityDTO.setLogicName((String) map.get("name"));
						String strLogicName = translatorMap.get(String.format("ir.model,name|%1$s", map.get("name")));
						if (StringUtils.hasLength(strLogicName)) {
							psDataEntityDTO.setLogicName(strLogicName);
						}
						if (psDataEntityDTO.getLogicName().length() > 60) {
							psDataEntityDTO.setMemo(psDataEntityDTO.getLogicName());
							psDataEntityDTO.setLogicName(psDataEntityDTO.getLogicName().substring(0, 60));
						}
						psDataEntityDTO.setDETag(strModel);
						psDataEntityDTO.setExistingModel(1);
						psDataEntityDTO.setNoViewMode(1);
						psDataEntityDTO.setTableName(strDEName.toLowerCase());
						String strDECodeName = "";
						for (int i = 0; i < items.length; i++) {
							if (i == 1) {
								if (items[1].equals(items[0])) {
									continue;
								}
							}
							String strItem = items[i];
							if (strItem.length() > 1) {
								strItem = strItem.substring(0, 1).toUpperCase() + strItem.toLowerCase().substring(1);
							}

							strDECodeName += strItem;
						}
						psDataEntityDTO.setCodeName(strDECodeName);
						PSModelServiceUtils.getInstance().createPSDataEntity(psDataEntityDTO);
						psDataEntityDTOMap.put(strDEName, psDataEntityDTO);
					}

					// 同步属性
					if (!ObjectUtils.isEmpty(fieldlist)) {

						Map<String, PSDEFieldDTO> psDEFieldDTOMap = new HashMap<String, PSDEFieldDTO>();

						PSDEFieldFilter psModelSearchContextDTO = new PSDEFieldFilter();
						psModelSearchContextDTO.setFieldCond(PSDEFieldDTO.FIELD_PSDEID, Conditions.EQ, psDataEntityDTO.getPSDataEntityId());
						List<PSDEFieldDTO> psDEFieldDTOList = PSModelServiceUtils.getInstance().searchAllPSDEFields(psModelSearchContextDTO);
						if (!ObjectUtils.isEmpty(psDEFieldDTOList)) {
							for (PSDEFieldDTO psDEFieldDTO : psDEFieldDTOList) {
								if (!StringUtils.hasLength(psDEFieldDTO.getPSDEFieldName())) {
									continue;
								}
								psDEFieldDTOMap.put(psDEFieldDTO.getPSDEFieldName().toLowerCase(), psDEFieldDTO);
							}
						}

						psDEFieldsMap.put(psDataEntityDTO.getPSDataEntityId(), psDEFieldDTOMap);

						for (Object item2 : fieldlist) {
							Map<String, Object> map2 = (Map<String, Object>) item2;
							String strFieldName = (String) map2.get("name");
							if (!StringUtils.hasLength(strFieldName)) {
								continue;
							}

							String strTType = (String) map2.get("ttype");
							if (!StringUtils.hasLength(strTType)) {
								continue;
							}

							int nId = this.getDataId(map2.get("id"));

							String strDesc = null;
							Object field_description = map2.get("field_description");
							if (field_description instanceof String) {
								strDesc = (String) field_description;
							}

							String strRelated = null;
							Object related = map2.get("related");
							if (related instanceof String) {
								strRelated = (String) related;
							}

							Boolean bRequired = (Boolean) map2.get("required");
							Boolean bCopied = (Boolean) map2.get("copied");
							Boolean bReadonly = (Boolean) map2.get("readonly");
							Boolean bStore = (Boolean) map2.get("store");
							Object size = map2.get("size");

							PSDEFieldDTO psDEFieldDTO = psDEFieldDTOMap.get(strFieldName);
							if (psDEFieldDTO == null) {

								boolean bCreate = false;

								psDEFieldDTO = new PSDEFieldDTO();

								PSDEFieldDTO predefinedPSDEFieldDTO = predefinedPSDEFieldMap.get(strFieldName.toUpperCase());
								if (predefinedPSDEFieldDTO != null) {
									predefinedPSDEFieldDTO.copyTo(psDEFieldDTO);
								}

								psDEFieldDTO.setPSDEFieldName(strFieldName.toUpperCase());
								psDEFieldDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
								psDEFieldDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
								psDEFieldDTO.setLogicName(strDesc);
								String strLogicName = translatorMap.get(String.format("ir.model.fields,field_description|%1$s", strDesc));
								if (StringUtils.hasLength(strLogicName)) {
									psDEFieldDTO.setLogicName(strLogicName);
								}

								if (psDEFieldDTO.getLogicName().length() > 60) {
									psDEFieldDTO.setMemo(psDEFieldDTO.getLogicName());
									psDEFieldDTO.setLogicName(psDEFieldDTO.getLogicName().substring(0, 60));
								}

								if (predefinedPSDEFieldDTO != null) {
									bCreate = true;
								} else {
									if (StringUtils.hasLength(strRelated)) {
										// 判断是否为图片引用
										if (FIELD_TTYPE_BINARY.equals(strTType)) {
//											String[] ids = strRelated.split("[.]");
//											if (ids.length > 1) {
//												continue;
//											}
										}
										else {
											
											if (FIELD_TTYPE_BOOLEAN.equals(strTType)
													||FIELD_TTYPE_CHAR.equals(strTType)
													||FIELD_TTYPE_DATE.equals(strTType)
													||FIELD_TTYPE_DATETIME.equals(strTType)
													||FIELD_TTYPE_FLOAT.equals(strTType)
													||FIELD_TTYPE_HTML.equals(strTType)
													||FIELD_TTYPE_INTEGER.equals(strTType)
													||FIELD_TTYPE_MANY2ONE_REFERENCE.equals(strTType)
													||FIELD_TTYPE_MONETARY.equals(strTType)
													||FIELD_TTYPE_SELECTION.equals(strTType)
													||FIELD_TTYPE_TEXT.equals(strTType)
													||FIELD_TTYPE_REFERENCE.equals(strTType)) {
												
											}
											else {
												continue;
											}
										}
									}
									psDEFieldDTO.setAllowEmpty((!DataTypeUtils.getBooleanValue(bRequired, false)) ? 1 : 0);
									psDEFieldDTO.setPasteReset((!DataTypeUtils.getBooleanValue(bCopied, false)) ? 1 : 0);
									if (!DataTypeUtils.getBooleanValue(bReadonly, false)) {
										psDEFieldDTO.setEnableUserInput(3);
									} else {
										psDEFieldDTO.setEnableUserInput(0);
									}
									if (DataTypeUtils.getBooleanValue(bStore, true)) {
										psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.PHISICAL);
									} else {
										psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.UI);
									}

									String strCodeName = psDEFieldDTO.getPSDEFieldName().toLowerCase();
									psDEFieldDTO.setCodeName(psDEFieldDTO.getPSDEFieldName().substring(0, 1) + strCodeName.substring(1));
									
									if (StringUtils.hasLength(strRelated)) {
										psDEFieldDTO.setUserTag(strRelated);
									}
									
									// 判断类型进行处理
									switch (strTType) {
									case FIELD_TTYPE_BINARY:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.VARBINARY);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.VARBINARY));
										bCreate = true;
										if (StringUtils.hasLength(strRelated)) {
											// 按虚拟处理
											psDEFieldDTO.setDEFType(net.ibizsys.runtime.dataentity.defield.DEFTypes.UI);
											//psDEFieldDTO.setUserTag(strRelated);
										}
										break;
									case FIELD_TTYPE_BOOLEAN:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.TRUEFALSE);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.TRUEFALSE));
										bCreate = true;
										break;
									case FIELD_TTYPE_CHAR:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.TEXT);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.TEXT));
										if (size instanceof Integer) {
											int nSize = (Integer) size;
											if(nSize > 0) {
												psDEFieldDTO.setLength(nSize);
											}
											else {
												psDEFieldDTO.setLength(200);
											}
										
										} else {
											psDEFieldDTO.setLength(200);
										}

										bCreate = true;
										break;
									case FIELD_TTYPE_DATE:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.DATE);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.DATE));
										bCreate = true;
										break;
									case FIELD_TTYPE_DATETIME:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.DATETIME);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.DATETIME));
										bCreate = true;
										break;
									case FIELD_TTYPE_FLOAT:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.BIGDECIMAL);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.BIGDECIMAL));
										bCreate = true;
										break;
									case FIELD_TTYPE_HTML:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.HTMLTEXT);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.HTMLTEXT));
										psDEFieldDTO.setLength(1000000);
										bCreate = true;
										break;
									case FIELD_TTYPE_INTEGER:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.INT);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.INT));
										bCreate = true;
										break;
									case FIELD_TTYPE_MANY2ONE_REFERENCE:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.INT);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.INT));
										psDEFieldDTO.setUserTag(FIELD_TTYPE_MANY2ONE_REFERENCE);
										bCreate = true;
										break;
									case FIELD_TTYPE_MONETARY:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.BIGDECIMAL);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.BIGDECIMAL));
										bCreate = true;
										break;
									case FIELD_TTYPE_SELECTION: {
										String strPSCodeListCodeName = String.format("%1$s__%2$s", psDataEntityDTO.getPSDataEntityName(), psDEFieldDTO.getPSDEFieldName()).toUpperCase();
										PSCodeListDTO psCodeListDTO = psCodeListDTOMap.get(strPSCodeListCodeName);
										if (psCodeListDTO == null) {
											psCodeListDTO = new PSCodeListDTO();
											psCodeListDTO.setCLType(CodeListTypes.STATIC);
											psCodeListDTO.setCodeName(strPSCodeListCodeName);
											psCodeListDTO.setPSCodeListName(String.format("%1$s[%2$s]", psDataEntityDTO.getLogicName(), psDEFieldDTO.getLogicName()));
											psCodeListDTO.setPSModuleId(psDataEntityDTO.getPSModuleId());
											List<PSCodeItemDTO> psCodeItemDTOList = psCodeItemsMap.get(nId);

											if (psCodeItemDTOList != null) {

												for (PSCodeItemDTO psCodeItemDTO : psCodeItemDTOList) {
													psCodeItemDTO.setUserData(psCodeItemDTO.getPSCodeItemName());
													String strItemLogicName = translatorMap.get(String.format("ir.model.fields.selection,name|%1$s", psCodeItemDTO.getPSCodeItemName()));
													if (StringUtils.hasLength(strItemLogicName)) {
														psCodeItemDTO.setPSCodeItemName(strItemLogicName);
													}
												}

											}

											psCodeListDTO.setPSCodeItems(psCodeItemDTOList);

											// 建立代码表
											PSModelServiceUtils.getInstance().createPSCodeList(psCodeListDTO);
											psCodeListDTOMap.put(strPSCodeListCodeName, psCodeListDTO);
										}
										psDEFieldDTO.setPSCodeListId(psCodeListDTO.getPSCodeListId());
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.SSCODELIST);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.SSCODELIST));
										psDEFieldDTO.setLength(200);
										bCreate = true;
									}
										break;
									case FIELD_TTYPE_TEXT:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.TEXT);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.TEXT));
										psDEFieldDTO.setLength(2000);
										// 需要进一步判断，是否可以给出更多的长度规则
										bCreate = true;
										break;
									case FIELD_TTYPE_REFERENCE:
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.TEXT);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.TEXT));
										psDEFieldDTO.setLength(500);
										psDEFieldDTO.setUserTag(FIELD_TTYPE_REFERENCE);
										bCreate = true;
										break;
									default:

										break;
									}
								}

								if (bCreate) {
									PSModelServiceUtils.getInstance().createPSDEField(psDEFieldDTO);
									psDEFieldDTOMap.put(psDEFieldDTO.getPSDEFieldName().toLowerCase(), psDEFieldDTO);
								}
							}
						}
					}

					log.debug(String.format("Odoo模型[%1$s]对应系统模块[%2$s]", strModel, psModuleDTO.getPSModuleName()));
				}
			}

			// 常规外键等
			for (Object item : list) {
				Map<String, Object> map = (Map<String, Object>) item;
				String strModel = (String) map.get("model");
				if (!StringUtils.hasLength(strModel)) {
					continue;
				}
				String[] items = strModel.split("[.]");
				String strModuleName = String.format("odoo_%1$s", items[0]).toLowerCase();
				PSModuleDTO psModuleDTO = psModuleDTOMap.get(strModuleName);
				// 判断实体是否存在
				String strDEName = strModel.replace(".", "_").toUpperCase();
				PSDataEntityDTO psDataEntityDTO = psDataEntityDTOMap.get(strDEName);
				if (psDataEntityDTO == null) {
					continue;
				}

				Map<String, PSDEFieldDTO> psDEFieldDTOMap = psDEFieldsMap.get(psDataEntityDTO.getPSDataEntityId());
				if (psDEFieldDTOMap == null) {
					continue;
				}

				List fieldlist = fieldListMap.get(map.get("id"));
				if (fieldlist == null) {
					continue;
				}

				Map<String, String> translatorMap = moduleTranslatorMap.get(items[0].toLowerCase());
				if (translatorMap == null) {
					continue;
				}

				for (Object item2 : fieldlist) {
					Map<String, Object> map2 = (Map<String, Object>) item2;
					String strFieldName = (String) map2.get("name");
					if (!StringUtils.hasLength(strFieldName)) {
						continue;
					}

					String strTType = (String) map2.get("ttype");
					if (!StringUtils.hasLength(strTType)) {
						continue;
					}

					int nId = this.getDataId(map2.get("id"));

					String strDesc = null;
					Object field_description = map2.get("field_description");
					if (field_description instanceof String) {
						strDesc = (String) field_description;
					}

					String strRelated = null;
					Object related = map2.get("related");
					if (related instanceof String) {
						strRelated = (String) related;
					}

					String strRelation = null;
					Object relation = map2.get("relation");
					if (relation instanceof String) {
						strRelation = (String) relation;
					}

					Boolean bRequired = (Boolean) map2.get("required");
					Boolean bCopied = (Boolean) map2.get("copied");
					Boolean bReadonly = (Boolean) map2.get("readonly");
					Boolean bStore = (Boolean) map2.get("store");

					PSDEFieldDTO psDEFieldDTO = psDEFieldDTOMap.get(strFieldName);
					if (psDEFieldDTO == null) {

						boolean bCreate = false;

						psDEFieldDTO = new PSDEFieldDTO();

						PSDEFieldDTO predefinedPSDEFieldDTO = predefinedPSDEFieldMap.get(strFieldName.toUpperCase());
						if (predefinedPSDEFieldDTO != null) {
							predefinedPSDEFieldDTO.copyTo(psDEFieldDTO);
						}

						psDEFieldDTO.setPSDEFieldName(strFieldName.toUpperCase());
						psDEFieldDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psDEFieldDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						psDEFieldDTO.setLogicName(strDesc);
						String strLogicName = translatorMap.get(String.format("ir.model.fields,field_description|%1$s", strDesc));
						if (StringUtils.hasLength(strLogicName)) {
							psDEFieldDTO.setLogicName(strLogicName);
						}

						if (psDEFieldDTO.getLogicName().length() > 60) {
							psDEFieldDTO.setMemo(psDEFieldDTO.getLogicName());
							psDEFieldDTO.setLogicName(psDEFieldDTO.getLogicName().substring(0, 60));
						}

						if (predefinedPSDEFieldDTO != null) {
							bCreate = true;
						} else {

							psDEFieldDTO.setAllowEmpty((!DataTypeUtils.getBooleanValue(bRequired, false)) ? 1 : 0);
							psDEFieldDTO.setPasteReset((!DataTypeUtils.getBooleanValue(bCopied, false)) ? 1 : 0);
							if (!DataTypeUtils.getBooleanValue(bReadonly, false)) {
								psDEFieldDTO.setEnableUserInput(3);
							} else {
								psDEFieldDTO.setEnableUserInput(0);
							}

							String strCodeName = psDEFieldDTO.getPSDEFieldName().toLowerCase();
							psDEFieldDTO.setCodeName(psDEFieldDTO.getPSDEFieldName().substring(0, 1) + strCodeName.substring(1));
							// 判断类型进行处理
							switch (strTType) {
							case FIELD_TTYPE_MANY2ONE:
								if (DataTypeUtils.getBooleanValue(bStore, true)) {
									// if (!StringUtils.hasLength(strRelated) &&
									// StringUtils.hasLength(strRelation)) {
									if (StringUtils.hasLength(strRelation)) {
										//
										String strDEName2 = strRelation.replace(".", "_").toUpperCase();
										PSDataEntityDTO psDataEntityDTO2 = psDataEntityDTOMap.get(strDEName2);
										if (psDataEntityDTO2 != null) {
											String strDERTag = String.format("DER1N|%1$s|%2$s|%3$s", psDataEntityDTO2.getPSDataEntityName(), psDataEntityDTO.getPSDataEntityName(), psDEFieldDTO.getPSDEFieldName()).toUpperCase();
											PSDERDTO psDERDTO = psDERDTOMap.get(strDERTag);
											if (psDERDTO == null) {
												psDERDTO = new PSDERDTO();
												psDERDTO.setDERType(DERTypes.DER1N);
												psDERDTO.setMajorPSDEId(psDataEntityDTO2.getPSDataEntityId());
												psDERDTO.setMajorPSDEName(psDataEntityDTO2.getPSDataEntityName());
												psDERDTO.setMinorPSDEId(psDataEntityDTO.getPSDataEntityId());
												psDERDTO.setMinorPSDEName(psDataEntityDTO.getPSDataEntityName());
												psDERDTO.setDERFieldName(psDEFieldDTO.getPSDEFieldName());
												psDERDTO.setDERFieldLName(psDEFieldDTO.getLogicName());

												psDERDTO.setUserTag(strRelated);

												int nPos = psDEFieldDTO.getCodeName().lastIndexOf("_id");
												if (nPos == psDEFieldDTO.getCodeName().length() - 3) {
													psDERDTO.setCodeName(psDEFieldDTO.getCodeName().substring(0, psDEFieldDTO.getCodeName().length() - 3));
													if (psDEFieldDTOMap.get(psDERDTO.getCodeName().toLowerCase()) != null) {
														psDERDTO.setCodeName(psDEFieldDTO.getCodeName() + "_object");
													}
												} else {
													psDERDTO.setCodeName(psDEFieldDTO.getCodeName() + "_object");
												}

												// 删除操作
												Object on_delete = map2.get("on_delete");
												if (on_delete instanceof String) {
													String strOnDelete = (String) on_delete;
													switch (strOnDelete) {
													case FIELD_ONDELETE_CASCADE:
														psDERDTO.setRemoveActionType(DERRemoveActionTypes.DELETE);
														break;
													case FIELD_ONDELETE_RESTRICT:
														psDERDTO.setRemoveActionType(DERRemoveActionTypes.REJECT);
														break;
													case FIELD_ONDELETE_SETNULL:
														psDERDTO.setRemoveActionType(DERRemoveActionTypes.RESET);
														break;
													}
												}

												// 建立关系
												PSModelServiceUtils.getInstance().createPSDER(psDERDTO);
												psDERDTOMap.put(strDERTag, psDERDTO);
											}

											// 判断外键值文本是否存在
											String strPickupTextFieldName = String.format("%1$s_NAME", psDEFieldDTO.getPSDEFieldName()).toLowerCase();
											PSDEFieldDTO pickupTextPSDEFieldDTO = psDEFieldDTOMap.get(strPickupTextFieldName);
											Map<String, PSDEFieldDTO> psDEFieldDTOMap2 = psDEFieldsMap.get(psDataEntityDTO2.getPSDataEntityId());
											PSDEFieldDTO majorPSDEFieldDTO = null;
											if (psDEFieldDTOMap2 != null) {
												majorPSDEFieldDTO = psDEFieldDTOMap2.get("name");
											}
											if (pickupTextPSDEFieldDTO == null && majorPSDEFieldDTO != null) {

												pickupTextPSDEFieldDTO = new PSDEFieldDTO();
												pickupTextPSDEFieldDTO.setDEFType(DEFTypes.LINK);
												pickupTextPSDEFieldDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
												pickupTextPSDEFieldDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
												pickupTextPSDEFieldDTO.setPSDEFieldName(strPickupTextFieldName);
												pickupTextPSDEFieldDTO.setLogicName(psDEFieldDTO.getLogicName());
												pickupTextPSDEFieldDTO.setCodeName(strPickupTextFieldName.substring(0, 1).toUpperCase() + strPickupTextFieldName.substring(1));
												pickupTextPSDEFieldDTO.setPSDataTypeId(DEFDataTypes.PICKUPTEXT);
												pickupTextPSDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.PICKUPTEXT));
												pickupTextPSDEFieldDTO.setPasteReset(psDEFieldDTO.getPasteReset());
												pickupTextPSDEFieldDTO.setEnableUserInput(psDEFieldDTO.getEnableUserInput());
												pickupTextPSDEFieldDTO.setPSDERId(psDERDTO.getPSDERId());
												pickupTextPSDEFieldDTO.setPSDERName(psDERDTO.getPSDERName());
												pickupTextPSDEFieldDTO.setDERPSDEFId(majorPSDEFieldDTO.getPSDEFieldId());
												pickupTextPSDEFieldDTO.setDERPSDEFName(majorPSDEFieldDTO.getPSDEFieldName());

												PSModelServiceUtils.getInstance().createPSDEField(pickupTextPSDEFieldDTO);
												psDEFieldDTOMap.put(pickupTextPSDEFieldDTO.getPSDEFieldName().toLowerCase(), pickupTextPSDEFieldDTO);

											}
										}
									}
								}
								break;
							case FIELD_TTYPE_MANY2MANY:
								break;
							case FIELD_TTYPE_ONE2MANY:
							default:
								log.debug(String.format("Odoo模型[%1$s]属性[%2$s]类型[%3$s]忽略同步", strModel, psDEFieldDTO.getPSDEFieldName(), strTType));
								break;
							}
						}
					}
				}

			}

			// One2Many 及 Many2Many 等
			for (Object item : list) {
				Map<String, Object> map = (Map<String, Object>) item;
				String strModel = (String) map.get("model");
				if (!StringUtils.hasLength(strModel)) {
					continue;
				}
				String[] items = strModel.split("[.]");
				String strModuleName = String.format("odoo_%1$s", items[0]).toLowerCase();
				PSModuleDTO psModuleDTO = psModuleDTOMap.get(strModuleName);
				// 判断实体是否存在
				String strDEName = strModel.replace(".", "_").toUpperCase();
				PSDataEntityDTO psDataEntityDTO = psDataEntityDTOMap.get(strDEName);
				if (psDataEntityDTO == null) {
					continue;
				}

				Map<String, PSDEFieldDTO> psDEFieldDTOMap = psDEFieldsMap.get(psDataEntityDTO.getPSDataEntityId());
				if (psDEFieldDTOMap == null) {
					continue;
				}

				List fieldlist = fieldListMap.get(map.get("id"));
				if (fieldlist == null) {
					continue;
				}

				Map<String, String> translatorMap = moduleTranslatorMap.get(items[0].toLowerCase());
				if (translatorMap == null) {
					continue;
				}

				for (Object item2 : fieldlist) {
					Map<String, Object> map2 = (Map<String, Object>) item2;
					String strFieldName = (String) map2.get("name");
					if (!StringUtils.hasLength(strFieldName)) {
						continue;
					}

					String strTType = (String) map2.get("ttype");
					if (!StringUtils.hasLength(strTType)) {
						continue;
					}

					int nId = this.getDataId(map2.get("id"));

					String strDesc = null;
					Object field_description = map2.get("field_description");
					if (field_description instanceof String) {
						strDesc = (String) field_description;
					}

					String strRelated = null;
					Object related = map2.get("related");
					if (related instanceof String) {
						strRelated = (String) related;
					}

					String strRelation = null;
					Object relation = map2.get("relation");
					if (relation instanceof String) {
						strRelation = (String) relation;
					}
					
					String strRelationField = null;
					Object relation_field = map2.get("relation_field");
					if (relation_field instanceof String) {
						strRelationField = (String) relation_field;
					}
					
					String strRelationTable = null;
					Object relation_table = map2.get("relation_table");
					if (relation_table instanceof String) {
						strRelationTable = (String) relation_table;
					}
					
					String strColumn1 = null;
					Object column1 = map2.get("column1");
					if (column1 instanceof String) {
						strColumn1 = (String) column1;
					}
					
					String strColumn2 = null;
					Object column2 = map2.get("column2");
					if (column2 instanceof String) {
						strColumn2 = (String) column2;
					}

					Boolean bRequired = (Boolean) map2.get("required");
					Boolean bCopied = (Boolean) map2.get("copied");
					Boolean bReadonly = (Boolean) map2.get("readonly");
					Boolean bStore = (Boolean) map2.get("store");

					PSDEFieldDTO psDEFieldDTO = psDEFieldDTOMap.get(strFieldName);
					if (psDEFieldDTO == null) {

						boolean bCreate = false;

						psDEFieldDTO = new PSDEFieldDTO();

						PSDEFieldDTO predefinedPSDEFieldDTO = predefinedPSDEFieldMap.get(strFieldName.toUpperCase());
						if (predefinedPSDEFieldDTO != null) {
							predefinedPSDEFieldDTO.copyTo(psDEFieldDTO);
						}

						psDEFieldDTO.setPSDEFieldName(strFieldName.toUpperCase());
						psDEFieldDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
						psDEFieldDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
						psDEFieldDTO.setLogicName(strDesc);
						String strLogicName = translatorMap.get(String.format("ir.model.fields,field_description|%1$s", strDesc));
						if (StringUtils.hasLength(strLogicName)) {
							psDEFieldDTO.setLogicName(strLogicName);
						}

						if (psDEFieldDTO.getLogicName().length() > 60) {
							psDEFieldDTO.setMemo(psDEFieldDTO.getLogicName());
							psDEFieldDTO.setLogicName(psDEFieldDTO.getLogicName().substring(0, 60));
						}

						if (predefinedPSDEFieldDTO != null) {
							bCreate = true;
						} else {

							psDEFieldDTO.setAllowEmpty((!DataTypeUtils.getBooleanValue(bRequired, false)) ? 1 : 0);
							psDEFieldDTO.setPasteReset((!DataTypeUtils.getBooleanValue(bCopied, false)) ? 1 : 0);
							if (!DataTypeUtils.getBooleanValue(bReadonly, false)) {
								psDEFieldDTO.setEnableUserInput(3);
							} else {
								psDEFieldDTO.setEnableUserInput(0);
							}

							String strCodeName = psDEFieldDTO.getPSDEFieldName().toLowerCase();
							psDEFieldDTO.setCodeName(psDEFieldDTO.getPSDEFieldName().substring(0, 1) + strCodeName.substring(1));
							// 判断类型进行处理
							switch (strTType) {
							case FIELD_TTYPE_ONE2MANY:
								if (!StringUtils.hasLength(strRelated) && StringUtils.hasLength(strRelation) && StringUtils.hasLength(strRelationField)) {
									// if (StringUtils.hasLength(strRelation)) {
									//
									String strDEName2 = strRelation.replace(".", "_").toUpperCase();
									PSDataEntityDTO psDataEntityDTO2 = psDataEntityDTOMap.get(strDEName2);
									if (psDataEntityDTO2 != null) {
										String strDERTag = String.format("DER1N|%1$s|%2$s|%3$s",psDataEntityDTO.getPSDataEntityName(), psDataEntityDTO2.getPSDataEntityName(), strRelationField).toUpperCase();
										PSDERDTO psDERDTO = psDERDTOMap.get(strDERTag);
										if(psDERDTO != null) {
											//判断该关系是否已经被使用
											for(PSDEFieldDTO psDEFieldDTO2 : psDEFieldDTOMap.values()) {
												if(!StringUtils.hasLength(psDEFieldDTO2.getO2MPSDERId())) {
													continue;
												}
												if(psDEFieldDTO2.getO2MPSDERId().equals(psDERDTO.getPSDERId())) {
													psDERDTO = null;
													break;
												}
											}
										}
										if(psDERDTO == null) {
											strDERTag = String.format("DERCUSTOM__%1$s__%2$s__%3$s__%4$s",psDataEntityDTO2.getPSDataEntityName(), psDataEntityDTO.getPSDataEntityName(), strRelationField, psDEFieldDTO.getPSDEFieldName()).toUpperCase();
										}
										psDERDTO = psDERDTOMap.get(strDERTag);
										if (psDERDTO == null) {
											psDERDTO = new PSDERDTO();
											psDERDTO.setPSDERName(strDERTag);
											psDERDTO.setDERType(DERTypes.DERCUSTOM);
											psDERDTO.setDERSubType(DERSubTypes.DER1N);
											psDERDTO.setMajorPSDEId(psDataEntityDTO.getPSDataEntityId());
											psDERDTO.setMajorPSDEName(psDataEntityDTO.getPSDataEntityName());
											psDERDTO.setMinorPSDEId(psDataEntityDTO2.getPSDataEntityId());
											psDERDTO.setMinorPSDEName(psDataEntityDTO2.getPSDataEntityName());
											psDERDTO.setDERFieldName(strRelationField.toUpperCase());
											psDERDTO.setUserTag(psDEFieldDTO.getPSDEFieldName().toLowerCase());
											// 建立关系
											PSModelServiceUtils.getInstance().createPSDER(psDERDTO);
											psDERDTOMap.put(strDERTag, psDERDTO);
										}
										

										psDEFieldDTO.setDEFType(DEFTypes.UI);
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.ONE2MANYDATA);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.ONE2MANYDATA));
										psDEFieldDTO.setO2MPSDERId(psDERDTO.getPSDERId());
										psDEFieldDTO.setO2MPSDERName(psDERDTO.getPSDERName());
										
										PSModelServiceUtils.getInstance().createPSDEField(psDEFieldDTO);
										psDEFieldDTOMap.put(psDEFieldDTO.getPSDEFieldName().toLowerCase(), psDEFieldDTO);
										
									}
								}
								break;
							case FIELD_TTYPE_MANY2MANY:
								if (!StringUtils.hasLength(strRelated) && StringUtils.hasLength(strRelation) && StringUtils.hasLength(strRelationTable)) {
									String strDEName2 = strRelation.replace(".", "_").toUpperCase();
									PSDataEntityDTO psDataEntityDTO2 = psDataEntityDTOMap.get(strDEName2);
									if (psDataEntityDTO2 != null) {
										String	strDERTag = String.format("DERCUSTOM__%1$s__%2$s__%3$s__%4$s",psDataEntityDTO2.getPSDataEntityName(), psDataEntityDTO.getPSDataEntityName(), strRelationTable, psDEFieldDTO.getPSDEFieldName()).toUpperCase();
										PSDERDTO psDERDTO = psDERDTOMap.get(strDERTag);
										if (psDERDTO == null) {
											psDERDTO = new PSDERDTO();
											psDERDTO.setPSDERName(strDERTag);
											psDERDTO.setDERType(DERTypes.DERCUSTOM);
											psDERDTO.setDERSubType(DERSubTypes.DER1N);
											psDERDTO.setMajorPSDEId(psDataEntityDTO.getPSDataEntityId());
											psDERDTO.setMajorPSDEName(psDataEntityDTO.getPSDataEntityName());
											psDERDTO.setMinorPSDEId(psDataEntityDTO2.getPSDataEntityId());
											psDERDTO.setMinorPSDEName(psDataEntityDTO2.getPSDataEntityName());
											psDERDTO.setUserTag(psDEFieldDTO.getPSDEFieldName().toLowerCase());
											psDERDTO.setUserTag2(strRelationTable);
											psDERDTO.setUserTag3(strColumn1);
											psDERDTO.setUserTag4(strColumn2);
											// 建立关系
											PSModelServiceUtils.getInstance().createPSDER(psDERDTO);
											psDERDTOMap.put(strDERTag, psDERDTO);
										}
										

										psDEFieldDTO.setDEFType(DEFTypes.UI);
										psDEFieldDTO.setPSDataTypeId(DEFDataTypes.ONE2MANYDATA);
										psDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.ONE2MANYDATA));
										psDEFieldDTO.setO2MPSDERId(psDERDTO.getPSDERId());
										psDEFieldDTO.setO2MPSDERName(psDERDTO.getPSDERName());
										
										PSModelServiceUtils.getInstance().createPSDEField(psDEFieldDTO);
										psDEFieldDTOMap.put(psDEFieldDTO.getPSDEFieldName().toLowerCase(), psDEFieldDTO);
										
									}
								}
								break;
							
							case FIELD_TTYPE_MANY2ONE:
								if (!DataTypeUtils.getBooleanValue(bStore, true)) {
									// if (!StringUtils.hasLength(strRelated) &&
									// StringUtils.hasLength(strRelation)) {
									if (StringUtils.hasLength(strRelation)) {
										//
										String strDEName2 = strRelation.replace(".", "_").toUpperCase();
										PSDataEntityDTO psDataEntityDTO2 = psDataEntityDTOMap.get(strDEName2);
										if (psDataEntityDTO2 != null) {
											String strDERTag = String.format("DER1N|%1$s|%2$s|%3$s", psDataEntityDTO2.getPSDataEntityName(), psDataEntityDTO.getPSDataEntityName(), psDEFieldDTO.getPSDEFieldName()).toUpperCase();
											PSDERDTO psDERDTO = psDERDTOMap.get(strDERTag);
											if (psDERDTO == null) {
												psDERDTO = new PSDERDTO();
												psDERDTO.setDERType(DERTypes.DER1N);
												psDERDTO.setMajorPSDEId(psDataEntityDTO2.getPSDataEntityId());
												psDERDTO.setMajorPSDEName(psDataEntityDTO2.getPSDataEntityName());
												psDERDTO.setMinorPSDEId(psDataEntityDTO.getPSDataEntityId());
												psDERDTO.setMinorPSDEName(psDataEntityDTO.getPSDataEntityName());
												psDERDTO.setDERFieldName(psDEFieldDTO.getPSDEFieldName());
												psDERDTO.setDERFieldLName(psDEFieldDTO.getLogicName());

												psDERDTO.setUserTag(strRelated);

												int nPos = psDEFieldDTO.getCodeName().lastIndexOf("_id");
												if (nPos == psDEFieldDTO.getCodeName().length() - 3) {
													psDERDTO.setCodeName(psDEFieldDTO.getCodeName().substring(0, psDEFieldDTO.getCodeName().length() - 3));
													if (psDEFieldDTOMap.get(psDERDTO.getCodeName().toLowerCase()) != null) {
														psDERDTO.setCodeName(psDEFieldDTO.getCodeName() + "_object");
													}
												} else {
													psDERDTO.setCodeName(psDEFieldDTO.getCodeName() + "_object");
												}

												// 删除操作
												Object on_delete = map2.get("on_delete");
												if (on_delete instanceof String) {
													String strOnDelete = (String) on_delete;
													switch (strOnDelete) {
													case FIELD_ONDELETE_CASCADE:
														psDERDTO.setRemoveActionType(DERRemoveActionTypes.DELETE);
														break;
													case FIELD_ONDELETE_RESTRICT:
														psDERDTO.setRemoveActionType(DERRemoveActionTypes.REJECT);
														break;
													case FIELD_ONDELETE_SETNULL:
														psDERDTO.setRemoveActionType(DERRemoveActionTypes.RESET);
														break;
													}
												}

												// 建立关系
												PSModelServiceUtils.getInstance().createPSDER(psDERDTO);
												psDERDTOMap.put(strDERTag, psDERDTO);
												
												
												PSDEFieldFilter psModelSearchContextDTO = new PSDEFieldFilter();
												psModelSearchContextDTO.setFieldCond(PSDEFieldDTO.FIELD_PSDEID, Conditions.EQ, psDataEntityDTO.getPSDataEntityId());
												psModelSearchContextDTO.setFieldCond(PSDEFieldDTO.FIELD_PSDERID, Conditions.EQ, psDERDTO.getPSDERId());
												psModelSearchContextDTO.setFieldCond(PSDEFieldDTO.FIELD_PSDATATYPEID, Conditions.EQ, DEFDataTypes.PICKUP);
												
												List<PSDEFieldDTO> psDEFieldDTOList2 = PSModelServiceUtils.getInstance().searchAllPSDEFields(psModelSearchContextDTO);
												if (!ObjectUtils.isEmpty(psDEFieldDTOList2)) {
													for (PSDEFieldDTO psDEFieldDTO2 : psDEFieldDTOList2) {
														if(DataTypeUtils.getIntegerValue(psDEFieldDTO2.getDEFType(), DEFTypes.PHISICAL) != DEFTypes.UI) {
															psDEFieldDTO2.setDEFType(DEFTypes.UI);
															psDEFieldDTO2.setPhysicalField(0);
															PSModelServiceUtils.getInstance().updatePSDEField(psDEFieldDTO2);
														}
													}
												}
											}

											// 判断外键值文本是否存在
											String strPickupTextFieldName = String.format("%1$s_NAME", psDEFieldDTO.getPSDEFieldName()).toLowerCase();
											PSDEFieldDTO pickupTextPSDEFieldDTO = psDEFieldDTOMap.get(strPickupTextFieldName);
											Map<String, PSDEFieldDTO> psDEFieldDTOMap2 = psDEFieldsMap.get(psDataEntityDTO2.getPSDataEntityId());
											PSDEFieldDTO majorPSDEFieldDTO = null;
											if (psDEFieldDTOMap2 != null) {
												majorPSDEFieldDTO = psDEFieldDTOMap2.get("name");
											}
											if (pickupTextPSDEFieldDTO == null && majorPSDEFieldDTO != null) {

												pickupTextPSDEFieldDTO = new PSDEFieldDTO();
												pickupTextPSDEFieldDTO.setDEFType(DEFTypes.LINK);
												pickupTextPSDEFieldDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
												pickupTextPSDEFieldDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
												pickupTextPSDEFieldDTO.setPSDEFieldName(strPickupTextFieldName);
												pickupTextPSDEFieldDTO.setLogicName(psDEFieldDTO.getLogicName());
												pickupTextPSDEFieldDTO.setCodeName(strPickupTextFieldName.substring(0, 1).toUpperCase() + strPickupTextFieldName.substring(1));
												pickupTextPSDEFieldDTO.setPSDataTypeId(DEFDataTypes.PICKUPTEXT);
												pickupTextPSDEFieldDTO.setPSDataTypeName(DEFDataTypes.toName(DEFDataTypes.PICKUPTEXT));
												pickupTextPSDEFieldDTO.setPasteReset(psDEFieldDTO.getPasteReset());
												pickupTextPSDEFieldDTO.setEnableUserInput(psDEFieldDTO.getEnableUserInput());
												pickupTextPSDEFieldDTO.setPSDERId(psDERDTO.getPSDERId());
												pickupTextPSDEFieldDTO.setPSDERName(psDERDTO.getPSDERName());
												pickupTextPSDEFieldDTO.setDERPSDEFId(majorPSDEFieldDTO.getPSDEFieldId());
												pickupTextPSDEFieldDTO.setDERPSDEFName(majorPSDEFieldDTO.getPSDEFieldName());

												PSModelServiceUtils.getInstance().createPSDEField(pickupTextPSDEFieldDTO);
												psDEFieldDTOMap.put(pickupTextPSDEFieldDTO.getPSDEFieldName().toLowerCase(), pickupTextPSDEFieldDTO);

											}
										}
									}
								}
								break;
								
							default:
								log.debug(String.format("Odoo模型[%1$s]属性[%2$s]类型[%3$s]忽略同步", strModel, psDEFieldDTO.getPSDEFieldName(), strTType));
								break;
							}
						}
					}
				}

			}

		}
	}

	protected int getDataId(Object id) throws Throwable {
		if (id instanceof Integer) {
			return (int) id;
		}
		if (id instanceof Object[]) {
			Object[] values = (Object[]) id;
			if (values.length > 0) {
				return this.getDataId(values[0]);
			}
		}
		if (id != null) {
			return Integer.parseInt(id.toString());
		}
		throw new Exception("数据标识无效");
	}

	/**
	 * 获取Odoo开放应用
	 * 
	 * @param dcSystem
	 * @return
	 * @throws Throwable
	 */
	protected OpenAccess getOdooOpenAccess(DCSystem dcSystem, boolean bTryMode) throws Throwable {
		/*
		 * String url = "http://172.16.240.23:8069"; String db = "";// "odoo";
		 * String username = "odoo@ibizsys.net"; String password =
		 * "c4bc061f451a0f816eb3352e24dcc22a220c5678";
		 */
		OpenAccess openAccess = new OpenAccess();
		openAccess.setRedirectUri("http://172.16.240.23:8069");
		openAccess.setAccessKey("odoo@ibizsys.net");
		openAccess.setSecretKey("c4bc061f451a0f816eb3352e24dcc22a220c5678");
		openAccess.setRegionId("");
		return openAccess;
	}
}
