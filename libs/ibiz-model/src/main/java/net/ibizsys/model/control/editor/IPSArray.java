package net.ibizsys.model.control.editor;



/**
 * 数组编辑器模型对象接口
 * <P>
 * 扩展父接口类型[ARRAY,MOBARRAY]
 *
 */
public interface IPSArray extends net.ibizsys.model.control.editor.IPSTextEditor
		,net.ibizsys.model.control.editor.IPSNumberEditor{

	
	
	/**
	 * 获取数据类型[DATATYPE]{STRING|NUMBER|INTEGER|URL|IMAGE|MAIL}
	 * @return
	 */
	java.lang.String getDataType();
}