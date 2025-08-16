package cn.ibizlab.central.plugin.groovy.dataentity.logic

import net.ibizsys.central.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode
import cn.ibizlab.central.plugin.groovy.dataentity.SimpleDataEntityRuntime.TrademarkDTO;

class SimpleDELogicRuntime extends DELogicRuntime{
	
	private def NODES = new HashMap<String, IPSDELogicNode>()

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
        if('BEGIN'.equalsIgnoreCase(strCodeName)){
            executeBegin(iDELogicSession)
            return;            
        }
        if('RAWSFCODE1'.equalsIgnoreCase(strCodeName)){
            executeRawsfcode1(iDELogicSession)
            return;            
        }
        if('PREPAREPARAM1'.equalsIgnoreCase(strCodeName)){
            executePrepareparam1(iDELogicSession)
            return;            
        }
		super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode);
	}


    /**
     * 执行逻辑节点[开始]，逻辑类型[BEGIN]
     * @param iDELogicSession
     * @throws Throwable
     */
    private void executeBegin(IDELogicSession iDELogicSession) throws Throwable{
        try{
            //模板未展开，调用基类执行
            super.onExecutePSDELogicNode(iDELogicSession, NODES['BEGIN'], false)
        }
        catch(Throwable ex){
            //未定义异常处理连接，直接抛出
            throw ex
        }
        if(true){
            //执行逻辑节点[准备参数处理]
            executePrepareparam1(iDELogicSession);
            //逻辑节点定义平行后续处理，继续执行  
        }
    }

    /**
     * 执行逻辑节点[脚本]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @throws Throwable
     */
    private void executeRawsfcode1(IDELogicSession iDELogicSession) throws Throwable{
        try{
            //脚本代码：
            // //Groovy
            // def a=1
            // a + 100
            // def param1 = logic.param('default')
            // param1.lawsupportname = param1.lawsupportname + a
            //调用基类执行
            super.onExecutePSDELogicNode(iDELogicSession, NODES['RAWSFCODE1'], false)
            //super.onExecutePSDELogicNode(iDELogicSession, NODES['RAWSFCODE1'], false)
        }
        catch(Throwable ex){
            //未定义异常处理连接，直接抛出
            throw ex
        }
    }

    /**
     * 执行逻辑节点[准备参数处理]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @throws Throwable
     */
    private void executePrepareparam1(IDELogicSession iDELogicSession) throws Throwable{
        try{
            // 当前参数：传入变量(Default)
            // 脚本代码：
            // /*Groovy*/
            // param.get('lawsupportname') + '测试'
            param('Default').set('aa', getNodeParamValue(NODES['PREPAREPARAM1'].getPSDELogicNodeParams()[0]))
            //super.onExecutePSDELogicNode(iDELogicSession, NODES['PREPAREPARAM1'], false)
        }
        catch(Throwable ex){
            //未定义异常处理连接，直接抛出
            throw ex
        }
        if(true){
            //执行逻辑节点[脚本]
            executeRawsfcode1(iDELogicSession);
            //逻辑节点定义平行后续处理，继续执行  
        }
    }

	
}
