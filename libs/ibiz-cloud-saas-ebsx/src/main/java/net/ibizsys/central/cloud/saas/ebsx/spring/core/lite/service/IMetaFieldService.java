package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaFieldDTO;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;

/**
 * 属性
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/.ibizmodel.index
 */
public interface IMetaFieldService extends IDEService<MetaFieldDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/MetaField.json";

  /**
   * 属性: 属性标识
   */
  String FIELD_FIELDID = "FIELDID";
  /**
   * 属性: 属性名称
   */
  String FIELD_FIELDNAME = "FIELDNAME";
  /**
   * 属性: 代码名称
   */
  String FIELD_CODENAME = "CODENAME";
  /**
   * 属性: 实体标识
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 实体名称
   */
  String FIELD_ENTITYNAME = "ENTITYNAME";
  /**
   * 属性: 实体代码名称
   */
  String FIELD_ENTITYCODENAME = "ENTITYCODENAME";
  /**
   * 属性: 系统
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 属性逻辑名
   */
  String FIELD_FIELDLOGICNAME = "FIELDLOGICNAME";
  /**
   * 属性: 属性全路径名称
   */
  String FIELD_FIELDUNINAME = "FIELDUNINAME";
  /**
   * 属性: 显示名称
   */
  String FIELD_FIELDSHOWNAME = "FIELDSHOWNAME";
  /**
   * 属性: 引用属性标识
   */
  String FIELD_REFFIELDID = "REFFIELDID";
  /**
   * 属性: 引用属性名称
   */
  String FIELD_REFFIELDNAME = "REFFIELDNAME";
  /**
   * 属性: 引用关系标识
   */
  String FIELD_RELATIONID = "RELATIONID";
  /**
   * 属性: 引用关系
   */
  String FIELD_RELATIONNAME = "RELATIONNAME";
  /**
   * 属性: 关系代码
   */
  String FIELD_RELATIONCODENAME = "RELATIONCODENAME";
  /**
   * 属性: 引用实体
   */
  String FIELD_REFENTITYNAME = "REFENTITYNAME";
  /**
   * 属性: 主键
   */
  String FIELD_KEYFIELD = "KEYFIELD";
  /**
   * 属性: 主信息
   */
  String FIELD_MAJORFIELD = "MAJORFIELD";
  /**
   * 属性: 联合主键
   */
  String FIELD_UNIONKEY = "UNIONKEY";
  /**
   * 属性: 属性类型
   */
  String FIELD_FIELDTYPE = "FIELDTYPE";
  /**
   * 属性: 预定义类型
   */
  String FIELD_PREDEFINED = "PREDEFINED";
  /**
   * 属性: 数据字典
   */
  String FIELD_DICT = "DICT";
  /**
   * 属性: 允许为空
   */
  String FIELD_NULLABLE = "NULLABLE";
  /**
   * 属性: 物理属性
   */
  String FIELD_PHYSICALFIELD = "PHYSICALFIELD";
  /**
   * 属性: 数据类型
   */
  String FIELD_DATATYPE = "DATATYPE";
  /**
   * 属性: 长度
   */
  String FIELD_DATALENGTH = "DATALENGTH";
  /**
   * 属性: 精度
   */
  String FIELD_DATAPRECI = "DATAPRECI";
  /**
   * 属性: 逻辑表达式
   */
  String FIELD_EXPRESSION = "EXPRESSION";
  /**
   * 属性: 扩展属性
   */
  String FIELD_EXTENSIONFIELD = "EXTENSIONFIELD";
  /**
   * 属性: 审计
   */
  String FIELD_ISENABLEAUDIT = "ISENABLEAUDIT";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 最后修改时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 行为: Create
   */
  String ACTION_CREATE = "Create";
  /**
   * 行为: Update
   */
  String ACTION_UPDATE = "Update";
  /**
   * 行为: Remove
   */
  String ACTION_REMOVE = "Remove";
  /**
   * 行为: Get
   */
  String ACTION_GET = "Get";
  /**
   * 行为: GetDraft
   */
  String ACTION_GETDRAFT = "GetDraft";
  /**
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "MetaFieldDTO":
                return new MetaFieldDTO();
            default:
                return null;
        }
    }

    @Override
    default ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        return new SearchContextDTO();
    }

    @Override
    default Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
        switch (strActionName.toLowerCase()) {
            case "create" :
                this.create((MetaFieldDTO) args[0]);
                return null;
            case "update" :
                this.update((MetaFieldDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MetaFieldDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MetaFieldDTO) args[0]);
            case "save" :
                this.save((MetaFieldDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MetaFieldDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MetaFieldDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdeactions/Get.ibizmodel.yaml
     */
    default MetaFieldDTO get(String key) throws Throwable {
        return (MetaFieldDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MetaFieldDTO getDraft(MetaFieldDTO dto) throws Throwable {
        return (MetaFieldDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MetaFieldDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdeactions/Save.ibizmodel.yaml
     */
    default void save(MetaFieldDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MetaFieldDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MetaFieldDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MetaFieldDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MetaFieldDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MetaFieldDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MetaFieldDTO>) obj;
    }

}

