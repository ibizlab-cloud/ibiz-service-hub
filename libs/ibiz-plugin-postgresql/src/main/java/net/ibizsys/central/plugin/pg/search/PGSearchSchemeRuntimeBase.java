package net.ibizsys.central.plugin.pg.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.database.ISysDBSchemeRuntime;
import net.ibizsys.central.cloud.core.search.ISysSearchDocRuntime;
import net.ibizsys.central.cloud.core.search.SysSearchSchemeRuntimeBase;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.search.ISysSearchSchemeRuntimeContext;
import net.ibizsys.central.search.SysSearchSchemeRuntimeContextProxy;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.SearchFieldDataType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.database.IPSSysDBColumn;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.model.database.PSSysDBColumnImpl;
import net.ibizsys.model.database.PSSysDBSchemeImpl;
import net.ibizsys.model.database.PSSysDBTableImpl;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchField;
import net.ibizsys.runtime.util.DBTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class PGSearchSchemeRuntimeBase extends SysSearchSchemeRuntimeBase implements IPGSearchSchemeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PGSearchSchemeRuntimeBase.class);
	private ISysDBSchemeRuntime iSysDBSchemeRuntime = null;
	private Map<String, List<IPSSysDBTable>> psSysDBTableListMap = new HashMap<String, List<IPSSysDBTable>>();

	public static abstract class ESSearchSchemeRuntimeContextBase<M extends IPGSearchSchemeRuntime, C extends ISysSearchSchemeRuntimeContext> extends SysSearchSchemeRuntimeContextProxy<M, C> implements IPGSearchSchemeRuntimeContext {
		public ESSearchSchemeRuntimeContextBase(C superContext) {
			super(superContext);
		}
	}

	@Override
	protected IPGSearchSchemeRuntimeContext createModelRuntimeContext() {
		return new ESSearchSchemeRuntimeContextBase<IPGSearchSchemeRuntime, ISysSearchSchemeRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public IPGSearchSchemeRuntime getModelRuntime() {
				return getSelf();
			}
		};
	}

	private PGSearchSchemeRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected IPGSearchSchemeRuntimeContext getSysSearchSchemeRuntimeContext() {
		return (IPGSearchSchemeRuntimeContext) super.getSysSearchSchemeRuntimeContext();
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();
		if (this.getSysDBSchemeRuntime(true) == null) {
			this.prepareSysDBSchemeRuntime();
			this.getSysDBSchemeRuntime(false);
		}
	}

	@Override
	protected void preparePSSysBDScheme() throws Exception {
		// super.preparePSSysBDScheme();
	}

	protected void prepareSysDBSchemeRuntime() throws Exception {
		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put(PSSysDBSchemeImpl.ATTR_GETID, this.getPSSysSearchScheme().getCodeName().toUpperCase());
		objectNode.put(PSSysDBSchemeImpl.ATTR_GETNAME, this.getName());
		objectNode.put(PSSysDBSchemeImpl.ATTR_GETCODENAME, this.getPSSysSearchScheme().getCodeName());
		objectNode.put(PSSysDBSchemeImpl.ATTR_GETDSLINK, String.format("PGSEARCHSCHEME_%1$s", this.getPSSysSearchScheme().getCodeName()).toUpperCase());
		if (StringUtils.hasLength(this.getServiceUrl())) {
			objectNode.put(PSSysDBSchemeImpl.ATTR_GETDBINSTTAG, this.getServiceUrl());
		}
		IPSSysDBScheme iPSSysDBScheme = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject(IPSSysDBScheme.class, objectNode);
		ISysDBSchemeRuntime iSysDBSchemeRuntime = (ISysDBSchemeRuntime) this.getSystemRuntime().createSysDBSchemeRuntime(iPSSysDBScheme);

		String folder = "sysdbscheme." + PSModelUtils.calcUniqueTag(iPSSysDBScheme.getPSSysModelGroup(), iPSSysDBScheme.getDSLink());
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("dbtype", DBTypes.POSTGRESQL);
		this.getSystemRuntimeSetting().setParams(folder, params);

		iSysDBSchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysDBScheme);
		this.setSysDBSchemeRuntime(iSysDBSchemeRuntime);
	}

	protected void setSysDBSchemeRuntime(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
		this.iSysDBSchemeRuntime = iSysDBSchemeRuntime;
	}

	protected ISysDBSchemeRuntime getSysDBSchemeRuntime(boolean bTryMode) throws Exception {
		if (this.iSysDBSchemeRuntime != null || bTryMode) {
			return this.iSysDBSchemeRuntime;
		}
		throw new Exception("数据库体系运行时对象无效");
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		this.getSysDBSchemeRuntime(false).install();
		// try {
		// log.debug(this.getSysDBSchemeRuntime(false).executeSelectSQL("select
		// * from accounts", Collections.EMPTY_LIST));
		// } catch (Throwable e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	@Override
	protected void onUninstall() throws Throwable {
		this.getSysDBSchemeRuntime(false).uninstall();
		super.onUninstall();
	}

	@Override
	protected ISysSearchDocRuntime createSysSearchDocRuntime(IPSSysSearchDoc iPSSysSearchDoc) {
		return new PGSearchDocRuntime();
	}

	@Override
	protected void onUpdateSchema(IPSSysSearchDoc iPSSysSearchDoc) throws Exception {
		List<IPSSysDBTable> psSysDBTableList = this.getPSSysDBTables(iPSSysSearchDoc);
		if (ObjectUtils.isEmpty(psSysDBTableList)) {
			return;
		}

		for (IPSSysDBTable iPSSysDBTable : psSysDBTableList) {
			// 判断表是否存在
			if (this.getSysDBSchemeRuntime(false).doesTableExist(iPSSysDBTable.getName())) {
				// 获取全部列
				Map<String, Object> columns = this.getSysDBSchemeRuntime(false).getTableColumns(iPSSysDBTable.getName());
				Map<String, Object> realColumns = new HashMap<String, Object>();
				for (java.util.Map.Entry<String, Object> entry : columns.entrySet()) {
					realColumns.put(this.getRealDBObjName(entry.getKey()), entry.getValue());
				}
				for (IPSSysDBColumn iPSSysDBColumn : iPSSysDBTable.getAllPSSysDBColumns()) {
					String strColumnName = this.getRealDBObjName(iPSSysDBColumn.getName());
					if (realColumns.containsKey(strColumnName)) {
						continue;
					}
					try {
						String strCreateColumnSQL = this.getCreateColumnSQL(iPSSysDBTable.getName(), iPSSysDBColumn);
						this.getSysDBSchemeRuntime(false).executeSQL(strCreateColumnSQL, Collections.EMPTY_LIST);
					} catch (Throwable ex) {
						throw new Exception(String.format("建立列[%1$s.%2$s]发生异常，%3$s", iPSSysDBTable.getName(), iPSSysDBTable.getName(), ex.getMessage()), ex);
					}
				}
			} else {
				try {
					String strCreateTableSQL = this.getCreateTableSQL(iPSSysDBTable);
					this.getSysDBSchemeRuntime(false).executeSQL(strCreateTableSQL, Collections.EMPTY_LIST);
					List<String> createIndexSQLList = this.getCreateIndexSQLs(iPSSysDBTable);
					if (!ObjectUtils.isEmpty(createIndexSQLList)) {
						for (String strCreateIndexSQL : createIndexSQLList) {
							this.getSysDBSchemeRuntime(false).executeSQL(strCreateIndexSQL, Collections.EMPTY_LIST);
						}
					}

				} catch (Throwable ex) {
					throw new Exception(String.format("建立表[%1$s]发生异常，%2$s", iPSSysDBTable.getName(), ex.getMessage()), ex);
				}
			}

		}

		psSysDBTableListMap.put(iPSSysSearchDoc.getName().toUpperCase(), psSysDBTableList);
	}

	protected String getTableName(IPSSysSearchDoc iPSSysSearchDoc) {
		return this.getRealDBObjName(iPSSysSearchDoc.getName());
	}

	protected String getCreateTableSQL(IPSSysDBTable iPSSysDBTable) throws Throwable {
		IDBDialect iDBDialect = this.getSysDBSchemeRuntime(false).getDBDialect();
		boolean bFirst = true;
		StringBuilder sb = new StringBuilder();

		String strKeyColumnName = "";
		String strRealTableName = iPSSysDBTable.getName();

		sb.append(String.format("CREATE TABLE %1$s(", iDBDialect.getDBObjStandardName(strRealTableName)));
		for (IPSSysDBColumn iPSSysDBColumn : iPSSysDBTable.getAllPSSysDBColumns()) {
			if (bFirst) {
				bFirst = false;
				sb.append("\n");
			} else {
				sb.append("\n,");
			}
			String strDataType = this.getDataType(iPSSysDBColumn);
			String strColumnName = iDBDialect.getDBObjStandardName(this.getRealDBObjName(iPSSysDBColumn.getName()));
			if (iPSSysDBColumn.isPKey()) {
				strKeyColumnName = strColumnName;
				sb.append(String.format("%1$s %2$s NOT NULL ", strColumnName, strDataType));
				sb.append("PRIMARY KEY ");
			} else {
				sb.append(String.format("%1$s %2$s %3$s", strColumnName, strDataType, iPSSysDBColumn.isNullable() ? "NULL" : "NOT NULL"));
			}
		}
		sb.append("\n)");
		return sb.toString();
	}

	protected List<String> getCreateIndexSQLs(IPSSysDBTable iPSSysDBTable) throws Throwable {
		IDBDialect iDBDialect = this.getSysDBSchemeRuntime(false).getDBDialect();

		// 判断是否补充索引
		List<IPSSysDBColumn> columnList = new ArrayList<IPSSysDBColumn>();
		for (IPSSysDBColumn iPSSysDBColumn : iPSSysDBTable.getAllPSSysDBColumns()) {
			JsonNode indexNode = iPSSysDBColumn.getObjectNode().path("_index");
			if (indexNode.isMissingNode()) {
				continue;
			}
			if (indexNode.asBoolean()) {
				columnList.add(iPSSysDBColumn);
			}
		}

		if (ObjectUtils.isEmpty(columnList)) {
			return Collections.EMPTY_LIST;
		}

		boolean bFirst = true;
		StringBuilder sb = new StringBuilder();

		String strKeyColumnName = "";
		String strRealTableName = iPSSysDBTable.getName();

		sb.append(String.format("CREATE INDEX %1$s ON %2$s(", iDBDialect.getDBObjStandardName(this.getRealDBObjName("IDX_S_") + strRealTableName), iDBDialect.getDBObjStandardName(strRealTableName)));
		for (IPSSysDBColumn iPSSysDBColumn : columnList) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(",");
			}
			String strColumnName = iDBDialect.getDBObjStandardName(this.getRealDBObjName(iPSSysDBColumn.getName()));
			sb.append(strColumnName);
		}
		sb.append("\n)");
		return Arrays.asList(sb.toString());
	}

	protected String getDataType(IPSSysDBColumn iPSSysDBColumn) {
		String strDataType = iPSSysDBColumn.getDataType();
		if (!StringUtils.hasLength(strDataType)) {
			strDataType = DataTypes.toString(iPSSysDBColumn.getStdDataType());
			if (DataTypeUtils.isStringDataType(iPSSysDBColumn.getStdDataType())) {
				if (iPSSysDBColumn.getLength() > 0) {
					strDataType += String.format("(%1$s)", iPSSysDBColumn.getLength());
				}
			}
		}
		return strDataType;
	}

	protected String getCreateColumnSQL(String strTableName, IPSSysDBColumn iPSSysDBColumn) throws Throwable {
		IDBDialect iDBDialect = this.getSysDBSchemeRuntime(false).getDBDialect();
		String strDataType = getDataType(iPSSysDBColumn);
		if (ObjectUtils.isEmpty(strDataType)) {
			throw new Exception(String.format("获取数据列[%1$s]数据库类型失败", iPSSysDBColumn.getName()));
		}
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("ALTER TABLE %1$s\n", iDBDialect.getDBObjStandardName(strTableName)));
		sb.append(String.format("ADD COLUMN %1$s %2$s %3$s", iDBDialect.getDBObjStandardName(this.getRealDBObjName(iPSSysDBColumn.getName())), strDataType, iPSSysDBColumn.isNullable() ? "NULL" : "NOT NULL"));

		sb.append("\n");
		return sb.toString();
	}

	protected List<IPSSysDBTable> getPSSysDBTables(IPSSysSearchDoc iPSSysSearchDoc) throws Exception {
		List<IPSSysDBTable> list = new ArrayList<IPSSysDBTable>();
		ObjectNode tableNode = JsonUtils.createObjectNode();
		String strTableName = this.getTableName(iPSSysSearchDoc);
		tableNode.put(PSSysDBTableImpl.ATTR_GETID, strTableName);
		tableNode.put(PSSysDBTableImpl.ATTR_GETNAME, strTableName);
		tableNode.put(PSSysDBTableImpl.ATTR_GETCODENAME, strTableName);

		Map<String, IPSSysSearchField> psSysSearchFieldMap = new LinkedHashMap<String, IPSSysSearchField>();
		java.util.List<IPSSysSearchField> psSysSearchFieldList = iPSSysSearchDoc.getAllPSSysSearchFields();
		if (!ObjectUtils.isEmpty(psSysSearchFieldList)) {
			for (IPSSysSearchField iPSSysSearchField : psSysSearchFieldList) {
				String strName = this.getRealDBObjName(iPSSysSearchField.getName());
				psSysSearchFieldMap.put(strName.toLowerCase(), iPSSysSearchField);
			}
		}

		ArrayNode columnsNode = tableNode.putArray(PSSysDBTableImpl.ATTR_GETALLPSSYSDBCOLUMNS);

		// 判断是否有主键
		IPSSysSearchField idPSSysSearchField = psSysSearchFieldMap.remove("id");
		ObjectNode idColumnNode = columnsNode.addObject();
		idColumnNode.put(PSSysDBColumnImpl.ATTR_GETID, this.getRealDBObjName("ID"));
		idColumnNode.put(PSSysDBColumnImpl.ATTR_GETNAME, "ID");
		idColumnNode.put(PSSysDBColumnImpl.ATTR_ISPKEY, true);
		idColumnNode.put(PSSysDBColumnImpl.ATTR_ISNULLABLE, false);
		idColumnNode.put(PSSysDBColumnImpl.ATTR_GETSTDDATATYPE, StdDataType.VARCHAR.value);
		idColumnNode.put(PSSysDBColumnImpl.ATTR_GETLENGTH, 100);

		for (IPSSysSearchField iPSSysSearchField : psSysSearchFieldMap.values()) {
			IPSSysDBTable iPSSysDBTable = this.getPSSysDBTable(iPSSysSearchDoc, iPSSysSearchField);
			if (iPSSysDBTable != null) {
				list.add(iPSSysDBTable);
				continue;
			}

			ObjectNode columnNode = columnsNode.addObject();
			columnNode.put(PSSysDBColumnImpl.ATTR_GETID, iPSSysSearchField.getId());
			columnNode.put(PSSysDBColumnImpl.ATTR_GETNAME, iPSSysSearchField.getName());
			columnNode.put(PSSysDBColumnImpl.ATTR_ISPKEY, false);
			columnNode.put(PSSysDBColumnImpl.ATTR_ISNULLABLE, true);
			columnNode.put(PSSysDBColumnImpl.ATTR_GETSTDDATATYPE, iPSSysSearchField.getStdDataType());
			if (SearchFieldDataType.DENSE_VECTOR.value.equals(iPSSysSearchField.getFieldType())) {
				int nDims = 1024;
				if (iPSSysSearchField.getFieldParams() != null) {
					JsonNode dimsNode = iPSSysSearchField.getFieldParams().path("type").path("dims");
					if (!dimsNode.isMissingNode()) {
						nDims = dimsNode.asInt(nDims);
					}
				}
				columnNode.put(PSSysDBColumnImpl.ATTR_GETDATATYPE, String.format("VECTOR(%1$s)", nDims));
			}
		}

		list.add(0, this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getSysDBSchemeRuntime(false).getPSSysDBScheme(), IPSSysDBTable.class, tableNode));

		return list;
	}

	protected IPSSysDBTable getPSSysDBTable(IPSSysSearchDoc iPSSysSearchDoc, IPSSysSearchField iPSSysSearchField) throws Exception {
		if (SearchFieldDataType.NESTED.value.equals(iPSSysSearchField.getFieldType())) {
			if (!ISysSearchDocRuntime.FIELDTAG_NESTED_TEXT_VECTOR.equals(iPSSysSearchField.getFieldTag())) {
				throw new Exception(String.format("无法识别的嵌套属性[%1$s]", iPSSysSearchField.getName()));
			}

			String strTableName = this.getRealDBObjName(String.format("%1$s__%2$s", iPSSysSearchDoc.getName(), iPSSysSearchField.getName()));
			ObjectNode tableNode = JsonUtils.createObjectNode();
			tableNode.put(PSSysDBTableImpl.ATTR_GETID, strTableName);
			tableNode.put(PSSysDBTableImpl.ATTR_GETNAME, strTableName);
			tableNode.put(PSSysDBTableImpl.ATTR_GETCODENAME, strTableName);
			tableNode.put(PSSysDBTableImpl.ATTR_GETTABLETAG, iPSSysSearchField.getName());

			ArrayNode columnsNode = tableNode.putArray(PSSysDBTableImpl.ATTR_GETALLPSSYSDBCOLUMNS);
			ObjectNode idColumnNode = columnsNode.addObject();
			idColumnNode.put(PSSysDBColumnImpl.ATTR_GETID, this.getRealDBObjName("ID"));
			idColumnNode.put(PSSysDBColumnImpl.ATTR_GETNAME, "ID");
			idColumnNode.put(PSSysDBColumnImpl.ATTR_ISPKEY, true);
			idColumnNode.put(PSSysDBColumnImpl.ATTR_ISNULLABLE, false);
			idColumnNode.put(PSSysDBColumnImpl.ATTR_GETSTDDATATYPE, StdDataType.VARCHAR.value);
			idColumnNode.put(PSSysDBColumnImpl.ATTR_GETLENGTH, 100);

			ObjectNode docIdColumnNode = columnsNode.addObject();
			docIdColumnNode.put(PSSysDBColumnImpl.ATTR_GETID, this.getRealDBObjName("DOC_ID"));
			docIdColumnNode.put(PSSysDBColumnImpl.ATTR_GETNAME, "DOC_ID");
			docIdColumnNode.put(PSSysDBColumnImpl.ATTR_ISPKEY, false);
			docIdColumnNode.put(PSSysDBColumnImpl.ATTR_ISNULLABLE, false);
			docIdColumnNode.put(PSSysDBColumnImpl.ATTR_GETSTDDATATYPE, StdDataType.VARCHAR.value);
			docIdColumnNode.put(PSSysDBColumnImpl.ATTR_GETLENGTH, 100);
			docIdColumnNode.put("_index", true);

			int nDims = 1024;
			if (iPSSysSearchField.getFieldParams() != null) {
				JsonNode dimsNode = iPSSysSearchField.getFieldParams().path("type").path("properties").path("vector").path("dims");
				if (!dimsNode.isMissingNode()) {
					nDims = dimsNode.asInt(nDims);
				}
			}

			ObjectNode textColumnNode = columnsNode.addObject();
			textColumnNode.put(PSSysDBColumnImpl.ATTR_GETID, this.getRealDBObjName("TEXT"));
			textColumnNode.put(PSSysDBColumnImpl.ATTR_GETNAME, "TEXT");
			textColumnNode.put(PSSysDBColumnImpl.ATTR_ISPKEY, false);
			textColumnNode.put(PSSysDBColumnImpl.ATTR_ISNULLABLE, false);
			textColumnNode.put(PSSysDBColumnImpl.ATTR_GETSTDDATATYPE, StdDataType.VARCHAR.value);
			textColumnNode.put(PSSysDBColumnImpl.ATTR_GETLENGTH, 4000);

			ObjectNode embeddingColumnNode = columnsNode.addObject();
			embeddingColumnNode.put(PSSysDBColumnImpl.ATTR_GETID, this.getRealDBObjName("EMBEDDING"));
			embeddingColumnNode.put(PSSysDBColumnImpl.ATTR_GETNAME, "EMBEDDING");
			embeddingColumnNode.put(PSSysDBColumnImpl.ATTR_ISPKEY, false);
			embeddingColumnNode.put(PSSysDBColumnImpl.ATTR_ISNULLABLE, false);
			embeddingColumnNode.put(PSSysDBColumnImpl.ATTR_GETDATATYPE, String.format("VECTOR(%1$s)", nDims));

			ObjectNode metaColumnNode = columnsNode.addObject();
			metaColumnNode.put(PSSysDBColumnImpl.ATTR_GETID, this.getRealDBObjName("META"));
			metaColumnNode.put(PSSysDBColumnImpl.ATTR_GETNAME, "META");
			metaColumnNode.put(PSSysDBColumnImpl.ATTR_ISPKEY, false);
			metaColumnNode.put(PSSysDBColumnImpl.ATTR_ISNULLABLE, true);
			metaColumnNode.put(PSSysDBColumnImpl.ATTR_GETDATATYPE, "JSONB");

			return this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getSysDBSchemeRuntime(false).getPSSysDBScheme(), IPSSysDBTable.class, tableNode);
		}
		return null;
	}

	@Override
	protected Object onInsert(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		ISysSearchDocRuntime iSysSearchDocRuntime = this.getSysSearchDocRuntime(strDocName, false);
		List<IPSSysDBTable> list = psSysDBTableListMap.get(strDocName.toUpperCase());
		if (ObjectUtils.isEmpty(list)) {
			throw new Exception("未获取搜索文档相关数据表");
		}

		Object id = arg.get(Entity.KEY);
		if (ObjectUtils.isEmpty(id)) {
			throw new Exception("未传入键值");
		}

		processDenseVectorFields(strDocName, arg, false);

		IDBDialect iDBDialect = this.getSysDBSchemeRuntime(false).getDBDialect();
		IPSSysDBTable mainPSSysDBTable = list.get(0);
		Map<String, Object> arg2 = new LinkedHashMap<String, Object>();
		for (IPSSysDBColumn iPSSysDBColumn : mainPSSysDBTable.getAllPSSysDBColumns()) {
			if (arg.containsKey(iPSSysDBColumn.getName())) {
				arg2.put(this.getRealDBObjName(iPSSysDBColumn.getName()), arg.get(iPSSysDBColumn.getName()));
			} else if (extParamMap != null && extParamMap.containsKey(iPSSysDBColumn.getName())) {
				arg2.put(this.getRealDBObjName(iPSSysDBColumn.getName()), extParamMap.get(iPSSysDBColumn.getName()));
			}
		}
		arg2.put(this.getRealDBObjName("ID"), id);
		String strInsertSQL = iDBDialect.getInsertTableSQL(this.getRealDBObjName(mainPSSysDBTable.getName()), arg2.keySet());

		int nRet = this.getSysDBSchemeRuntime(false).executeSQL(strInsertSQL, new ArrayList(arg2.values()));

		for (int i = 1; i < list.size(); i++) {
			IPSSysDBTable iPSSysDBTable = list.get(i);
			IPSSysSearchField iPSSysSearchField = iSysSearchDocRuntime.getPSSysSearchField(iPSSysDBTable.getTableTag(), false);
			// 判断类型
			if (SearchFieldDataType.NESTED.value.equals(iPSSysSearchField.getFieldType()) && ISysSearchDocRuntime.FIELDTAG_NESTED_TEXT_VECTOR.equals(iPSSysSearchField.getFieldTag())) {
				Object fieldValue = arg.get(iPSSysSearchField.getName());
				if (ObjectUtils.isEmpty(fieldValue)) {
					continue;
				}

				Map[] value = (Map[]) fieldValue;
				for (int j = 0; j < value.length; j++) {
					Map<String, Object> arg3 = new LinkedHashMap<String, Object>();
					Map item = value[j];

					arg3.put(this.getRealDBObjName("ID"), String.format("%1$s__%2$s", id, j));
					arg3.put(this.getRealDBObjName("DOC_ID"), id);
					arg3.put(this.getRealDBObjName("TEXT"), item.get("text"));
					arg3.put(this.getRealDBObjName("EMBEDDING"), item.get("vector"));

					strInsertSQL = iDBDialect.getInsertTableSQL(this.getRealDBObjName(iPSSysDBTable.getName()), arg3.keySet());
					this.getSysDBSchemeRuntime(false).executeSQL(strInsertSQL, new ArrayList(arg3.values()));
				}

			}
		}

		return nRet;

		// return super.onInsert(strDocName, arg, extParamMap);
	}

	@Override
	protected Object onUpdate(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		ISysSearchDocRuntime iSysSearchDocRuntime = this.getSysSearchDocRuntime(strDocName, false);
		List<IPSSysDBTable> list = psSysDBTableListMap.get(strDocName.toUpperCase());
		if (ObjectUtils.isEmpty(list)) {
			throw new Exception("未获取搜索文档相关数据表");
		}

		Object id = arg.get(Entity.KEY);
		if (ObjectUtils.isEmpty(id)) {
			throw new Exception("未传入键值");
		}

		processDenseVectorFields(strDocName, arg, true);

		IDBDialect iDBDialect = this.getSysDBSchemeRuntime(false).getDBDialect();
		IPSSysDBTable mainPSSysDBTable = list.get(0);
		// 判断数据是否存在
		List<Object> ret = this.getSysDBSchemeRuntime(false).executeSelectSQL(String.format("SELECT 1 FROM %1$s where %2$s = ? LIMIT 1", this.getRealDBObjName(mainPSSysDBTable.getName()), this.getRealDBObjName("ID")), Arrays.asList(id));
		if (ObjectUtils.isEmpty(ret)) {
			return this.onInsert(strDocName, arg, extParamMap);
		}

		Map<String, Object> arg2 = new LinkedHashMap<String, Object>();
		Map<String, Object> keyarg = new LinkedHashMap<String, Object>();
		for (IPSSysDBColumn iPSSysDBColumn : mainPSSysDBTable.getAllPSSysDBColumns()) {
			if ("ID".equalsIgnoreCase(iPSSysDBColumn.getName())) {
				keyarg.put(this.getRealDBObjName("ID"), id);
			} else {
				if (arg.containsKey(iPSSysDBColumn.getName())) {
					arg2.put(this.getRealDBObjName(iPSSysDBColumn.getName()), arg.get(iPSSysDBColumn.getName()));
				} else if (extParamMap != null && extParamMap.containsKey(iPSSysDBColumn.getName())) {
					arg2.put(this.getRealDBObjName(iPSSysDBColumn.getName()), extParamMap.get(iPSSysDBColumn.getName()));
				}
			}

		}

		String strUpdateSQL = iDBDialect.getUpdateTableSQL(this.getRealDBObjName(mainPSSysDBTable.getName()), arg2.keySet(), keyarg.keySet());
		List<Object> params = new ArrayList<Object>();
		params.addAll(arg2.values());
		params.addAll(keyarg.values());

		int nRet = this.getSysDBSchemeRuntime(false).executeSQL(strUpdateSQL, params);

		for (int i = 1; i < list.size(); i++) {
			IPSSysDBTable iPSSysDBTable = list.get(i);
			IPSSysSearchField iPSSysSearchField = iSysSearchDocRuntime.getPSSysSearchField(iPSSysDBTable.getTableTag(), false);
			// 判断类型
			if (SearchFieldDataType.NESTED.value.equals(iPSSysSearchField.getFieldType()) && ISysSearchDocRuntime.FIELDTAG_NESTED_TEXT_VECTOR.equals(iPSSysSearchField.getFieldTag())) {
				if (!arg.containsKey(iPSSysSearchField.getName())) {
					continue;
				}

				this.getSysDBSchemeRuntime(false).executeSQL(String.format("DELETE FROM %1$s where %2$s = ?", this.getRealDBObjName(iPSSysDBTable.getName()), this.getRealDBObjName("DOC_ID")), Arrays.asList(id));
				Object fieldValue = arg.get(iPSSysSearchField.getName());
				if (ObjectUtils.isEmpty(fieldValue)) {

					continue;
				}

				Map[] value = (Map[]) fieldValue;
				for (int j = 0; j < value.length; j++) {
					Map<String, Object> arg3 = new LinkedHashMap<String, Object>();
					Map item = value[j];

					arg3.put(this.getRealDBObjName("ID"), String.format("%1$s__%2$s", id, j));
					arg3.put(this.getRealDBObjName("DOC_ID"), id);
					arg3.put(this.getRealDBObjName("TEXT"), item.get("text"));
					arg3.put(this.getRealDBObjName("EMBEDDING"), item.get("vector"));

					String strInsertSQL = iDBDialect.getInsertTableSQL(this.getRealDBObjName(iPSSysDBTable.getName()), arg3.keySet());
					this.getSysDBSchemeRuntime(false).executeSQL(strInsertSQL, new ArrayList(arg3.values()));
				}
			}
		}

		return nRet;
	}

	@Override
	protected Object onDelete(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		ISysSearchDocRuntime iSysSearchDocRuntime = this.getSysSearchDocRuntime(strDocName, false);
		List<IPSSysDBTable> list = psSysDBTableListMap.get(strDocName.toUpperCase());
		if (ObjectUtils.isEmpty(list)) {
			throw new Exception("未获取搜索文档相关数据表");
		}

		Object id = arg.get(Entity.KEY);
		if (ObjectUtils.isEmpty(id)) {
			throw new Exception("未传入键值");
		}

		IDBDialect iDBDialect = this.getSysDBSchemeRuntime(false).getDBDialect();
		IPSSysDBTable mainPSSysDBTable = list.get(0);
		List<Object> ret = this.getSysDBSchemeRuntime(false).executeSelectSQL(String.format("SELECT 1 FROM %1$s where %2$s = ? LIMIT 1", this.getRealDBObjName(mainPSSysDBTable.getName()), this.getRealDBObjName("ID")), Arrays.asList(id));
		if (ObjectUtils.isEmpty(ret)) {
			return 0;
		}

		for (int i = 1; i < list.size(); i++) {
			IPSSysDBTable iPSSysDBTable = list.get(i);
			IPSSysSearchField iPSSysSearchField = iSysSearchDocRuntime.getPSSysSearchField(iPSSysDBTable.getTableTag(), false);
			// 判断类型
			if (SearchFieldDataType.NESTED.value.equals(iPSSysSearchField.getFieldType()) && ISysSearchDocRuntime.FIELDTAG_NESTED_TEXT_VECTOR.equals(iPSSysSearchField.getFieldTag())) {

				this.getSysDBSchemeRuntime(false).executeSQL(String.format("DELETE FROM %1$s where %2$s = ?", this.getRealDBObjName(iPSSysDBTable.getName()), this.getRealDBObjName("DOC_ID")), Arrays.asList(id));
			}
		}

		return this.getSysDBSchemeRuntime(false).executeSQL(String.format("DELETE FROM %1$s where %2$s = ?", this.getRealDBObjName(mainPSSysDBTable.getName()), this.getRealDBObjName("ID")), Arrays.asList(id));
	}

	@Override
	protected List<Chunk> onSelectChunks(String docName, IChunkSearchContext iChunkSearchContext) throws Throwable {
		ISysSearchDocRuntime iSysSearchDocRuntime = this.getSysSearchDocRuntime(docName, false);
		List<IPSSysDBTable> list = psSysDBTableListMap.get(docName.toUpperCase());
		if (ObjectUtils.isEmpty(list)) {
			throw new Exception("未获取搜索文档相关数据表");
		}

		List<IPSSysSearchField> psSysSearchFieldList = iSysSearchDocRuntime.getNestedTextVectorFields();
		if (ObjectUtils.isEmpty(psSysSearchFieldList)) {
			throw new Exception("未定义嵌套文本向量属性");
		}

		IDBDialect iDBDialect = this.getSysDBSchemeRuntime(false).getDBDialect();
		IPSSysSearchField iPSSysSearchField = psSysSearchFieldList.get(0);
		IPSSysDBTable iPSSysDBTable = list.get(1);
		List<String> parts = iSysSearchDocRuntime.splitNestedText(iPSSysSearchField, iChunkSearchContext.getQuery());
		Map<String, Chunk> chunkMap = new HashMap<String, Chunk>();
		for (String strPart : parts) {
			// 计算向量值
			double[] queryVector = this.getVector(strPart);
			// float[] queryVector2 = new float[queryVector.length];

			String strSQL = String.format("select t.id,t.doc_id, t.text, (1.0 - (t.embedding <=> '%1$s')/2) as similarity FROM %2$s t where (1.0 - (t.embedding <=> '%1$s')/2) >0.5 order by similarity desc limit 100", JsonUtils.toString(queryVector), iDBDialect.getDBObjStandardName(iPSSysDBTable.getName()));

			List<Object> ret = this.getSysDBSchemeRuntime(false).executeSelectSQL(strSQL, Collections.EMPTY_LIST);
			if (!ObjectUtils.isEmpty(ret)) {
				for (Object item : ret) {
					Map map = (Map) item;

					String strChunkId = DataTypeUtils.asString(map.get("ID"));
					double score = DataTypeUtils.asDouble(map.get("SIMILARITY"), 0.0);
					Chunk last = chunkMap.get(strChunkId);
					if (last != null && last.getSimilarity() > score) {
						continue;
					}

					String docId = DataTypeUtils.asString(map.get("DOC_ID"));
					String strText = DataTypeUtils.asString(map.get("TEXT"));
					last = new Chunk();
					last.setId(strChunkId);
					last.setDocId(docId);
					last.setContent(strText);
					last.setSimilarity(score);
					chunkMap.put(strChunkId, last);
				}
			}
		}

		List<Chunk> chunkList = new ArrayList<Chunk>();
		chunkList.addAll(chunkMap.values());
		Collections.sort(chunkList, new Comparator<Chunk>() {

			@Override
			public int compare(Chunk o1, Chunk o2) {
				return o2.getSimilarity().compareTo(o1.getSimilarity());
			}
		});

		return chunkList;

	}

	protected void onShutdown() throws Exception {
		// try {
		// this.closeESClientPool();
		// } catch (Exception ex) {
		// log.error(String.format("关闭连接池对象发生异常，%1$s", ex.getMessage()), ex);
		// }
		super.onShutdown();
	}
}
