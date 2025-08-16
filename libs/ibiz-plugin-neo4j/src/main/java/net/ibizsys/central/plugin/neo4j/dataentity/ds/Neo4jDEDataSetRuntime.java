package net.ibizsys.central.plugin.neo4j.dataentity.ds;

import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Value;
import org.neo4j.driver.types.Node;
import org.neo4j.driver.types.Path;
import org.neo4j.driver.types.Relationship;
import org.springframework.data.domain.PageImpl;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Neo4j 图实体数据集运行时对象
 *
 * @author lionlau
 */
public class Neo4jDEDataSetRuntime extends Neo4jDEDataSetRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Neo4jDEDataSetRuntimeBase.class);

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	@Override
	protected Object onFetch(ISearchContext iSearchContext) throws Throwable {

		Map<String, String> conditionMap = new HashMap<String, String>();
		// 获取相关的属性
		List<ISearchCond> searchCondList = iSearchContext.getSearchConds();
		if (!ObjectUtils.isEmpty(searchCondList)) {
			for (ISearchCond iSearchCond : searchCondList) {
				if (!(iSearchCond instanceof ISearchFieldCond)) {
					continue;
				}

				ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
				String strTag = this.getPSDEFieldTag(iSearchFieldCond.getFieldName(), true);
				if (!StringUtils.hasLength(strTag)) {
					continue;
				}

				if (Conditions.IN.equals(iSearchFieldCond.getCondOp())) {
					if (iSearchFieldCond.isParamMode()) {
						conditionMap.put(strTag, (String) iSearchContext.get((String) iSearchFieldCond.getValue()));
					} else {
						conditionMap.put(strTag, (String) iSearchFieldCond.getValue());
					}
				}
			}
		}

		String strNodeIn = conditionMap.get(FIELDTAG_NODE);
		String strRelationshipIn = conditionMap.get(FIELDTAG_RELATIONSHIP);
		String strSourceIn = conditionMap.get(FIELDTAG_RELATIONSHIP_SOURCE);
		if (!StringUtils.hasLength(strSourceIn)) {
			strSourceIn = strNodeIn;
		}
		String strTargetIn = conditionMap.get(FIELDTAG_RELATIONSHIP_TARGET);
		if (!StringUtils.hasLength(strTargetIn)) {
			strTargetIn = strNodeIn;
		}

		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();

		int nTotal = 0;

		try (Session session = this.getNeo4jBDSchemeRuntime().getDriver().session()) {

			//逐行放入
			EntityDTO entityDTO = new EntityDTO();
			Map<String, Object> sourceMap = new HashMap<>();
			Map<String, Object> targetMap = new HashMap<>();
			Map<String, Object> relationshipMap = new HashMap<>();


			entityDTOList.add(entityDTO);

			String query = "match result = (source)-[relationship]->(target) %s return result";
			String where = "";

			if (StringUtils.hasLength(strSourceIn)) {
				if (StringUtils.hasLength(where)) {
					where += " and (";
				} else {
					where += " where (";
				}
				for (int i = 0; i < strSourceIn.split(",|;").length; i++) {
					if (i > 0) {
						where += " or ";
					}
					where += String.format("source:%s", strSourceIn.split(",|;")[i]);
				}
				where += ") ";
			}

			if (StringUtils.hasLength(strRelationshipIn)) {
				if (StringUtils.hasLength(where)) {
					where += " and (";
				} else {
					where += " where (";
				}
				for (int i = 0; i < strRelationshipIn.split(",|;").length; i++) {
					if (i > 0) {
						where += " or ";
					}
					where += String.format("relationship:%s", strRelationshipIn.split(",|;")[i]);
				}
				where += ") ";
			}

			if (StringUtils.hasLength(strTargetIn)) {
				if (StringUtils.hasLength(where)) {
					where += " and (";
				} else {
					where += " where (";
				}
				for (int i = 0; i < strTargetIn.split(",|;").length; i++) {
					if (i > 0) {
						where += " or ";
					}
					where += String.format("target:%s", strTargetIn.split(",|;")[i]);
				}
				where += ") ";
			}

			//业务逻辑条件
			if (!ObjectUtils.isEmpty(searchCondList)) {
				for (ISearchCond iSearchCond : searchCondList) {
					if (!(iSearchCond instanceof ISearchFieldCond)) {
						continue;
					}

					ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
					if (!iSearchFieldCond.getCondOp().equals(Conditions.EQ)) {
						continue;
					}
					//暂时只处理EQ
					if (Conditions.EQ.equals(iSearchFieldCond.getCondOp())) {
						Object condValue = null;
						if (iSearchFieldCond.isParamMode()) {
							condValue = iSearchContext.get((String) iSearchFieldCond.getValue());
						} else {
							condValue = iSearchFieldCond.getValue();
						}
						if (condValue != null) {
							if (StringUtils.hasLength(where)) {
								where += " and (";
							} else {
								where += " where (";
							}
							where += String.format("source.%1$s='%2$s' and relationship.%1$s='%2$s' and target.%1$s='%2$s'", iSearchFieldCond.getFieldName(), condValue);
							where += ") ";
						}
					}
				}
			}

			query = String.format(query, where);
			Result result = session.run(query);
			while (result.hasNext()) {
				Record record = result.next();
				for (Value value : record.values()) {
					Path path = value.asPath();
					if (path.relationships() != null && path.relationships().iterator().hasNext()) {
						//source
						if (true) {
							Node source = path.start();
							Iterable<String> labels = source.labels();
							for (String label : labels) {
								//排重
								String key = label + source.id();
								if (!sourceMap.containsKey(key)) {
									Map sourceValue = source.asMap().entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(), Map.Entry::getValue));
									sourceValue.put(FIELDTAG_RELATIONSHIP_SOURCE.toLowerCase(), label);
									sourceMap.put(key, sourceValue);
								}
							}
						}
						//target
						if (true) {
							Node target = path.end();
							Iterable<String> labels = target.labels();
							for (String label : labels) {
								//排重
								String key = label + target.id();
								if (!targetMap.containsKey(key)) {
									Map targetValue = target.asMap().entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(), Map.Entry::getValue));
									targetValue.put(FIELDTAG_RELATIONSHIP_TARGET.toLowerCase(), label);
									targetMap.put(key, targetValue);
								}
							}
						}
						//relationship
						if (true) {
							for (Relationship relationship : path.relationships()) {
								if (!relationshipMap.containsKey(relationship.type())) {
									//排重
									String key = relationship.type() + relationship.id();
									if (!targetMap.containsKey(key)) {
										Map relationshipValue = relationship.asMap().entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(), Map.Entry::getValue));
										relationshipValue.put(FIELDTAG_RELATIONSHIP_SOURCE.toLowerCase(), path.start().labels().iterator().next());
										relationshipValue.put(FIELDTAG_RELATIONSHIP_TARGET.toLowerCase(), path.end().labels().iterator().next());
										relationshipValue.put(FIELDTAG_RELATIONSHIP.toLowerCase(), relationship.type());
										relationshipMap.put(key, relationshipValue);
									}
								}
							}
						}

					} else {
						//单节点查询
					}
				}
			}

			entityDTO.put("source", sourceMap.values());
			entityDTO.put("target", targetMap.values());
			entityDTO.put("relationship", relationshipMap.values());

		}

		return new PageImpl<IEntityDTO>(entityDTOList, iSearchContext.getPageable(), nTotal);
	}

}
