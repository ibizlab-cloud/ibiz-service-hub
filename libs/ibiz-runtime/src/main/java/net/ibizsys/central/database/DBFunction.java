package net.ibizsys.central.database;

import net.ibizsys.runtime.util.DataTypes;

public class DBFunction implements IDBFunction {

	private String strName = null;
	private int nDataType = DataTypes.UNKNOWN;
	private String strFormat = null;
	private int nLength = 0;
	
	public DBFunction(String strName, int nDataType, String strFormat, int nLength) {
		this.strName = strName;
		this.nDataType = nDataType;
		this.strFormat = strFormat;
		this.nLength = nLength;
	}
	
	
	@Override
	public String getName() {
		return this.strName;
	}

	@Override
	public int getOutputDataType() {
		return this.nDataType;
	}
	
	

	@Override
	public String getFuncSQL(String[] args) throws Throwable {
		return getFuncSQL(args, false);
	}


	@Override
	public String getFuncSQL( String[] args, boolean bInsert) throws Throwable {
		int nCurLength = 0;
		if(args != null ) {
			nCurLength = args.length;
		}
		if(nLength != nCurLength) {
			throw new Exception(String.format("数据库函数[%1$s]需要参数[%2$s]",this.getName(),nLength));
		}
		if(nLength == 0) {
			return strFormat;
		}
		
		switch (nCurLength) {
		case 0:
			return strFormat;
		case 1:
			return String.format(strFormat, args[0]);
		case 2:
			return String.format(strFormat, args[0], args[1]);
		case 3:
			return String.format(strFormat, args[0], args[1], args[2]);
		case 4:
			return String.format(strFormat, args[0], args[1], args[2], args[3]);
		case 5:
			return String.format(strFormat, args[0], args[1], args[2], args[3], args[4]);
		case 6:
			return String.format(strFormat, args[0], args[1], args[2], args[3], args[4], args[5]);
		case 7:
			return String.format(strFormat, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
		case 8:
			return String.format(strFormat, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		case 9:
			return String.format(strFormat, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8]);
		case 10:
			return String.format(strFormat, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
		default:
			throw new Exception("格式化参数数组溢出");
		}
	}
}
