package net.ibizsys.central.util.groovy;

import groovy.lang.MetaClass;
import groovy.lang.MetaClassRegistry;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCondBase;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;


public class MetaClassCreationHandle extends groovy.lang.MetaClassRegistry.MetaClassCreationHandle {

	
	@Override
	protected MetaClass createNormalMetaClass(Class theClass, MetaClassRegistry registry) {
		
		if(IDataEntityRuntime.class.isAssignableFrom(theClass)) {
			return new DataEntityRuntimeMetaClassImpl(registry, theClass);
		}
		
		if(ISearchContextDTO.class.isAssignableFrom(theClass)) {
			return new SearchContextDTOMetaClassImpl(registry, theClass);
		}
		
		if(ISearchGroupCondBase.class.isAssignableFrom(theClass)) {
			return new SearchGroupCondMetaClassImpl(registry, theClass);
		}
		
		if(IEntityDTO.class.isAssignableFrom(theClass)) {
			return new EntityDTOMetaClassImpl(registry, theClass);
		}
		
		if(IScriptEntity.class.isAssignableFrom(theClass)) {
			return new ScriptEntityMetaClassImpl(registry, theClass);
		}
		
		if(ISystemModelRuntime.class.isAssignableFrom(theClass)) {
			return new SystemModelRuntimeMetaClassImpl(registry, theClass);
		}
		
		if(IModelRuntime.class.isAssignableFrom(theClass)) {
			return new ModelRuntimeMetaClassImpl(registry, theClass);
		}
		
		return super.createNormalMetaClass(theClass, registry);
	}

}
