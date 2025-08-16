package ${item.getPKGCodeName()}.dataentity

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime
import net.ibizsys.central.util.EntityDTO
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.central.util.SearchContextDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.action.IPSDEAction
import net.ibizsys.model.dataentity.defield.IPSDEField
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.model.dataentity.mainstate.IPSDEMainState
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO
import net.ibizsys.runtime.IDynaInstRuntime
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime
import net.ibizsys.runtime.util.EntityError
import net.ibizsys.runtime.util.IEntityBase

import org.springframework.data.domain.Page

@groovy.transform.CompileStatic
class ${item.codeName.capitalize()}DERuntime extends DataEntityRuntime{

    private Map<String, IPSDEAction> ACTIONS = new HashMap<>()
    
 
<% item.getAllPSDEMethodDTOs().each {
out << ctx.output(it, '/dataentity/dto/DTO_'+it.type+'_sub.tpl', '    ') << '\n'
}%>

    @Override
	protected void onInit() throws Exception {
		super.onInit();
		
		this.getPSDataEntity().getAllPSDEActions().each { 
			ACTIONS[it.name.toUpperCase()] = it
		}
	}

    @Override
	protected IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
<% item.getAllPSDEMethodDTOs().each {
   if(it.type != 'DEACTIONINPUT' && it.type != 'DEFAULT') return;
%>\
        if('${it.name}'.equalsIgnoreCase(iPSDEMethodDTO.getName())) return new ${it.name}()
<%}%>\
		return super.createEntityDTO(iPSDEMethodDTO)
	}
	
	@Override
	protected ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
<% item.getAllPSDEMethodDTOs().each {
   if(it.type != 'DEFILTER' ) return;
%>\
        if('${it.name}'.equalsIgnoreCase(iPSDEMethodDTO.getName())) return new ${it.name}()
<%}%>\
		return super.createSearchContextDTO(iPSDEMethodDTO)
	}

<% if(item.getMainStatePSDEFields()){%>\
	@Override
	public IPSDEMainState getPSDEMainState(Object obj) throws Exception {
	    /**
		 * 主状态控制属性
		 */
<% item.getMainStatePSDEFields().each{%>\
        // ${it.logicName}(${it.name})
<% }%>\
		return super.getPSDEMainState(obj)
	}
<% }%>\

    @Override
	protected Object executeActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, boolean bIgnoreDEService) throws Throwable {
		if(!bIgnoreDEService) {
<% item.getAllPSDEActions().each {%>\
            if('${it.name}'.equalsIgnoreCase(strActionName)){
<% if(it.getPSDEActionReturnMust().type == 'VOID'){ %>\
                ${it.codeName.uncapitalize()}(<% out << ((it.getPSDEActionInputMust().type == 'NONE')?'':((it.getPSDEActionInputMust().groovyType=='def'?'':('('+ it.getPSDEActionInputMust().groovyType+')')) + 'args[0]')) %>)
                return;            
<% }else{ %>\
                return ${it.codeName.uncapitalize()}(<% out << ((it.getPSDEActionInputMust().type == 'NONE')?'':((it.getPSDEActionInputMust().groovyType=='def'?'':('('+ it.getPSDEActionInputMust().groovyType+')')) + 'args[0]')) %>)
<%}%>\
            }
<%}%>\
        }
		return super.executeActionReal(strActionName, iPSDEAction, args, bIgnoreDEService)
	}
	
	@Override
	protected void executeActionLogics(IEntityBase iEntity, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
<% item.getAllPSDEActions().each {
        if(!it.getPreparePSDEActionLogics()
           && !it.getCheckPSDEActionLogics()
           && !it.getBeforePSDEActionLogics()
           && !it.getAfterPSDEActionLogics()) 
            return;

%>\
        if('${it.name}'.equalsIgnoreCase(iPSDEAction.getName())){
<% if(it.getPreparePSDEActionLogics()){ %>\
            if('PREPARE'.equalsIgnoreCase(strAttachMode)){
                onPrepare${it.codeName.capitalize()}(iEntity, iPSDEAction, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
                return
            }
<% } %>\
<% if(it.getCheckPSDEActionLogics()){ %>\
            if('CHECK'.equalsIgnoreCase(strAttachMode)){
                onCheck${it.codeName.capitalize()}(iEntity, iPSDEAction, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
                return
            }
<% } %>\
<% if(it.getBeforePSDEActionLogics()){ %>\
            if('BEFORE'.equalsIgnoreCase(strAttachMode)){
                onBefore${it.codeName.capitalize()}(iEntity, iPSDEAction, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
                return
            }
<% } %>\
<% if(it.getAfterPSDEActionLogics()){ %>\
            if('AFTER'.equalsIgnoreCase(strAttachMode)){
                onAfter${it.codeName.capitalize()}(iEntity, iPSDEAction, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
                return
            }
<% } %>\
            super.executeActionLogics(iEntity, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
            return
        }
<% } %>\
		super.executeActionLogics(iEntity, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
	}
	
<% item.getAllPSDEActions().each { %>
    ${it.getPSDEActionReturnMust().groovyType} ${it.codeName.uncapitalize()}(<% out << ((it.getPSDEActionInputMust().type == 'NONE')?'':(it.getPSDEActionInputMust().groovyType + ' arg'))%>) throws Throwable{
        def args = [arg] as Object[]
        <% out << ((it.getPSDEActionReturnMust().type == 'VOID')?'':('return (' + it.getPSDEActionReturnMust().groovyType + ')')) %>super.executeActionReal('${it.name}', null, args, true);
    }
    
<% if(it.getPreparePSDEActionLogics()){ %>\
    protected void onPrepare${it.codeName.capitalize()}(IEntityBase iEntity, IPSDEAction iPSDEAction, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
        // 执行以下逻辑：
<% it.getPreparePSDEActionLogics().each{ 
    if (!it.isValid() || !it.isEnableBackend()) {
        return
    }
%>\
        ${it.comment.commentString}
<% } %>\
        super.executeActionLogics(iEntity, iPSDEAction, 'PREPARE', iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
    }
<% } %>\
<% if(it.getCheckPSDEActionLogics()){ %>\
    protected void onCheck${it.codeName.capitalize()}(IEntityBase iEntity, IPSDEAction iPSDEAction, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
        // 执行以下逻辑：
<% it.getCheckPSDEActionLogics().each{ 
    if (!it.isValid() || !it.isEnableBackend()) {
        return
    }
%>\
        ${it.comment.commentString}
<% } %>\
        super.executeActionLogics(iEntity, iPSDEAction, 'CHECK', iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
    }
<% } %>\
<% if(it.getBeforePSDEActionLogics()){ %>\
    protected void onBefore${it.codeName.capitalize()}(IEntityBase iEntity, IPSDEAction iPSDEAction, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
        // 执行以下逻辑：
<% it.getBeforePSDEActionLogics().each{ 
    if (!it.isValid() || !it.isEnableBackend()) {
        return;
    }
%>\
        ${it.comment.commentString}
<% } %>\
        super.executeActionLogics(iEntity, iPSDEAction, 'BEFORE', iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
    }
<% } %>\
<% if(it.getAfterPSDEActionLogics()){ %>\
    protected void onAfter${it.codeName.capitalize()}(IEntityBase iEntity, IPSDEAction iPSDEAction, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
        // 执行以下逻辑：
<% it.getAfterPSDEActionLogics().each{ 
    if (!it.isValid() || !it.isEnableBackend()) {
        return;
    }
%>\
        ${it.comment.commentString}
<% } %>\
        super.executeActionLogics(iEntity, iPSDEAction, 'AFTER', iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData)
    }
<% } %>\
<% }%>

    @Override
    public Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, boolean bIgnoreDEService) throws Throwable {
		if(!bIgnoreDEService) {
<% item.getAllPSDEDataSets().each {%>\
            if('${it.name}'.equalsIgnoreCase(strDataSetName)){
                return fetch${it.codeName.capitalize()}(<% out << ((it.getPSDEDataSetInputMust().type == 'NONE')?'':((it.getPSDEDataSetInputMust().groovyType=='def'?'':('('+ it.getPSDEDataSetInputMust().groovyType+')')) + 'args[0]')) %>)
            }
<%}%>\
		}
		return super.fetchDataSet(strDataSetName, iPSDEDataSet, args, bIgnoreDEService)
	}

<% item.getAllPSDEDataSets().each { %>
    ${it.getPSDEDataSetReturnMust().groovyType} fetch${it.codeName.capitalize()}(<% out << ((it.getPSDEDataSetInputMust().type == 'NONE')?'':(it.getPSDEDataSetInputMust().groovyType + ' arg'))%>) throws Throwable{
        def args = [arg] as Object[]
        <% out << ((it.getPSDEDataSetReturnMust().type == 'VOID')?'':('return (' + it.getPSDEDataSetReturnMust().groovyType + ')')) %>super.fetchDataSet('${it.name}', null, args, true);
    }
<% }%>\

    @Override
	protected void fillEntityDefaultValues(IEntityBase iEntity, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
	    /**
		 * 属性默认值设置
		 */
<% item.getAllPSDEFields().each {
    if(!it.getDefaultValue() && !it.getDefaultValueType())
        return 
%>\
        // ${it.logicName}(${it.name})  =  ${it.defaultValueComment}
<% }%>\
		super.fillEntityDefaultValues(iEntity, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData)
	}
	
	@Override
	protected void onRemoveInvalidUserInput(IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable {
		/**
		 * 新建数据行为移除以下属性
		 */
<% item.getAllPSDEFields().each {
    if(it.isKeyDEField() || it.isEnableUICreate())
        return 
%>\
        // ${it.logicName}(${it.name})
<% }%>\

		/**
		 * 更新数据行为移除以下属性
		 */
<% item.getAllPSDEFields().each {
    if(it.isKeyDEField() || it.isEnableUIModify())
        return 
%>\
        // ${it.logicName}(${it.name})
<% }%>\
		super.onRemoveInvalidUserInput(iPSDEAction, iEntityDTO)
	}
	
	@Override
	protected boolean checkFieldValueRule(IEntityBase iEntity, IPSDEField iPSDEField, boolean bCheckEmpty, boolean bCheckDup, boolean bCheckDEFValueRule, boolean bDynaInstMode, EntityError entityError) throws Throwable {
		switch(iPSDEField.getName()){
<% item.getAllPSDEFields().each {%>\
            case '${it.getName()}':
                return checkFieldValueRule_${it.codeName.capitalize()}(iEntity, iPSDEField, bCheckEmpty, bCheckDup, bCheckDEFValueRule, bDynaInstMode, entityError)
<% }%>\
		    default:
		        break;
		}
		return super.checkFieldValueRule(iEntity, iPSDEField, bCheckEmpty, bCheckDup, bCheckDEFValueRule, bDynaInstMode, entityError)
	}
	
	@Override
	protected boolean checkFieldValueRule(Object objValue, IEntityBase iEntity, IPSDEFValueRule iPSDEFValueRule, IPSDEField iPSDEField, IPSDataEntity iPSDataEntity, EntityError entityError) throws Throwable {
		switch(iPSDEField.getName()+'__'+iPSDEFValueRule.getCodeName()){
<% item.getAllPSDEFields().each {
    def field = it
    it.getAllPSDEFValueRules().each {%>\
            case '${field.getName()}__${it.codeName}':
                return checkFieldValueRule_${field.codeName.capitalize()}_${it.codeName.capitalize()}(objValue, iEntity, iPSDEFValueRule, iPSDEField, iPSDataEntity, entityError)
<% }}%>\
		    default:
		        break;
		}		
		return super.checkFieldValueRule(objValue, iEntity, iPSDEFValueRule, iPSDEField, iPSDataEntity, entityError)
	}
	
<% item.getAllPSDEFields().each {
    def field = it
%>\
	protected boolean checkFieldValueRule_${it.codeName.capitalize()}(IEntityBase iEntity, IPSDEField iPSDEField, boolean bCheckEmpty, boolean bCheckDup, boolean bCheckDEFValueRule, boolean bDynaInstMode, EntityError entityError) throws Throwable {
${it.valueRuleComment.commentString('		// ')}
<% it.getAllPSDEFValueRules().each {
    if(!it.isCheckDefault() || !it.isEnableBackend())
        return         
%>\
        // [属性值规则] ${it.name}(${it.codeName})
<% }%>\
        return super.checkFieldValueRule(iEntity, iPSDEField, bCheckEmpty, bCheckDup, bCheckDEFValueRule, bDynaInstMode, entityError)
	}
	
<% field.getAllPSDEFValueRules().each {
    if(!it.isEnableBackend())
        return         
%>\
    protected boolean checkFieldValueRule_${field.codeName.capitalize()}_${it.codeName.capitalize()}(Object objValue, IEntityBase iEntity, IPSDEFValueRule iPSDEFValueRule, IPSDEField iPSDEField, IPSDataEntity iPSDataEntity, EntityError entityError) throws Throwable {
<% if(it.getPSDEFVRGroupConditionMust().comment){%>\
${it.getPSDEFVRGroupConditionMust().comment.commentString('		// ')}
        return super.checkFieldValueRule(objValue, iEntity, iPSDEFValueRule, iPSDEField, iPSDataEntity, entityError)      
<%}else{%>\
        // （无）
        return true;
<% }%>\
    }
    
<% }%>\
<% }%>\
}