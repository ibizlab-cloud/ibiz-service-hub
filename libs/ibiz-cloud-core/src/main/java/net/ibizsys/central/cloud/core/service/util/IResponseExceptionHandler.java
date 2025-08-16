package net.ibizsys.central.cloud.core.service.util;

import org.springframework.http.ResponseEntity;

/**
 * Rest接口异常处理对象
 * @author lionlau
 *
 */
public interface IResponseExceptionHandler {

	/**
	 * 获取反馈内容
	 * @param ex
	 * @return
	 */
	ResponseEntity<?> getResponseEntity(Throwable ex);
}
