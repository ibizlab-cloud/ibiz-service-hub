package net.ibizsys.model.control.calendar;



/**
 * 实体日历部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO}运行时对象
 *
 */
public interface IPSDECalendar extends net.ibizsys.model.control.calendar.IPSCalendar{

	
	
	/**
	 * 获取分组高度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPHEIGHT}
	 * @return
	 */
	int getGroupHeight();
	
	
	/**
	 * 获取分组布局
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPLAYOUT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MDCtrlGroupLayout}
	 * @return
	 */
	java.lang.String getGroupLayout();
	
	
	/**
	 * 获取分组模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MDCtrlGroupMode}
	 * @return
	 */
	java.lang.String getGroupMode();
	
	
	/**
	 * 获取分组应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEField();


	/**
	 * 获取分组应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEFieldMust();
	
	
	/**
	 * 获取分组代码表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPPSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getGroupPSCodeList();


	/**
	 * 获取分组代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getGroupPSCodeListMust();
	
	
	/**
	 * 获取分组默认界面样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getGroupPSSysCss();


	/**
	 * 获取分组默认界面样式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getGroupPSSysCssMust();
	
	
	/**
	 * 获取分组绘制插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getGroupPSSysPFPlugin();


	/**
	 * 获取分组绘制插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getGroupPSSysPFPluginMust();
	
	
	/**
	 * 获取分组应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPTEXTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupTextPSAppDEField();


	/**
	 * 获取分组应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupTextPSAppDEFieldMust();
	
	
	/**
	 * 获取分组文本实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGroupTextPSDEField();


	/**
	 * 获取分组文本实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGroupTextPSDEFieldMust();
	
	
	/**
	 * 获取分组宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO#FIELD_GROUPWIDTH}
	 * @return
	 */
	int getGroupWidth();
	
	
	/**
	 * 获取图例位置，多个日历项图例位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LabelPos}
	 * @return
	 */
	java.lang.String getLegendPos();
	
	
	/**
	 * 获取是否启用分组，计算{@link #getGroupMode}返回不等于(NONE)
	 * @return
	 */
	boolean isEnableGroup();
}