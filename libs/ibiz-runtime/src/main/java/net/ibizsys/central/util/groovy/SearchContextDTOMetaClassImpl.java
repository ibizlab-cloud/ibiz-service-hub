package net.ibizsys.central.util.groovy;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.util.ISearchContextDTO;

public class SearchContextDTOMetaClassImpl extends SearchGroupCondMetaClassImpl{

	public SearchContextDTOMetaClassImpl(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public SearchContextDTOMetaClassImpl(Class theClass) {
		super(theClass);
	}

	public SearchContextDTOMetaClassImpl(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public SearchContextDTOMetaClassImpl(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}

	@Override
	protected IDEMethodDTORuntime getDEMethodDTORuntime(Object object) {
		if(object instanceof ISearchContextDTO) {
			ISearchContextDTO iSearchContextDTO =  (ISearchContextDTO)object;
			return iSearchContextDTO.getDEMethodDTORuntime();
		}
		return null;
	}
}
