package cn.ibizlab.central.plugin.odoo.dataentity;

import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrRuleDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResGroupsDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResGroupsImpliedRelDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.RuleGroupRelDTO;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.annotation.DEDataSet;

import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 群组实体运行时对象
 * @author lionlau
 *
 */
public class ResGroupsDERuntime extends OdooDataEntityRuntimeBase{

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

    @DEDataSet("CUR_USER_REF")
    protected Page<?> doFetchCurUserRef(ISearchContextDTO iSearchContextDTO) throws Throwable {
        iSearchContextDTO.all();
        Object ret = this.doFetchDataSetReal("CUR_USER_REF",null, new Object[] {iSearchContextDTO}, null);
        List resGroups = new ArrayList<>();
        Page<IEntityDTO> page = new PageImpl<>(resGroups);
        if(ret!=null && ret instanceof Page){
            page = (Page<IEntityDTO>)ret;
            resGroups.addAll(((Page<?>) page).getContent());
            //获取继承集合
            List<Object> totalImpliedIds = new ArrayList<>();
            resGroups.forEach(item -> {
                ResGroupsDTO resGroupsDTO = (ResGroupsDTO) item;
                totalImpliedIds.addAll(this.getImpliedResGroupsIds(resGroupsDTO.getId(),true));
            });
            ISearchContextDTO impliedSearchContextDTO = this.createSearchContext();
            impliedSearchContextDTO.in(this.getKeyPSDEField().getLowerCaseName(), totalImpliedIds).count(false).all();
            Object impliedResGroups = this.fetchDataSet("with_nested",null,new Object[]{impliedSearchContextDTO});
            if(impliedResGroups != null && impliedResGroups instanceof Page) {
                resGroups.addAll(((Page<?>) impliedResGroups).getContent());
            }

            //全局规则
            ISearchContextDTO iRRulesearchContextDTO = getIRRuleService().createSearchContext();
            iRRulesearchContextDTO.all().count(false);
            Object irRulePage = getIRRuleService().fetchDataSet("global",null,new Object[]{iRRulesearchContextDTO});
            if(irRulePage != null && irRulePage instanceof Page) {
                //构建默认用户组承载全局规则
                ResGroupsDTO defaultResGroup = (ResGroupsDTO) this.createEntity();
                List RuleGroupRelDTOs = new ArrayList<>();
                defaultResGroup.setRuleGroupRels(RuleGroupRelDTOs);
                defaultResGroup.setName("__GlobalDefault__");
                List<IrRuleDTO> irRules = ((Page<IrRuleDTO>) irRulePage).getContent();
                if(!ObjectUtils.isEmpty(irRules)) {
                    for (IrRuleDTO irRule : irRules) {
                        RuleGroupRelDTO ruleGroupRelDTO = new RuleGroupRelDTO();
                        ruleGroupRelDTO.setModelId(irRule.getModelId());
                        ruleGroupRelDTO.setRuleName(irRule.getName());
                        ruleGroupRelDTO.setDomainForce(irRule.getDomainForce());
                        ruleGroupRelDTO.setPermRead(irRule.getPermRead());
                        ruleGroupRelDTO.setPermCreate(irRule.getPermCreate());
                        ruleGroupRelDTO.setPermWrite(irRule.getPermWrite());
                        ruleGroupRelDTO.setPermUnlink(irRule.getPermUnlink());
                        RuleGroupRelDTOs.add(ruleGroupRelDTO);
                    }
                }
                resGroups.add(defaultResGroup);
            }
        }
        return new PageImpl<IEntityDTO>(resGroups, iSearchContextDTO.getPageable(), resGroups.size(), page.getTotalPages());
    }

    /**
     * 递归查找继承权限组
     * @param key
     * @param recursive
     * @return
     */
    protected java.util.List<Object> getImpliedResGroupsIds(java.lang.Object key, boolean recursive) {
        Assert.notNull(key, "传入键值无效");
        Queue<Object> idQueue = new ArrayDeque<Object>();
        String pickupPSDEField = ResGroupsImpliedRelDTO.FIELD_HID;
        String keyPSDEField = ResGroupsImpliedRelDTO.FIELD_GID;
        List<Object> totalList = new ArrayList<Object>();
        //预先放入避免递归重复查询，后续输出时移除
        totalList.add(key);
        idQueue.add(key);
        while (idQueue.size() > 0) {
            ISearchContextDTO iSearchContextDTO = this.getResGroupsImpliedRelService().createSearchContext().count(false).all();
            iSearchContextDTO.eq(keyPSDEField, idQueue.poll());
            List<IEntityDTO> list = this.getResGroupsImpliedRelService().selectDataQuery(this.getResGroupsImpliedRelService().getSimplePSDEDataQuery(), iSearchContextDTO);
            if (ObjectUtils.isEmpty(list)) {
                break;
            }

            for (IEntityDTO iEntityDTO : list) {
                Object parentId = iEntityDTO.get(pickupPSDEField);
                if (!ObjectUtils.isEmpty(parentId) && !totalList.contains(parentId)) {
                    idQueue.add(parentId);
                    totalList.add(parentId);
                }
            }

            if (!recursive) {
                break;
            }
        }
        totalList.remove(key);
        return totalList;
    }
}
