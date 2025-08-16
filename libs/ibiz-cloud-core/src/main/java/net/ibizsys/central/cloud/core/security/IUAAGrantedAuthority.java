package net.ibizsys.central.cloud.core.security;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
include = JsonTypeInfo.As.PROPERTY,
property = "type")
@JsonSubTypes({
@Type(value = UAADEAuthority.class, name= IUAAGrantedAuthority.TYPE_OPPRIV),
@Type(value = UAAMenuAuthority.class, name= IUAAGrantedAuthority.TYPE_APPMENU),
@Type(value = UAAUniResAuthority.class, name= IUAAGrantedAuthority.TYPE_UNIRES),
@Type(value = UAARoleAuthority.class, name= IUAAGrantedAuthority.TYPE_ROLE)
})


public interface IUAAGrantedAuthority extends GrantedAuthority{

	
	public final static String TYPE_OPPRIV = "OPPRIV";
	
	public final static String TYPE_UNIRES = "UNIRES";
	
	public final static String TYPE_APPMENU = "APPMENU";
	
	public final static String TYPE_ROLE = "ROLE";
	
	/**
	 * 获取类型
	 * @return
	 */
	String getType();
}
