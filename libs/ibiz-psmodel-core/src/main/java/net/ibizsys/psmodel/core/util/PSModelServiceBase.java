package net.ibizsys.psmodel.core.util;

import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class PSModelServiceBase<M extends IPSModel, F extends IPSModelFilter> implements IPSModelService<M, F> {

	private static final Log log = LogFactory.getLog(PSModelServiceBase.class);

	// private TypeReference<M> psModelTypeReference = new TypeReference<M>(){};

	public static ObjectMapper MAPPER = new ObjectMapper();

	public static ObjectMapper getMapper() {
		return PSModelServiceBase.MAPPER;
	}

	public static void setMapper(ObjectMapper mapper) {
		if (mapper != null) {
			PSModelServiceBase.MAPPER = mapper;
		} else {
			PSModelServiceBase.MAPPER = new ObjectMapper();
		}
	}

	@Override
	public void create(M m, boolean get) throws Exception {
		this.onBeforeCreate(m);
		this.checkBefore(m, false);
		this.doCreate(m);
		this.checkAfter(m, false);
		this.onAfterCreate(m);
	}

	protected void onBeforeCreate(M m) throws Exception {

	}

	protected void doCreate(M m) throws Exception {
		throw new Exception("没有实现");
	}

	protected void onAfterCreate(M m) throws Exception {

	}

	@Override
	public void update(M m, boolean get) throws Exception {
		this.mergeLast(m);
		this.onBeforeUpdate(m);
		this.checkBefore(m, true);
		this.doUpdate(m);
		this.checkAfter(m, true);
		this.onAfterUpdate(m);
	}

	protected void onBeforeUpdate(M m) throws Exception {

	}

	protected void doUpdate(M m) throws Exception {
		throw new Exception("没有实现");
	}

	protected void onAfterUpdate(M m) throws Exception {

	}
	
	protected void mergeLast(M m) throws Exception {
		M last = getLast(m);
		if(last != null) {
			doMergeLast(m, last);
		}
		
	}
	
	protected M getLast(M m) throws Exception{
		return null;
	}
	
	protected void doMergeLast(M m, M last) throws Exception {
		last.copyToIf(m);
	}
	
	

	@Override
	public void checkBefore(M m, boolean updateMode) throws Exception {
		doCheckBefore(m, updateMode);
	}

	protected void doCheckBefore(M m, boolean updateMode) throws Exception {

	}

	@Override
	public void checkAfter(M m, boolean updateMode) throws Exception {
		doCheckAfter(m, updateMode);
	}

	protected void doCheckAfter(M m, boolean updateMode) throws Exception {

	}
	
	@Override
	public M getDraft(M m) throws Exception {
		if(m == null) {
			m = this.createDomain();
		}
		return this.doGetDraft(m);
	}
	
	protected M doGetDraft(M m) throws Exception {
		return m;
	}

	@Override
	public M get(String key, boolean tryMode) throws Exception {
		M m = this.doGet(key, tryMode);
		if (m != null) {
			this.onAfterGet(m);
		}
		return m;
	}

	protected M doGet(String key, boolean tryMode) throws Exception {
		throw new Exception("没有实现");
	}

	protected void onAfterGet(M m) throws Exception {

	}

	@Override
	public void remove(String key) throws Exception {
		M m = this.get(key, false);
		this.onBeforeRemove(m);
		this.doRemove(m);
		this.onAfterRemove(m);
	}
	
	protected void onBeforeRemove(M m) throws Exception {
		
	}
	
	
	protected void onAfterRemove(M m) throws Exception {
		
	}

	
	protected void doRemove(M m) throws Exception {
		
	}

	@Override
	public void remove(F f) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<M> select(F f) throws Exception {
		Page<M> page = this.fetch("DEFAULT", f);
		if(page != null) {
			return page.getContent();
		}
		return null;
	}

	@Override
	public M selectOne(F f) throws Exception {
		return this.selectOne(f, false);
	}

	@Override
	public M selectOne(F f, boolean tryMode) throws Exception {
		if(f instanceof PSModelFilterBase) {
			PSModelFilterBase psModelFilterBase = (PSModelFilterBase)f;
			psModelFilterBase.setPage(0);
			psModelFilterBase.setSize(1);
		}
		List<M> list = this.select(f);
		M m = ObjectUtils.isEmpty(list)?null:list.get(0);
		if(m != null || tryMode) {
			return m;
		}
		throw new Exception("无法获取符合条件的数据");
	}
	
	@Override
	public boolean select(M m, boolean tryMode) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Page<M> fetch(F f) throws Exception {
		return this.fetch("DEFAULT", f);
	}
	
	@Override
	public Page<M> fetch(String strDataSetName, F f) throws Exception {
		return this.doFetch(strDataSetName, f);
	}

	protected Page<M> doFetch(String strDataSetName, F f) throws Exception {
//		Page<Map<String, Object>> page = this.getPSModelStorage().fetch(this.getModelName(), strDataSetName, f);
//		if (ObjectUtils.isEmpty(page) || ObjectUtils.isEmpty(page.getContent())) {
//			return (Page) page;
//		}
//		List<M> list = new ArrayList<M>();
//
//		List<Map<String, Object>> contentList = page.getContent();
//		for (Map<String, Object> item : contentList) {
//			M domain = this.createDomain();
//			list.add(domain);
//		}
//		return new PageImpl<M>(list, f.getPageable(), page.getTotalElements());
		throw new Exception("没有实现");
	}

	@Override
	public M createDomain() {
		return null;
	}

	@Override
	public F createFilter() {
		return null;
	}

	@Override
	public M getDomain(Object params) {
		return null;
	}

	@Override
	public F getFilter(Object params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object invoke(String methodName, String key, Object params) throws Exception {
		methodName = methodName.toUpperCase();
		return doInvoke(methodName, key, params);
	}

	protected Object doInvoke(String methodName, String key, Object params) throws Exception {
		
		if (METHOD_GET.equals(methodName)) {
			return this.get(key, false);
		}

		if (METHOD_CREATE.equals(methodName)) {
			M domain = this.getDomain(params);
			if(domain == null) {
				domain = this.createDomain();
				if (params instanceof Map) {
					domain.putAll((Map) params);
				}
			}
			this.create(domain, true);
			return domain;
		}

		if (METHOD_UPDATE.equals(methodName)) {
			M domain = this.getDomain(params);
			if(domain == null) {
				domain = this.createDomain();
				if (params instanceof Map) {
					domain.putAll((Map) params);
				}
			}
			this.update(domain, true);
			return domain;
		}
		
		if (METHOD_GETDRAFT.equals(methodName)) {
			M domain = this.getDomain(params);
			if(domain == null) {
				domain = this.createDomain();
				if (params instanceof Map) {
					domain.putAll((Map) params);
				}
			}
			return this.getDraft(domain);
		}

		if (METHOD_REMOVE.equals(methodName)) {
			this.remove(key);
			return null;
		}

		if (methodName.indexOf(METHOD_FETCH) == 0) {
			F f = this.getFilter(params);
			if(f == null) {
				f = this.createFilter();
				if (params instanceof Map) {
					f.putAll((Map) params);
				}
			}
			return this.fetch(methodName.substring(METHOD_FETCH.length()), f);
		}

		throw new Exception(String.format("无法识别的调用方法[%1$s]", methodName));
	}

	@Override
	public String getModelName(boolean single) {
		return null;
	}

	public String getModelName() {
		return this.getModelName(true);
	}

	public boolean fillDomainKeyValue(M m) throws Exception {
		if (!ObjectUtils.isEmpty(m.getId())) {
			return true;
		}

		// if(this.getDEModel().getUniTagDEField()!=null) {
		// if((StringHelper.compare(strKeyFieldName,
		// this.getDEModel().getUniTagDEField().getName(), true)!=0)) {
		// objValue = et.get(this.getDEModel().getUniTagDEField().getName());
		// if (objValue != null)
		// return true;
		// }
		// if(bTempMode) {
		// et.set(this.getDEModel().getUniTagDEField().getName(), TEMPKEY +
		// KeyValueHelper.genGuidEx());
		// return false;
		// }
		// else {
		// //判断是否传入实体对象键值
		// objValue = et.get(ENTITYKEY);
		// if (objValue != null)
		// {
		// et.set(this.getDEModel().getUniTagDEField().getName(),objValue);
		// return true;
		// }
		// }
		// }

		boolean bet = doFillDomainKeyValue(m);

		return bet;
	}

	protected boolean doFillDomainKeyValue(M m) throws Exception {
		// if(!bTempMode){
		// /**
		// * 20171218 调整为填充唯一标记列
		// */
		// if(this.getDEModel().getUniTagDEField()!=null){
		// if(!this.getDEModel().getUniTagDEField().isEnableDBAutoValue()){
		// et.set(this.getDEModel().getUniTagDEField().getName(),
		// KeyValueHelper.genGuidEx());
		// }
		// }
		// }

		m.setId(genGuidEx());

		return false;
	}

	/**
	 * 新建一个GUID
	 * 
	 * @return
	 */
	final public static String genGuidEx() {
		UUID idOne = UUID.randomUUID();
		return idOne.toString().toUpperCase();
	}

	final private static String convertToHex(byte[] data) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			int halfbyte = (data[i] >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))
					buf.append((char) ('0' + halfbyte));
				else
					buf.append((char) ('a' + (halfbyte - 10)));
				halfbyte = data[i] & 0x0F;
			} while (two_halfs++ < 1);
		}
		return buf.toString();
	}
	//
	// /**
	// * 获取指定文本的MD5字符串
	// *
	// * @param text
	// * @return
	// */
	// final public static String genMD5(String text) {
	// try {
	// MessageDigest md = MessageDigest.getInstance("MD5");
	// byte[] md5hash = new byte[32];
	// // md.update(text.getBytes("iso-8859-1"), 0, text.length());
	// md.update(text.getBytes("iso-8859-1"), 0, text.length());
	// md5hash = md.digest();
	// return convertToHex(md5hash);
	// } catch (Exception ex) {
	// return "";
	// }
	// }

	/**
	 * 获取指定文本的MD5字符串
	 * 
	 * @param text
	 * @return
	 */
	final public static String genMD5Ex(String text) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] md5hash = new byte[32];
			// md.update(text.getBytes("iso-8859-1"), 0, text.length());
			md.update(text.getBytes("utf-8"));
			md5hash = md.digest();
			return convertToHex(md5hash);
		} catch (Exception ex) {
			return "";
		}
	}

	/**
	 * 获取当前的时间
	 * 
	 * @return
	 */
	final public static long curTime() {
		return (new java.util.Date()).getTime();
	}

	/**
	 * 产生唯一标识
	 * 
	 * @param strSrc1
	 * @return
	 */
	final public static String genUniqueId(String strSrc1) {
		return genMD5Ex(strSrc1);
	}

	/**
	 * 产生唯一标识
	 * 
	 * @param strSrc1
	 * @param strSrc2
	 * @return
	 */
	final public static String genUniqueId(String strSrc1, String strSrc2) {
		return genMD5Ex(String.format("%1$s||%2$s", strSrc1, strSrc2));
	}

	/**
	 * 产生唯一标识
	 * 
	 * @param strSrc1
	 * @param strSrc2
	 * @param strSrc3
	 * @return
	 */
	final public static String genUniqueId(String strSrc1, String strSrc2, String strSrc3) {
		return genMD5Ex(String.format("%1$s||%2$s||%3$s", strSrc1, strSrc2, strSrc3));
	}

	/**
	 * 产生唯一标识
	 * 
	 * @param strSrc1
	 * @param strSrc2
	 * @param strSrc3
	 * @param strSrc4
	 * @return
	 */
	final public static String genUniqueId(String strSrc1, String strSrc2, String strSrc3, String strSrc4) {
		return genMD5Ex(String.format("%1$s||%2$s||%3$s||%4$s", strSrc1, strSrc2, strSrc3, strSrc4));
	}

	/**
	 * 产生唯一标识
	 * 
	 * @param strSrc1
	 * @param strSrc2
	 * @param strSrc3
	 * @param strSrc4
	 * @param strSrc5
	 * @return
	 */
	final public static String genUniqueId(String strSrc1, String strSrc2, String strSrc3, String strSrc4, String strSrc5) {
		return genMD5Ex(String.format("%1$s||%2$s||%3$s||%4$s||%5$s", strSrc1, strSrc2, strSrc3, strSrc4, strSrc5));
	}

	/**
	 * 产生唯一标识
	 * 
	 * @param strSrc1
	 * @param strSrc2
	 * @param strSrc3
	 * @param strSrc4
	 * @param strSrc5
	 * @param strSrc6
	 * @return
	 */
	final public static String genUniqueId(String strSrc1, String strSrc2, String strSrc3, String strSrc4, String strSrc5, String strSrc6) {
		return genMD5Ex(String.format("%1$s||%2$s||%3$s||%4$s||%5$s||%6$s", strSrc1, strSrc2, strSrc3, strSrc4, strSrc5, strSrc6));
	}

	protected IPSModelStorage getPSModelStorage() throws Exception {
		return PSModelServiceSession.getCurrent().getPSModelStorage();
	}

}
