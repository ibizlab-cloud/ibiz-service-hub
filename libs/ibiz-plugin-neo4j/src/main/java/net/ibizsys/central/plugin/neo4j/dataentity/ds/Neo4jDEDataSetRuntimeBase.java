package net.ibizsys.central.plugin.neo4j.dataentity.ds;

import net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase;
import net.ibizsys.central.plugin.neo4j.ba.INeo4jBDSchemeRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.HashMap;

public abstract class Neo4jDEDataSetRuntimeBase extends DEDataSetRuntimeBase {

    private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Neo4jDEDataSetRuntimeBase.class);
    private INeo4jBDSchemeRuntime iNeo4jBDSchemeRuntime = null;
    private java.util.Map<String, IPSDEField> psDEFieldMap = new HashMap<String, IPSDEField>();


    /**
     * 属性标记：节点标签
     */
    public final static String FIELDTAG_NODE = "NODE_LABLES";


    /**
     * 属性标记：关系
     */
    public final static String FIELDTAG_RELATIONSHIP = "RELATIONSHIP_TYPE";

    /**
     * 属性标记：关系源节点标签
     */
    public final static String FIELDTAG_RELATIONSHIP_SOURCE = "SOURCE_LABLES";


    /**
     * 属性标记：关系目标节点标签
     */
    public final static String FIELDTAG_RELATIONSHIP_TARGET = "TARGET_LABLES";

    @Override
    protected void onInit() throws Exception {

        psDEFieldMap.put(FIELDTAG_NODE, null);
        psDEFieldMap.put(FIELDTAG_RELATIONSHIP, null);
        psDEFieldMap.put(FIELDTAG_RELATIONSHIP_SOURCE, null);
        psDEFieldMap.put(FIELDTAG_RELATIONSHIP_TARGET, null);

        java.util.List<IPSDEField> psDEFieldList = this.getPSDEDataSet().getParentPSModelObject(IPSDataEntity.class).getAllPSDEFields();
        if (!ObjectUtils.isEmpty(psDEFieldList)) {
            for (IPSDEField iPSDEField : psDEFieldList) {
                if (psDEFieldMap.containsKey(iPSDEField.getName())) {
                    psDEFieldMap.put(iPSDEField.getName(), iPSDEField);
                }
            }

            for (IPSDEField iPSDEField : psDEFieldList) {
				String strFieldTag = iPSDEField.getFieldTag();
                if (!StringUtils.hasLength(strFieldTag)) {
                    continue;
                }

                strFieldTag = strFieldTag.toUpperCase();
                if (psDEFieldMap.containsKey(strFieldTag)) {
                    psDEFieldMap.put(strFieldTag, iPSDEField);
                }
            }
        }

        super.onInit();
    }

    protected IPSDEField getPSDEFieldByTag(String strTag, boolean bTryMode) throws Exception {
        IPSDEField iPSDEField = psDEFieldMap.get(strTag);
        if (iPSDEField != null || bTryMode) {
            return iPSDEField;
        }
        throw new Exception(String.format("未定义指定标记[%1$s]属性", strTag));
    }


    protected String getPSDEFieldTag(String strName, boolean bTryMode) throws Exception {
        for (java.util.Map.Entry<String, IPSDEField> entry : this.psDEFieldMap.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }

            if (entry.getValue().getName().equalsIgnoreCase(strName)) {
                return entry.getKey();
            }
        }
        if (bTryMode) {
            return null;
        }
        throw new Exception(String.format("未获取指定属性[%1$s]标记", strName));
    }


    protected INeo4jBDSchemeRuntime getNeo4jBDSchemeRuntime() throws Exception {
        if (this.iNeo4jBDSchemeRuntime == null) {
            if (this.getDataEntityRuntime().getSysBDSchemeRuntime() instanceof INeo4jBDSchemeRuntime) {
                this.iNeo4jBDSchemeRuntime = (INeo4jBDSchemeRuntime) this.getDataEntityRuntime().getSysBDSchemeRuntime();
            }
            if (this.iNeo4jBDSchemeRuntime == null) {
                throw new Exception("Neo4j数据库运行时对象无效");
            }
        }
        return this.iNeo4jBDSchemeRuntime;
    }


}
