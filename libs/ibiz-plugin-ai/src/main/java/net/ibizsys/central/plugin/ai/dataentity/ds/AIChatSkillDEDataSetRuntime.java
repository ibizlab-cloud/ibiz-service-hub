package net.ibizsys.central.plugin.ai.dataentity.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatSkill;
import net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase;
import net.ibizsys.central.plugin.ai.agent.ISysAIFactoryRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.plugin.IPluginRuntimeInitable;

public class AIChatSkillDEDataSetRuntime extends DEDataSetRuntimeBase implements IPluginRuntimeInitable{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIChatSkillDEDataSetRuntime.class);
	ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
	
	public static final String SKILL_FIELD_NAME = "NAME";
	public static final String SKILL_FIELD_PROMPT = "PROMPT";
	
	@Override
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)super.getSystemRuntime();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
	}
	
	protected ISysAIFactoryRuntime getSysAIFactoryRuntime() throws Exception {
		if(this.iSysAIFactoryRuntime == null) {
			//获取系统的AI工厂
			List<IPSSysAIFactory> psSysAIFactoryList = getSystemRuntime().getPSSystem().getAllPSSysAIFactories();
			if(ObjectUtils.isEmpty(psSysAIFactoryList)) {
				throw new Exception("当前系统未定义AI工厂");
			}
			this.iSysAIFactoryRuntime = (ISysAIFactoryRuntime)this.getSystemRuntime().getSysAIFactoryRuntime(psSysAIFactoryList.get(0));
		}
		return this.iSysAIFactoryRuntime;
	}
	
	@Override
	protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		
		IPSDEField namePSDEField = this.getDataEntityRuntime().getPSDEFieldByTag(SKILL_FIELD_NAME, true);
		if(namePSDEField == null) {
			namePSDEField = this.getDataEntityRuntime().getMajorPSDEField();
		}
		
		IPSDEField promptPSDEField = this.getDataEntityRuntime().getPSDEFieldByTag(SKILL_FIELD_PROMPT, true);
		
		List<ISysAIChatSkill> sysAIChatSkillList = this.getSysAIFactoryRuntime().getAIChatSkills();
		if(!ObjectUtils.isEmpty(sysAIChatSkillList)) {
			for(ISysAIChatSkill iSysAIChatSkill : sysAIChatSkillList) {
				IEntityDTO entityDTO = this.getDataEntityRuntime().createEntity();
				this.getDataEntityRuntime().setFieldValue(entityDTO, this.getDataEntityRuntime().getKeyPSDEField(), iSysAIChatSkill.getId());
				if(namePSDEField != null) {
					this.getDataEntityRuntime().setFieldValue(entityDTO, namePSDEField, iSysAIChatSkill.getName());
				}
				if(promptPSDEField != null) {
					this.getDataEntityRuntime().setFieldValue(entityDTO, promptPSDEField, iSysAIChatSkill.getPrompt());
				}
				entityDTOList.add(entityDTO);
			}
		}
		
		if(namePSDEField != null) {
			IPSDEField finalNamePSDEField = namePSDEField;
			Collections.sort(entityDTOList, new Comparator<IEntityDTO>() {

				@Override
				public int compare(IEntityDTO arg0, IEntityDTO arg1) {
					String name0 = arg0.getString(finalNamePSDEField.getLowerCaseName(), "");
					String name1 = arg1.getString(finalNamePSDEField.getLowerCaseName(), "");
					return name0.compareTo(name1);
				}
			});
		}
		
		return new PageImpl(entityDTOList, iSearchContext.getPageable(), entityDTOList.size());
	}

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSFPlugin iPSSysSFPlugin) throws Exception {
		
	}

}
