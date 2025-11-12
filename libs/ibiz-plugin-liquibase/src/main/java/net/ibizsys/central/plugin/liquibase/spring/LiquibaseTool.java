package net.ibizsys.central.plugin.liquibase.spring;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import liquibase.CatalogAndSchema;
import liquibase.Liquibase;
import liquibase.change.core.EmptyChange;
import liquibase.changelog.ChangeSet;
import liquibase.changelog.DatabaseChangeLog;
import liquibase.database.Database;
import liquibase.database.ObjectQuotingStrategy;
import liquibase.diff.DiffResult;
import liquibase.diff.ObjectDifferences;
import liquibase.diff.compare.CompareControl;
import liquibase.diff.output.DiffOutputControl;
import liquibase.integration.commandline.CommandLineUtils;
import liquibase.resource.FileSystemResourceAccessor;
import liquibase.resource.ResourceAccessor;
import liquibase.snapshot.DatabaseSnapshot;
import liquibase.snapshot.SnapshotControl;
import liquibase.snapshot.SnapshotGeneratorFactory;
import liquibase.structure.core.Column;
import liquibase.structure.core.DataType;
import liquibase.structure.core.Index;
import liquibase.structure.core.PrimaryKey;
import liquibase.structure.core.Table;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.database.ISysDBSchemeSyncAdapter;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.plugin.liquibase.util.DiffToChangeLogEx;
import net.ibizsys.model.PSModelEnums.DBIndexSource;
import net.ibizsys.model.database.IPSSysDBColumn;
import net.ibizsys.model.database.IPSSysDBIndex;
import net.ibizsys.model.database.IPSSysDBIndexColumn;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.KeyValueUtils;

@Component
public class LiquibaseTool implements ISysDBSchemeSyncAdapter {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LiquibaseTool.class);

	private static Map<String, String> dataTypeMap = new HashMap<String, String>();

	/**
	 * 系统模型中预定义的Liquibase变更文件前缀
	 */
	public static final String LIQUIBASE_CHANGELOGS_PREFIX = "LIQUIBASE_CHANGELOGS__";

	static {
		// ChangeFactory.getInstance().register(DropIndexChangeEx.class);
		// ChangeFactory.getInstance().register(CreateIndexChangeEx.class);

		dataTypeMap.put("BIGDECIMAL", "DECIMAL");
		dataTypeMap.put("VARBINARY", "BLOB");
		dataTypeMap.put("VARBINARY.MYSQL", "MEDIUMBLOB");
		dataTypeMap.put("TEXT.MYSQL", "MEDIUMTEXT");
	}

	/**
	 * 注册数据库类型
	 * @param strKey
	 * @param strDataType
	 */
	public static void registerDataType(String strKey, String strDataType) {
		dataTypeMap.put(strKey, strDataType);
	}


	/**
	 * 获取传入标准类型的数据库类型
	 * @param strKey
	 * @return
	 */
	public static String getDataType(String strKey) {
		return dataTypeMap.get(strKey);
	}


	public final static String SNAPSHOTID = "iBizCloud";

	public final static int MAXRETRY = 3;

	@Override
	public void sync(ISystemRuntime iSystemRuntime, ISysDBSchemeRuntime iSysDBSchemeRuntime, DataSource dataSource, Object objTag) throws Throwable {
		int nRetry = 0;
		while(true) {
			try {
				this.doSync(iSystemRuntime, iSysDBSchemeRuntime, dataSource, objTag);
				break;
			}
			catch (Throwable ex) {
				nRetry ++;
				if(nRetry >= MAXRETRY) {
					throw ex;
				}
				log.warn(String.format("系统[%1$s]数据库[%2$s]更新失败，进行第%3$s重试", iSystemRuntime.getDeploySystemId(), iSysDBSchemeRuntime.getDSLink(), nRetry));
			}
		}
	}

	protected void doSync(ISystemRuntime iSystemRuntime, ISysDBSchemeRuntime iSysDBSchemeRuntime, DataSource dataSource, Object objTag) throws Throwable {

		IPSSysDBScheme iPSSysDBScheme = iSysDBSchemeRuntime.getPSSysDBScheme();
		List<IPSSysDBTable> psSysDBTableList = iPSSysDBScheme.getAllPSSysDBTables();

		String strFolder = String.format("%1$s%2$schangelogs", iSystemRuntime.getFileFolder(), File.separator);
		File folder = new File(strFolder);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		Map<String, String> changeLogFileMap = new LinkedHashMap<String, String>();

		ResourceAccessor resourceAccessor = new FileSystemResourceAccessor(Paths.get(".").toString());

		// 放入自动化变更文件
		String strDefaultModelTag = null;
		if (!ObjectUtils.isEmpty(psSysDBTableList)) {
			String strModelDigest = KeyValueUtils.genUniqueId(iPSSysDBScheme.getObjectNode().toString());
			String strModelTag = String.format("%1$s-%2$s-%3$s", iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getDSLink(), strModelDigest).toLowerCase();

			String strChangelogFile = String.format("%1$s%2$s%3$s.xml", strFolder, File.separator, strModelTag);
			//判断错误文件是否文件
			int nIndex = 0;
			while(new File(strChangelogFile).exists()) {
				String strChangelogErrFile = strChangelogFile + ".err";
				if(!(new File(strChangelogErrFile).exists())) {
					break;
				}
				nIndex ++;
				//存在错误文件，重写格式化模型标记
				strModelTag = String.format("%1$s-%2$s-%3$s_%4$s", iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getDSLink(), strModelDigest, nIndex).toLowerCase();
				strChangelogFile = String.format("%1$s%2$s%3$s.xml", strFolder, File.separator, strModelTag);
			}
			//
			strDefaultModelTag = strModelTag;
			changeLogFileMap.put(strChangelogFile, strModelTag);

			File file = new File(strChangelogFile);

			if (file.exists()) {
				// 判断有没有变更
				Database targetDatabase = null;
				try (Liquibase liquibase = new Liquibase(strChangelogFile, resourceAccessor, targetDatabase)) {
					if (ObjectUtils.isEmpty(liquibase.getDatabaseChangeLog()) || ObjectUtils.isEmpty(liquibase.getDatabaseChangeLog().getChangeSets())) {
						log.debug(String.format("变更文件[%1$s]未包含任何操作，忽略", strChangelogFile));
						changeLogFileMap.remove(strChangelogFile);
						// return;
					}
				}
			}

		}

		// 生成用户自定义LOG文件
		String strContentCatTag = String.format("%1$s%2$s", LIQUIBASE_CHANGELOGS_PREFIX, iPSSysDBScheme.getDSLink());
		IPSSysContentCat iPSSysContentCat = iSystemRuntime.getPSSystemService().getPSSysContentCat(strContentCatTag, true);
		if (iPSSysContentCat != null) {
			List<IPSSysContent> psSysContentList = iPSSysContentCat.getPSSysContents();
			if (!ObjectUtils.isEmpty(psSysContentList)) {

				for (IPSSysContent iPSSysContent : psSysContentList) {

					if (!StringUtils.hasLength(iPSSysContent.getCodeName())) {
						log.warn(String.format("预置内容项[%1$s]未定义代码标识，忽略", iPSSysContent.getName()));
						continue;
					}

					String strModelTag = String.format("%1$s-%2$s-user-%3$s", iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getDSLink(), iPSSysContent.getCodeName()).toLowerCase();
					String strChangelogFile = String.format("%1$s%2$s%3$s.xml", strFolder, File.separator, strModelTag);

					File file = new File(strChangelogFile);
					if (!file.exists()) {

						String strContent = iPSSysContent.getContent();
						if (!StringUtils.hasLength(strContent)) {
							log.warn(String.format("预置内容项[%1$s]未定义内容，忽略", iPSSysContent.getName()));
							continue;
						}

						FileUtils.writeStringToFile(file, strContent, "UTF-8");
					}

					changeLogFileMap.put(strChangelogFile, strModelTag);
				}
			}
		}

		if (changeLogFileMap.size() == 0) {
			// 未包含任何变更文件
			log.debug(String.format("系统[%1$s]数据库[%2$s]未定义变更文件", iSystemRuntime.getDeploySystemId(), iSysDBSchemeRuntime.getDSLink()));
			return;
		}


		Map<String, Boolean> tagExistsMap = new HashMap<String, Boolean>();
		for (java.util.Map.Entry<String, String> entry : changeLogFileMap.entrySet()) {
			tagExistsMap.put(entry.getValue(), false);
		}
		boolean bFirst = true;

		for (java.util.Map.Entry<String, String> entry : changeLogFileMap.entrySet()) {

			String strChangelogFile = entry.getKey();
			String strModelTag = entry.getValue();

			if(!bFirst) {
				boolean bHasTag = tagExistsMap.get(strModelTag);
				if(bHasTag) {
					log.debug(String.format("变更文件[%1$s]标记已操作[%2$s]，忽略", strChangelogFile, strModelTag));
					continue;
				}
			}

			File file = new File(strChangelogFile);
			if(!file.exists()) {
				if(!strDefaultModelTag.equals(strModelTag)) {
					log.warn(String.format("变更文件[%1$s]不存在，忽略", strChangelogFile));
					continue;
				}
			}

			Database targetDatabase = CommandLineUtils.createDatabaseObject(resourceAccessor, dataSource.getJdbcUrl(), dataSource.getUsername(), dataSource.getPassword(), dataSource.getDriverClassName(), "", "", false, false, null, null, null, null, null, null, null);

			try (Liquibase liquibase = new Liquibase(strChangelogFile, resourceAccessor, targetDatabase)) {
				if(bFirst) {
					bFirst = false;
					for(String strTag : tagExistsMap.keySet()) {
						boolean bExists = liquibase.tagExists(strTag);
						tagExistsMap.put(strTag, bExists);
					}
				}

				//boolean bHasTag = liquibase.tagExists(strModelTag);
				boolean bHasTag = tagExistsMap.get(strModelTag);
				if (!bHasTag) {
					if (!file.exists()) {
						
						String strCacheTag = String.format("%1$s-%2$s-%3$s", "LiquibaseTool", iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getDSLink());
						boolean firstTime = DataTypeUtils.asBoolean(ServiceHub.getInstance().getGlobalParam(strCacheTag), true);
						if(firstTime) {
							ServiceHub.getInstance().setGlobalParam(strCacheTag, false);
						}
						
						String strTypes = firstTime?"Column,Table,Index":"Column,Table"; // Column,Table,Index,ForeignKey,Index,PrimaryKey
						String strTypes2 = "Column,Table,Index,ForeignKey,PrimaryKey"; //
						SnapshotControl snapshotControl = new SnapshotControl(targetDatabase, strTypes);

						ObjectQuotingStrategy originalStrategy = targetDatabase.getObjectQuotingStrategy();
						DatabaseSnapshot databaseSnapshot = null;
						try {
							targetDatabase.setObjectQuotingStrategy(ObjectQuotingStrategy.QUOTE_ALL_OBJECTS);
							long nStart = System.currentTimeMillis();
							databaseSnapshot = SnapshotGeneratorFactory.getInstance().createSnapshot(CatalogAndSchema.DEFAULT, targetDatabase, snapshotControl);
							
							long nLast = System.currentTimeMillis() - nStart;
							log.debug(String.format("建立数据库[%1$s][%2$s]快照耗时[%3$s]", iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getDSLink(), nLast));
							
							
							Set<Table> tables = databaseSnapshot.get(Table.class);
							Set<Column> columns = databaseSnapshot.get(Column.class);
							Set<Index> indices = firstTime? databaseSnapshot.get(Index.class):null;
							
							Map<String, Table> tableMap = new HashMap<String, Table>();
							if (!ObjectUtils.isEmpty(tables)) {
								for (Table table : tables) {
									tableMap.put(table.getName().toUpperCase(), table);
								}
							}

							Map<String, Column> columnMap = new HashMap<String, Column>();
							if (!ObjectUtils.isEmpty(columns)) {
								for (Column column : columns) {
									columnMap.put(String.format("%1$s.%2$s", column.getRelation().getName(), column.getName()).toUpperCase(), column);
								}
							}
							//Map<String, Index> indexMap = new HashMap<String, Index>();
							if (!ObjectUtils.isEmpty(indices)) {
								for (Index index : indices) {
									//indexMap.put(String.format("%1$s.%2$s", index.getRelation().getName(), index.getName()).toUpperCase(), index);
									String strCacheTag2 = String.format("%1$s-%2$s-%3$s", "LiquibaseTool", iSystemRuntime.getDeploySystemId(), KeyValueUtils.genUniqueId(iPSSysDBScheme.getDSLink(), index.getRelation().getName().toUpperCase(), index.getName().toUpperCase()));
									ServiceHub.getInstance().setGlobalParam(strCacheTag2, true);
								}
							}

							// 增加索引类型
							if(!firstTime) {
								snapshotControl.addType(Index.class, targetDatabase);
							}
							

							DiffResult diffResult = new DiffResult(databaseSnapshot, databaseSnapshot, new CompareControl(null, strTypes2));
							
							for (IPSSysDBTable iPSSysDBTable : psSysDBTableList) {

								List<IPSSysDBColumn> psSysDBColumnList = iPSSysDBTable.getAllPSSysDBColumns();
								if (ObjectUtils.isEmpty(psSysDBColumnList)) {
									continue;
								}

								Table table = new Table(null, null, iPSSysDBTable.getName());
								table.setSnapshotId(SNAPSHOTID);
								table.setRemarks(iPSSysDBTable.getLogicName());
								List<Column> keyList = new ArrayList<Column>();
								Map<String, IPSSysDBColumn> enableModifyPSSysDBColumnMap = new HashMap<String, IPSSysDBColumn>();
								for (IPSSysDBColumn iPSSysDBColumn : psSysDBColumnList) {

									Column column = new Column(iPSSysDBColumn.getName());
									column.setRelation(table);
									column.setRemarks(iPSSysDBColumn.getLogicName());
									if (iPSSysDBColumn.isPKey() || !iPSSysDBColumn.isNullable()) {
										column.setNullable(false);
									}

									table.addColumn(column);

									if (iPSSysDBColumn.isPKey()) {
										keyList.add(column);
									}

									String strType = iPSSysDBColumn.getDataType();
									if(StringUtils.hasLength(strType)) {
										int nPos = strType.indexOf("(");
										if(nPos != -1) {
											strType = strType.substring(0, nPos);
										}
										strType = strType.trim();
										if(StringUtils.hasLength(strType)) {
											column.setType(new DataType(strType));
											if (iPSSysDBColumn.getLength() > 0) {
												column.getType().setColumnSize(iPSSysDBColumn.getLength());
												if (iPSSysDBColumn.getPrecision() > 0) {
													column.getType().setDecimalDigits(iPSSysDBColumn.getPrecision());
												}
											}

											if (iPSSysDBColumn.isPKey() && iPSSysDBColumn.isAutoIncrement()) {
												column.setAutoIncrementInformation(new Column.AutoIncrementInformation());
											}

											continue;
										}
									}

									int nStdDataType = iPSSysDBColumn.getStdDataType();

									strType = DataTypes.toString(nStdDataType);
									String strTypeKey = String.format("%1$s.%2$s", strType, targetDatabase.getShortName()).toUpperCase();
									if (dataTypeMap.containsKey(strTypeKey)) {
										strType = dataTypeMap.get(strTypeKey);
									}
									else if (dataTypeMap.containsKey(strType)) {
										strType = dataTypeMap.get(strType);
									}

									column.setType(new DataType(strType));

									String columnKey = iPSSysDBTable.getName().toUpperCase() + "." +iPSSysDBColumn.getName().toUpperCase();
									if(columnMap.containsKey(columnKey)  && !iPSSysDBColumn.getLogicName().equals(columnMap.get(columnKey).getRemarks())) {
										enableModifyPSSysDBColumnMap.put(iPSSysDBColumn.getName().toUpperCase(), iPSSysDBColumn);
									}

									if (DataTypeUtils.isStringDataType(nStdDataType)) {
										if(!DataTypeUtils.isLongStringDataType(nStdDataType)) {
											if (iPSSysDBColumn.getLength() > 0) {
												column.getType().setColumnSize(iPSSysDBColumn.getLength());
												enableModifyPSSysDBColumnMap.put(iPSSysDBColumn.getName().toUpperCase(), iPSSysDBColumn);
											}
										}
										continue;
									}

									if (DataTypeUtils.isDoubleDataType(nStdDataType)) {
										if (iPSSysDBColumn.getLength() > 0) {
											column.getType().setColumnSize(iPSSysDBColumn.getLength());
										}
										if (iPSSysDBColumn.getPrecision() > 0) {
											if (iPSSysDBColumn.getLength() <= 0) {
												//使用默认值
												column.getType().setColumnSize(12 + iPSSysDBColumn.getPrecision());
											}
											column.getType().setDecimalDigits(iPSSysDBColumn.getPrecision());
										}

										/*
										 * liquibase 无符号是通过类型传入，后续处理
										 * if(iPSSysDBColumn.isUnsigned()) {
										 *
											column.getType().
										}*/

										continue;
									}
									if (DataTypeUtils.isIntDataType(nStdDataType)) {
										if (iPSSysDBColumn.isPKey() && iPSSysDBColumn.isAutoIncrement()) {
											column.setAutoIncrementInformation(new Column.AutoIncrementInformation());
										}

										if (iPSSysDBColumn.getLength() > 0) {
											column.getType().setColumnSize(iPSSysDBColumn.getLength());
										}
										continue;
									}
								}

								// 判断表是否存在
								if (!tableMap.containsKey(table.getName().toUpperCase())) {
									// 新建表
									diffResult.addMissingObject(table);
									// 补充主键
									PrimaryKey primaryKey = new PrimaryKey();
									primaryKey.setSnapshotId(SNAPSHOTID);
									for (int i = 0; i < keyList.size(); i++) {
										primaryKey.addColumn(i, keyList.get(i));
									}
									primaryKey.setTable(table);
									diffResult.addMissingObject(primaryKey);

									tableMap.put(table.getName().toUpperCase(), table);

									// 将表中所有的列都放入，匹配后续有其它操作file
									List<Column> columnList = table.getColumns();
									if (!ObjectUtils.isEmpty(columnList)) {
										for (Column column : columnList) {
											String strTag = String.format("%1$s.%2$s", column.getRelation().getName(), column.getName()).toUpperCase();
											if (!columnMap.containsKey(strTag)) {
												columnMap.put(strTag, column);
											}
										}
									}

								} else {
									//表备注
									if (!table.getRemarks().equals(tableMap.get(table.getName().toUpperCase()).getRemarks())) {
										ObjectDifferences tableDifferences = null;
										tableDifferences = new ObjectDifferences(CompareControl.STANDARD);
										tableDifferences.addDifference("remarks", tableMap.get(table.getName().toUpperCase()).getRemarks(), table.getRemarks());
										diffResult.addChangedObject(table, tableDifferences);
									}
									// 判断列是否丢失
									List<Column> columnList = table.getColumns();
									if (!ObjectUtils.isEmpty(columnList)) {
										for (Column column : columnList) {
											String strTag = String.format("%1$s.%2$s", column.getRelation().getName(), column.getName()).toUpperCase();
											if (!columnMap.containsKey(strTag)) {
												diffResult.addMissingObject(column);
												columnMap.put(strTag, column);
											} else {
												ObjectDifferences objectDifferences = null;
												IPSSysDBColumn iPSSysDBColumn = enableModifyPSSysDBColumnMap.get(column.getName().toUpperCase());
												if(iPSSysDBColumn != null) {
													int nStdDataType = iPSSysDBColumn.getStdDataType();
													Column column2 = columnMap.get(strTag);

													//字段备注
													if (!column.getRemarks().equals(column2.getRemarks())) {
														if (objectDifferences == null) {
															objectDifferences = new ObjectDifferences(CompareControl.STANDARD);
														}
														objectDifferences.addDifference("remarks", column2.getRemarks(), column.getRemarks());
													}

													if (DataTypeUtils.isStringDataType(nStdDataType)) {
														if (!DataTypeUtils.isLongStringDataType(nStdDataType)) {
															//字符串长度变化
															if (!ObjectUtils.nullSafeEquals(column.getType().getColumnSize(), column2.getType().getColumnSize())) {
																if (objectDifferences == null) {
																	objectDifferences = new ObjectDifferences(CompareControl.STANDARD);
																}
																objectDifferences.addDifference("type", column.getType(), column2.getType());
															}
														}
													}

													if (objectDifferences != null) {
														diffResult.addChangedObject(column, objectDifferences);
													}
													continue;
												}
											}
										}
									}
								}

								List<IPSSysDBIndex> psSysDBIndexList = iPSSysDBTable.getAllPSSysDBIndices();
								if (!ObjectUtils.isEmpty(psSysDBIndexList)) {

									for (IPSSysDBIndex iPSSysDBIndex : psSysDBIndexList) {
										
										//关系外键需要做存在判断
										if(DBIndexSource.DER.value.equals(iPSSysDBIndex.getSourceType())) {
											String strCacheTag2 = String.format("%1$s-%2$s-%3$s", "LiquibaseTool", iSystemRuntime.getDeploySystemId(), KeyValueUtils.genUniqueId(iPSSysDBScheme.getDSLink(), table.getName().toUpperCase(), iPSSysDBIndex.getCodeName().toUpperCase()));
											if(DataTypeUtils.asBoolean(ServiceHub.getInstance().getGlobalParam(strCacheTag2), false)) {
												continue;
											}
											//直接设置为true，后续不再进入
											ServiceHub.getInstance().setGlobalParam(strCacheTag2, true);
										}
										

										// 先进行索引移除
										Index index = new Index(iPSSysDBIndex.getCodeName());
										index.setSnapshotId(SNAPSHOTID);
										index.setRelation(table);

										java.util.List<IPSSysDBIndexColumn> psSysDBIndexColumnList = iPSSysDBIndex.getAllPSSysDBIndexColumns();
										if (!ObjectUtils.isEmpty(psSysDBIndexColumnList)) {
											for (IPSSysDBIndexColumn iPSSysDBIndexColumn : psSysDBIndexColumnList) {
												String strTag = String.format("%1$s.%2$s", table.getName(), iPSSysDBIndexColumn.getName()).toUpperCase();
												Column column = columnMap.get(strTag);
												if (column == null) {
													log.error(String.format("数据列[%1$s.%2$s]不存在，忽略加入索引[%3$s]", table.getName(), iPSSysDBIndexColumn.getName(), iPSSysDBIndex.getCodeName()));
													continue;
												}
												index.addColumn(column);
											}
										}
										if (iPSSysDBIndex.getRemoveFlag()) {
											diffResult.addUnexpectedObject(index);
										} else if (!ObjectUtils.isEmpty(index.getColumns())) {
											if (iSysDBSchemeRuntime.isDropIndexFirst()) {
												diffResult.addUnexpectedObject(index);
											}
											diffResult.addMissingObject(index);
										}
									}
								}
							}

							DiffToChangeLogEx diffToChangeLog = new DiffToChangeLogEx(diffResult, new DiffOutputControl());
							diffToChangeLog.setChangeSetAuthor("iBiz-Cloud");
							diffToChangeLog.setIdRoot(strModelTag);

							diffToChangeLog.print(strChangelogFile);

						} finally {
							targetDatabase.setObjectQuotingStrategy(originalStrategy);
						}
					}

					DatabaseChangeLog databaseChangeLog = liquibase.getDatabaseChangeLog();

					if (ObjectUtils.isEmpty(databaseChangeLog) || ObjectUtils.isEmpty(databaseChangeLog.getChangeSets())) {
						log.debug(String.format("变更文件[%1$s]未包含任何操作，忽略", strChangelogFile));
						continue;
					} else {

						//插入空白操作
						ChangeSet changeSet = new ChangeSet(String.format("%1$s-empty", strModelTag), "iBiz-Cloud", false, false, strChangelogFile, null ,null,  databaseChangeLog);
						changeSet.addChange(new EmptyChange());
						databaseChangeLog.addChangeSet(changeSet);

						liquibase.update("");
						liquibase.tag(strModelTag);
					}
				} else {
					log.debug(String.format("变更文件[%1$s]标记已操作[%2$s]，忽略", strChangelogFile, strModelTag));
				}

			} catch (Throwable ex) {
				try {
					if (file.exists()) {
						String strErrorFileName = file.getCanonicalPath() + ".err";
						log.error(String.format("同步数据库发生异常，写入错误文件[%1$s]", strErrorFileName));
						try(PrintStream fos = new PrintStream(new File(strErrorFileName), "UTF-8")){
							ex.printStackTrace(fos);
						}
					}
				} catch (Exception e) {
					log.error(e);
				}
				throw ex;
			}
		}

	}
}
