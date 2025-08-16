package net.ibizsys.central.cloud.workflow.flowable.history;

import org.flowable.common.engine.impl.history.HistoryLevel;
import org.flowable.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.flowable.engine.impl.history.DefaultHistoryManager;
import org.flowable.engine.impl.persistence.entity.ExecutionEntity;
import org.flowable.task.service.impl.persistence.entity.TaskEntity;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.workflow.core.util.WFConsts;

public class HistoryManager extends DefaultHistoryManager {

    public HistoryManager(ProcessEngineConfigurationImpl processEngineConfiguration, HistoryLevel historyLevel, boolean usePrefixId) {
        super(processEngineConfiguration, historyLevel, usePrefixId);
    }


    @Override
    public void recordTaskCreated(TaskEntity task, ExecutionEntity execution) {
        if (execution != null && !ObjectUtils.isEmpty(execution)) {
            Object dynaInst = execution.getTransientVariable(WFConsts.DYNAINST_TAG);
            if(!ObjectUtils.isEmpty(dynaInst)){
                task.setScopeId(dynaInst.toString());
            }
            Object dynaInst2 = execution.getTransientVariable(WFConsts.DYNAINST_TAG2);
            if(!ObjectUtils.isEmpty(dynaInst2)){
                task.setSubScopeId(dynaInst2.toString());
            }
        }
        super.recordTaskCreated(task, execution);
    }
}
