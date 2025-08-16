package net.ibizsys.central.util.groovy;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCondBase;
import net.ibizsys.central.util.SearchFieldCondHelper;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public class SearchGroupCondMetaClassImpl extends MetaClassImplBase{

	public final static String FIELD_ID = "id";
	
	public final static String FIELD_NAME = "name";
	
	public SearchGroupCondMetaClassImpl(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public SearchGroupCondMetaClassImpl(Class theClass) {
		super(theClass);
	}

	public SearchGroupCondMetaClassImpl(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public SearchGroupCondMetaClassImpl(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}


	
	@Override
	protected Object onGetProperty(Class sender, Object object, String name, boolean useSuper, boolean fromInsideClass) {
		IDEMethodDTORuntime iDEMethodDTORuntime = this.getDEMethodDTORuntime(object);
		if(iDEMethodDTORuntime != null) {
			IPSDEField iPSDEField = iDEMethodDTORuntime.getDataEntityRuntime().getPSDEFieldByCodeName(name, true);
			if(iPSDEField == null) {
				iPSDEField = iDEMethodDTORuntime.getDataEntityRuntime().getPSDEField(name, true);
			}
			if(iPSDEField == null) {
				if(FIELD_ID.equalsIgnoreCase(name)) {
					iPSDEField = iDEMethodDTORuntime.getDataEntityRuntime().getKeyPSDEField();
				}
				else
					if(FIELD_NAME.equalsIgnoreCase(name)) {
						if(iDEMethodDTORuntime.getDataEntityRuntime().getMajorPSDEField()!=null) {
							iPSDEField = iDEMethodDTORuntime.getDataEntityRuntime().getMajorPSDEField();
						}
					}
			}
			
			if(iPSDEField == null) {
				throw new DataEntityRuntimeException(iDEMethodDTORuntime.getDataEntityRuntime(), iDEMethodDTORuntime, String.format("指定属性[%1$s]不存在", name));
			}
			
			return new SearchFieldCondHelper((ISearchGroupCondBase)object, iPSDEField.getName());
		}
		
		return super.onGetProperty(sender, object, name, useSuper, fromInsideClass);
	}
	
	
	protected IDEMethodDTORuntime getDEMethodDTORuntime(Object object) {
		if(object instanceof SearchGroupCond) {
			SearchGroupCond searchGroupCond = (SearchGroupCond)object;
			ISearchContextDTO iSearchContextDTO = searchGroupCond.getSearchContextDTO();
			return iSearchContextDTO.getDEMethodDTORuntime();
		}
		return null;
	}

}
