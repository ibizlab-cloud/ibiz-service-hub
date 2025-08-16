package net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictOptionDTO;
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
 * 字典项
 * 
 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/.ibizmodel.index
 */
public interface IDictOptionService extends IDEService<DictOptionDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/dict/PSDATAENTITIES/DictOption.json";

  /**
   * 属性: 标识
   */
  String FIELD_VKEY = "VKEY";
  /**
   * 属性: 目录代码
   */
  String FIELD_CID = "CID";
  /**
   * 属性: 目录
   */
  String FIELD_CNAME = "CNAME";
  /**
   * 属性: 代码值
   */
  String FIELD_VAL = "VAL";
  /**
   * 属性: 名称
   */
  String FIELD_LABEL = "LABEL";
  /**
   * 属性: 父代码值
   */
  String FIELD_PVAL = "PVAL";
  /**
   * 属性: 过滤项
   */
  String FIELD_VFILTER = "VFILTER";
  /**
   * 属性: 栏目样式
   */
  String FIELD_CLS = "CLS";
  /**
   * 属性: 图标
   */
  String FIELD_ICONCLS = "ICONCLS";
  /**
   * 属性: 是否禁用
   */
  String FIELD_DISABLED = "DISABLED";
  /**
   * 属性: 过期/失效
   */
  String FIELD_EXPIRED = "EXPIRED";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 扩展
   */
  String FIELD_EXTENSION = "EXTENSION";
  /**
   * 属性: 最后修改时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
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
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: DEFAULT
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
            case "DictOptionDTO":
                return new DictOptionDTO();
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
                this.create((DictOptionDTO) args[0]);
                return null;
            case "update" :
                this.update((DictOptionDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DictOptionDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DictOptionDTO) args[0]);
            case "save" :
                this.save((DictOptionDTO) args[0]);
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
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DictOptionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DictOptionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdeactions/Get.ibizmodel.yaml
     */
    default DictOptionDTO get(String key) throws Throwable {
        return (DictOptionDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DictOptionDTO getDraft(DictOptionDTO dto) throws Throwable {
        return (DictOptionDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DictOptionDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DictOptionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DictOptionDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DictOptionDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DictOptionDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DictOptionDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DictOptionDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DictOptionDTO>) obj;
    }

}

