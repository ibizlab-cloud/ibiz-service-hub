package net.ibizsys.runtime.dataentity.action;

/**
 * 实体行为模式
 * 
 * @author lionlau
 *
 */
public class DEActionModes {

	/**
	 * 创建数据，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CREATE = "CREATE";
	/**
	 * 读取数据，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String READ = "READ";
	/**
	 * 更新数据，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String UPDATE = "UPDATE";
	/**
	 * 删除数据，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String DELETE = "DELETE";



	/**
	 * 自定义操作，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CUSTOM = "CUSTOM";
	/**
	 * 获取草稿，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String GETDRAFT = "GETDRAFT";
	/**
	 * 未知操作，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String UNKNOWN = "UNKNOWN";
	/**
	 * 移动位置，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String MOVEORDER = "MOVEORDER";

	/**
	 * 操作类型：检查主键
	 */
	public final static String CHECKKEY = "CHECKKEY";

	/**
	 * 操作类型：保存数据
	 */
	public final static String SAVE = "SAVE";
	
	
	/**
	 * 删除数据（等同DELETE），注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String REMOVE = "DELETE";
	
    /**
	 * 获取草稿（指定源数据），注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String GETDRAFTFROM= "GETDRAFTFROM";
	
	
	/**
	 * 移动操作参数：目标数据
	 */
	public final static String PARAM_MOVEORDER_TARGETKEY = "srftargetkey";
    
	/**
	 * 移动操作参数：移动类型
	 */
    public final static String PARAM_MOVEORDER_MOVETYPE = "srfmovetype";
    
    public final static String MOVETYPE_MOVEAFTER = "MOVEAFTER";
    public final static String MOVETYPE_MOVEBEFORE = "MOVEBEFORE";
    public final static String MOVETYPE_SWITCHPOS = "SWITCHPOS";
    
    

}
