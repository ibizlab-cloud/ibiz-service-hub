package net.ibizsys.central.database.oracle;

import net.ibizsys.central.database.DBDialectBase;
import net.ibizsys.runtime.util.DBTypes;

public class OracleDialect extends DBDialectBase{

	
	public OracleDialect() {
		
//		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_YEAR, DataTypes.INT, "EXTRACT(YEAR FROM %1$s)", 1));
//		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_QUARTER, DataTypes.INT, "EXTRACT(QUARTER FROM %1$s)", 1));
//		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_MONTH, DataTypes.INT, "EXTRACT(MONTH FROM %1$s)", 1));
//		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_DAYOFMONTH, DataTypes.INT, "EXTRACT(DAY FROM %1$s)", 1));

		
	}
	
	@Override
	public String getDBType() {
		return DBTypes.ORACLE;
	}

	
//	@Override
//	public String getDBObjStandardName(String strOriginName) throws Throwable {
//		String[] items = strOriginName.split("[.]");
//		if(items.length == 1) {
//			return String.format("`%1$s`",strOriginName);
//		}
//		else {
//			StringBuilder sb = new StringBuilder ();
//			for(int i = 0;i<items.length;i++) {
//				if(i!=0) {
//					sb.append(".");
//				}
//				sb.append(String.format("`%1$s`",items[i]));
//			}
//			return sb.toString();
//		}
//	}
//	
//	@Override
//	protected String getStringConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable {
//		if(bParam) {
//			
//			if (Conditions.LIKE.equals(strCondOp)) {
//				return String.format("UPPER(%1$s) LIKE CONCAT('%%',UPPER(%2$s),'%%')", strFieldName, objValueOrParam);
//			}
//			
//			if (Conditions.LEFTLIKE.equals(strCondOp)) {
//				return String.format("UPPER(%1$s) LIKE CONCAT(UPPER(%2$s),'%%')", strFieldName, objValueOrParam);
//			}
//			
//			if (Conditions.RIGHTLIKE.equals(strCondOp)) {
//				return String.format("UPPER(%1$s) LIKE CONCAT('%%',UPPER(%2$s))", strFieldName, objValueOrParam);
//			}
//			
//			
//		}
//		return super.getStringConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext);
//	}
}
