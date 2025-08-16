package net.ibizsys.central.plugin.version.dataentity.action;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.util.IDEVersionControlUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 恢复版本实体行为运行时对象
 * @author lionlau
 *
 */
public class RestoreVersionDEActionRuntime extends VersionDEActionRuntimeBase {

	@Override
	protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
		
		//获取父属性
		IPSDERBase verPSDERBase = this.getVersionPSDERBase(iEntityDTO, false);
		IPSDEField parentIdPSDEField = null;
		if(verPSDERBase instanceof IPSDER1N) {
			parentIdPSDEField = ((IPSDER1N)verPSDERBase).getPSPickupDEFieldMust();
		}
		else
			if(verPSDERBase instanceof IPSDERCustom) {
				parentIdPSDEField = ((IPSDERCustom)verPSDERBase).getPickupPSDEFieldMust();
			}
		if(parentIdPSDEField == null) {
			throw new Exception(String.format("未指定父标识属性模型对象"));
		}
		
		Object parentId = this.getDataEntityRuntime().getFieldValue(iEntityDTO, parentIdPSDEField);
		if(ObjectUtils.isEmpty(parentId)) {
			throw new Exception(String.format("未指定父标识数据"));
		}
		
		//获取数据
		IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(verPSDERBase.getMajorPSDataEntityMust().getId(), false);
		IDEVersionControlUtilRuntime iDEVersionControlUtilRuntime = null;
		if(majorDataEntityRuntime.isEnableVersionControl()) {
			iDEVersionControlUtilRuntime = majorDataEntityRuntime.getDEVersionControlUtilRuntime();
		}
		if(iDEVersionControlUtilRuntime == null) {
			throw new Exception(String.format("主实体未提供版本控制功能组件"));
		}
		
		Object restoreVersionId = iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
		
		IEntityBase last = majorDataEntityRuntime.get(parentId);
		
		IEntityDTO newVersionData = this.getDataEntityRuntime().createEntity();
		
		iDEVersionControlUtilRuntime.prepare(last, newVersionData);
		
		IPSDEField messagePSDEField = this.getMessagePSDEField(true);
		IPSDEField namePSDEField = this.getNamePSDEField(true);
		if(messagePSDEField != null) {
			String strMessage = iEntityDTO.getString(messagePSDEField.getLowerCaseName(), null);
			if(!StringUtils.hasLength(strMessage) && namePSDEField != null) {
				IEntityDTO restoreEntityDTO = this.getDataEntityRuntime().get(restoreVersionId);
				strMessage = String.format("从[%1$s]恢复", restoreEntityDTO.get(namePSDEField.getLowerCaseName()));
			}
			if(StringUtils.hasLength(strMessage)) {
				newVersionData.set(messagePSDEField.getLowerCaseName(), strMessage);
			}
		}
		
		
		return iDEVersionControlUtilRuntime.restore(last, restoreVersionId, newVersionData);
	}
}
