package net.ibizsys.model.app.control;



public class PSAppCounterRefImpl extends net.ibizsys.model.control.counter.PSSysCounterRefImpl implements net.ibizsys.model.app.control.IPSAppCounterRef{

	public final static String ATTR_GETPSAPPCOUNTER = "getPSAppCounter";
	private net.ibizsys.model.app.control.IPSAppCounter psappcounter;

	public net.ibizsys.model.app.control.IPSAppCounter getPSAppCounter(){
		if(this.psappcounter != null) return this.psappcounter;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTER);
		if(value == null){
			return null;
		}
		this.psappcounter = getPSModelObject(net.ibizsys.model.app.control.IPSAppCounter.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCOUNTER);
		return this.psappcounter;
	}

	public net.ibizsys.model.app.control.IPSAppCounter getPSAppCounterMust(){
		net.ibizsys.model.app.control.IPSAppCounter value = this.getPSAppCounter();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器");}
		return value;
	}

	public void setPSAppCounter(net.ibizsys.model.app.control.IPSAppCounter psappcounter){
		this.psappcounter = psappcounter;
	}

}