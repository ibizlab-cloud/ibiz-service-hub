package net.ibizsys.model.res;



/**
 * 系统预置内容模型对象接口
 *
 */
public interface IPSSysContent extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取内容路径
	 * @return
	 */
	java.lang.String getContentPath();
	
	
	/**
	 * 获取内容标记
	 * @return
	 */
	java.lang.String getContentTag();
	
	
	/**
	 * 获取内容标记2
	 * @return
	 */
	java.lang.String getContentTag2();
	
	
	/**
	 * 获取内容标记3
	 * @return
	 */
	java.lang.String getContentTag3();
	
	
	/**
	 * 获取内容标记4
	 * @return
	 */
	java.lang.String getContentTag4();
	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getSubject();
}