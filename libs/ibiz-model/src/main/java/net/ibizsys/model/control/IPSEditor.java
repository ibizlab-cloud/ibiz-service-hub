package net.ibizsys.model.control;



/**
 * 编辑器部件模型基础对象接口
 * <P>
 * 子接口扩展识别值 {@link #getEditorType}
 *
 */
public interface IPSEditor extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取直接Css样式
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取动态样式表
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取编辑器高度
	 * @return
	 */
	double getEditorHeight();
	
	
	/**
	 * 获取编辑器参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getEditorParams();
	
	
	/**
	 * 获取编辑器样式
	 * @return
	 */
	java.lang.String getEditorStyle();
	
	
	/**
	 * 获取编辑器类型
	 * @return
	 */
	java.lang.String getEditorType();
	
	
	/**
	 * 获取编辑器宽度
	 * @return
	 */
	double getEditorWidth();
	
	
	/**
	 * 获取对象标识属性[OBJECTIDFIELD]
	 * @return
	 */
	java.lang.String getObjectIdField();
	
	
	/**
	 * 获取对象名称属性[OBJECTNAMEFIELD]
	 * @return
	 */
	java.lang.String getObjectNameField();
	
	
	/**
	 * 获取对象值属性[OBJECTVALUEFIELD]
	 * @return
	 */
	java.lang.String getObjectValueField();
	
	
	/**
	 * 获取部件注入属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes();
	
	/**
	 * 获取部件注入属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件注入属性集合
	 * @param list 部件注入属性集合
	 */
	void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list);
	
	
	/**
	 * 获取部件逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics();
	
	/**
	 * 获取部件逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件逻辑集合
	 * @param list 部件逻辑集合
	 */
	void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list);
	
	
	/**
	 * 获取部件绘制器集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders();
	
	/**
	 * 获取部件绘制器集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件绘制器集合
	 * @param list 部件绘制器集合
	 */
	void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list);
	
	
	/**
	 * 获取复合编辑器项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSEditorItem> getPSEditorItems();
	
	/**
	 * 获取复合编辑器项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSEditorItem getPSEditorItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置复合编辑器项集合
	 * @param list 复合编辑器项集合
	 */
	void setPSEditorItems(java.util.List<net.ibizsys.model.control.IPSEditorItem> list);
	
	
	/**
	 * 获取界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取辅助输入词条分类
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDictCat getPSSysDictCat();


	/**
	 * 获取辅助输入词条分类，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDictCat getPSSysDictCatMust();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取编辑器输入提示
	 * @return
	 */
	java.lang.String getPlaceHolder();
	
	
	/**
	 * 获取预置类型
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取多项文本分隔符[TEXTSEPARATOR]
	 * @return
	 */
	java.lang.String getTextSeparator();
	
	
	/**
	 * 获取多项值分隔符[VALUESEPARATOR]
	 * @return
	 */
	java.lang.String getValueSeparator();
	
	
	/**
	 * 获取值类型[VALUETYPE]{SIMPLE|SIMPLES|OBJECT|OBJECTS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorValueType}
	 * @return
	 */
	java.lang.String getValueType();
	
	
	/**
	 * 获取是否禁用状态[DISABLED]
	 * @return
	 */
	boolean isDisabled();
	
	
	/**
	 * 获取是否支持编辑
	 * @return
	 */
	boolean isEditable();
	
	
	/**
	 * 获取是否只读状态[READONLY]
	 * @return
	 */
	boolean isReadOnly();
}