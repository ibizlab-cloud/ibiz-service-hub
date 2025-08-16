package net.ibizsys.runtime.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;

public class CachedBeanCopier {
    //创建过的BeanCopier实例放到缓存中，下次可以直接获取，提升性能
    static final Map<String, BeanCopier> BEAN_COPIERS = new HashMap<String, BeanCopier>();

    public static void copy(Object srcObj, Object destObj) {
        copy(srcObj,destObj,true);
    }

    public static void copy(Object srcObj, Object destObj,boolean useConverter) {
        if(srcObj==null||destObj==null) {
            return;
        }
        getCopier(srcObj,destObj,useConverter).copy(srcObj, destObj, new Converter() {
            @Override
            public Object convert(Object o, Class aClass, Object o1) {
//                if("setFocusNull".equals(o1)) {
//                    if(destObj instanceof EntityBase) {
//                        EntityBase entityBase = (EntityBase) destObj;
//                        return entityBase.getFocusNull();
//                    }
//                }
                return o;
            }
        });
    }

    public synchronized static BeanCopier getCopier(Object srcObj, Object destObj,boolean useConverter) {
        String key = srcObj.getClass().getName()+destObj.getClass().getName()+useConverter;
        BeanCopier copier;
        if (!BEAN_COPIERS.containsKey(key)) {
            copier = BeanCopier.create(srcObj.getClass(), destObj.getClass(), useConverter);
            BEAN_COPIERS.put(key, copier);
        } else {
            copier = BEAN_COPIERS.get(key);
        }
        return copier;
    }
}
