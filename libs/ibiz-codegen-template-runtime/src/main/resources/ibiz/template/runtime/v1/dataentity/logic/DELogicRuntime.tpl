package ${item.getPKGCodeName()}.logic

import com.fasterxml.jackson.annotation.JsonIgnore

import net.ibizsys.central.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode
import net.ibizsys.model.dataentity.logic.IPSDEThrowExceptionLogic

@groovy.transform.CompileStatic
class ${item.codeName.capitalize()}DELogicRuntime extends DELogicRuntime{

    private Map<String, IPSDELogicNode> NODES = new HashMap<>()

    @Override
	protected void onInit() throws Exception {
		super.onInit();
		
		//缓存模型
		this.getPSDELogic().getPSDELogicNodes().each { 
			NODES[it.codeName.toUpperCase()] = it
		}
	}

    @Override
	protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        String strCodeName = iPSDELogicNode.getCodeName()
<% item.getPSDELogicNodes().each {%>\
        if('${it.codeName.toUpperCase()}'.equalsIgnoreCase(strCodeName)){
            execute${it.codeName.capitalize()}(iDELogicSession)
            return;            
        }
<%}%>\
		super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode);
	}

<% item.getPSDELogicNodes().each { 
    def node = it
%>
    /**
     * 执行逻辑节点[${it.name}]，逻辑类型[${it.getLogicNodeType()}]
     * @param iDELogicSession
     * @throws Throwable
     */
    private void execute${it.codeName.capitalize()}(IDELogicSession iDELogicSession) throws Throwable{
        try{
<% /*(it.getPSSysSFPlugin() == null) && */ if( ctx.contains("/dataentity/logic/DELogicNodeRuntime_" + it.getLogicNodeType() + '.tpl')){
        out << ctx.output(it, "/dataentity/logic/DELogicNodeRuntime_" + it.getLogicNodeType() + '.tpl', '            ') << '\n' %>\
            //super.onExecutePSDELogicNode(iDELogicSession, NODES['${it.codeName.toUpperCase()}'], false)
<%}else{%>\
            //模板未展开，调用基类执行
            super.onExecutePSDELogicNode(iDELogicSession, NODES['${it.codeName.toUpperCase()}'], false)
<%}%>\
        }
        catch(Throwable ex){
<% if(it.catchPSDELogicLink){%>\
            if(ex instanceof IPSDEThrowExceptionLogic){
                throws ex
            }
            execute${it.catchPSDELogicLink.getDstPSDELogicNodeMust().codeName.capitalize()}(iDELogicSession);
            return;
<% }else{ %>\
            //未定义异常处理连接，直接抛出
            throw ex
<%}%>\
        }
<% it.getPSDELogicLinks().each {
     if(it.isCatchLink()){
        return;
     }
%>\
        if(${it.groovyExpression}){
            //执行逻辑节点[${it.getDstPSDELogicNodeMust().name}]
            execute${it.getDstPSDELogicNodeMust().codeName.capitalize()}(iDELogicSession);
<% if(!node.isParallelOutput()) {%>\
            return;
<% }else{ %>\
            //逻辑节点定义平行后续处理，继续执行  
<%}%>\
        }
<% }%>\
    }
<% }%>


   

}