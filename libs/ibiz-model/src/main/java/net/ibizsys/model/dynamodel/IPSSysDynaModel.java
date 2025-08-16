package net.ibizsys.model.dynamodel;



/**
 * <P>
 * 子接口扩展识别值 {@link #getUsage}
 *
 */
public interface IPSSysDynaModel extends net.ibizsys.model.dynamodel.IPSDynaModel
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取模型内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取模型标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MODELTAG}
	 * @return
	 */
	java.lang.String getModelTag();
	
	
	/**
	 * 获取模型标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MODELTAG2}
	 * @return
	 */
	java.lang.String getModelTag2();
	
	
	/**
	 * 获取模型标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MODELTAG3}
	 * @return
	 */
	java.lang.String getModelTag3();
	
	
	/**
	 * 获取模型标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MODELTAG4}
	 * @return
	 */
	java.lang.String getModelTag4();
	
	
	/**
	 * 获取模型用途
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaModelUsage}
	 * @return
	 */
	java.lang.String getUsage();
}