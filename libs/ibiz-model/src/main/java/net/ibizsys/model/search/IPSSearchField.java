package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSearchField extends net.ibizsys.model.search.IPSSearchDocObject{

	
	
	/**
	 * 获取分析器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ANALYZER}
	 * @return
	 */
	java.lang.String getAnalyzer();
	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取时间格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DATEFORMAT}
	 * @return
	 */
	java.lang.String getDateFormat();
	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FIELDPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getFieldParams();
	
	
	/**
	 * 获取属性标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FIELDTAG}
	 * @return
	 */
	java.lang.String getFieldTag();
	
	
	/**
	 * 获取属性标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FIELDTAG2}
	 * @return
	 */
	java.lang.String getFieldTag2();
	
	
	/**
	 * 获取属性类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FIELDTYPE}
	 * @return
	 */
	java.lang.String getFieldType();
	
	
	/**
	 * 获取忽略属性集合
	 * @return
	 */
	java.lang.String[] getIgnoreFields();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PATTERN}
	 * @return
	 */
	java.lang.String getPattern();
	
	
	/**
	 * 获取搜索分析器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SEARCHANALYZER}
	 * @return
	 */
	java.lang.String getSearchAnalyzer();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否属性数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FIELDDATAFLAG}
	 * @return
	 */
	boolean isFieldData();
	
	
	/**
	 * 获取是否包括在父中
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_INCINPARENTFLAG}
	 * @return
	 */
	boolean isIncludeInParent();
	
	
	/**
	 * 获取是否索引
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_INDEXFLAG}
	 * @return
	 */
	boolean isIndex();
	
	
	/**
	 * 获取是否主键
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PKEY}
	 * @return
	 */
	boolean isPKey();
	
	
	/**
	 * 获取是否存储
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_STOREFLAG}
	 * @return
	 */
	boolean isStore();
}