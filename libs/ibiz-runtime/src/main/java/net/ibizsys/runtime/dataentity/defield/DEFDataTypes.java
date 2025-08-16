package net.ibizsys.runtime.dataentity.defield;

/**
 * 属性数据类型
 * 
 * @author lionlau
 *
 */
public class DEFDataTypes {

	/**
	 * 自增标识，整数类型，用户不可见，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ACID = "ACID";
	/**
	 * 大整型，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String BIGINT = "BIGINT";
	/**
	 * 选择项文本，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CODELISTTEXT = "CODELISTTEXT";
	/**
	 * 货币，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CURRENCY = "CURRENCY";
	/**
	 * 货币单位，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CURRENCYUNIT = "CURRENCYUNIT";
	/**
	 * 日期型，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String DATE = "DATE";
	/**
	 * 日期时间型，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String DATETIME = "DATETIME";
	/**
	 * 出生日期，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String DATETIME_BIRTHDAY = "DATETIME_BIRTHDAY";
	/**
	 * 数值，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String DECIMAL = "DECIMAL";
	
	/**
	 * 大数值，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String BIGDECIMAL = "BIGDECIMAL";
	
	/**
	 * 浮点，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String FLOAT = "FLOAT";
	/**
	 * 全局唯一标识，文本类型，用户不可见，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String GUID = "GUID";
	/**
	 * HTML文本，没有长度限制，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String HTMLTEXT = "HTMLTEXT";
	/**
	 * 继承属性，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String INHERIT = "INHERIT";
	/**
	 * 整型，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String INT = "INT";
	/**
	 * 长文本，没有长度限制，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String LONGTEXT = "LONGTEXT";
	/**
	 * 长文本，长度1000，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String LONGTEXT_1000 = "LONGTEXT_1000";
	/**
	 * 数字串业务标识，数字类型，用户可见，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NBID = "NBID";
	/**
	 * 多项选择(数值)，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NMCODELIST = "NMCODELIST";
	/**
	 * 单项选择(数值)，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NSCODELIST = "NSCODELIST";
	/**
	 * 外键值，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PICKUP = "PICKUP";
	/**
	 * 外键值附加数据，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PICKUPDATA = "PICKUPDATA";
	/**
	 * 外键值文本，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PICKUPTEXT = "PICKUPTEXT";
	/**
	 * 字符串业务标识，文本类型，用户可见，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SBID = "SBID";
	/**
	 * 多项选择(文本值)，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SMCODELIST = "SMCODELIST";
	/**
	 * 单项选择(文本值)，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SSCODELIST = "SSCODELIST";
	/**
	 * 文本，可指定长度，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String TEXT = "TEXT";
	/**
	 * 电子邮件，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String TEXT_EMAIL = "TEXT_EMAIL";
	/**
	 * 时间型，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String TIME = "TIME";
	/**
	 * 真假逻辑，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String TRUEFALSE = "TRUEFALSE";
	/**
	 * 二进制流，没有长度限制，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String VARBINARY = "VARBINARY";
	/**
	 * 工作流处理状态，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String WFSTATE = "WFSTATE";
	/**
	 * 是否逻辑，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String YESNO = "YESNO";
	/**
	 * 一对多关系数据集合，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ONE2MANYDATA = "ONE2MANYDATA";
	/**
	 * 外键值对象，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PICKUPOBJECT = "PICKUPOBJECT";

	/**
	 * 一对一关系数据对象，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ONE2ONEDATA = "ONE2ONEDATA";

	/**
	 * 文件，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String FILE = "FILE";
	/**
	 * 文件列表，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String FILELIST = "FILELIST";
	/**
	 * 文件列表，没有数量限制，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String LONGFILELIST = "LONGFILELIST";
	/**
	 * 图片，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PICTURE = "PICTURE";
	/**
	 * 图片列表，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PICTURELIST = "PICTURELIST";
	/**
	 * 图片列表，没有数量限制，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String LONGPICTURELIST = "LONGPICTURELIST";

	/**
	 * 获取属性数据类型名称
	 * @param strDEFDataType
	 * @return
	 */
	public final static String toName(String strDEFDataType) {
		switch (strDEFDataType) {
		case "ACID":
			return "自增标识，整数类型，用户不可见";
		case "BIGINT":
			return "大整型";
		case "CODELISTTEXT":
			return "选择项文本";
		case "CURRENCY":
			return "货币";
		case "CURRENCYUNIT":
			return "货币单位";
		case "DATE":
			return "日期型";
		case "DATETIME":
			return "日期时间型";
		case "DATETIME_BIRTHDAY":
			return "出生日期";
		case "DECIMAL":
			return "数值";
		case "BIGDECIMAL":
			return "大数值";
		case "FLOAT":
			return "浮点";
		case "GUID":
			return "全局唯一标识，文本类型，用户不可见";
		case "HTMLTEXT":
			return "HTML文本，没有长度限制";
		case "INHERIT":
			return "继承属性";
		case "INT":
			return "整型";
		case "LONGTEXT":
			return "长文本，没有长度限制";
		case "LONGTEXT_1000":
			return "长文本，长度1000";
		case "NBID":
			return "数字串业务标识，数字类型，用户可见";
		case "NMCODELIST":
			return "多项选择(数值)";
		case "NSCODELIST":
			return "单项选择(数值)";
		case "PICKUP":
			return "外键值";
		case "PICKUPDATA":
			return "外键值附加数据";
		case "PICKUPTEXT":
			return "外键值文本";
		case "SBID":
			return "字符串业务标识，文本类型，用户可见";
		case "SMCODELIST":
			return "多项选择(文本值)";
		case "SSCODELIST":
			return "单项选择(文本值)";
		case "TEXT":
			return "文本，可指定长度";
		case "TEXT_EMAIL":
			return "电子邮件";
		case "TIME":
			return "时间型";
		case "TRUEFALSE":
			return "真假逻辑";
		case "VARBINARY":
			return "二进制流，没有长度限制";
		case "WFSTATE":
			return "工作流处理状态";
		case "YESNO":
			return "是否逻辑";
		case "ONE2MANYDATA":
			return "一对多关系数据集合";
		case "PICKUPOBJECT":
			return "外键值对象";
		case "ONE2ONEDATA":
			return "一对一关系数据对象";
		case "FILE":
			return "文件";
		case "FILELIST":
			return "文件列表";
		case "LONGFILELIST":
			return "文件列表，没有数量限制";
		case "PICTURE":
			return "图片";
		case "PICTURELIST":
			return "图片列表";
		case "LONGPICTURELIST":
			return "图片列表，没有数量限制";
		default:
			throw new RuntimeException(String.format("未知属性数据类型[%1$s]", strDEFDataType));
		}

	}
}
