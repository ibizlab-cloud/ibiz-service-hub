package net.ibizsys.central.dataentity.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionInput;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.dataentity.service.DEMethodInputTypes;

public class DEMethodUtils {

	private static final Log log = LogFactory.getLog(DEMethodUtils.class);
	
	public static Object[] getActionArgs(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objBody, String strKey) throws Exception {
		return getActionArgs(iDataEntityRuntime, iPSDEAction, objBody, strKey, null);
	}
	
	public static Object[] getActionArgs(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objBody, String strKey, Object draft) throws Exception {
		IPSDEActionInput iPSDEActionInput = iPSDEAction.getPSDEActionInput();
		if (iPSDEActionInput == null) {
			throw new ModelException(iPSDEAction, String.format("实体行为[%1$s]没有指定输入对象", iPSDEAction.getName()));
		}

		
		if (DEMethodInputTypes.NONE.equals(iPSDEActionInput.getType())) {
			IEntityDTO iEntityDTO = (IEntityDTO) iDataEntityRuntime.createEntity();
			
			return new Object[] { iEntityDTO };
		}
		
		if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
			if (ObjectUtils.isEmpty(strKey)) {
				throw new Exception("没有指定输入参数");
			}
			String[] items = strKey.trim().replace(",", ";").split("[;]");
			if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType())) {
				if (items.length == 1) {
					Object objValue = iDataEntityRuntime.getSystemRuntime().convertValue(iDataEntityRuntime.getKeyPSDEField().getStdDataType(), (String) strKey);
					return new Object[] { objValue };
				} else {
					List list = new ArrayList();
					for (int i = 0; i < items.length; i++) {
						Object objValue = iDataEntityRuntime.getSystemRuntime().convertValue(iDataEntityRuntime.getKeyPSDEField().getStdDataType(), items[i]);
						list.add(objValue);
					}
					return new Object[] { list };
				}
			}

			if (DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
				List list = new ArrayList();
				for (int i = 0; i < items.length; i++) {
					Object objValue = iDataEntityRuntime.getSystemRuntime().convertValue(iDataEntityRuntime.getKeyPSDEField().getStdDataType(), items[i]);
					list.add(objValue);
				}
				return new Object[] { list };
			}
		}

		if (DEMethodInputTypes.DTO.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.DTOS.equals(iPSDEActionInput.getType())) {
			if (objBody == null) {
				throw new Exception("没有指定输入参数");
			}

			if (objBody instanceof List) {
				// 构建列表
				List dtoList = new ArrayList();
				List list = (List) objBody;
				for (Object item : list) {
					IEntityDTO iEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iPSDEActionInput.getPSDEMethodDTOMust(), item);
					if(draft instanceof IEntityDTO) {
						((IEntityDTO)draft).copyTo(iEntityDTO, true);
					}
					iEntityDTO.resetReadOnlyFields();
					iDataEntityRuntime.removeInvalidUserInput(iPSDEAction, iEntityDTO);
					
					dtoList.add(iEntityDTO);
				}
				return new Object[] { dtoList };
			} else {
				IEntityDTO iEntityDTO = (IEntityDTO)iDataEntityRuntime.getDEMethodDTO(iPSDEActionInput.getPSDEMethodDTOMust(), objBody);
				if(draft instanceof IEntityDTO) {
					((IEntityDTO)draft).copyTo(iEntityDTO, true);
				}
				iEntityDTO.resetReadOnlyFields();
				iDataEntityRuntime.removeInvalidUserInput(iPSDEAction, iEntityDTO);
				
				if (StringUtils.hasLength(strKey)) {
					Object objValue = iDataEntityRuntime.getSystemRuntime().convertValue(iDataEntityRuntime.getKeyPSDEField().getStdDataType(), (String) strKey);
					iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objValue);
				}

				return new Object[] { iEntityDTO };
			}
		}

		throw new Exception(String.format("无法识别的实体行为输入类型[%1$s][%2$s]", iPSDEAction.getName(), iPSDEActionInput.getType()));
	}
}
