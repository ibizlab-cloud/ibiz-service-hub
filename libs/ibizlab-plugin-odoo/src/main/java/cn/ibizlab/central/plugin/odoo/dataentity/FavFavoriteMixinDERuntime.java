package cn.ibizlab.central.plugin.odoo.dataentity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import cn.ibizlab.central.plugin.odoo.dataentity.dto.FavFavoriteDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.FavFavoriteMixinDTOUtils;
import cn.ibizlab.central.plugin.odoo.util.OdooEmployeeContextUtils;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.database.DBSchemeUtils;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.defield.IDEFGroupRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.annotation.DEAction;
import net.ibizsys.model.PSModelEnums.DEActionMode;
import net.ibizsys.model.PSModelEnums.DEDataQueryViewLevel;
import net.ibizsys.model.PSModelEnums.DEDataSetGroupMode;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.util.DataTypes;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataEntityRuntimeHolder;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.SearchCustomCond;

public class FavFavoriteMixinDERuntime extends OdooAbstractDERuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(FavFavoriteMixinDERuntime.class);
	
	private IDataEntityRuntime favFavoriteDERuntime = null;
	private Map<String, String> dynaTableMap = new ConcurrentHashMap<String, String>();
	
	protected IDataEntityRuntime getFavFavoriteDERuntime() {
		if(this.favFavoriteDERuntime == null) {
			this.favFavoriteDERuntime = this.getSystemRuntime().getDataEntityRuntime("FAV_FAVORITE");
		}
		return this.favFavoriteDERuntime;
	}
	
	@DEAction("add_favorite")
	protected int doAddFavorite(IEntityDTO iEntityDTO) throws Throwable {
		if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
			return 0;
		}
		
		IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
		if(childDataDataEntityRuntime.getSysDBSchemeRuntime() == null) {
			return 0;
		}
		
		IDBDialect iDBDialect = childDataDataEntityRuntime.getSysDBSchemeRuntime().getDBDialect();
		
		//获取插入语句
		String strDynaTable = this.getDynaTable(childDataDataEntityRuntime);
		Object resId = childDataDataEntityRuntime.getKeyFieldValue(iEntityDTO);
		String strKey = KeyValueUtils.genUniqueId(childDataDataEntityRuntime.getLowerCaseName(), resId, OdooEmployeeContextUtils.getParterIdIf(EmployeeContext.getCurrentMust()));
		//判断数据是否存在
		String strSQL = String.format("select 1 from %1$s where %2$s = ?", iDBDialect.getDBObjStandardName(strDynaTable), iDBDialect.getDBObjStandardName(childDataDataEntityRuntime.getKeyPSDEField().getLowerCaseName()));
		
		List<?> list = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSelectSQL(strSQL, Arrays.asList(strKey));
		if(!ObjectUtils.isEmpty(list)) {
			return 0;
		}
		
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put(FavFavoriteDTO.FIELD_ID, strKey);
		map.put(FavFavoriteDTO.FIELD_PARTNER_ID, OdooEmployeeContextUtils.getParterIdIf(EmployeeContext.getCurrentMust()));
		map.put(FavFavoriteDTO.FIELD_RES_MODEL, childDataDataEntityRuntime.getLowerCaseName());
		map.put(FavFavoriteDTO.FIELD_RES_ID, resId);
		map.put(FavFavoriteDTO.FIELD_CREATE_DATE, DateUtils.getCurTime());
		
		//获取插入语句
		strSQL = iDBDialect.getInsertTableSQL(strDynaTable, map.keySet());
		
		int ret = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSQL(strSQL, new ArrayList(map.values()));
		return ret;
	}
	
	@DEAction("remove_favorite")
	protected int doRemoveFavorite(IEntityDTO iEntityDTO) throws Throwable {
		if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
			return 0;
		}
		
		IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
		if(childDataDataEntityRuntime.getSysDBSchemeRuntime() == null) {
			return 0;
		}
		
		IDBDialect iDBDialect = childDataDataEntityRuntime.getSysDBSchemeRuntime().getDBDialect();
		
		//获取插入语句
		String strDynaTable = this.getDynaTable(childDataDataEntityRuntime);
		Object resId = childDataDataEntityRuntime.getKeyFieldValue(iEntityDTO);
		String strKey = KeyValueUtils.genUniqueId(childDataDataEntityRuntime.getLowerCaseName(), resId, OdooEmployeeContextUtils.getParterIdIf(EmployeeContext.getCurrentMust()));
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put(FavFavoriteDTO.FIELD_ID, strKey);
		String strSQL = iDBDialect.getDeleteTableSQL(strDynaTable, map.keySet());
		
		int ret = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSQL(strSQL, new ArrayList(map.values()));
		return ret;
	}
	
	@DEAction("remove_all_favorites")
	protected int doRemoveAllFavorites(IEntityDTO iEntityDTO) throws Throwable {
		if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
			return 0;
		}
		
		IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
		if(childDataDataEntityRuntime.getSysDBSchemeRuntime() == null) {
			return 0;
		}
		
		IDBDialect iDBDialect = childDataDataEntityRuntime.getSysDBSchemeRuntime().getDBDialect();
		
		//获取插入语句
		String strDynaTable = this.getDynaTable(childDataDataEntityRuntime);
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put(FavFavoriteDTO.FIELD_RES_MODEL, childDataDataEntityRuntime.getLowerCaseName());
		map.put(FavFavoriteDTO.FIELD_PARTNER_ID, OdooEmployeeContextUtils.getParterIdIf(EmployeeContext.getCurrentMust()));

		String strSQL = iDBDialect.getDeleteTableSQL(strDynaTable, map.keySet());
		
		int ret = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSQL(strSQL, new ArrayList(map.values()));
		return ret;
	}
	
	@Override
	public void translateSearchContextBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextDTO iSearchContextDTO, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		super.translateSearchContextBeforeProceed(iDataEntityRuntimeContext, iSearchContextDTO, strDataSetName, iPSDEDataSet);
		
		IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)iDataEntityRuntimeContext.getDataEntityRuntime();
		if(childDataDataEntityRuntime.getSysDBSchemeRuntime() == null) {
			return;
		}
		
		IDBDialect iDBDialect = childDataDataEntityRuntime.getSysDBSchemeRuntime().getDBDialect();
		String strDynaTable = this.getDynaTable(childDataDataEntityRuntime);
		
		this.translateSearchContextBeforeProceed(childDataDataEntityRuntime, iSearchContextDTO, iSearchContextDTO, iDBDialect, strDynaTable);
	}
	
	protected void translateSearchContextBeforeProceed(IDataEntityRuntime childDataDataEntityRuntime, ISearchContextDTO iSearchContextDTO, ISearchGroupCond iSearchGroupCond, IDBDialect iDBDialect, String strDynaTable) throws Throwable {
		List<ISearchCond> searchCondList = iSearchGroupCond.getSearchConds();
		if(ObjectUtils.isEmpty(searchCondList)) {
			return;
		}
		
		List<ISearchCond> newSearchCondList = new ArrayList<ISearchCond>();
		for(ISearchCond iSearchCond : searchCondList) {
			if(iSearchCond instanceof ISearchFieldCond) {
				//判断是否为动态属性
				ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
				if(StringUtils.hasLength(iSearchFieldCond.getFieldName()) && FavFavoriteMixinDTOUtils.FIELD_IS_FAVORITE.equalsIgnoreCase(iSearchFieldCond.getFieldName())) {
					
					//附加条件
					Object value = iSearchFieldCond.getValue();
					if(iSearchFieldCond.isParamMode() && value != null) {
						value = iSearchContextDTO.get(value.toString());
					}
					
					if(ObjectUtils.isEmpty(value)) {
						continue;
					}
					
					
					String strKeyExpCode = childDataDataEntityRuntime.getFieldQueryExp(childDataDataEntityRuntime.getKeyPSDEField());
					
					//动态属性，替换为自定义查询
					SearchCustomCond searchCustomCond = new SearchCustomCond();

					String strSql = String.format("SELECT 1 FROM %1$s WHERE %2$s = %1$s.%3$s AND %1$s.%4$s ='%5$s' AND %1$s.%6$s ='%7$s' ",
							iDBDialect.getDBObjStandardName(strDynaTable),
							strKeyExpCode, iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_ID),
							iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_MODEL), childDataDataEntityRuntime.getLowerCaseName(), iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_PARTNER_ID), OdooEmployeeContextUtils.getParterIdIf(EmployeeContext.getCurrentMust()));

					if(value.toString().equals("1")) {
						searchCustomCond.setCustomCond(String.format("EXISTS(%1$s)", strSql));
					}
					else {
						searchCustomCond.setCustomCond(String.format("NOT EXISTS(%1$s)", strSql));
					}

					newSearchCondList.add(searchCustomCond);
					continue;
				}
				newSearchCondList.add(iSearchCond);
				continue;
			}
			newSearchCondList.add(iSearchCond);
			if(iSearchCond instanceof ISearchGroupCond) {
				translateSearchContextBeforeProceed(childDataDataEntityRuntime, iSearchContextDTO, (ISearchGroupCond)iSearchCond, iDBDialect, strDynaTable);
				continue;
			}
		}

		iSearchGroupCond.getSearchConds().clear();
		iSearchGroupCond.getSearchConds().addAll(newSearchCondList);
	}
	
	@Override
	public void translateEntityAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO,	String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
			return;
		}
		
		if(iPSDEAction == null) {
			return;
		}
		
		if(!DEActionMode.UPDATE.value.equals(iPSDEAction.getActionMode())
				&& !DEActionMode.READ.value.equals(iPSDEAction.getActionMode())) {
			return;
		}
		
		IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
		if(childDataDataEntityRuntime.getSysDBSchemeRuntime() == null) {
			return;
		}
		
		if(iEntityDTO == null || iEntityDTO.getDEMethodDTORuntime() == null) {
			return;
		}
		
		IDBDialect iDBDialect = childDataDataEntityRuntime.getSysDBSchemeRuntime().getDBDialect();
		String strDynaTable = this.getDynaTable(childDataDataEntityRuntime);
		Object resId = childDataDataEntityRuntime.getKeyFieldValue(iEntityDTO);
		
		
		if(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(FavFavoriteMixinDTOUtils.FIELD_IS_FAVORITE, true) != null) {
			String strKey = KeyValueUtils.genUniqueId(childDataDataEntityRuntime.getLowerCaseName(), resId, OdooEmployeeContextUtils.getParterIdIf(EmployeeContext.getCurrentMust()));
			String strSQL = String.format("select 1 from %1$s where %2$s = ?", iDBDialect.getDBObjStandardName(strDynaTable), iDBDialect.getDBObjStandardName(childDataDataEntityRuntime.getKeyPSDEField().getLowerCaseName()));
			List<?> list = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSelectSQL(strSQL, Arrays.asList(strKey));
			FavFavoriteMixinDTOUtils.setIsFavorite(iEntityDTO, ObjectUtils.isEmpty(list)?EntityBase.BOOLEAN_FALSE:EntityBase.BOOLEAN_TRUE);
		}
		
		if(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(FavFavoriteMixinDTOUtils.FIELD_FAVORITE_COUNT, true) != null) {
			String strSQL = String.format("select count(1) as cnt from %1$s where %2$s = ? and %3$s = ?", iDBDialect.getDBObjStandardName(strDynaTable), iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_MODEL), iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_ID));
			List<?> list = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSelectSQL(strSQL, Arrays.asList(childDataDataEntityRuntime.getLowerCaseName(), resId));
			int nCnt = 0;
			if(!ObjectUtils.isEmpty(list) && list.get(0) instanceof Map) {
				nCnt = DataTypeUtils.asInteger(((Map)list.get(0)).get("CNT"));
			}
			FavFavoriteMixinDTOUtils.setFavoriteCount(iEntityDTO, nCnt);
		}
		//super.translateEntityAfterProceed(iDataEntityRuntimeContext, iEntityDTO, strActionName, iPSDEAction);
	}

	
	@Override
	public void translateEntitiesAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextDTO iSearchContextDTO, List<? extends IEntityDTO> entityDTOList, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		
		if(ObjectUtils.isEmpty(entityDTOList)) {
			return;
		}
		
		if (iPSDEDataSet.getGroupMode() != DEDataSetGroupMode.NONE.value) {
			return;
		}
		
		IDataEntityRuntime childDataDataEntityRuntime = iDataEntityRuntimeContext.getDataEntityRuntime();
		if(childDataDataEntityRuntime.getSysDBSchemeRuntime() == null) {
			return;
		}

		IDEFGroupRuntime iDEFGroupRuntime = null;
		if (iPSDEDataSet.getViewLevel() == DEDataQueryViewLevel.DEFGROUP.value && iPSDEDataSet.getPSDEFGroup() != null) {
			iDEFGroupRuntime = iDataEntityRuntimeContext.getDataEntityRuntime().getDEFGroupRuntime(iPSDEDataSet.getPSDEFGroup(), false);
		}

//		if (iPSDEDataSet.getViewLevel() != DEDataQueryViewLevel.ALL.value && iDEFGroupRuntime == null)  {
//			return;
//		}
		
		IDBDialect iDBDialect = childDataDataEntityRuntime.getSysDBSchemeRuntime().getDBDialect();
		String strDynaTable = this.getDynaTable(childDataDataEntityRuntime);
		
		IPSDEField isFavoritePSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEField(FavFavoriteMixinDTOUtils.FIELD_IS_FAVORITE);
		IPSDEField favoriteCountPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEField(FavFavoriteMixinDTOUtils.FIELD_FAVORITE_COUNT);
		
		Map<Object, IEntityDTO> entityDTOMap = new HashMap<Object, IEntityDTO>();
		for(IEntityDTO item : entityDTOList) {
			Object key = iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue(item);
			entityDTOMap.put(key, item);
		}
		
		
		if(isFavoritePSDEField != null && (iDEFGroupRuntime == null || iDEFGroupRuntime.contains(isFavoritePSDEField))) {
			
			for(IEntityDTO item : entityDTOList) {
				FavFavoriteMixinDTOUtils.setIsFavorite(item, EntityBase.BOOLEAN_FALSE);
			}
			
			String strSQL = String.format("select %1$s from %2$s where %3$s = '%4$s' and %5$s = '%6$s' and ", 
					iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_ID), 
					iDBDialect.getDBObjStandardName(strDynaTable), 
					iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_MODEL), 
					childDataDataEntityRuntime.getLowerCaseName(),
					iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_PARTNER_ID), 
					OdooEmployeeContextUtils.getParterIdIf(EmployeeContext.getCurrentMust()));
			
			strSQL += iDBDialect.getConditionSQL(FavFavoriteDTO.FIELD_RES_ID, DataTypes.VARCHAR, Conditions.IN, new ArrayList(entityDTOMap.keySet()), false, null);
			List<?> list = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSelectSQL(strSQL, null);
			if(!ObjectUtils.isEmpty(list)) {
				for(Object item : list) {
					if(item instanceof Map) {
						Object resId =((Map)item).get(FavFavoriteDTO.FIELD_RES_ID.toUpperCase());
						IEntityDTO iEntityDTO = entityDTOMap.get(resId);
						if(iEntityDTO!=null) {
							FavFavoriteMixinDTOUtils.setIsFavorite(iEntityDTO, EntityBase.BOOLEAN_TRUE);
						}
					}
				}
			}
		}
		
		if(favoriteCountPSDEField != null && (iDEFGroupRuntime == null || iDEFGroupRuntime.contains(favoriteCountPSDEField))) {
			for(IEntityDTO item : entityDTOList) {
				FavFavoriteMixinDTOUtils.setFavoriteCount(item, 0);
			}
			
			String strSQL = String.format("select %1$s, count(1) as cnt from %2$s where %3$s = '%4$s' and ", 
					iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_ID), 
					iDBDialect.getDBObjStandardName(strDynaTable), 
					iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_MODEL), 
					childDataDataEntityRuntime.getLowerCaseName());
			
			strSQL += iDBDialect.getConditionSQL(FavFavoriteDTO.FIELD_RES_ID, DataTypes.VARCHAR, Conditions.IN, new ArrayList(entityDTOMap.keySet()), false, null);
			strSQL += String.format(" group by %1$s", iDBDialect.getDBObjStandardName(FavFavoriteDTO.FIELD_RES_ID));
			List<?> list = childDataDataEntityRuntime.getSysDBSchemeRuntime().executeSelectSQL(strSQL, null);
			if(!ObjectUtils.isEmpty(list)) {
				for(Object item : list) {
					if(item instanceof Map) {
						Object resId =((Map)item).get(FavFavoriteDTO.FIELD_RES_ID.toUpperCase());
						int nCnt = DataTypeUtils.asInteger(((Map)item).get("CNT"), 0);
						IEntityDTO iEntityDTO = entityDTOMap.get(resId);
						if(iEntityDTO!=null) {
							FavFavoriteMixinDTOUtils.setFavoriteCount(iEntityDTO, nCnt);
						}
					}
				}
			}
		}
		
		
	}
	
	
	protected String getDynaTable(IDataEntityRuntime childDataDataEntityRuntime) throws Exception {
		String strTableName = dynaTableMap.get(childDataDataEntityRuntime.getId());
		if(!StringUtils.hasLength(strTableName)) {
			strTableName = String.format("%1$s_%2$s", this.getFavFavoriteDERuntime().getName(), childDataDataEntityRuntime.getName()).toLowerCase();
			DataSource dataSource = ServiceHub.getInstance().getDataSource((String)childDataDataEntityRuntime.getSysDBSchemeRuntimeMust().getDataSourceTag(), true);
			if(dataSource == null) {
				dataSource = ServiceHub.getInstance().getDefaultDataSource();
			}
			if(!DBSchemeUtils.doesTableExist(dataSource, childDataDataEntityRuntime.getSysDBSchemeRuntimeMust().getDBDialect(), strTableName)) {
				DBSchemeUtils.createTable(dataSource, childDataDataEntityRuntime.getSysDBSchemeRuntimeMust().getDBDialect(), strTableName, this.getFavFavoriteDERuntime().getPSDEFields());
			}
			dynaTableMap.put(childDataDataEntityRuntime.getId(), strTableName);
		}
		return strTableName;
	}
}
