package net.ibizsys.central.database.mysql;

import java.util.Collection;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.database.DBDialectBase;
import net.ibizsys.central.database.DBFunction;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DBTypes;
import net.ibizsys.runtime.util.DataTypes;

public class MySQL5Dialect extends DBDialectBase {

	public MySQL5Dialect() {

		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_YEAR, DataTypes.INT, "EXTRACT(YEAR FROM %1$s)", 1));
		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_QUARTER, DataTypes.INT, "EXTRACT(QUARTER FROM %1$s)", 1));
		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_MONTH, DataTypes.INT, "EXTRACT(MONTH FROM %1$s)", 1));
		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_DAYOFMONTH, DataTypes.INT, "EXTRACT(DAY FROM %1$s)", 1));

	}

	@Override
	public String getDBType() {
		return DBTypes.MYSQL5;
	}

	@Override
	public String getDBObjStandardName(String strOriginName) throws Throwable {
		String[] items = strOriginName.split("[.]");
		if (items.length == 1) {
			return String.format("`%1$s`", strOriginName);
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < items.length; i++) {
				if (i != 0) {
					sb.append(".");
				}
				sb.append(String.format("`%1$s`", items[i]));
			}
			return sb.toString();
		}
	}

	@Override
	protected String getStringConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable {
		if (bParam) {

			if (Conditions.LIKE.equals(strCondOp)) {
				return String.format("UPPER(%1$s) LIKE CONCAT('%%',UPPER(%2$s),'%%')", strFieldName, objValueOrParam);
			}

			if (Conditions.LEFTLIKE.equals(strCondOp)) {
				return String.format("UPPER(%1$s) LIKE CONCAT(UPPER(%2$s),'%%')", strFieldName, objValueOrParam);
			}

			if (Conditions.RIGHTLIKE.equals(strCondOp)) {
				return String.format("UPPER(%1$s) LIKE CONCAT('%%',UPPER(%2$s))", strFieldName, objValueOrParam);
			}

		}
		return super.getStringConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext);
	}

	@Override
	public String getLastInsertIdSQL(String strAlias) throws Throwable {
		if (StringUtils.hasLength(strAlias)) {
			return String.format("SELECT LAST_INSERT_ID() AS %1$s", this.getDBObjStandardName(strAlias));
		}
		return "SELECT LAST_INSERT_ID()";
	}

	@Override
	public String getJsonExtractSQL(String strFieldName, String strJsonPath) throws Throwable {
		return String.format("%1$s->'$.%2$s'", strFieldName, strJsonPath);
	}

	@Override
	protected String onGetCreateTableSQL(String strTableName, Collection<IPSDEField> psDEFieldList) throws Throwable {
		boolean bFirst = true;
		StringBuilder sb = new StringBuilder();

		String strKeyColumnName = "";
		String strRealTableName = strTableName;

		sb.append(String.format("CREATE TABLE %1$s(", this.getDBObjStandardName(strRealTableName)));
		for (IPSDEField iPSDEField : psDEFieldList) {
			if (bFirst) {
				bFirst = false;
				sb.append("\n");
			} else {
				sb.append("\n,");
			}
			if (iPSDEField.isKeyDEField()) {
				strKeyColumnName = iPSDEField.getName();
				sb.append(String.format("`%1$s` %2$s", iPSDEField.getName(), this.getDataType(iPSDEField, true, false, false, null)));
				sb.append("PRIMARY KEY ");
			} else {
				sb.append(String.format("`%1$s` %2$s", iPSDEField.getName(), this.getDataType(iPSDEField, false, true, false, null)));
			}
		}
		sb.append("\n)");
		return sb.toString();
	}

	@Override
	protected String onGetCreateColumnSQL(String strTableName, IPSDEField iPSDEField) throws Throwable {

		String strDataType = this.getDataType(iPSDEField, false, true, false, "");
		if (ObjectUtils.isEmpty(strDataType)) {
			throw new Exception(String.format("获取实体属性[%1$s]数据库类型失败", iPSDEField.getName()));
		}
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("ALTER TABLE %1$s\n", this.getDBObjStandardName(strTableName)));
		sb.append(String.format("ADD COLUMN %1$s %2$s", this.getDBObjStandardName(iPSDEField.getName()), strDataType));

		sb.append("\n");
		return sb.toString();
	}

	protected String onGetDataType(IPSDEField iPSDEField, boolean bAppendNullFlag, boolean bAllowNull, boolean bAppendDefault, String strDefault) throws Throwable {
		int nStdDataType = iPSDEField.getStdDataType();
		switch (nStdDataType) {
		case DataTypes.VARCHAR: {
			int nLength = iPSDEField.getLength();

			if (nLength <= 0)
				nLength = 200;
			if (nLength >= 4000)
				nLength = 4000;
			String strDBType = "";
			strDBType += String.format(" VARCHAR(%1$s) ", nLength);
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		case DataTypes.TEXT: {
			String strDBType = "";
			strDBType += String.format(" MEDIUMTEXT ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		case DataTypes.INT: {
			String strDBType = "";
			strDBType += String.format(" INTEGER ");
			// if(this.isUnsigned())
			// strDBType += String.format(" UNSIGNED ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			// if(this.isAutoIncrement())
			// strDBType += String.format(" AUTO_INCREMENT ");
			return strDBType;
		}

		case DataTypes.BIGINT: {
			int nLength = iPSDEField.getLength();
			if (nLength <= 0)
				nLength = 20;

			String strDBType = "";
			strDBType += String.format(" BIGINT(%1$s) ", nLength);
			// if(this.isUnsigned())
			// strDBType += String.format(" UNSIGNED ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			// if(this.isAutoIncrement())
			// strDBType += String.format(" AUTO_INCREMENT ");
			return strDBType;
		}

		case DataTypes.FLOAT: {
			String strDBType = "";
			strDBType += String.format(" DOUBLE ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		case DataTypes.DATETIME: {
			String strDBType = "";
			strDBType += String.format(" DATETIME ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		case DataTypes.DATE: {
			String strDBType = "";
			strDBType += String.format(" DATE ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		case DataTypes.TIME: {
			String strDBType = "";
			strDBType += String.format(" DATETIME ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		case DataTypes.BIGDECIMAL:
		case DataTypes.DECIMAL: {
			int nLength = iPSDEField.getLength();
			if (nLength <= 0)
				nLength = 12;
			int nPRECISION = iPSDEField.getPrecision();
			if (nPRECISION <= 0)
				nPRECISION = 0;
			String strDBType = "";
			strDBType += String.format(" DECIMAL(%1$s,%2$s) ", nLength, nPRECISION);
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		case DataTypes.VARBINARY: {
			String strDBType = "";
			strDBType += String.format(" MEDIUMBLOB ");
			if (bAppendNullFlag) {
				if (bAllowNull)
					strDBType += String.format(" NULL ");
				else
					strDBType += String.format(" NOT NULL ");
			}
			return strDBType;
		}

		default:
			return "";
		}
	}
}
