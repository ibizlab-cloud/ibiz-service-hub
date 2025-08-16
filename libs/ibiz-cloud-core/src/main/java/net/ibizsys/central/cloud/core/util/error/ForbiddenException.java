package net.ibizsys.central.cloud.core.util.error;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class ForbiddenException extends AbstractThrowableProblem {

    public ForbiddenException(String message) {
        super(ErrorConstants.DEFAULT_TYPE, message, Status.FORBIDDEN);
    }
    
    public ForbiddenException() {
        super(ErrorConstants.DEFAULT_TYPE, null, Status.FORBIDDEN);
    }
}
