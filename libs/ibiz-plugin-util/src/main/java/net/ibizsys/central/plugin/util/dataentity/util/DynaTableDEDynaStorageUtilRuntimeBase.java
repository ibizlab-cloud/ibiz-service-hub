package net.ibizsys.central.plugin.util.dataentity.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityExtendLogic;
import net.ibizsys.central.plugin.extension.dataentity.util.DEDynaStorageUtilRuntimeBase;
import net.ibizsys.central.plugin.extension.dataentity.util.DEExtensionUtilRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.SearchCustomCond;

/**
 * 动态数据表实体动态功能运行时对象
 * 
 * @author lionlau
 *
 */
public abstract class DynaTableDEDynaStorageUtilRuntimeBase extends DEDynaStorageUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaTableDEDynaStorageUtilRuntimeBase.class);

	private Map<String, Map<String, String>> typePSDEFieldMap = new HashMap<String, Map<String, String>>();

	public final static String DATATYPE_DEFAULT = "default";

	@Override
	protected void onInit() throws Exception {
		this.setStorageDataEntityRuntime(this.getDataEntityRuntime());
		super.onInit();
	}

	@Override
	protected boolean isPrepareStoragePSDEFields() {
		return false;
	}
	
	protected String getDynaTableName(String strType) throws Exception {
		return String.format("%1$s_%2$s", this.getDataEntityRuntime().getTableName(), strType);
	}
	
	@Override
	public int getStorageMode() {
		return STORAGEMODE_EXTERNAL_DYNAMIC_COLUMNS;
	}

	@Override
	protected Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Exception {
		Map<String, IPSDEField> psDEFieldMap = super.getDynaPSDEFields(arg0, strActionName, iPSDEAction);
		if (psDEFieldMap!= null && arg0 instanceof IEntityDTO) {
			IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
			if (dataTypePSDEField == null) {
				this.prepareDynaTable(DATATYPE_DEFAULT, psDEFieldMap);
			} else {
				String strDataType = ((IEntityDTO) arg0).getString(dataTypePSDEField.getLowerCaseName(), null);
				if (!StringUtils.hasLength(strDataType)) {
					IEntityDTO last = getLastEntityIf((IEntityDTO) arg0);
					if (last != null) {
						strDataType = last.getString(dataTypePSDEField.getLowerCaseName(), null);
					}
				}
				if (StringUtils.hasLength(strDataType)) {
					this.prepareDynaTable(strDataType, psDEFieldMap);
				}
			}
		}
		return psDEFieldMap;
	}

	@Override
	protected Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Exception {
		Map<String, IPSDEField> psDEFieldMap = super.getDynaPSDEFields(arg0, strDataSetName, iPSDEDataSet);
		if(psDEFieldMap!= null && arg0 instanceof ISearchContextDTO) {
			String strDataType = this.getDataTypeValue((ISearchContextDTO)arg0);
			if(StringUtils.hasLength(strDataType)) {
				this.prepareDynaTable(strDataType, psDEFieldMap);
			}
		}
		return psDEFieldMap;
	}

	@Override
	protected Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery) throws Exception {
		Map<String, IPSDEField> psDEFieldMap = super.getDynaPSDEFields(arg0, strDataQueryName, iPSDEDataQuery);
		if(psDEFieldMap!= null && arg0 instanceof ISearchContextDTO) {
			String strDataType = this.getDataTypeValue((ISearchContextDTO)arg0);
			if(StringUtils.hasLength(strDataType)) {
				this.prepareDynaTable(strDataType, psDEFieldMap);
			}
		}
		return psDEFieldMap;
	}

	@Override
	protected List<IPSDEField> getExtensionPSDEFields(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Exception {
		if(this.getDEExtensionUtilRuntime() != null) {
			if (arg0 instanceof IEntityDTO) {
				IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
				if (dataTypePSDEField != null) {
					String strDataType = ((IEntityDTO) arg0).getString(dataTypePSDEField.getLowerCaseName(), null);
					if (!StringUtils.hasLength(strDataType)) {
						IEntityDTO last = getLastEntityIf((IEntityDTO) arg0);
						if (last != null) {
							strDataType = last.getString(dataTypePSDEField.getLowerCaseName(), null);
						}
					}
					if (StringUtils.hasLength(strDataType)) {
						return this.getDEExtensionUtilRuntime().getPSDEFields(String.format(DEExtensionUtilRuntimeBase.FIELD_EXTENSION_FORMAT, dataTypePSDEField.getName(), strDataType));
					}
				}
			}
			return this.getDEExtensionUtilRuntime().getPSDEFields(null);
		}
		return null;
	}

	@Override
	protected List<IPSDEField> getExtensionPSDEFields(Object arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Exception {
		if(this.getDEExtensionUtilRuntime() != null) {
			if (arg0 instanceof ISearchContextDTO) {
				IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
				if (dataTypePSDEField != null) {
					String strDataType = getDataTypeValue((ISearchContextDTO)arg0);
					if (StringUtils.hasLength(strDataType)) {
						return this.getDEExtensionUtilRuntime().getPSDEFields(String.format(DEExtensionUtilRuntimeBase.FIELD_EXTENSION_FORMAT, dataTypePSDEField.getName(), strDataType));
					}
				}
			}
			return this.getDEExtensionUtilRuntime().getPSDEFields(null);
		}
		return null;
	}

	@Override
	protected List<IPSDEField> getExtensionPSDEFields(Object arg0, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery) throws Exception {
		if(this.getDEExtensionUtilRuntime() != null) {
			if (arg0 instanceof ISearchContextDTO) {
				IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
				if (dataTypePSDEField != null) {
					String strDataType = getDataTypeValue((ISearchContextDTO)arg0);
					if (StringUtils.hasLength(strDataType)) {
						return this.getDEExtensionUtilRuntime().getPSDEFields(String.format(DEExtensionUtilRuntimeBase.FIELD_EXTENSION_FORMAT, dataTypePSDEField.getName(), strDataType));
					}
				}
			}
			return this.getDEExtensionUtilRuntime().getPSDEFields(null);
		}
		return null;
	}

	protected void prepareDynaTable(String strType, Map<String, IPSDEField> fields) throws Exception {
		if (ObjectUtils.isEmpty(strType)) {
			return;
		}

		String strTableName = this.getDynaTableName(strType);
		Map<String, String> fieldMap = this.typePSDEFieldMap.get(strTableName);
		if (fieldMap == null) {
			// 未存在，查询表及结构模型
			DataSource dataSource = ServiceHub.getInstance().getDataSource((String) this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDataSourceTag(), true);
			if(dataSource == null) {
				dataSource = ServiceHub.getInstance().getDefaultDataSource();
			}
			fieldMap = new ConcurrentHashMap<String, String>();
			if (doesTableExist(dataSource, strTableName)) {
				// 获取列信息
				Map<String, String> columns = this.getTableColumns(dataSource, strTableName);
				fieldMap.putAll(columns);
			} else {
				Map<String, IPSDEField> createTableFields = new LinkedHashMap<String, IPSDEField>();

				// 放入主键
				createTableFields.put(this.getDataEntityRuntime().getKeyPSDEField().getName(), this.getDataEntityRuntime().getKeyPSDEField());
				createTableFields.putAll(fields);
				this.createTable(dataSource, strTableName, createTableFields.values());
				for (String strFieldName : createTableFields.keySet()) {
					fieldMap.put(strFieldName, "");
				}
			}
			this.typePSDEFieldMap.put(strTableName, fieldMap);
		}

		// 判断列是否满足要求
		for (java.util.Map.Entry<String, IPSDEField> entry : fields.entrySet()) {
			if (fieldMap.containsKey(entry.getKey())) {
				continue;
			}
			DataSource dataSource = ServiceHub.getInstance().getDataSource((String) this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDataSourceTag(), true);
			if(dataSource == null) {
				dataSource = ServiceHub.getInstance().getDefaultDataSource();
			}
			this.createColumn(dataSource, strTableName, entry.getValue());
			fieldMap.put(entry.getKey(), "");
		}
	}

	public boolean doesTableExist(DataSource dataSource, String tableName) throws SQLException {
		Connection connection = null;
		DatabaseMetaData meta = null;
		ResultSet tables = null;
		try {
			connection = dataSource.getConnection();
			meta = connection.getMetaData();
			tables = meta.getTables(null, null, tableName.toUpperCase(), new String[] { "TABLE" });
			return tables.next();
		} finally {
			if (tables != null) {
				tables.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	protected Map<String, String> getTableColumns(DataSource dataSource, String tableName) throws SQLException {
		Map<String, String> map = new HashMap<String, String>();
		Connection connection = null;
		DatabaseMetaData meta = null;
		ResultSet tables = null;
		try {
			connection = dataSource.getConnection();
			meta = connection.getMetaData();
			ResultSet columns = meta.getColumns(null, null, tableName.toUpperCase(), null);
			// 遍历结果集并打印每一列的信息
			while (columns.next()) {
				String columnName = columns.getString("COLUMN_NAME");
				String columnType = columns.getString("TYPE_NAME");
				// int dataSize = columns.getInt("COLUMN_SIZE");
				// String defaultValue = columns.getString("COLUMN_DEF");
				// boolean isNullable = columns.getBoolean("NULLABLE");

				map.put(columnName.toUpperCase(), "");
			}

			return map;
		} finally {
			if (tables != null) {
				tables.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	protected void createTable(DataSource dataSource, String strTableName, Collection<IPSDEField> psDEFieldList) throws Exception {
		String strSQL = null;
		try {
			strSQL = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDBDialect().getCreateTableSQL(strTableName, psDEFieldList);
		} catch (Throwable ex) {
			throw new Exception(String.format("获取建立数据表SQL发生异常，%1$s", ex.getMessage()));
		}

		Connection connection = null;
		Statement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(strSQL);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	protected void createColumn(DataSource dataSource, String strTableName, IPSDEField iPSDEField) throws Exception {
		String strSQL = null;
		try {
			strSQL = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDBDialect().getCreateColumnSQL(strTableName, iPSDEField);
		} catch (Throwable ex) {
			throw new Exception(String.format("获取建立数据列SQL发生异常，%1$s", ex.getMessage()));
		}

		Connection connection = null;
		Statement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(strSQL);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	protected IEntityDTO getLastEntityIf(IEntityDTO et) {
		IEntityDTO lastEntity = this.getDataEntityRuntime().getLastEntity();
		if (lastEntity == null) {
			Object key = et.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
			if (!ObjectUtils.isEmpty(key)) {
				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				String strTag = String.format("__LASTENTITYIF__%1$s__%2$s", actionSession.getSessionId(), key);
				Object value = actionSession.getActionParam(strTag);
				if (value == null) {
					lastEntity = this.getDataEntityRuntime().rawSelectOne(this.getDataEntityRuntime().createSearchContext().count(false).eq(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key), true);
					if (lastEntity != null) {
						actionSession.setActionParam(strTag, lastEntity);
					}
				} else {
					lastEntity = (IEntityDTO) value;
				}
			}
		}
		return lastEntity;
	}

	@Override
	protected void onTranslateEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		// TODO Auto-generated method stub
		super.onTranslateEntityDynaFieldsBeforeProceed(arg0, strActionName, iPSDEAction);
	}

	@Override
	protected void onTranslateEntityDynaFieldsAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		Map<String, IPSDEField> dynaPSDEFieldMap;
		if (DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
			dynaPSDEFieldMap = this.getDynaPSDEFields(objRet, strActionName, iPSDEAction);
		} else {
			dynaPSDEFieldMap = this.getDynaPSDEFields(arg0, strActionName, iPSDEAction);
		}
		if (ObjectUtils.isEmpty(dynaPSDEFieldMap)) {
			return;
		}

		IEntityDTO iEntityBase = null;
		if (objRet instanceof IEntityDTO) {
			iEntityBase = (IEntityDTO) objRet;
		} else if (arg0 instanceof IEntityDTO) {
			iEntityBase = (IEntityDTO) arg0;
		}

		if (iEntityBase == null) {
			return;
		}

		Object key = this.getDataEntityRuntime().getFieldValue(iEntityBase, this.getDataEntityRuntime().getKeyPSDEField());

		IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
		String strDataType = null;
		if (dataTypePSDEField == null) {
			strDataType = DATATYPE_DEFAULT;
		} else {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode()) || DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
				strDataType = iEntityBase.getString(dataTypePSDEField.getLowerCaseName(), null);
			} else if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				IEntityDTO last = this.getLastEntityIf(iEntityBase);
				if (last != null) {
					strDataType = last.getString(dataTypePSDEField.getLowerCaseName(), null);
				}
			}
		}

		if (ObjectUtils.isEmpty(strDataType)) {
			return;
		}

		IDBDialect iDBDialect = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDBDialect();
		String strTableName = this.getDynaTableName(strDataType);
		// 进行存储
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strParamKey = String.format("%1$s_%2$s", ACTIONSESSION_DYNAFIELDS_PREFIX, actionSession.getSessionId());
		Object dynaFields = actionSession.getActionParam(strParamKey);
		Map<String, Object> dynaFieldValueMap = null;
		if (dynaFields instanceof Map) {
			dynaFieldValueMap = (Map) dynaFields;
		}
		if (dynaFieldValueMap != null) {
			// 判断旧数据是否存在
			String strSQL = String.format("SELECT 1 FROM %1$s WHERE %2$s = ?", iDBDialect.getDBObjStandardName(strTableName), iDBDialect.getDBObjStandardName(this.getDataEntityRuntime().getKeyPSDEField().getName()));
			boolean bExists = !ObjectUtils.isEmpty(this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().executeSelectSQL(strSQL, Arrays.asList(key)));

			Map<String, Object> storageFieldMap = new HashMap<String, Object>();
			for (IPSDEField iPSDEField : dynaPSDEFieldMap.values()) {
				if (!dynaFieldValueMap.containsKey(iPSDEField.getName())) {
					continue;
				}

				Object value = dynaFieldValueMap.get(iPSDEField.getName());
				storageFieldMap.put(iPSDEField.getName(), value);
			}

			if (!ObjectUtils.isEmpty(storageFieldMap)) {
				storageFieldMap.put(this.getDataEntityRuntime().getKeyPSDEField().getName(), key);
				List<Object> params = new ArrayList<Object>();
				StringBuilder sb = new StringBuilder();
				if (!bExists) {
					sb.append(String.format("INSERT INTO %1$s (\r\n", iDBDialect.getDBObjStandardName(strTableName)));
					boolean bFirst = true;
					for (String strColumn : storageFieldMap.keySet()) {
						if (bFirst) {
							bFirst = false;
						} else {
							sb.append(",");
						}
						sb.append(String.format("%1$s", iDBDialect.getDBObjStandardName(strColumn)));
					}

					sb.append(String.format(") VALUES (\r\n"));

					bFirst = true;
					for (Object value : storageFieldMap.values()) {
						if (bFirst) {
							bFirst = false;
						} else {
							sb.append(",");
						}
						sb.append(String.format("?"));
						params.add(value);
					}
					sb.append(")");
				} else {
					storageFieldMap.remove(this.getDataEntityRuntime().getKeyPSDEField().getName());
					if (!ObjectUtils.isEmpty(storageFieldMap)) {
						sb.append(String.format("UPDATE %1$s SET \r\n", iDBDialect.getDBObjStandardName(strTableName)));
						boolean bFirst = true;
						for (java.util.Map.Entry<String, Object> entry : storageFieldMap.entrySet()) {
							if (bFirst) {
								bFirst = false;
							} else {
								sb.append(",");
							}
							sb.append(String.format("%1$s = ?", iDBDialect.getDBObjStandardName(entry.getKey())));
							params.add(entry.getValue());
						}
						sb.append(String.format(" WHERE \r\n"));

						sb.append(String.format("%1$s = ?", iDBDialect.getDBObjStandardName(this.getDataEntityRuntime().getKeyPSDEField().getName())));
						params.add(key);
					}
				}
				strSQL = sb.toString();
				if (StringUtils.hasLength(strSQL)) {
					this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().executeSQL(strSQL, params);
				}
			}
		}
		
		boolean bFillDefaultMode = true;
		java.util.List<IDataEntityExtendLogic> dataEntityExtendLogicList = this.getDataEntityRuntime().getDataEntityExtendLogics();
		if(!ObjectUtils.isEmpty(dataEntityExtendLogicList)) {
			for(IDataEntityExtendLogic iDataEntityExtendLogic : dataEntityExtendLogicList) {
				IPSDEDataQuery viewPSDEDataQuery = iDataEntityExtendLogic.getViewPSDEDataQuery();
				if(viewPSDEDataQuery == null) {
					bFillDefaultMode = true;
					break;
				}
				
				IPSDEDataQueryCode iPSDEDataQueryCode = iDataEntityExtendLogic.getPSDEDataQueryCode(viewPSDEDataQuery, iDBDialect.getDBType(), true);
				if(iPSDEDataQueryCode == null) {
					bFillDefaultMode = true;
					break;
				}
				
				StringBuilder sb = new StringBuilder();
				sb.append(iPSDEDataQueryCode.getQueryCode());
				
				boolean bFirst = true;
				List<IPSDEDataQueryCodeCond> conds = iPSDEDataQueryCode.getPSDEDataQueryCodeConds();
				if(!ObjectUtils.isEmpty(conds)) {
					for(IPSDEDataQueryCodeCond iPSDEDataQueryCodeCond : conds) {
						if(bFirst) {
							sb.append(" WHERE ");
							bFirst = false;
						}
						else {
							sb.append(" AND ");
						}
						sb.append(iPSDEDataQueryCodeCond.getCustomCond());
					}
				}
				if(bFirst) {
					sb.append(" WHERE ");
					bFirst = false;
				}
				else {
					sb.append(" AND ");
				}
				
				IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iPSDEDataQueryCode.getPSDEDataQueryCodeExp(this.getDataEntityRuntime().getKeyPSDEField().getName(), false);
				sb.append(String.format("%1$s = ?", iPSDEDataQueryCodeExp.getExpression()));
				
				List<?> list = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().executeSelectSQL(sb.toString(), Arrays.asList(key));
				if (!ObjectUtils.isEmpty(list)) {
					if (list.get(0) instanceof Map) {
						Map<String, Object> map = (Map) list.get(0);
						for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
							IPSDEField iPSDEField = dynaPSDEFieldMap.get(entry.getKey().toUpperCase());
							if (iPSDEField == null) {
								if(iEntityBase.contains(entry.getKey().toLowerCase())) {
									continue;
								}
								this.getDataEntityRuntime().setFieldValue(iEntityBase, entry.getKey().toLowerCase(), entry.getValue());
							} else {
								if(iEntityBase.contains(iPSDEField.getLowerCaseName())) {
									continue;
								}
								this.getDataEntityRuntime().setFieldValue(iEntityBase, iPSDEField, entry.getValue());
							}
						}
					}
				}
				
				bFillDefaultMode = false;
			}
		}

		if(!bFillDefaultMode) {
			if(this.getDEExtensionUtilRuntime()!=null) {
				if(ObjectUtils.isEmpty(this.getDEExtensionUtilRuntime().getPSDEFields(null))) {
					return;
				}
			}
			else
				return;
		}
		
		String strSQL = String.format("SELECT * FROM %1$s WHERE %2$s = ?", iDBDialect.getDBObjStandardName(strTableName), iDBDialect.getDBObjStandardName(this.getDataEntityRuntime().getKeyPSDEField().getName()));
		List<?> list = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().executeSelectSQL(strSQL, Arrays.asList(key));
		if (!ObjectUtils.isEmpty(list)) {
			if (list.get(0) instanceof Map) {
				Map<String, Object> map = (Map) list.get(0);
				for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
					IPSDEField iPSDEField = dynaPSDEFieldMap.get(entry.getKey().toUpperCase());
					if (iPSDEField == null) {
						if(iEntityBase.contains(entry.getKey().toLowerCase())) {
							continue;
						}						
						this.getDataEntityRuntime().setFieldValue(iEntityBase, entry.getKey().toLowerCase(), entry.getValue());
					} else {
						if(iEntityBase.contains(iPSDEField.getLowerCaseName())) {
							continue;
						}
						this.getDataEntityRuntime().setFieldValue(iEntityBase, iPSDEField, entry.getValue());
					}
				}
			}
		}
	}

	@Override
	protected void onRemoveEntityDynaFieldsBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		Object key = null;
		if (arg0 instanceof IEntityDTO) {
			key = this.getDataEntityRuntime().getFieldValue((IEntityDTO) arg0, this.getDataEntityRuntime().getKeyPSDEField());
		} else
			key = arg0;

		if (key == null) {
			return;
		}

		IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
		String strDataType = null;
		if (dataTypePSDEField == null) {
			strDataType = DATATYPE_DEFAULT;
		} else {
			IEntityDTO iEntityBase = this.getDataEntityRuntime().createEntity();
			iEntityBase.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			IEntityDTO last = this.getLastEntityIf(iEntityBase);
			if (last != null) {
				strDataType = last.getString(dataTypePSDEField.getLowerCaseName(), null);
			}
		}

		if (ObjectUtils.isEmpty(strDataType)) {
			return;
		}
		//启用逻辑有效忽略删除
		if(this.getDataEntityRuntime().isEnableLogicValid()){
			return;
		}
		
		String strTableName = this.getDynaTableName(strDataType);
		String strOriginTable = this.getDataEntityRuntime().getTableName();
		if(DataTypeUtils.compare(strTableName, strOriginTable) != 0) {
			IDBDialect iDBDialect = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDBDialect();
			String strSQL = String.format("DELETE FROM %1$s WHERE %2$s = ?", iDBDialect.getDBObjStandardName(strTableName), iDBDialect.getDBObjStandardName(this.getDataEntityRuntime().getKeyPSDEField().getName()));
			this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().executeSQL(strSQL, Arrays.asList(arg0));
		}
	}

	@Override
	protected void translateSearchContextDynaFields(ISearchContextDTO iSearchContextDTO, ISearchGroupCond iSearchGroupCond, Map<String, IPSDEField> dynaPSDEFieldMap) throws Throwable {
		String strDataType = getDataTypeValue(iSearchContextDTO);
		if (!StringUtils.hasLength(strDataType)) {
			return;
		}
		String strTableName = this.getDynaTableName(strDataType);

		this.translateSearchContextDynaFields(strTableName, iSearchContextDTO, iSearchGroupCond, dynaPSDEFieldMap);

	}

	protected String getDataTypeValue(ISearchContextDTO iSearchContextDTO) throws Exception {
		IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
		String strDataType = null;
		if (dataTypePSDEField == null) {
			strDataType = DATATYPE_DEFAULT;
		} else {
			List<ISearchCond> searchCondList = iSearchContextDTO.getSearchConds();
			if (ObjectUtils.isEmpty(searchCondList)) {
				return null;
			}
			ISearchGroupCond filterSearchGroupCond = null;
			for (ISearchCond iSearchCond : searchCondList) {
				if (iSearchCond instanceof ISearchFieldCond) {
					ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
					if (dataTypePSDEField.getName().equalsIgnoreCase(iSearchFieldCond.getFieldName()) && Conditions.EQ.equalsIgnoreCase(iSearchFieldCond.getCondOp()) && !StringUtils.hasLength(iSearchFieldCond.getValueFunc())) {
						if (iSearchFieldCond.isParamMode()) {
							strDataType = DataTypeUtils.asString(iSearchContextDTO.get((String) iSearchFieldCond.getValue()));
						} else {
							strDataType = DataTypeUtils.asString(iSearchFieldCond.getValue());
						}
						break;
					}
				}

				if (filterSearchGroupCond == null && iSearchCond instanceof ISearchGroupCond) {
					if (ISearchGroupCond.CAT_FILTER.equals(((ISearchGroupCond) iSearchCond).getCat())) {
						filterSearchGroupCond = (ISearchGroupCond) iSearchCond;
					}
				}
			}

			if (!StringUtils.hasLength(strDataType) && filterSearchGroupCond != null && !ObjectUtils.isEmpty(filterSearchGroupCond.getSearchConds())) {
				for (ISearchCond iSearchCond : filterSearchGroupCond.getSearchConds()) {
					if (iSearchCond instanceof ISearchFieldCond) {
						ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
						if (dataTypePSDEField.getName().equalsIgnoreCase(iSearchFieldCond.getFieldName()) && Conditions.EQ.equalsIgnoreCase(iSearchFieldCond.getCondOp()) && !StringUtils.hasLength(iSearchFieldCond.getValueFunc())) {
							if (iSearchFieldCond.isParamMode()) {
								strDataType = DataTypeUtils.asString(iSearchContextDTO.get((String) iSearchFieldCond.getValue()));
							} else {
								strDataType = DataTypeUtils.asString(iSearchFieldCond.getValue());
							}
							break;
						}
					}
				}
			}
		}

		return strDataType;
	}

	protected void translateSearchContextDynaFields(String strTableName, ISearchContextDTO iSearchContextDTO, ISearchGroupCond iSearchGroupCond, Map<String, IPSDEField> dynaPSDEFieldMap) throws Throwable {
		List<ISearchCond> searchCondList = iSearchGroupCond.getSearchConds();
		if (ObjectUtils.isEmpty(searchCondList)) {
			return;
		}

		String strKeyExpCode = this.getDataEntityRuntime().getFieldQueryExp(this.getDataEntityRuntime().getKeyPSDEField());

		List<ISearchCond> newSearchCondList = new ArrayList<ISearchCond>();
		for (ISearchCond iSearchCond : searchCondList) {
			if (iSearchCond instanceof ISearchFieldCond) {
				// 判断是否为动态属性
				ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
				if (StringUtils.hasLength(iSearchFieldCond.getFieldName())) {
					IPSDEField dynaPSDEField = dynaPSDEFieldMap.get(iSearchFieldCond.getFieldName().toUpperCase());
					if (dynaPSDEField != null) {
						// 动态属性，替换为自定义查询
						SearchCustomCond searchCustomCond = new SearchCustomCond();

						String strSql = String.format("SELECT 1 FROM %1$s WHERE %2$s = %1$s.%3$s AND ", getDBDialect().getDBObjStandardName(strTableName), strKeyExpCode, getDBDialect().getDBObjStandardName(this.getDataEntityRuntime().getKeyPSDEField().getName()));

						// 附加条件
						Object value = iSearchFieldCond.getValue();
						if (iSearchFieldCond.isParamMode() && value != null) {
							value = iSearchContextDTO.get(value.toString());
						}

						strSql += getDBDialect().getConditionSQL(String.format("%1$s.%2$s", getDBDialect().getDBObjStandardName(strTableName), getDBDialect().getDBObjStandardName(dynaPSDEField.getName())), dynaPSDEField.getStdDataType(), iSearchFieldCond.getCondOp(), value, false, null);

						searchCustomCond.setCustomCond(String.format("EXISTS(%1$s)", strSql));

						newSearchCondList.add(searchCustomCond);
						continue;
					}
				}
				newSearchCondList.add(iSearchCond);
				continue;
			}
			newSearchCondList.add(iSearchCond);
			if (iSearchCond instanceof ISearchGroupCond) {
				translateSearchContextDynaFields(strTableName, iSearchContextDTO, (ISearchGroupCond) iSearchCond, dynaPSDEFieldMap);
				continue;
			}
		}

		iSearchGroupCond.getSearchConds().clear();
		iSearchGroupCond.getSearchConds().addAll(newSearchCondList);
	}

	@Override
	protected void fillEntityDTODynaFields(ISearchContextBase arg0, List<? extends IEntityDTO> list, Map<String, IPSDEField> dynaPSDEFieldMap) throws Throwable {
		if (ObjectUtils.isEmpty(list)) {
			return;
		}

		String strDataType = getDataTypeValue((ISearchContextDTO) arg0);
		if (!StringUtils.hasLength(strDataType)) {
			return;
		}
		
		String strTableName = this.getDynaTableName(strDataType);

		String strKeyName = this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName();

		Map<Object, IEntityDTO> entityDTOMap = new LinkedHashMap<Object, IEntityDTO>();
		for (IEntityDTO iEntityDTO : list) {
			Object objKeyValue = iEntityDTO.get(strKeyName);
			if (ObjectUtils.isEmpty(objKeyValue)) {
				continue;
			}
			entityDTOMap.put(objKeyValue, iEntityDTO);
		}

		if (ObjectUtils.isEmpty(entityDTOMap)) {
			return;
		}

		IDBDialect iDBDialect = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDBDialect();
		
		boolean bFillDefaultMode = true;
		java.util.List<IDataEntityExtendLogic> dataEntityExtendLogicList = this.getDataEntityRuntime().getDataEntityExtendLogics();
		if(!ObjectUtils.isEmpty(dataEntityExtendLogicList)) {
			for(IDataEntityExtendLogic iDataEntityExtendLogic : dataEntityExtendLogicList) {
				IPSDEDataQuery viewPSDEDataQuery = iDataEntityExtendLogic.getViewPSDEDataQuery();
				if(viewPSDEDataQuery == null) {
					bFillDefaultMode = true;
					break;
				}
				
				IPSDEDataQueryCode iPSDEDataQueryCode = iDataEntityExtendLogic.getPSDEDataQueryCode(viewPSDEDataQuery, iDBDialect.getDBType(), true);
				if(iPSDEDataQueryCode == null) {
					bFillDefaultMode = true;
					break;
				}
				
				StringBuilder sb = new StringBuilder();
				sb.append(iPSDEDataQueryCode.getQueryCode());
				
				boolean bFirst = true;
				List<IPSDEDataQueryCodeCond> conds = iPSDEDataQueryCode.getPSDEDataQueryCodeConds();
				if(!ObjectUtils.isEmpty(conds)) {
					for(IPSDEDataQueryCodeCond iPSDEDataQueryCodeCond : conds) {
						if(bFirst) {
							sb.append(" WHERE ");
							bFirst = false;
						}
						else {
							sb.append(" AND ");
						}
						sb.append(iPSDEDataQueryCodeCond.getCustomCond());
					}
				}
				if(bFirst) {
					sb.append(" WHERE ");
					bFirst = false;
				}
				else {
					sb.append(" AND ");
				}
				
				IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iPSDEDataQueryCode.getPSDEDataQueryCodeExp(this.getDataEntityRuntime().getKeyPSDEField().getName(), false);
				sb.append(String.format("%1$s IN (", iPSDEDataQueryCodeExp.getExpression()));
				bFirst = true;
				List<Object> params = new ArrayList<Object>();
				for (Object key : entityDTOMap.keySet()) {

					if (bFirst) {
						bFirst = false;
					} else {
						sb.append(",");
					}
					sb.append(String.format("?"));
					params.add(key);
				}
				sb.append(")");
				
				List<?> allList = this.getStorageDataEntityRuntime().getSysDBSchemeRuntimeMust().executeSelectSQL(sb.toString(), params);

				if (!ObjectUtils.isEmpty(allList)) {
					for (Object item : allList) {
						Entity entity = new Entity(item);
						Object keyValue = entity.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
						if (ObjectUtils.isEmpty(keyValue)) {
							continue;
						}

						IEntityDTO iEntityDTO = entityDTOMap.get(keyValue);
						if (iEntityDTO == null) {
							continue;
						}

						java.util.Map<String, Object> map = entity.any();

						for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
							IPSDEField iPSDEField = dynaPSDEFieldMap.get(entry.getKey().toUpperCase());
							if (iPSDEField == null) {
								if(iEntityDTO.contains(entry.getKey().toLowerCase())) {
									continue;
								}
								this.getDataEntityRuntime().setFieldValue(iEntityDTO, entry.getKey().toLowerCase(), entry.getValue());
							} else {
								if(iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
									continue;
								}
								this.getDataEntityRuntime().setFieldValue(iEntityDTO, iPSDEField, entry.getValue());
							}
						}
					}
				}
				
				bFillDefaultMode = false;
			}
		}
		
		if(!bFillDefaultMode) {
			if(this.getDEExtensionUtilRuntime()!=null) {
				if(ObjectUtils.isEmpty(this.getDEExtensionUtilRuntime().getPSDEFields(null))) {
					return;
				}
			}
			else
				return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("SELECT * FROM %1$s WHERE %2$s IN (", iDBDialect.getDBObjStandardName(strTableName), iDBDialect.getDBObjStandardName(this.getDataEntityRuntime().getKeyPSDEField().getName())));

		boolean bFirst = true;
		List<Object> params = new ArrayList<Object>();
		for (Object key : entityDTOMap.keySet()) {

			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(",");
			}
			sb.append(String.format("?"));
			params.add(key);
		}
		sb.append(")");

		List<?> allList = this.getStorageDataEntityRuntime().getSysDBSchemeRuntimeMust().executeSelectSQL(sb.toString(), params);

		if (!ObjectUtils.isEmpty(allList)) {
			for (Object item : allList) {
				Entity entity = new Entity(item);
				Object keyValue = entity.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
				if (ObjectUtils.isEmpty(keyValue)) {
					continue;
				}

				IEntityDTO iEntityDTO = entityDTOMap.get(keyValue);
				if (iEntityDTO == null) {
					continue;
				}

				java.util.Map<String, Object> map = entity.any();

				for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
					IPSDEField iPSDEField = dynaPSDEFieldMap.get(entry.getKey().toUpperCase());
					if (iPSDEField == null) {
						if(iEntityDTO.contains(entry.getKey().toLowerCase())) {
							continue;
						}
						this.getDataEntityRuntime().setFieldValue(iEntityDTO, entry.getKey().toLowerCase(), entry.getValue());
					} else {
						if(iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
							continue;
						}
						this.getDataEntityRuntime().setFieldValue(iEntityDTO, iPSDEField, entry.getValue());
					}
				}
			}
		}

	}
}
