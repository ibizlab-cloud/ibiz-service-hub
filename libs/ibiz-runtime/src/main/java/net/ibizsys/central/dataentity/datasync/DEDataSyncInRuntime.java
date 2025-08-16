package net.ibizsys.central.dataentity.datasync;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionInput;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.service.DEMethodInputTypes;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.domain.DataSyncIn;

public class DEDataSyncInRuntime extends net.ibizsys.runtime.dataentity.datasync.DEDataSyncInRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSyncInRuntime.class);
	
	@Override
	protected Object[] getActionArgs(IPSDEAction iPSDEAction, IEntity iEntity, DataSyncIn dataSyncIn) throws Throwable {

		IPSDEActionInput iPSDEActionInput = iPSDEAction.getPSDEActionInput();
		if (iPSDEActionInput == null) {
			throw new ModelException(iPSDEAction, String.format("实体行为[%1$s]没有指定输入对象", iPSDEAction.getName()));
		}
		
		if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
			String strKey = dataSyncIn.getDataKey();
			if (ObjectUtils.isEmpty(strKey)) {
				throw new Exception("没有指定输入参数");
			}
			String[] items = strKey.trim().replace(",", ";").split("[;]");
			if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType())) {
				if (items.length == 1) {
					Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), (String) strKey);
					return new Object[] { objValue };
				} else {
					List list = new ArrayList();
					for (int i = 0; i < items.length; i++) {
						Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), items[i]);
						list.add(objValue);
					}
					return new Object[] { list };
				}
			}

			if (DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
				List list = new ArrayList();
				for (int i = 0; i < items.length; i++) {
					Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), items[i]);
					list.add(objValue);
				}
				return new Object[] { list };
			}
		}

		if (DEMethodInputTypes.DTO.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.DTOS.equals(iPSDEActionInput.getType())) {
			if (iEntity == null) {
				throw new Exception("没有指定输入参数");
			}

			IEntityDTO iEntityDTO = (IEntityDTO) this.getDataEntityRuntime().getDEMethodDTO(iPSDEActionInput.getPSDEMethodDTOMust(), iEntity.any(), true);
			return new Object[] { iEntityDTO };
		}

		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("无法识别的实体行为输入类型[%1$s][%2$s]", iPSDEAction.getName(), iPSDEActionInput.getType()));
	
	}
	
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime) super.getDataEntityRuntime();
	}
}
