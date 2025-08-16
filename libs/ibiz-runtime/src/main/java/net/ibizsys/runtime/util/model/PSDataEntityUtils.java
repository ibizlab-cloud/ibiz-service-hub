package net.ibizsys.runtime.util.model;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER11;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.runtime.dataentity.der.DER1NMasterRSTypes;
import net.ibizsys.runtime.dataentity.der.DERSubTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;

/**
 * 实体辅助功能
 * 
 * @author lionlau
 *
 */
public class PSDataEntityUtils {

	/**
	 * 计算传入从实体及主实体的连接属性
	 * 
	 * @param minorPSDataEntity
	 *            从实体
	 * @param majorPSDataEntity
	 *            主实体
	 * @return
	 * @throws Exception
	 */
	public static IPSDEField getPickupPSDEField(IPSDataEntity minorPSDataEntity, IPSDataEntity majorPSDataEntity) throws Exception {

		// 获取从实体的全部从属关系
		java.util.List<IPSDERBase> psDERBases = minorPSDataEntity.getMinorPSDERs();
		if (psDERBases == null) {
			return null;
		}

		//获取存在附属关系的一对多关系
		for (IPSDERBase psDERBase : psDERBases) {
			if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
				IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
				if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
					if (psDERBase.getMajorPSDataEntity().getId().equals(majorPSDataEntity.getId())) {
						return iPSDER1N.getPSPickupDEField();
					}
				}
			} else {
				continue;
			}
		}
		
		for (IPSDERBase psDERBase : psDERBases) {
			if (DERTypes.DER11.equals(psDERBase.getDERType())) {
				IPSDER11 iPSDER11 = (IPSDER11) psDERBase;
				if (psDERBase.getMajorPSDataEntity().getId().equals(majorPSDataEntity.getId())) {
					return iPSDER11.getPSPickupDEField();
				}
			} else {
				continue;
			}
		}
		
		//自定义关系：子关系类型为 DER1N
		for (IPSDERBase psDERBase : psDERBases) {
			if (DERTypes.DERCUSTOM.equals(psDERBase.getDERType())) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) psDERBase;
				if(DERSubTypes.DER1N.equals(iPSDERCustom.getDERSubType())) {
					if ((iPSDERCustom.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
						if (psDERBase.getMajorPSDataEntity().getId().equals(majorPSDataEntity.getId())) {
							return iPSDERCustom.getPickupPSDEField();
						}
					}
					continue;
				}
				if(DERSubTypes.DER11.equals(iPSDERCustom.getDERSubType())) {
					if (psDERBase.getMajorPSDataEntity().getId().equals(majorPSDataEntity.getId())) {
						return iPSDERCustom.getPickupPSDEField();
					}
					continue;
				}
			} else {
				continue;
			}
		}
		
		
		// 不需要判断控制关系类型
		for (IPSDERBase psDERBase : psDERBases) {
			if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
				IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
				if (psDERBase.getMajorPSDataEntity().getId().equals(majorPSDataEntity.getId())) {
					return iPSDER1N.getPSPickupDEField();
				}
			} else {
				continue;
			}
		}

		return null;
	}

}
