package net.ibizsys.central.util.expression;

import java.util.Map;

import org.springframework.context.expression.MapAccessor;
import org.springframework.expression.AccessException;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.TypedValue;
import org.springframework.lang.Nullable;

import net.ibizsys.runtime.util.IEntity;

public class PropertyMapAccessor extends MapAccessor {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PropertyMapAccessor.class);
	private String strDefaultValue = null;
	
	public final static Object NULLOBJECT = new Object();
	
	public PropertyMapAccessor(String strDefaultValue) {
		this.strDefaultValue = strDefaultValue;
	}
	
	public PropertyMapAccessor() {
		
	}
	
	
	@Override
	public Class<?>[] getSpecificTargetClasses() {
		return new Class<?>[] {IEntity.class, Map.class};
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.context.expression.MapAccessor#canRead(org.springframework.expression.EvaluationContext, java.lang.Object, java.lang.String)
	 */
	@Override
	public boolean canRead(EvaluationContext context, @Nullable Object target, String name) throws AccessException {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.context.expression.MapAccessor#read(org.springframework.expression.EvaluationContext, java.lang.Object, java.lang.String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public TypedValue read(EvaluationContext context, @Nullable Object target, String name) throws AccessException {

		if (target == null || target == NULLOBJECT) {
			if(this.strDefaultValue == null) {
				return TypedValue.NULL;
			}
			return new TypedValue(this.strDefaultValue);
		}
		
		if(target instanceof Map) {
			Map<?, ?> map = (Map<?, ?>) target;
			Object value = map.get(name);
			if(value == null) {
				if(this.strDefaultValue == null) {
					return TypedValue.NULL;
				}
				return new TypedValue(this.strDefaultValue);                                                                              
			}
			return new TypedValue(value);
		}
		
		if(target instanceof IEntity) {
			IEntity iEntity = (IEntity) target;
			Object value = iEntity.get(name);
			if(value == null) {
				if(this.strDefaultValue == null) {
					return TypedValue.NULL;
				}
				return new TypedValue(this.strDefaultValue);                                                                             
			}
			return new TypedValue(value);
		}
		
		try {
			return super.read(context, target, name);
		}
		catch (Exception e) {
			return TypedValue.NULL;
		}
	}
	
}
