package net.ibizsys.central.plugin.extension.dataentity;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;

public interface IPSModelDataEntityRuntime extends IDataEntityRuntime {

	/**
	 * 获取运行模型标记
	 * @return
	 */
	String getPSModelTag();
	
	
	
	/**
	 * 转换至 PSModelFilter 对象
	 * @param iSearchContext
	 * @return
	 */
	IPSModelFilter toPSModelFilter(ISearchContextDTO iSearchContext);
	
	
	
	/**
	 * 转换至 PSModel 对象
	 * @param iEntity
	 * @return
	 */
	IPSModel toPSModel(IEntityDTO iEntity);
	
	
	
	/**
	 * 从 PSModel 转换至 当前实体数据对象
	 * @param iPSModel
	 * @return
	 */
	IEntityDTO fromPSModel(IPSModel iPSModel);
	
//	
//	/**
//	 * 从 PSModel 转换至 当前实体数据对象
//	 * @param iPSModel
//	 * @return
//	 */
//	Page<? extends IEntity> fromPSModelPage(Page<? extends IPSModel> page);
	
}
