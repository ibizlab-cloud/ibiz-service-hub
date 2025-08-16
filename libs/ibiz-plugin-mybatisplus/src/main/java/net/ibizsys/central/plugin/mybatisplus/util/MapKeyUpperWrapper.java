package net.ibizsys.central.plugin.mybatisplus.util;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.wrapper.MapWrapper;

import java.util.Map;

/**
 * Map的包装器
 * Map中的key全部转大写处理
 */
public class MapKeyUpperWrapper extends MapWrapper {

    public MapKeyUpperWrapper(MetaObject metaObject, Map<String, Object> map) {
        super(metaObject, map);
    }

    @Override
    public String findProperty(String name, boolean useCamelCaseMapping) {
        return name == null ? "" : name.toUpperCase();
    }
}