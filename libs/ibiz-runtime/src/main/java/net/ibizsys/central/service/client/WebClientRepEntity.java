package net.ibizsys.central.service.client;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;

public class WebClientRepEntity extends Entity implements IWebClientRepEntity {

	public final static String FIELD_HEADER = "header";
	public final static String FIELD_BODY = "body";
	public final static String FIELD_STATUSCODE = "statuscode";

	public WebClientRepEntity() {
		super(null, false);
	}

	@Override
	@JsonIgnore
	public Object getBody() {
		return this.get(FIELD_BODY);
	}

	@JsonIgnore
	public void setBody(Object objBody) {
		this.set(FIELD_BODY, objBody);
	}
	
	@Override
	@JsonIgnore
	public int getStatusCode() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_STATUSCODE), HttpStatus.OK.value());
		}
		catch (Exception ex) {
			return HttpStatus.OK.value();
		}
	}

	@JsonIgnore
	public void setStatusCode(Object objStatusCode) {
		this.set(FIELD_STATUSCODE, objStatusCode);
	}
	
	

	@Override
	@JsonIgnore
	public IEntity getHeader() {
		Object objValue = this.get(FIELD_HEADER);
		if (objValue instanceof IEntity) {
			return (IEntity) objValue;
		}
		return null;
	}

	@JsonIgnore
	public void setHeader(IEntity iEntity) {
		this.set(FIELD_HEADER, iEntity);
	}

	public static IWebClientRepEntity from(IWebClientRep<?> iWebClientRep) {
		WebClientRepEntity webClientRepEntity = new WebClientRepEntity();
		if (iWebClientRep.getHeaders() != null) {
			// IEntity header = new Entity(iWebClientRep.getHeaders(), false);
			IEntity header = new Entity(null, false);
			MultiValueMap<String, String> map = iWebClientRep.getHeaders();
			if (map != null) {
				for(java.util.Map.Entry<String, List<String>> entry : map.entrySet()) {
					if(ObjectUtils.isEmpty(entry.getValue())) {
						continue;
					}
					if(entry.getValue().size() == 1) {
						header.set(entry.getKey(), entry.getValue().get(0));
					}
					else {
						header.set(entry.getKey(), entry.getValue());
					}
				}
			}
			webClientRepEntity.setHeader(header);
		}
		webClientRepEntity.setBody(iWebClientRep.getBody());
		webClientRepEntity.setStatusCode(iWebClientRep.getStatusCode());
		return webClientRepEntity;
	}



}
