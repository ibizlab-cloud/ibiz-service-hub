package net.ibizsys.model.control.grid;



/**
 * 实体表格编辑项更新成员模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGEIUDetailDTO}运行时对象
 *
 */
public interface IPSDEGEIUpdateDetail extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取更新表格列
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIUDetailDTO#FIELD_PSDEGRIDCOLNAME}
	 * @return
	 */
	java.lang.String getName();
}