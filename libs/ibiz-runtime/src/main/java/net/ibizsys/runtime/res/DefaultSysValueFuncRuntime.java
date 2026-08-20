package net.ibizsys.runtime.res;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ISearchContextBase;

import java.sql.Timestamp;

/**
 * 默认系统值函数运行时实现
 * 
 * @author lionlau
 */
public class DefaultSysValueFuncRuntime extends SysValueFuncRuntimeBase {

	@Override
	public void convert(ISearchContextBase iSearchContextBase, IPSDEFSearchMode iPSDEFSearchMode, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime) {

		Assert.notNull(iSearchContextBase, "搜索上下文对象无效");
		Assert.notNull(iPSDEFSearchMode, "属性搜索模式对象无效");
		Assert.notNull(iPSDEField, "属性对象无效");
		Assert.notNull(iDataEntityRuntime, "实体运行时对象无效");

		String valueFunc = iPSDEFSearchMode.getValueFunc();
		if (!StringUtils.hasLength(valueFunc)) {
			return;
		}

		// 获取用户输入的天数值
		Object objValue = iDataEntityRuntime.getSearchCondition(iSearchContextBase, iPSDEField, iPSDEFSearchMode);
		if (ObjectUtils.isEmpty(objValue)) {
			return;
		}

		if (PREDEFINED_DATEDIFFNOW.equalsIgnoreCase(valueFunc) || PREDEFINED_DATEDIFFNOW2.equalsIgnoreCase(valueFunc)) {
			int days;
			try {
				days = DataTypeUtils.getIntegerValue(objValue, 0);
			} catch (Exception e) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("转化天数[%1$s]发生异常", objValue));
			}

			// 根据值函数类型处理
			if (PREDEFINED_DATEDIFFNOW.equalsIgnoreCase(valueFunc)) {
				// 过去：从今天零点往前推 days 天 到 当前时刻
				applyDateRange(iSearchContextBase, iPSDEField, iPSDEFSearchMode, iDataEntityRuntime, days, false);
				return;
			}

			if (PREDEFINED_DATEDIFFNOW2.equalsIgnoreCase(valueFunc)) {
				// 未来：从当前时刻 到 今天零点往后推 days 天
				applyDateRange(iSearchContextBase, iPSDEField, iPSDEFSearchMode, iDataEntityRuntime, days, true);
				return;
			}
		}
		

		throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法识别的搜索模式[%1$s]值函数条件[%2$s]", iPSDEFSearchMode.getName(), valueFunc));
	}

	/**
	 * 应用日期区间条件（使用 UTC 零点，与原始实现保持一致）
	 * 
	 * @param ctx
	 *            搜索上下文
	 * @param field
	 *            属性
	 * @param mode
	 *            搜索模式（含操作符和值函数）
	 * @param runtime
	 *            实体运行时
	 * @param days
	 *            天数（正数）
	 * @param forward
	 *            true=未来区间（当前→目标日），false=过去区间（目标日→当前）
	 */
	protected void applyDateRange(ISearchContextBase ctx, IPSDEField field, IPSDEFSearchMode mode, IDataEntityRuntime runtime, int days, boolean forward) {
		// 获取当前 UTC 时间戳
		long currentMillis = System.currentTimeMillis();
		// 计算 UTC 当天零点（除以86400000取整再乘回）
		long startMillis = (currentMillis / 86400000L) * 86400000L;

		// 计算目标日零点（往前或往后偏移 days 天）
		long offsetMillis = days * 86400000L;
		long targetMillis = forward ? startMillis + offsetMillis : startMillis - offsetMillis;

		Timestamp targetTime = new Timestamp(targetMillis);
		Timestamp currentTime = new Timestamp(currentMillis);

		// 根据方向确定区间上下限
		Timestamp lowerBound, upperBound;
		if (forward) {
			// 未来：[当前时刻, 目标日零点]
			lowerBound = currentTime;
			upperBound = targetTime;
		} else {
			// 过去：[目标日零点, 当前时刻]
			lowerBound = targetTime;
			upperBound = currentTime;
		}

		// 无论原操作符是 LTANDEQ 还是 GTANDEQ，均生成区间查询
		String op = mode.getValueOP();
		if (Conditions.LTANDEQ.equals(op) || Conditions.GTANDEQ.equals(op)) {
			// 清除该字段的已有条件（可选，根据业务决定是否开启）
			runtime.setSearchCondition(ctx, field, Conditions.GTANDEQ, lowerBound);
			runtime.setSearchCondition(ctx, field, Conditions.LTANDEQ, upperBound);
		} 
		else
		if (Conditions.LT.equals(op) || Conditions.GT.equals(op)) {
			// 清除该字段的已有条件（可选，根据业务决定是否开启）
			runtime.setSearchCondition(ctx, field, Conditions.GT, lowerBound);
			runtime.setSearchCondition(ctx, field, Conditions.LT, upperBound);
		}
		else {
			throw new DataEntityRuntimeException(runtime, String.format("值函数[%1$s]不支持操作符[%2$s]，仅支持 LTANDEQ、GTANDEQ、LT、GT", mode.getValueFunc(), op));
		}
	}
}