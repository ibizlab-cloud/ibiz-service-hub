package net.ibizsys.runtime.dataentity;

import java.util.concurrent.Executor;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 数据对象变化触发逻辑
 * @author lionlau
 *
 */
public interface IDataEntityOnChangeLogic {

	/**
     * Get executor for execute this receive.
     *
     * @return Executor
     */
    default Executor getExecutor() {
    	return null;
    }
    
    
    /**
     * 变化时触发
     * @param data
     * @param last
     * @param strActionMode
     * @param iPSDEAction
     */
    void execute(final IDataEntityRuntime iDataEntityRuntime, final IEntityBase data, final IEntityBase last, final String strActionMode, final IPSDEAction iPSDEAction);
}
