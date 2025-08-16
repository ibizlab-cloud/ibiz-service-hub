package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSDBValueOP;
import net.ibizsys.psmodel.core.filter.PSDBValueOPFilter;
import net.ibizsys.psmodel.core.service.IPSDBValueOPService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;

public class PSDBValueOPRTService extends PSModelRTServiceBase<PSDBValueOP, PSDBValueOPFilter> implements IPSDBValueOPService {
	private static final Log log = LogFactory.getLog(PSDBValueOPRTService.class);

	private static List<PSDBValueOP> PSDBValueOPs = new ArrayList<PSDBValueOP>();

	static {
		Map<String, PSDBValueOP> map = new HashMap<String, PSDBValueOP>();

		map.put("EQ", new PSDBValueOP().id("EQ").validflag(1).dbflag(1).dlflag(1).name("等于(=)").ordervalue(10));
		map.put("NOTEQ", new PSDBValueOP().id("NOTEQ").validflag(1).dbflag(1).dlflag(1).name("不等于(<>)").ordervalue(20));
		map.put("GT", new PSDBValueOP().id("GT").validflag(1).dbflag(1).dlflag(1).name("大于(>)").ordervalue(30));
		map.put("GTANDEQ", new PSDBValueOP().id("GTANDEQ").validflag(1).dbflag(1).dlflag(1).name("大于等于(>=)").ordervalue(40));
		map.put("LT", new PSDBValueOP().id("LT").validflag(1).dbflag(1).dlflag(1).name("小于(<)").ordervalue(50));
		map.put("LTANDEQ", new PSDBValueOP().id("LTANDEQ").validflag(1).dbflag(1).dlflag(1).name("小于等于(<=)").ordervalue(60));
		map.put("ISNULL", new PSDBValueOP().id("ISNULL").validflag(1).dbflag(1).dlflag(1).name("值为空(Nil)").ordervalue(100));
		map.put("ISNOTNULL", new PSDBValueOP().id("ISNOTNULL").validflag(1).dbflag(1).dlflag(1).name("值不为空(NotNil)").ordervalue(110));
		map.put("TESTNULL", new PSDBValueOP().id("TESTNULL").validflag(1).dbflag(1).dlflag(1).name("空值判断(TestNil)").ordervalue(120));
		map.put("LIKE", new PSDBValueOP().id("LIKE").validflag(1).dbflag(1).dlflag(1).name("文本包含(%)").ordervalue(200));
		map.put("LEFTLIKE", new PSDBValueOP().id("LEFTLIKE").validflag(1).dbflag(1).dlflag(1).name("文本左包含(%#)").ordervalue(210));
		map.put("RIGHTLIKE", new PSDBValueOP().id("RIGHTLIKE").validflag(1).dbflag(1).dlflag(1).name("文本右包含(#%)").ordervalue(220));
		map.put("USERLIKE", new PSDBValueOP().id("USERLIKE").validflag(1).dbflag(1).dlflag(1).name("自定义文本包含(%)").ordervalue(230));
		map.put("IN", new PSDBValueOP().id("IN").validflag(1).dbflag(1).dlflag(1).name("值在范围中(In)").ordervalue(300));
		map.put("NOTIN", new PSDBValueOP().id("NOTIN").validflag(1).dbflag(1).dlflag(1).name("值不在范围中(NotIn)").ordervalue(310));
		map.put("EXISTS", new PSDBValueOP().id("EXISTS").validflag(1).dbflag(1).dlflag(1).name("存在引用数据(Exists)").ordervalue(315));
		map.put("EXISTSX", new PSDBValueOP().id("EXISTSX").validflag(1).dbflag(1).dlflag(1).name("存在引用数据(ExistsX)（条件）").ordervalue(316));
		map.put("BITAND", new PSDBValueOP().id("BITAND").validflag(1).dbflag(1).dlflag(1).name("位与操作（BitAnd）(仅限整数形）").ordervalue(320));
		map.put("CHILDOF", new PSDBValueOP().id("CHILDOF").validflag(1).dbflag(1).dlflag(1).name("子数据（递归）").ordervalue(330));

		PSDBValueOPs.addAll(map.values());
	}

	@Override
	public PSDBValueOP createDomain() {
		return new PSDBValueOP();
	}

	@Override
	public PSDBValueOPFilter createFilter() {
		return new PSDBValueOPFilter();
	}

	@Override
	public PSDBValueOP getDomain(Object params) {
		if (params instanceof PSDBValueOP) {
			return (PSDBValueOP) params;
		}
		return getMapper().convertValue(params, PSDBValueOP.class);
	}

	@Override
	public PSDBValueOPFilter getFilter(Object params) {
		if (params instanceof PSDBValueOPFilter) {
			return (PSDBValueOPFilter) params;
		}
		return getMapper().convertValue(params, PSDBValueOPFilter.class);
	}

	@Override
	public String getModelName(boolean single) {
		if (single) {
			return "PSDBVALUEOP";
		} else {
			return "PSDBVALUEOPS";
		}
	}

	protected List<PSDBValueOP> getDomainList(String strDataSetName, PSDBValueOPFilter f) throws Exception {
		// 执行过滤操作
		return filterDomainList(PSDBValueOPs, strDataSetName, f);
	}
}
