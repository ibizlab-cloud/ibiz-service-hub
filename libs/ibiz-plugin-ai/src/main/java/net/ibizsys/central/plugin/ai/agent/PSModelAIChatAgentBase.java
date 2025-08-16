package net.ibizsys.central.plugin.ai.agent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntity;

public abstract class PSModelAIChatAgentBase extends AIChatAgentBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelAIChatAgentBase.class);

	
	public final static String TEMPLPARAM_APPDE = "appde";
	public final static String TEMPLPARAM_DE = "de";
	
	
	protected abstract IDataEntityRuntime getDataEntityRuntime();
	
	@Override
	protected List getActiveData(Object dataOrKeys) throws Throwable {
		List<IEntity> entityList = new ArrayList<IEntity>();
		if(dataOrKeys instanceof List) {
			List list = (List)dataOrKeys;
			for(Object item : list) {
				if(item instanceof IEntity) {
					entityList.add((IEntity)item);
				}
				else {
					entityList.add(this.getDataEntityRuntime().get(item));
				}
			}
		}
		else {
			if(dataOrKeys instanceof String) {
				String[] keys = StringUtils.tokenizeToStringArray((String)dataOrKeys, ";,|");
				for(String key : keys) {
					entityList.add(this.getDataEntityRuntime().get(key));
				}
			}
			else {
				entityList.add(this.getDataEntityRuntime().get(dataOrKeys));
			}
		}
		return entityList;
	}
}
