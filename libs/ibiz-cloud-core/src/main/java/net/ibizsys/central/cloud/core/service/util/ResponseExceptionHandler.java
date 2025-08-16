package net.ibizsys.central.cloud.core.service.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.dataentity.service.DEServiceAPIRuntimeException;
import net.ibizsys.central.service.SubSysServiceAPIDERuntimeException;
import net.ibizsys.central.service.SubSysServiceAPIRuntimeException;
import net.ibizsys.central.service.SysServiceAPIRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.EntityException;
import net.ibizsys.runtime.util.EntityFieldError;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.UserConfirmException;
import net.ibizsys.runtime.util.UserConfirmOption;

public class ResponseExceptionHandler implements IResponseExceptionHandler {

	@Override
	public ResponseEntity<?> getResponseEntity(Throwable ex) {
		
		if (ex instanceof EntityException) {
			return getResponseEntity((EntityException) ex);
		} else if (ex instanceof UserConfirmException) {
			return getResponseEntity((UserConfirmException) ex);
		} else if (ex instanceof ErrorException) {
			return getResponseEntity((ErrorException) ex);
		} else if (ex instanceof DataEntityRuntimeException) {
			return getResponseEntity((DataEntityRuntimeException) ex);
		} else if (ex instanceof SysServiceAPIRuntimeException) {
			return getResponseEntity((SysServiceAPIRuntimeException) ex);
		} else if (ex instanceof DEServiceAPIRuntimeException) {
			return getResponseEntity((DEServiceAPIRuntimeException) ex);
		} else if (ex instanceof SubSysServiceAPIRuntimeException) {
			return getResponseEntity((SubSysServiceAPIRuntimeException) ex);
		} else if (ex instanceof SubSysServiceAPIDERuntimeException) {
			return getResponseEntity((SubSysServiceAPIDERuntimeException) ex);
		} else if (ex instanceof SystemRuntimeException) {
			return getResponseEntity((SystemRuntimeException) ex);
		} else if (ex instanceof SystemGatewayException) {
			return getResponseEntity((SystemGatewayException) ex);
		}
		
		if(ex instanceof RuntimeException) {
			ObjectNode out = JsonUtils.createObjectNode();
			out.put("type", "RuntimeException");
			out.put("code", Errors.INTERNALERROR);
			out.put("message", ex.getMessage());
			return getResponseEntity(out);
		}
		
		ObjectNode out = JsonUtils.createObjectNode();
		out.put("type", ex.getClass().getSimpleName());
		out.put("code", Errors.INTERNALERROR);
		out.put("message", ex.getMessage());
		return getResponseEntity(out);
		
		
		//return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}
	
	protected boolean isGetCauseResponseEntity(Throwable ex) {
		if(!(ex instanceof RuntimeException)) {
			return false;
		}
		
		if (ex instanceof EntityException) {
			return true;
		} else if (ex instanceof UserConfirmException) {
			return true;
		} else if (ex instanceof ErrorException) {
			return true;
		} else if (ex instanceof DataEntityRuntimeException) {
			return true;
		} else if (ex instanceof DEServiceAPIRuntimeException) {
			return true;
		} else if (ex instanceof SubSysServiceAPIRuntimeException) {
			return true;
		} else if (ex instanceof SubSysServiceAPIDERuntimeException) {
			return true;
		} else if (ex instanceof SystemRuntimeException) {
			return true;
		} else if (ex instanceof SystemGatewayException) {
			return true;
		}
		
		return false;
	}

	public ResponseEntity<?> getResponseEntity(SystemGatewayException systemGatewayException) {

		if (isGetCauseResponseEntity(systemGatewayException.getCause())) {
			return this.getResponseEntity((RuntimeException)systemGatewayException.getCause());
		}
		
		ObjectNode out = JsonUtils.createObjectNode();
		out.put("type", "SystemGatewayException");
		out.put("code", Errors.INTERNALERROR);
		out.put("message", systemGatewayException.getMessage());
		return getResponseEntity(out);
	}

	public ResponseEntity<?> getResponseEntity(UserConfirmException userConfirmException) {

		ObjectNode out = JsonUtils.createObjectNode();
		out.put("type", "UserConfirmException");
		out.put("code", Errors.USERCONFIRM);
		out.put("message", userConfirmException.getMessage());
		out.put("messagetype", userConfirmException.getMessageType());

		ArrayNode arrayNode = out.putArray("options");
		if (!ObjectUtils.isEmpty(userConfirmException.getOptions())) {
			for (UserConfirmOption userConfirmOption : userConfirmException.getOptions()) {
				arrayNode.add(JsonUtils.toJsonNode(userConfirmOption));
			}
		}
		//return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(out);
		return getResponseEntity(out);
	}

	public ResponseEntity<?> getResponseEntity(EntityException entityException) {

		ObjectNode out = JsonUtils.createObjectNode();
		out.put("type", "EntityException");
		out.put("code", entityException.getErrorCode());
		out.put("message", entityException.getMessage());

		ArrayNode arrayNode = out.putArray("details");

		if (entityException.getEntityError() != null) {
			for (EntityFieldError entityFieldError : entityException.getEntityError().getEntityFieldErrorList()) {
				ObjectNode fieldError = arrayNode.addObject();
				fieldError.put("fieldname", entityFieldError.getFieldName());
				fieldError.put("fieldlogicname", entityFieldError.getFieldLogicName());
				fieldError.put("fielderrortype", entityFieldError.getErrorType());
				if (entityFieldError.getPSDEFValueRule() != null) {
					fieldError.put("fielderrorinfo", entityFieldError.getPSDEFValueRule().getRuleInfo());
				} else {
					fieldError.put("fielderrorinfo", entityFieldError.getErrorInfo());
				}
			}
		}
		return getResponseEntity(out);
	}
	
	public ResponseEntity<?> getResponseEntity(ErrorException errorException) {

		ObjectNode out = JsonUtils.createObjectNode();
		out.put("type", "ErrorException");
		out.put("code", errorException.getErrorCode());
		out.put("message", errorException.getMessage());
		return getResponseEntity(out);
	}
	

	public ResponseEntity<?> getResponseEntity(DataEntityRuntimeException dataEntityRuntimeException) {

		ObjectNode out = JsonUtils.createObjectNode();
		out.put("type", "DataEntityRuntimeException");
		out.put("code", dataEntityRuntimeException.getErrorCode());
		out.put("message", dataEntityRuntimeException.getMessage());
		return getResponseEntity(out);
	}

	public ResponseEntity<?> getResponseEntity(SystemRuntimeException systemRuntimeException) {

		if(isGetCauseResponseEntity(systemRuntimeException.getCause())) {
		//if(systemRuntimeException.getCause() != null) {
			return getResponseEntity(systemRuntimeException.getCause());
		}
		ObjectNode out = JsonUtils.createObjectNode();
		out.put("type", "SystemRuntimeException");
		out.put("code", systemRuntimeException.getErrorCode());
		out.put("message", systemRuntimeException.getMessage());
		
		return getResponseEntity(out);
	}

	public ResponseEntity<?> getResponseEntity(SubSysServiceAPIRuntimeException subSysServiceAPIRuntimeException) {

		ObjectNode out = JsonUtils.createObjectNode();

		out.put("type", "SubSysServiceAPIRuntimeException");
		out.put("code", subSysServiceAPIRuntimeException.getErrorCode());
		out.put("message", subSysServiceAPIRuntimeException.getMessage());
		return getResponseEntity(out);
		
	}

	public ResponseEntity<?> getResponseEntity(SubSysServiceAPIDERuntimeException subSysServiceAPIDERuntimeException) {

		ObjectNode out = JsonUtils.createObjectNode();

		out.put("type", "SubSysServiceAPIDERuntimeException");
		out.put("code", subSysServiceAPIDERuntimeException.getErrorCode());
		out.put("message", subSysServiceAPIDERuntimeException.getMessage());
		
		return getResponseEntity(out);
	}

	public ResponseEntity<?> getResponseEntity(DEServiceAPIRuntimeException deServiceAPIRuntimeException) {

		if (isGetCauseResponseEntity(deServiceAPIRuntimeException.getCause())) {
	//	if (deServiceAPIRuntimeException.getCause() instanceof RuntimeException) {
			return this.getResponseEntity((RuntimeException)deServiceAPIRuntimeException.getCause());
		}
		
		ObjectNode out = JsonUtils.createObjectNode();

		out.put("type", "DEServiceAPIRuntimeException");
		out.put("code", deServiceAPIRuntimeException.getErrorCode());
		out.put("message", deServiceAPIRuntimeException.getMessage());
		
		return getResponseEntity(out);
	}
	
	public ResponseEntity<?> getResponseEntity(SysServiceAPIRuntimeException sysServiceAPIRuntimeException) {

		if (isGetCauseResponseEntity(sysServiceAPIRuntimeException.getCause())) {
	//	if (deServiceAPIRuntimeException.getCause() instanceof RuntimeException) {
			return this.getResponseEntity((RuntimeException)sysServiceAPIRuntimeException.getCause());
		}
		
		ObjectNode out = JsonUtils.createObjectNode();

		out.put("type", "SysServiceAPIRuntimeException");
		out.put("code", sysServiceAPIRuntimeException.getErrorCode());
		out.put("message", sysServiceAPIRuntimeException.getMessage());
		
		return getResponseEntity(out);
	}
	
	
	protected ResponseEntity<?> getResponseEntity(ObjectNode objectNode){
		JsonNode codeNode =  objectNode.get("code");
		int nCode = Errors.INTERNALERROR;
		if(codeNode != null && codeNode.isNumber()) {
			nCode = codeNode.asInt();
		}
		if (Errors.ACCESSDENY == nCode) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).contentType(MediaType.APPLICATION_JSON).body(objectNode);
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON).body(objectNode);
	}

}
