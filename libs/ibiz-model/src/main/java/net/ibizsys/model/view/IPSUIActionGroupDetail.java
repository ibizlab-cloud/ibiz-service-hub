package net.ibizsys.model.view;



/**
 * 界面行为组成员模型基础对象接口
 *
 */
public interface IPSUIActionGroupDetail extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取行为级别
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ACTIONLEVEL}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionLevel}
	 * @return
	 */
	int getActionLevel();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取成员标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DETAILTAG}
	 * @return
	 */
	java.lang.String getDetailTag();
	
	
	/**
	 * 获取成员标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DETAILTAG2}
	 * @return
	 */
	java.lang.String getDetailTag2();
	
	
	/**
	 * 获取界面行为对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEUIACTIONID}
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取界面行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取提示信息
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取界面行为附加参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_UIACTIONPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUIActionParamJO();
	
	
	/**
	 * 获取是否添加分隔栏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ADDSEPARATOR}
	 * @return
	 */
	boolean isAddSeparator();
	
	
	/**
	 * 获取是否显示标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SHOWMODE}
	 * @return
	 */
	boolean isShowCaption();
	
	
	/**
	 * 获取是否显示图标
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SHOWMODE}
	 * @return
	 */
	boolean isShowIcon();
}