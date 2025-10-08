package net.ibizsys.central.plugin.mybatisplus.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;

import net.ibizsys.runtime.util.*;
import org.apache.commons.collections.map.CaseInsensitiveMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import net.ibizsys.central.database.IDBDataService;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntimeContext;
import net.ibizsys.central.database.ISysDBTableRuntime;
import net.ibizsys.central.database.SysDBSchemeRuntime;
import net.ibizsys.central.database.SysDBSchemeRuntimeException;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.plugin.mybatisplus.spring.mapper.MybatisDbDataMapper;
import net.ibizsys.central.plugin.mybatisplus.util.DBSchemeContextHolder;
import net.ibizsys.central.plugin.mybatisplus.util.GroupQuery;
import net.ibizsys.central.plugin.mybatisplus.util.MybatisSqlUtil;
import net.ibizsys.central.plugin.mybatisplus.util.oldsql.SqlCodeUtil;
import net.ibizsys.central.security.IUserContextRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.ds.DEDataSetGroupModes;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;

@Service("DBDataService")
public class MybatisDbDataService implements IDBDataService {

	private Log log = LogFactory.getLog(MybatisDbDataService.class);

	private String regex = "\\?";
	private Pattern pattern = Pattern.compile(regex);

	@Autowired
	private MybatisDbDataMapper dbDataMapper;

	@Value("${ibiz.db.batchsize:1000}")
	private int batchSize;

	@Value("${ibiz.db.batchmode:MULTISQL}")
	private String batchMode;

	@Value("${ibiz.db.createbatchmode:}")
	private String createBatchMode;

	@Value("${ibiz.db.updatebatchmode:}")
	private String updateBatchMode;

	@Autowired
	SqlSession sqlSession;

	@PostConstruct
	public void postConstruct() {
		SysDBSchemeRuntime.setDefaultDBDataService(this);
	}

	@Override
	public int insert(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, List args) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			if (!StringUtils.isEmpty(args)) {
				int size = args.size();
				if (size == 1) {
					Object arg = args.get(0);
					return this.insert(iSysDBSchemeRuntimeContext, iSysDBTableRuntime, (SqlCommandParam) arg);
				} else {
					// 批更新处理
					int ret = 0;
					Long cur = System.currentTimeMillis();
					List batchData = new ArrayList();
					for (int i = 0; i < args.size(); i++) {
						batchData.add(args.get(i));
						if (batchSize == batchData.size() || i == args.size() - 1) {
							int num = 0;
							if ("SINGLESQL".equals(StringUtils.isEmpty(this.createBatchMode) ? batchMode : this.createBatchMode)) {
								List<List<SqlParam>> batchDataList = new ArrayList<>();
								List<String> includeColumns = new ArrayList<>();
								//包含的字段 避免太多空字段
								for (String column : iSysDBTableRuntime.getColumns().keySet()) {
									if (batchData.stream().anyMatch(arg -> {
										SqlCommandParam sqlCommandParam = (SqlCommandParam) arg;
										for (SqlParam value : sqlCommandParam.getValues()) {
											if (value.getName().equals(iSysDBTableRuntime.getColumns().get(column).getStandardName())) {
												return true;
											}
										}
										return false;
									})) {
										includeColumns.add(iSysDBTableRuntime.getColumns().get(column).getStandardName());
									}
								}

								for (Object arg : batchData) {
									List<SqlParam> sqlParamList = new ArrayList<>();
									for (String column : includeColumns) {
										SqlCommandParam sqlCommandParam = (SqlCommandParam) arg;
										boolean has = false;
										for (SqlParam value : sqlCommandParam.getValues()) {
											if (value.getName().equals(column)) {
												has = true;
												sqlParamList.add(value);
												break;
											}
										}
										if (!has)
											sqlParamList.add(null);
									}
									batchDataList.add(sqlParamList);
								}
								num = this.dbDataMapper.batchInsertDataSingleSQL(iSysDBTableRuntime, includeColumns, batchDataList);
							} else if ("MULTISQL".equals(StringUtils.isEmpty(this.createBatchMode) ? batchMode : this.createBatchMode)) {
								num = this.dbDataMapper.batchInsertData(iSysDBTableRuntime, batchData);
							} else {
								throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "未支持的批处理模式：" + (StringUtils.isEmpty(this.createBatchMode) ? batchMode : this.createBatchMode));
							}
							ret += num;
							batchData.clear();
						}
					}
					log.debug(String.format("批处理创建[%1$s]耗时[%2$s]ms", args.size(), System.currentTimeMillis() - cur));
					return ret;
				}
			}
			return 0;
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public int update(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, List args) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			if (!StringUtils.isEmpty(args)) {
				int size = args.size();
				if (size == 1) {
					Object arg = args.get(0);
					return this.update(iSysDBSchemeRuntimeContext, iSysDBTableRuntime, (SqlCommandParam) arg);
				} else {
					// 批更新处理
					int ret = 0;
					Long cur = System.currentTimeMillis();
					List batchData = new ArrayList();
					for (int i = 0; i < args.size(); i++) {
						batchData.add(args.get(i));
						if (batchSize == batchData.size() || i == args.size() - 1) {
							int num = 0;
							if ("SINGLESQL".equals(StringUtils.isEmpty(this.updateBatchMode) ? batchMode : this.updateBatchMode)) {
								Map<String, Map<Object, SqlParam>> sqlParamMap = new HashMap<>();
								List keys = new ArrayList();
								for (Object arg : batchData) {
									SqlCommandParam sqlCommandParam = (SqlCommandParam) arg;
									for (SqlParam value : sqlCommandParam.getValues()) {
										//ORACLE中CLOB (case when id=1 then 字符串 else 字段) 需要to_clob()处理
										if(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType().equals(DBTypes.ORACLE)) {
											if (iSysDBTableRuntime.getColumns().containsKey(value.getName())) {
												value.setDataType(iSysDBTableRuntime.getColumns().get(value.getName()).getStdDataType());
											}
										}
										if (!sqlParamMap.containsKey(value.getName()))
											sqlParamMap.put(value.getName(), new HashMap<>());
										Object key = null;
										for (SqlParam condition : sqlCommandParam.getConditions()) {
											key = condition.getValue();
										}
										if (key == null)
											continue;
										if (!sqlParamMap.get(value.getName()).containsKey(key)) {
											if (!keys.contains(key)) {
												keys.add(key);
											}
											sqlParamMap.get(value.getName()).put(key, value);
										}
									}
								}
								num = this.dbDataMapper.batchUpdateDataSingleSQL(iSysDBTableRuntime, keys, sqlParamMap);
							} else if ("MULTISQL".equals(StringUtils.isEmpty(this.updateBatchMode) ? batchMode : this.updateBatchMode)) {
								num = this.dbDataMapper.batchUpdateData(iSysDBTableRuntime, batchData);
							} else {
								throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "未支持的批处理模式：" + (StringUtils.isEmpty(this.updateBatchMode) ? batchMode : this.updateBatchMode));
							}
							ret += num;
							batchData.clear();
						}
					}
					log.debug(String.format("批处理更新[%1$s]耗时[%2$s]ms", args.size(), System.currentTimeMillis() - cur));
					return ret;
				}
			}
			return 0;
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public int delete(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, List args) throws Throwable {
		int retSize = 0;
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			if (!StringUtils.isEmpty(args)) {
				int size = args.size();
				if (size == 1) {
					Object arg = args.get(0);
					return this.delete(iSysDBSchemeRuntimeContext, iSysDBTableRuntime, (SqlCommandParam) arg);
				} else {
					int ret = 0;
					Long cur = System.currentTimeMillis();
					List batchRemoveData = new ArrayList();
					for (int i = 0; i < args.size(); i++) {
						SqlCommandParam sqlCommandParam = (SqlCommandParam) args.get(i);
						for (SqlParam value : sqlCommandParam.getConditions()) {
							batchRemoveData.add(value.getValue());
						}
						if (batchSize == batchRemoveData.size() || i == args.size() - 1) {
							int num = 0;
							num = this.dbDataMapper.batchRemoveData(iSysDBTableRuntime, batchRemoveData);
							ret += num;
							batchRemoveData.clear();
						}
					}
					log.debug(String.format("批删除[%1$s]耗时[%2$s]ms", args.size(), System.currentTimeMillis() - cur));
					return ret;
				}
			}
			return retSize;
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public int insert(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			return this.dbDataMapper.insertData(iSysDBTableRuntime, arg);
		} catch (DataIntegrityViolationException e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public int update(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			return this.dbDataMapper.updateData(iSysDBTableRuntime, arg);
		} catch (DataIntegrityViolationException e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public int delete(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			return this.dbDataMapper.removeData(iSysDBTableRuntime, arg);
		} catch (DataIntegrityViolationException e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.DELETEREJECT, e);
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public org.springframework.data.domain.Page<?> select(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			QueryWrapper<Object> query = new QueryWrapper<>();
			// 分组数据集合处理
			if (iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.GROUPPARAMS || iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.GROUPPARAMSEX || iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.DERAGGDATA) {
				return selectGroup(iSysDBSchemeRuntimeContext, iDataEntityRuntime, iPSDEDataSet, iSearchContext);
			}
			String sql = MybatisSqlUtil.composeDataSet(this, iDataEntityRuntime, iPSDEDataSet, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), iSearchContext, query);
			//替换旧版本
			sql = sql.replace("#{srf.", "#{ctx.");
			sql = sql.replace("${srf.", "#{ctx.");
			if(sql.indexOf("${srf")!=-1) {
				sql = SqlCodeUtil.parse(sql);
			}
			// 生成分页
			Page<?> page = MybatisSqlUtil.composePage(iDataEntityRuntime, iPSDEDataSet, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), iSearchContext);
			// 传入上下文忽略大小写 Map
			Map<String, Object> dataMap = new CaseInsensitiveMap();
			if (iSearchContext.any() != null)
				dataMap.putAll(iSearchContext.any());

			Map<String, Object> data = new HashMap();
			data.put("datacontext", dataMap);
			data.put("globalcontext", new HashMap<String, Object>());
			IUserContext iUserContext = UserContext.getCurrent();
			if (iUserContext != null && iUserContext instanceof IUserContextRuntime) {
				IUserContextRuntime iUserContextRuntime = (IUserContextRuntime) iUserContext;
				data.put("sessioncontext", iUserContextRuntime.getSessionParams());
			}
			data.put("systemcontext", SystemContextUtils.getInstance().getParams(null));
			data.put("webcontext", dataMap);

			//查询别名加入参数
			Map<String, Object> alias = new HashMap();
			data.put("alias", alias);
			for (IPSDEDataQuery iPSDEDataQuery : iPSDEDataSet.getPSDEDataQueries()) {
				IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = iDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), true);
				if (iDEDataQueryCodeRuntime != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode() != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps() != null) {
					iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps().forEach(iPSDEDataQueryCodeExp -> {
						String codeExpName = iPSDEDataQueryCodeExp.getName();
						if(codeExpName.startsWith("ALIAS.")){
							String aliasName = codeExpName.substring(6);
							alias.put(aliasName, iPSDEDataQueryCodeExp.getExpression());
						}
					});
				}
			}

			//将动态sql解析成普通sql
			sql= MybatisSqlUtil.convertSQL(sql, data, sqlSession);
			// 查询数据
			Page<Map<String, Object>> resultPage = this.dbDataMapper.queryData(page, query, sql, data);
			// 创建返回的分页数据
			PageImpl<?> newPage = new PageImpl<Map<String, Object>>(resultPage.getRecords(), iSearchContext.getPageable() != null ? iSearchContext.getPageable() : PageRequest.of(0, 10), resultPage.getTotal());
			return newPage;
		} catch (Exception e) {
			log.error(e);
			throw new DataEntityRuntimeException(iDataEntityRuntime, "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	public org.springframework.data.domain.Page<?> selectGroup(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext) throws Throwable {
		QueryWrapper<Object> query = new QueryWrapper<>();

		// 传入上下文忽略大小写 Map
		Map<String, Object> dataMap = new CaseInsensitiveMap();
		if (iSearchContext.any() != null)
			dataMap.putAll(iSearchContext.any());

		Map<String, Object> data = new HashMap();
		data.put("datacontext", dataMap);
		data.put("globalcontext", new HashMap<String, Object>());
		IUserContext iUserContext = UserContext.getCurrent();
		if (iUserContext != null && iUserContext instanceof IUserContextRuntime) {
			IUserContextRuntime iUserContextRuntime = (IUserContextRuntime) iUserContext;
			data.put("sessioncontext", iUserContextRuntime.getSessionParams());
		}
		data.put("systemcontext", new HashMap<String, Object>());
		data.put("webcontext", dataMap);
		//查询别名加入参数
		Map<String, Object> alias = new HashMap();
		data.put("alias", alias);
		for (IPSDEDataQuery iPSDEDataQuery : iPSDEDataSet.getPSDEDataQueries()) {
			IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = iDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), true);
			if (iDEDataQueryCodeRuntime != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode() != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps() != null) {
				iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps().forEach(iPSDEDataQueryCodeExp -> {
					String codeExpName = iPSDEDataQueryCodeExp.getName();
					if(codeExpName.startsWith("ALIAS.")){
						String aliasName = codeExpName.substring(6);
						alias.put(aliasName, iPSDEDataQueryCodeExp.getExpression());
					}
				});
			}
		}
		Page<?> page = MybatisSqlUtil.composePage(iDataEntityRuntime, iPSDEDataSet, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), iSearchContext);
		GroupQuery groupQuery = MybatisSqlUtil.getGroupQuery(this, iSysDBSchemeRuntimeContext, iDataEntityRuntime, iPSDEDataSet, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), iSearchContext);
		//将动态sql解析成普通sql
		groupQuery.setDatasql(MybatisSqlUtil.convertSQL(groupQuery.getDatasql(), data, sqlSession));
		Page<Map<String, Object>> resultPage = this.dbDataMapper.queryGroupData(page, query, groupQuery, data);
		// 创建返回的分页数据
		PageImpl<?> newPage = new PageImpl<Map<String, Object>>(resultPage.getRecords(), iSearchContext.getPageable() != null ? iSearchContext.getPageable() : PageRequest.of(0, 10), resultPage.getTotal());
		return newPage;
	}

	@Override
	public List<?> select(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			QueryWrapper<Object> query = new QueryWrapper<>();
			Page<?> page = MybatisSqlUtil.composePage(iDataEntityRuntime, iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), iSearchContext);
			page.setSearchCount(false);
			// 传入上下文忽略大小写 Map
			Map<String, Object> dataMap = new CaseInsensitiveMap();
			if (iSearchContext.any() != null)
				dataMap.putAll(iSearchContext.any());

			// 组合查询 sql
			IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = iDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), false);
			String sql = MybatisSqlUtil.composeDataQuery(this, iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query);
			//替换旧版本
			sql = sql.replace("#{srf.", "#{ctx.");
			sql = sql.replace("${srf.", "#{ctx.");
			if(sql.indexOf("${srf")!=-1) {
				sql = SqlCodeUtil.parse(sql);
			}

			Map<String, Object> data = new HashMap();
			data.put("datacontext", dataMap);
			data.put("globalcontext", new HashMap<String, Object>());
			IUserContext iUserContext = UserContext.getCurrent();
			if (iUserContext != null && iUserContext instanceof IUserContextRuntime) {
				IUserContextRuntime iUserContextRuntime = (IUserContextRuntime) iUserContext;
				data.put("sessioncontext", iUserContextRuntime.getSessionParams());
			}
			data.put("systemcontext", SystemContextUtils.getInstance().getParams(null));
			data.put("webcontext", dataMap);
			//查询别名加入参数
			Map<String, Object> alias = new HashMap();
			data.put("alias", alias);
			if (iDEDataQueryCodeRuntime != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode() != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps() != null) {
				iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps().forEach(iPSDEDataQueryCodeExp -> {
					String codeExpName = iPSDEDataQueryCodeExp.getName();
					if(codeExpName.startsWith("ALIAS.")){
						String aliasName = codeExpName.substring(6);
						alias.put(aliasName, iPSDEDataQueryCodeExp.getExpression());
					}
				});
			}
			//将动态sql解析成普通sql
			sql= MybatisSqlUtil.convertSQL(sql, data, sqlSession);
			// 查询数据
			List<Map<String, Object>> items = this.dbDataMapper.queryData(page, query, sql, data).getRecords();
			return items;
		} catch (Exception e) {
			log.error(e);
			throw new DataEntityRuntimeException(iDataEntityRuntime, "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public org.springframework.data.domain.Page<?> select2(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			QueryWrapper<Object> query = new QueryWrapper<>();
			Page<?> page = MybatisSqlUtil.composePage(iDataEntityRuntime, iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), iSearchContext);
			// 传入上下文忽略大小写 Map
			Map<String, Object> dataMap = new CaseInsensitiveMap();
			if (iSearchContext.any() != null)
				dataMap.putAll(iSearchContext.any());

			// 组合查询 sql
			IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = iDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), false);
			String sql = MybatisSqlUtil.composeDataQuery(this, iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query);
			//替换旧版本
			sql = sql.replace("#{srf.", "#{ctx.");
			sql = sql.replace("${srf.", "#{ctx.");
			if(sql.indexOf("${srf")!=-1) {
				sql = SqlCodeUtil.parse(sql);
			}

			Map<String, Object> data = new HashMap();
			data.put("datacontext", dataMap);
			data.put("globalcontext", new HashMap<String, Object>());
			IUserContext iUserContext = UserContext.getCurrent();
			if (iUserContext != null && iUserContext instanceof IUserContextRuntime) {
				IUserContextRuntime iUserContextRuntime = (IUserContextRuntime) iUserContext;
				data.put("sessioncontext", iUserContextRuntime.getSessionParams());
			}
			data.put("systemcontext", SystemContextUtils.getInstance().getParams(null));
			data.put("webcontext", dataMap);
			//查询别名加入参数
			Map<String, Object> alias = new HashMap();
			data.put("alias", alias);
			if (iDEDataQueryCodeRuntime != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode() != null && iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps() != null) {
				iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getPSDEDataQueryCodeExps().forEach(iPSDEDataQueryCodeExp -> {
					String codeExpName = iPSDEDataQueryCodeExp.getName();
					if(codeExpName.startsWith("ALIAS.")){
						String aliasName = codeExpName.substring(6);
						alias.put(aliasName, iPSDEDataQueryCodeExp.getExpression());
					}
				});
			}
			//将动态sql解析成普通sql
			sql= MybatisSqlUtil.convertSQL(sql, data, sqlSession);
			// 查询数据
			//List<Map<String, Object>> items =      this.dbDataMapper.queryData(page, query, sql, data).getRecords();
			Page<Map<String, Object>> resultPage = this.dbDataMapper.queryData(page, query, sql, data);
			PageImpl<?> newPage = new PageImpl<Map<String, Object>>(resultPage.getRecords(), iSearchContext.getPageable() != null ? iSearchContext.getPageable() : PageRequest.of(0, 10), resultPage.getTotal());
			return newPage;
		} catch (Exception e) {
			log.error(e);
			throw new DataEntityRuntimeException(iDataEntityRuntime, "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}
	@Override
	public List<?> select(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			return this.dbDataMapper.selectData(iSysDBTableRuntime, arg);
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public Object selectOne(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			return null;
		} catch (Exception e) {
			log.error(e);
			throw new SysDBSchemeRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	/**
	 * list条件转换
	 *
	 * @param params
	 * @return
	 */
	private Map<String, Object> convertListParam(List<Object> params) {
		Map<String, Object> mapParams = new HashMap<>();
		if (params != null) {
			for (int i = 0; i < params.size(); i++) {
				mapParams.put(String.valueOf(i), params.get(i));
			}
		}
		return mapParams;
	}

	@Override
	public List<?> executeSelectSQL(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, String strSQL, List<Object> params) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			Matcher m = pattern.matcher(strSQL);
			int i = 0;
			while (m.find()) {
				strSQL = strSQL.replaceFirst(regex, String.format("#{ctx.%s}", i));
				i++;
			}
			List<Map<String, Object>> datas = dbDataMapper.queryData(null, strSQL, convertListParam(params));
			return datas;
		} catch (Exception e) {
			log.error(e);
			throw new SystemRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getSystemRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public int executeSQL(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, String strSQL, List<Object> params) throws Throwable {
		try {
			DBSchemeContextHolder.push(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime());
			DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDataSourceTag());
			Matcher m = pattern.matcher(strSQL);
			int i = 0;
			while (m.find()) {
				strSQL = strSQL.replaceFirst(regex, String.format("#{ctx.%s}", i));
				i++;
			}
			return dbDataMapper.updateBySQL(strSQL, convertListParam(params));
		} catch (Exception e) {
			log.error(e);
			throw new SystemRuntimeException(iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getSystemRuntime(), "数据库执行异常，请联系系统管理员。", Errors.INTERNALERROR, e);
		} finally {
			DBSchemeContextHolder.poll();
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public String getConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext, IDBDialect iDBDialect) throws Throwable {
		return iDBDialect.getConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext);

	}

	@Override
	public void push(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
		DBSchemeContextHolder.push(iSysDBSchemeRuntime);
		DynamicDataSourceContextHolder.push((String) iSysDBSchemeRuntime.getDataSourceTag());
	}

	@Override
	public void poll() {
		DBSchemeContextHolder.poll();
		DynamicDataSourceContextHolder.poll();
	}

	@Override
	public ISysDBSchemeRuntime current() {
		return DBSchemeContextHolder.peek();
	}
}
