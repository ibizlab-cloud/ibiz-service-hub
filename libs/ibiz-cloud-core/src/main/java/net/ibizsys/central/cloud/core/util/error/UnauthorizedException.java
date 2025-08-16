package net.ibizsys.central.cloud.core.util.error;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class UnauthorizedException extends AbstractThrowableProblem {

    public UnauthorizedException(String message) {
        super(ErrorConstants.DEFAULT_TYPE, message, Status.UNAUTHORIZED);
    }
    
    public UnauthorizedException() {
        super(ErrorConstants.DEFAULT_TYPE, null, Status.UNAUTHORIZED);
    }
}
