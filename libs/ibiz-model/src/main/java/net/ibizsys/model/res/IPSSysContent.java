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
	String getCodeName();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	String getContent();
	
	
	/**
	 * 获取内容路径
	 * @return
	 */
	String getContentPath();
	
	
	/**
	 * 获取内容标记
	 * @return
	 */
	String getContentTag();
	
	
	/**
	 * 获取内容标记2
	 * @return
	 */
	String getContentTag2();
	
	
	/**
	 * 获取内容标记3
	 * @return
	 */
	String getContentTag3();
	
	
	/**
	 * 获取内容标记4
	 * @return
	 */
	String getContentTag4();
	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysContentType}
	 * @return
	 */
	String getContentType();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	String getSubject();
}