package net.ibizsys.central.plugin.mybatisplus.spring.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.ibizsys.central.database.ISysDBTableRuntime;
import net.ibizsys.central.plugin.mybatisplus.util.GroupQuery;
import net.ibizsys.runtime.util.SqlCommandParam;
import net.ibizsys.runtime.util.SqlParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface MybatisDbDataMapper {

    int insertData(@Param("schema") ISysDBTableRuntime schema, @Param("param") SqlCommandParam param);

    int batchInsertData(@Param("schema") ISysDBTableRuntime schema, @Param("list") List<SqlCommandParam> list);

    int batchInsertDataSingleSQL(@Param("schema") ISysDBTableRuntime schema,@Param("columns") List<String> columns, @Param("list") List<List<SqlParam>> list);

    int updateData(@Param("schema") ISysDBTableRuntime schema, @Param("param") SqlCommandParam data);

    int batchUpdateData(@Param("schema") ISysDBTableRuntime schema, @Param("list") List<SqlCommandParam> list);

    int batchUpdateDataSingleSQL(@Param("schema") ISysDBTableRuntime schema,@Param("keys") List keys, @Param("map") Map<String, Map<Object, SqlParam>> map);

    int removeData(@Param("schema") ISysDBTableRuntime schema, @Param("param") SqlCommandParam data);

    int batchRemoveData(@Param("schema") ISysDBTableRuntime schema, @Param("keys") List list);

    List<Map<String, Object>> selectData(@Param("schema") ISysDBTableRuntime schema,
                                         @Param("param") SqlCommandParam data);

    @Select("${sql}")
    List<Map<String, Object>> queryData(@Param(Constants.WRAPPER) Wrapper<?> query, @Param("sql") String sql,
                                        @Param("ctx") Object data);

    @Select("${sql}")
    Page<Map<String, Object>> queryData(IPage<?> page, @Param(Constants.WRAPPER) Wrapper<?> query,
                                        @Param("sql") String sql, @Param("ctx") Object data);

    Page<Map<String, Object>> queryGroupData(IPage<?> page, @Param(Constants.WRAPPER) Wrapper<?> query, @Param("groupquery") GroupQuery groupQuery,
                                             @Param("ctx") Object data);

    /**
     * 自定义更新SQL
     *
     * @param sql
     * @return
     */
    @Update("${sql}")
    int updateBySQL(@Param("sql") String sql, @Param("ctx") Map param);

    /**
     * 自定义插入SQL
     *
     * @param sql
     * @return
     */
    @Insert("${sql}")
    int insertBySQL(@Param("sql") String sql, @Param("ctx") Map param);

    /**
     * 自定义删除SQL
     *
     * @param sql
     * @return
     */
    @Delete("${sql}")
    int deleteBySQL(@Param("sql") String sql, @Param("ctx") Map param);

}
