package cn.ibizlab.central.plugin.odoo.dataentity.security;

import cn.ibizlab.central.plugin.odoo.IOdooSystemRuntimeBase;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrRuleDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResGroupsDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResGroupsImpliedRelDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.RuleGroupRelDTO;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.central.cloud.core.dataentity.security.DataEntityAccessManager;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv;
import net.ibizsys.model.dataentity.priv.PSDEOPPrivRoleImpl;
import net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import java.util.*;

public class OdooDataEntityAccessManager extends DataEntityAccessManager {
    private static final Log log = LogFactory.getLog(OdooDataEntityAccessManager.class);

    private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
    IDataEntityRuntime iResGroupsService;

    protected IDataEntityRuntime getResGroupsService() {
        if(this.iResGroupsService == null) {
            this.iResGroupsService =  this.getMainSystemRuntime().getDataEntityRuntime("RES_GROUPS");
        }
        return this.iResGroupsService;
    }

    IDataEntityRuntime iResGroupsImpliedRelService;

    protected IDataEntityRuntime getResGroupsImpliedRelService() {
        if(this.iResGroupsImpliedRelService == null) {
            this.iResGroupsImpliedRelService =  this.getMainSystemRuntime().getDataEntityRuntime("RES_GROUPS_IMPLIED_REL");
        }
        return this.iResGroupsImpliedRelService;
    }

    IDataEntityRuntime iIRRuleService;

    protected IDataEntityRuntime getIRRuleService() {
        if(this.iIRRuleService == null) {
            this.iIRRuleService =  this.getMainSystemRuntime().getDataEntityRuntime("IR_Rule");
        }
        return this.iIRRuleService;
    }


    @Override
    protected void onInit() throws Exception {
        super.onInit();
        prepareSysCacheUtilRuntime();
    }

    @Override
    protected List<IPSDEUserRole> getPSDEUserRoles(IEmployeeContext iEmployeeContext, String strAccessAction) {
        List<IPSDEUserRole> authorities = super.getPSDEUserRoles(iEmployeeContext, strAccessAction);
        List<IPSDEUserRole> modelAccessAuthorities = new ArrayList<>();
        List<IPSDEUserRole> ruleAuthorities = new ArrayList<>();
        boolean checkAccessRule = false;
        for (IPSDEUserRole rtPSDEUserRole : getPSDEUserRoleByResGroup(iEmployeeContext)) {
            List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = rtPSDEUserRole.getPSDEUserRoleOPPrivs();
            if (iPSDEUserRoleOPPrivs != null) {
                if (iPSDEUserRoleOPPrivs.stream().anyMatch(iPSDEUserRoleOPPriv -> iPSDEUserRoleOPPriv.getDataAccessAction().equals(strAccessAction))) {
                    if(rtPSDEUserRole.isAllData()){
                        modelAccessAuthorities.add(rtPSDEUserRole);
                    }else {
                        ruleAuthorities.add(rtPSDEUserRole);
                    }
                }
                if(!rtPSDEUserRole.isAllData()){
                    checkAccessRule = true;
                }
            }
        }
        //分层写入
        if(!modelAccessAuthorities.isEmpty() ) {
            if(!ruleAuthorities.isEmpty()) {
                authorities.addAll(ruleAuthorities);
            }else {
                if(!checkAccessRule) {
                    authorities.addAll(modelAccessAuthorities);
                }
            }
        }
        return authorities;
    }

    /**
     * 获取定义于ResGroup的权限
     * @param iEmployeeContext
     * @return
     */
    protected List<IPSDEUserRole> getPSDEUserRoleByResGroup(IEmployeeContext iEmployeeContext) {
        try {
            List<IPSDEUserRole>iPSDEUserRoles = new ArrayList<>();
            List resGroups = new ArrayList<>();
            IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrent();
            List cacheResGroups = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()), getDataEntityAccessCacheTag(), List.class);
            if(cacheResGroups == null) {
                ISearchContextDTO searchContextDTO = getResGroupsService().createSearchContext();
                searchContextDTO.nestedfields(true).all().count(false);
                Object resGroupsPage = getResGroupsService().fetchDataSet("cur_user_ref",null,new Object[]{searchContextDTO});
                if(resGroupsPage != null && resGroupsPage instanceof Page) {
                    resGroups.addAll(((Page<?>) resGroupsPage).getContent());
                    //已将下列方法集成至ResGroups中cur_user_ref集合内

//                    //获取继承集合
//                    List<Object> totalImpliedIds = new ArrayList<>();
//                    resGroups.forEach(item -> {
//                        ResGroupsDTO resGroupsDTO = (ResGroupsDTO) item;
//                        totalImpliedIds.addAll(this.getImpliedResGroupsIds(resGroupsDTO.getId(),true));
//                    });
//                    ISearchContextDTO impliedSearchContextDTO = getResGroupsService().createSearchContext();
//                    impliedSearchContextDTO.in(getResGroupsService().getKeyPSDEField().getLowerCaseName(), totalImpliedIds).count(false).all();
//                    Object impliedResGroups = getResGroupsService().fetchDataSet("with_nested",null,new Object[]{impliedSearchContextDTO});
//                    if(impliedResGroups != null && impliedResGroups instanceof Page) {
//                        resGroups.addAll(((Page<?>) impliedResGroups).getContent());
//                    }
                }

//                //全局规则
//                ISearchContextDTO iRRulesearchContextDTO = getIRRuleService().createSearchContext();
//                iRRulesearchContextDTO.all().count(false);
//                Object irRulePage = getIRRuleService().fetchDataSet("global",null,new Object[]{iRRulesearchContextDTO});
//                if(irRulePage != null && irRulePage instanceof Page) {
//                    //构建默认用户组承载全局规则
//                    ResGroupsDTO defaultResGroup = (ResGroupsDTO) getResGroupsService().createEntity();
//                    List RuleGroupRelDTOs = new ArrayList<>();
//                    defaultResGroup.setRuleGroupRels(RuleGroupRelDTOs);
//                    defaultResGroup.setName("__GlobalDefault__");
//                    List<IrRuleDTO> irRules = ((Page<IrRuleDTO>) irRulePage).getContent();
//                    if(!ObjectUtils.isEmpty(irRules)) {
//                        for (IrRuleDTO irRule : irRules) {
//                            RuleGroupRelDTO ruleGroupRelDTO = new RuleGroupRelDTO();
//                            ruleGroupRelDTO.setModelId(irRule.getModelId());
//                            ruleGroupRelDTO.setRuleName(irRule.getName());
//                            ruleGroupRelDTO.setDomainForce(irRule.getDomainForce());
//                            ruleGroupRelDTO.setPermRead(irRule.getPermRead());
//                            ruleGroupRelDTO.setPermCreate(irRule.getPermCreate());
//                            ruleGroupRelDTO.setPermWrite(irRule.getPermWrite());
//                            ruleGroupRelDTO.setPermUnlink(irRule.getPermUnlink());
//                            RuleGroupRelDTOs.add(ruleGroupRelDTO);
//                        }
//                    }
//                    resGroups.add(defaultResGroup);
//                }

                this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()), getDataEntityAccessCacheTag(), resGroups);
            }else {
                cacheResGroups.forEach(cacheResGroup ->{
                    ResGroupsDTO resGroupsDTO = (ResGroupsDTO) getResGroupsService().createEntity();
                    try {
                        resGroupsDTO.reload(cacheResGroup,true);
                    } catch (Exception e) {
                        log.error(String.format("缓存权限组读取失败：%1$s",e.getMessage()));
                    }
                    resGroups.add(resGroupsDTO);
                });

            }
            resGroups.forEach(item -> {
                ResGroupsDTO resGroupsDTO = (ResGroupsDTO) item;
                if (!ObjectUtils.isEmpty(resGroupsDTO.getRuleGroupRels())) {
                    //重现域限制权限规则
                    resGroupsDTO.getRuleGroupRels().forEach(ruleGroupRelDTO -> {
                        if (this.getDataEntityRuntime().getName().equals(ruleGroupRelDTO.getModelId())) {
                            ObjectNode userRoleNode = JsonUtils.createObjectNode();
                            userRoleNode.put(PSDEUserRoleImpl.ATTR_GETNAME, ruleGroupRelDTO.getRuleName());
                            if("__GlobalDefault__".equals(resGroupsDTO.getName())){
                                userRoleNode.put(PSDEUserRoleImpl.ATTR_GETUSERTAG, "__GlobalDefault__");
                            }
                            if (ruleGroupRelDTO.getDomainForce() != null)
                                userRoleNode.put(PSDEUserRoleImpl.ATTR_GETCUSTOMCOND, ruleGroupRelDTO.getDomainForce());
                            ArrayNode userRoleDataActionsNode = JsonUtils.createArrayNode();

                            if (DataTypeUtils.asInteger(ruleGroupRelDTO.getPermRead(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "READ");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }
                            if (DataTypeUtils.asInteger(ruleGroupRelDTO.getPermCreate(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "CREATE");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }
                            if (DataTypeUtils.asInteger(ruleGroupRelDTO.getPermWrite(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "UPDATE");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }
                            if (DataTypeUtils.asInteger(ruleGroupRelDTO.getPermUnlink(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "DELETE");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }

                            userRoleNode.put(PSDEUserRoleImpl.ATTR_GETPSDEUSERROLEOPPRIVS, userRoleDataActionsNode);
                            try {
                                IPSDEUserRole iPSDEUserRole = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDEUserRole.class, userRoleNode);
                                iPSDEUserRoles.add(iPSDEUserRole);
                            } catch (Exception ex) {
                                log.error(ex);
                            }
                        }
                    });
                }
                if (!ObjectUtils.isEmpty(resGroupsDTO.getModelAccess())) {
                    //重现全部数据权限规则
                    resGroupsDTO.getModelAccess().forEach(modelAccessDTO -> {
                        if (this.getDataEntityRuntime().getName().equals(modelAccessDTO.getModelId())) {
                            ObjectNode userRoleNode = JsonUtils.createObjectNode();
                            userRoleNode.put(PSDEUserRoleImpl.ATTR_GETNAME, modelAccessDTO.getName());
                            userRoleNode.put(PSDEUserRoleImpl.ATTR_ISALLDATA,true);
                            ArrayNode userRoleDataActionsNode = JsonUtils.createArrayNode();

                            if (DataTypeUtils.asInteger(modelAccessDTO.getPermRead(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "READ");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }
                            if (DataTypeUtils.asInteger(modelAccessDTO.getPermCreate(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "CREATE");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }
                            if (DataTypeUtils.asInteger(modelAccessDTO.getPermWrite(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "UPDATE");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }
                            if (DataTypeUtils.asInteger(modelAccessDTO.getPermUnlink(),0) == 1) {
                                ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
                                userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, "DELETE");
                                userRoleDataActionsNode.add(userRoleDataActionNode);
                            }

                            userRoleNode.put(PSDEUserRoleImpl.ATTR_GETPSDEUSERROLEOPPRIVS, userRoleDataActionsNode);
                            try {
                                IPSDEUserRole iPSDEUserRole = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDEUserRole.class, userRoleNode);
                                iPSDEUserRoles.add(iPSDEUserRole);
                            } catch (Exception ex) {
                                log.error(ex);
                            }
                        }
                    });
                }
            });
            return iPSDEUserRoles;
        } catch (Throwable e) {
            log.error(e);
            return new ArrayList<>();
        }
    }

    /**
     * 定义缓存标识
     * @return
     */
    protected String getDataEntityAccessCacheTag(){
        return String.format("odoodeaccess");
    }

    protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
        return this.getSysCacheUtilRuntime(false);
    }

    protected ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode) {
        if(this.iSysCacheUtilRuntime != null || bTryMode) {
            return this.iSysCacheUtilRuntime;
        }
        throw new SystemRuntimeException(this.getSystemRuntime(), "未指定系统缓存功能组件");
    }

    protected void setSysCacheUtilRuntime(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
        this.iSysCacheUtilRuntime = iSysCacheUtilRuntime;
    }

    protected void prepareSysCacheUtilRuntime() throws Exception {
        this.setSysCacheUtilRuntime(this.getSystemRuntime().getSysCacheUtilRuntime(true));
    }

//    /**
//     * 递归查找继承权限组
//     * @param key
//     * @param recursive
//     * @return
//     */
//    protected java.util.List<Object> getImpliedResGroupsIds(java.lang.Object key, boolean recursive) {
//        Assert.notNull(key, "传入键值无效");
//        Queue<Object> idQueue = new ArrayDeque<Object>();
//        String pickupPSDEField = ResGroupsImpliedRelDTO.FIELD_HID;
//        String keyPSDEField = ResGroupsImpliedRelDTO.FIELD_GID;
//        List<Object> totalList = new ArrayList<Object>();
//        //预先放入避免递归重复查询，后续输出时移除
//        totalList.add(key);
//        idQueue.add(key);
//        while (idQueue.size() > 0) {
//            ISearchContextDTO iSearchContextDTO = this.getResGroupsImpliedRelService().createSearchContext().count(false).all();
//            iSearchContextDTO.eq(keyPSDEField, idQueue.poll());
//            List<IEntityDTO> list = this.getResGroupsImpliedRelService().selectDataQuery(this.getResGroupsImpliedRelService().getSimplePSDEDataQuery(), iSearchContextDTO);
//            if (ObjectUtils.isEmpty(list)) {
//                break;
//            }
//
//            for (IEntityDTO iEntityDTO : list) {
//                Object parentId = iEntityDTO.get(pickupPSDEField);
//                if (!ObjectUtils.isEmpty(parentId) && !totalList.contains(parentId)) {
//                    idQueue.add(parentId);
//                    totalList.add(parentId);
//                }
//            }
//
//            if (!recursive) {
//                break;
//            }
//        }
//        totalList.remove(key);
//        return totalList;
//    }

    public IOdooSystemRuntimeBase getMainSystemRuntime() {
        IOdooSystemRuntimeBase mainSystemRuntime = (IOdooSystemRuntimeBase)((IOdooSystemRuntimeBase) super.getSystemRuntime()).getMainSystemRuntime(true);
        if(mainSystemRuntime == null) {
            mainSystemRuntime = (IOdooSystemRuntimeBase) this.getSystemRuntime();
        }
        return mainSystemRuntime;
    }

    /**
     * 添加权限条件,区分全局条件与常规条件
     * @param searchContext
     * @param iEmployeeContext
     * @param action
     */
    @Override
    public void addAuthorityConditions(ISearchContextDTO searchContext, IEmployeeContext iEmployeeContext, String action) {
        if (!this.testSuperuser(iEmployeeContext)) {
            List<ISearchCond> items = searchContext.getSearchCondsIf();
            List<IPSDEUserRole> authorities = this.getPSDEUserRoles(iEmployeeContext, action);
            List<IPSDEUserRole> globalAuthorities = new ArrayList<>();
            //分离全局规则与常规规则
            java.util.Iterator<IPSDEUserRole> authorityIterator = authorities.iterator();
            while (authorityIterator.hasNext()){
                IPSDEUserRole authority = authorityIterator.next();
                if("__GlobalDefault__".equals(authority.getUserTag())){
                    globalAuthorities.add(authority);
                    authorityIterator.remove();
                }
            }
            if (!authorities.stream().anyMatch((authority) -> {
                return authority.isAllData();
            })) {
                SearchGroupCond authorityCond = new SearchGroupCond(searchContext);
                authorityCond.setCondOp("AND");
                authorityCond.setCat("AUTHORITY");
                SearchGroupCond authorityConds = new SearchGroupCond(searchContext);
                authorityConds.setCondOp("OR");
                authorityCond.getSearchCondsIf().add(authorityConds);
                if (authorities.size() == 0) {
                    if (globalAuthorities.size() == 0) {
                        SearchCustomCond customCond = new SearchCustomCond();
                        customCond.setCustomCond("1 <> 1");
                        authorityConds.getSearchCondsIf().add(customCond);
                    }
                    items.add(authorityCond);
                } else {
                    List<ISearchCond> conds = this.genAuthorityConditions(authorities, action);
                    if (!ObjectUtils.isEmpty(conds)) {
                        authorityConds.getSearchCondsIf().addAll(conds);
                        items.add(authorityCond);
                    } else {
                        SearchCustomCond customCond = new SearchCustomCond();
                        customCond.setCustomCond("1 <> 1");
                        authorityConds.getSearchCondsIf().add(customCond);
                        items.add(authorityCond);
                    }
                }
                //全局权限条件用AND连接
                SearchGroupCond GlobalAuthorityConds = new SearchGroupCond(searchContext);
                GlobalAuthorityConds.setCondOp("AND");
                if (globalAuthorities.size() != 0){
                    List<ISearchCond> conds = this.genAuthorityConditions(globalAuthorities, action);
                    if (!ObjectUtils.isEmpty(conds)) {
                        GlobalAuthorityConds.getSearchCondsIf().addAll(conds);
                    }
                    authorityCond.getSearchCondsIf().add(GlobalAuthorityConds);
                }
            }
        }
    }
}