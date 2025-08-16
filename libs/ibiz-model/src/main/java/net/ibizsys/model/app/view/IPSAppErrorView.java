package net.ibizsys.model.app.view;



/**
 * 应用错误展现功能视图模型对象接口
 * <P>
 * 扩展父接口类型[APPERRORVIEW]
 *
 */
public interface IPSAppErrorView extends net.ibizsys.model.app.view.IPSAppUtilView{

	
	
	/**
	 * 获取获取错误代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppUtilViewDTO#FIELD_ERRCODE}
	 * @return
	 */
	java.lang.String getErrorCode();
}