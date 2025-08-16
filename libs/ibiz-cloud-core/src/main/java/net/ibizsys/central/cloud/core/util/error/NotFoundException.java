package net.ibizsys.central.cloud.core.util.error;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class NotFoundException extends AbstractThrowableProblem {

    public NotFoundException(String message) {
        super(ErrorConstants.DEFAULT_TYPE, message, Status.NOT_FOUND);
    }
    
    public NotFoundException() {
        super(ErrorConstants.DEFAULT_TYPE, null, Status.NOT_FOUND);
    }
}
