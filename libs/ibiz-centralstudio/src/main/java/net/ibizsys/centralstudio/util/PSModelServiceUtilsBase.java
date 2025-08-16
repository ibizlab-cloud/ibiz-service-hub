package net.ibizsys.centralstudio.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.util.*;

/**
 * 模型辅助基类
 *
 * @author lionlau
 */
public abstract class PSModelServiceUtilsBase {

    private static final Log log = LogFactory.getLog(PSModelServiceUtilsBase.class);

    protected static ObjectMapper MAPPER = new ObjectMapper();

    private static WebClient webClient = null;

    public final static int LIST_SIZE = 200;


    private Map<String, Object> params = new HashMap<String, Object>();


    // private final static ThreadLocal<String> psSysDevBKTaskIdThreadLocal =
    // new ThreadLocal<String>();

    private static final ThreadLocal<Deque<String>> psSysDevBKTaskIdThreadLocal = new ThreadLocal<Deque<String>>() {
        @Override
        protected Deque<String> initialValue() {
            return new ArrayDeque<String>();
        }
    };

    protected WebClient getWebClient() {
        if (PSModelServiceUtilsBase.webClient == null) {
            PSModelServiceUtilsBase.webClient = WebClient.builder().codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(16 * 1024 * 1024)).build();

            // this.webClient = WebClient.create();
        }
        return PSModelServiceUtilsBase.webClient;
    }

    // protected Object callCreate()
    protected <T> void executeCreate(String strModelName, String strPath, Class<T> cls, IPSModelDTO iPSModelDTO) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();
        try {

            iPSModelDTO.reset("createdate");
            iPSModelDTO.reset("createman");
            iPSModelDTO.reset("updatedate");
            iPSModelDTO.reset("updateman");

            Mono<T> mono = getWebClient().post().uri(String.format("%1$s/%2$s", psModelServiceSession.getServiceUrl(), strPath)).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").bodyValue(iPSModelDTO).retrieve().bodyToMono(cls);

            T t = mono.block();
            iPSModelDTO.resetAll();
            ((IPSModelDTO) t).copyTo(iPSModelDTO);

            log.debug(String.format("建立对象[%1$s]", strModelName));

        } catch (WebClientResponseException ex) {
            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }

            throw ex;
        }
    }

    protected void executeCreate(String strModelName, String strPath, List<? extends IPSModelDTO> psModelDTOList) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();

        boolean bBreak = false;
        int nIndex = 0;
        while (true) {
            List list = null;
            if (psModelDTOList.size() <= LIST_SIZE) {
                list = psModelDTOList;
                bBreak = true;
            } else {
                list = new ArrayList();
                for (int i = 0; i < LIST_SIZE; i++) {
                    int nCurIndex = nIndex * LIST_SIZE + i;
                    if (nCurIndex < psModelDTOList.size()) {
                        IPSModelDTO iPSModelDTO = psModelDTOList.get(nCurIndex);
                        list.add(iPSModelDTO);
                    } else {
                        bBreak = true;
                        break;
                    }
                }
            }
            nIndex++;
            try {

                for (Object item : list) {
                    IPSModelDTO iPSModelDTO = (IPSModelDTO) item;
                    iPSModelDTO.reset("createdate");
                    iPSModelDTO.reset("createman");
                    iPSModelDTO.reset("updatedate");
                    iPSModelDTO.reset("updateman");
                }

                Mono<String> mono = getWebClient().post().uri(String.format("%1$s/%2$s/batch", psModelServiceSession.getServiceUrl(), strPath)).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").bodyValue(list).retrieve().bodyToMono(String.class);
                mono.block();

                log.debug(String.format("建立对象[%1$s]", strModelName));

            } catch (WebClientResponseException ex) {
                String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
                if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                    ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                    if (objNode.get("message") != null) {
                        String strMessage = objNode.get("message").asText();
                        throw new Exception(strMessage, ex);
                    }
                }

                throw ex;
            }

            if (bBreak) {
                break;
            }

        }

    }

    protected <T> void executeUpdate(String strModelName, String strPath, Class<T> cls, IPSModelDTO iPSModelDTO) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();

        try {

            iPSModelDTO.reset("createdate");
            iPSModelDTO.reset("createman");
            iPSModelDTO.reset("updatedate");
            iPSModelDTO.reset("updateman");

            Mono<T> mono = getWebClient().put().uri(String.format("%1$s/%2$s/{1}", psModelServiceSession.getServiceUrl(), strPath), iPSModelDTO.getSrfkey()).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").bodyValue(iPSModelDTO).retrieve().bodyToMono(cls);

            T t = mono.block();

            iPSModelDTO.resetAll();
            ((IPSModelDTO) t).copyTo(iPSModelDTO);

            log.debug(String.format("更新对象[%1$s]", strModelName));

            // MAPPER.readvalue
        } catch (WebClientResponseException ex) {
            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }

            throw ex;
        }
    }

    protected void executeUpdate(String strModelName, String strPath, List<? extends IPSModelDTO> psModelDTOList) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();

        boolean bBreak = false;
        int nIndex = 0;
        while (true) {
            List list = null;
            if (psModelDTOList.size() <= LIST_SIZE) {
                list = psModelDTOList;
                bBreak = true;
            } else {
                list = new ArrayList();
                for (int i = 0; i < LIST_SIZE; i++) {
                    int nCurIndex = nIndex * LIST_SIZE + i;
                    if (nCurIndex < psModelDTOList.size()) {
                        IPSModelDTO iPSModelDTO = psModelDTOList.get(nCurIndex);
                        list.add(iPSModelDTO);
                    } else {
                        bBreak = true;
                        break;
                    }
                }
            }
            nIndex++;
            try {

                for (Object item : list) {
                    IPSModelDTO iPSModelDTO = (IPSModelDTO) item;
                    iPSModelDTO.reset("createdate");
                    iPSModelDTO.reset("createman");
                    iPSModelDTO.reset("updatedate");
                    iPSModelDTO.reset("updateman");
                }

                Mono<String> mono = getWebClient().put().uri(String.format("%1$s/%2$s/batch", psModelServiceSession.getServiceUrl(), strPath)).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").bodyValue(list).retrieve().bodyToMono(String.class);

                mono.block();

                log.debug(String.format("更新对象[%1$s]", strModelName));

            } catch (WebClientResponseException ex) {
                String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
                if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                    ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                    if (objNode.get("message") != null) {
                        String strMessage = objNode.get("message").asText();
                        throw new Exception(strMessage, ex);
                    }
                }

                throw ex;
            }

            if (bBreak) {
                break;
            }

        }

//		try {
//			Mono<String> mono = getWebClient().put().uri(String.format("%1$s/%2$s/batch", psModelServiceSession.getServiceUrl(), strPath)).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").bodyValue(psModelDTOList).retrieve().bodyToMono(String.class);
//
//			mono.block();
//		} catch (WebClientResponseException ex) {
//			String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
//			if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
//				ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
//				if (objNode.get("message") != null) {
//					String strMessage = objNode.get("message").asText();
//					throw new Exception(strMessage, ex);
//				}
//			}
//
//			throw ex;
//		}
    }

    protected <T> T executeGet(String strModelName, String strPath, Class<T> cls, String strKey, boolean bTryMode) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();
        try {
            Mono<T> mono = getWebClient().get().uri(String.format("%1$s/%2$s/{1}", psModelServiceSession.getServiceUrl(), strPath), strKey).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").retrieve().bodyToMono(cls);
            return mono.block();
        } catch (WebClientResponseException ex) {

            if (bTryMode) {
                if (ex.getRawStatusCode() == HttpStatus.NOT_FOUND.value()) {
                    return null;
                }
            }

            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }

            throw ex;
        }
    }

    protected boolean executeRemove(String strModelName, String strPath, String strKey, boolean bTryMode) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();
        try {
            Mono<String> mono = getWebClient().delete().uri(String.format("%1$s/%2$s/{1}", psModelServiceSession.getServiceUrl(), strPath), strKey).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").retrieve().bodyToMono(String.class);
            mono.block();
            return true;
        } catch (WebClientResponseException ex) {

            if (bTryMode) {
                if (ex.getRawStatusCode() == HttpStatus.NOT_FOUND.value()) {
                    return false;
                }
            }

            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }
            throw ex;
        }

    }

    protected ObjectNode executeExport(String strModelName, String strPath, String strKey, boolean bTryMode) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();
        try {
            Mono<ObjectNode> mono = getWebClient().post().uri(String.format("%1$s/%2$s/{1}/exportModel", psModelServiceSession.getServiceUrl(), strPath), strKey)
                    .header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession))
                    .header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId())
                    .header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0")
                    .retrieve()
                    .bodyToMono(String.class)
                    .flatMap(str -> {
                        try {
                            return Mono.just(MAPPER.readValue(str, ObjectNode.class));
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    });
            return mono.block();
        } catch (WebClientResponseException ex) {

            if (bTryMode) {
                if (ex.getRawStatusCode() == HttpStatus.NOT_FOUND.value()) {
                    return null;
                }
            }
            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }
            throw ex;
        }
    }

    protected Boolean executeImport(String strModelName, String strPath, String strKey, Object object, boolean bTryMode) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();
        try {
            Mono<Boolean> mono = getWebClient().post().uri(String.format("%1$s/%2$s/{1}/importModel", psModelServiceSession.getServiceUrl(), strPath), strKey).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").bodyValue(object).retrieve().bodyToMono(Boolean.class);
            return mono.block();
        } catch (WebClientResponseException ex) {

            if (bTryMode) {
                if (ex.getRawStatusCode() == HttpStatus.NOT_FOUND.value()) {
                    return false;
                }
            }
            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }
            throw ex;
        }
    }

    protected Boolean executeScopeImport(String strModelName, String strPath, Object importModel, boolean bTryMode) throws Throwable {
        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();
        try {
            Mono<Boolean> mono = getWebClient().post().uri(String.format("%1$s/%2$s/importModel", psModelServiceSession.getServiceUrl(), strPath)).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", psModelServiceSession.isImportMode() ? "1" : "0").bodyValue(importModel).retrieve().bodyToMono(Boolean.class);
            return mono.block();
        } catch (WebClientResponseException ex) {

            if (bTryMode) {
                if (ex.getRawStatusCode() == HttpStatus.NOT_FOUND.value()) {
                    return false;
                }
            }
            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }
            throw ex;
        }
    }

    protected <T> Page<T> executeFetchDefault(String strModelName, String strPath, Class<T> cls, ISearchContext iSearchContext) throws Throwable {

        PSModelServiceSession psModelServiceSession = PSModelServiceSession.getCurrent();
        try {
            Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
            if (iSearchContext.any() != null) {
                queryMap.putAll(iSearchContext.any());
            }

            if (iSearchContext.getPageable() != null) {
                queryMap.put("size", iSearchContext.getPageable().getPageSize());
                queryMap.put("page", iSearchContext.getPageable().getPageNumber());
            }

            if (iSearchContext.getPageSort() != null && iSearchContext.getPageSort() != Sort.unsorted()) {
                java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
                if (orders != null) {
                    while (orders.hasNext()) {
                        Sort.Order order = orders.next();


                        if (order.isAscending()) {
                            queryMap.put("sort", String.format("%1$s,asc", order.getProperty().toUpperCase()));
                        } else {
                            queryMap.put("sort", String.format("%1$s,desc", order.getProperty().toUpperCase()));
                        }
                        break;
                    }
                }
            }

            Mono<ResponseEntity<List<T>>> mono = getWebClient().get().uri(String.format("%1$s/%2$s/fetchdefault?%3$s", psModelServiceSession.getServiceUrl(), strPath, getUrlParamsByMap(queryMap))).header("Authorization", "Bearer " + getAuthorizationBearer(psModelServiceSession)).header("psdevslnsys", psModelServiceSession.getPSDevSlnSysId()).header("srfimportmode", "1").retrieve().toEntityList(cls);

            ResponseEntity<List<T>> responseEntity = mono.block();

            List<String> list = responseEntity.getHeaders().get("x-total");
            if (list != null && list.size() > 0) {
                return new PageImpl<>(responseEntity.getBody(), iSearchContext.getPageable(), Integer.valueOf(list.get(0)));
            } else {
                return new PageImpl<>(responseEntity.getBody());
            }
        } catch (WebClientResponseException ex) {
            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }

            throw ex;
        }
    }

    protected <T> List<T> executeFetchDefaultAll(String strModelName, String strPath, Class<T> cls, PSModelSearchContextDTO psModelSearchContextDTO) throws Throwable {
        psModelSearchContextDTO.setSize(1000);
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < 100; i++) {
            psModelSearchContextDTO.setPage(i);
            Page<T> page = executeFetchDefault(strModelName, strPath, cls, psModelSearchContextDTO);
            list.addAll(page.getContent());
            if (page.getContent().size() < psModelSearchContextDTO.getSize()) {
                break;
            }
        }

        return list;

    }

    /**
     * 开始系统开发后台任务
     *
     * @param strTaskName
     * @return
     * @throws Throwable
     */
    public String beginPSSysDevBKTask(String strTaskName) throws Throwable {

        PSModelDTO psModelDTO = new PSModelDTO();
        psModelDTO.set("pssysdevbktaskname", strTaskName);
        psModelDTO.set("tasktype", "IBIZCENTRAL");
        psModelDTO.set("taskstate", 10);

        this.executeCreate("PSSYSDEVBKTASK", "pssysdevbktasks", PSModelDTO.class, psModelDTO);

        String strPSSysDevBKTaskId = (String) psModelDTO.get("pssysdevbktaskid");
        this.pushPSSysDevBKTaskId(strPSSysDevBKTaskId);
        return strPSSysDevBKTaskId;
    }

    /**
     * 更新系统开发后台任务
     *
     * @param strTaskInfo
     * @throws Throwable
     */
    public void updateCurrentPSSysDevBKTask(int nLogLevel, String strTaskInfo) {
        String strFullTaskInfo = null;
        switch (nLogLevel) {
            case LogLevels.DEBUG:
                strFullTaskInfo = String.format("[DEBUG] %1$s", strTaskInfo);
                break;
            case LogLevels.ERROR:
                strFullTaskInfo = String.format("[ERROR] %1$s", strTaskInfo);
                break;
            case LogLevels.FATAL:
                strFullTaskInfo = String.format("[FATAL] %1$s", strTaskInfo);
                break;
            case LogLevels.INFO:
                strFullTaskInfo = String.format("[INFO] %1$s", strTaskInfo);
                break;
            case LogLevels.TRACE:
                strFullTaskInfo = String.format("[TRACE] %1$s", strTaskInfo);
                break;
            case LogLevels.WARN:
                strFullTaskInfo = String.format("[WARN] %1$s", strTaskInfo);
                break;
            default:
                strFullTaskInfo = strTaskInfo;
                break;
        }

        this.updateCurrentPSSysDevBKTask(strFullTaskInfo);
    }

    /**
     * 更新系统开发后台任务
     *
     * @param strTaskInfo
     * @throws Throwable
     */
    public void updateCurrentPSSysDevBKTask(String strTaskInfo) {

        try {
            String strPSSysDevBKTaskId = this.peekPSSysDevBKTaskId();
            if (!StringUtils.hasLength(strPSSysDevBKTaskId)) {
                log.warn(String.format("上下文未定义系统后台开发任务标识"));
                // throw new Exception(String.format("上下文未定义系统后台开发任务标识"));
                return;
            }

            this.updatePSSysDevBKTask(strPSSysDevBKTaskId, strTaskInfo);
        } catch (Throwable ex) {
            log.error(ex);
        }
    }

    /**
     * 更新系统开发后台任务
     *
     * @param strTaskId
     * @param strTaskInfo
     * @throws Throwable
     */
    public void updatePSSysDevBKTask(String strTaskId, String strTaskInfo) throws Throwable {

        PSModelDTO psModelDTO = new PSModelDTO();
        psModelDTO.set("pssysdevbktaskid", strTaskId);
        psModelDTO.set("tasktype", "IBIZCENTRAL");
        psModelDTO.set("taskstate", 20);
        psModelDTO.set("resultinfo", strTaskInfo);
        psModelDTO.setSrfKey(strTaskId);

        this.executeUpdate("PSSYSDEVBKTASK", "pssysdevbktasks", PSModelDTO.class, psModelDTO);

    }

    /**
     * 标记系统开发后台任务失败
     *
     * @param strTaskInfo
     * @throws Throwable
     */
    public void errorCurrentPSSysDevBKTask(String strTaskInfo) {

        try {
            String strPSSysDevBKTaskId = this.pollPSSysDevBKTaskId();
            if (!StringUtils.hasLength(strPSSysDevBKTaskId)) {
                throw new Exception(String.format("上下文未定义系统后台开发任务标识"));
            }

            this.errorPSSysDevBKTask(strPSSysDevBKTaskId, strTaskInfo);
        } catch (Throwable ex) {
            log.error(ex);
        }

    }

    /**
     * 标记系统开发后台任务失败
     *
     * @param strTaskId
     * @param strTaskInfo
     * @throws Throwable
     */
    public void errorPSSysDevBKTask(String strTaskId, String strTaskInfo) throws Throwable {
        PSModelDTO psModelDTO = new PSModelDTO();
        psModelDTO.set("pssysdevbktaskid", strTaskId);
        psModelDTO.set("tasktype", "IBIZCENTRAL");
        psModelDTO.set("taskstate", 40);
        psModelDTO.set("resultinfo", strTaskInfo);
        psModelDTO.setSrfKey(strTaskId);
        this.executeUpdate("PSSYSDEVBKTASK", "pssysdevbktasks", PSModelDTO.class, psModelDTO);
    }

    /**
     * 完成当前系统开发后台任务
     */
    public void finishCurrentPSSysDevBKTask() {
        finishCurrentPSSysDevBKTask(null);
    }

    /**
     * 完成当前系统开发后台任务
     *
     * @param strTaskInfo
     */
    public void finishCurrentPSSysDevBKTask(String strTaskInfo) {
        try {
            String strPSSysDevBKTaskId = this.pollPSSysDevBKTaskId();
            if (!StringUtils.hasLength(strPSSysDevBKTaskId)) {
                throw new Exception(String.format("上下文未定义系统后台开发任务标识"));
            }

            this.finishPSSysDevBKTask(strPSSysDevBKTaskId, strTaskInfo);
        } catch (Throwable ex) {
            log.error(ex);
        }
    }

    /**
     * 完成系统开发后台任务
     *
     * @param strTaskId
     * @param strTaskInfo
     * @throws Throwable
     */
    public void finishPSSysDevBKTask(String strTaskId, String strTaskInfo) throws Throwable {
        PSModelDTO psModelDTO = new PSModelDTO();
        psModelDTO.set("pssysdevbktaskid", strTaskId);
        psModelDTO.set("tasktype", "IBIZCENTRAL");
        psModelDTO.set("taskstate", 30);
        psModelDTO.set("resultinfo", strTaskInfo);
        psModelDTO.setSrfKey(strTaskId);
        this.executeUpdate("PSSYSDEVBKTASK", "pssysdevbktasks", PSModelDTO.class, psModelDTO);
    }

    private String peekPSSysDevBKTaskId() {
        return psSysDevBKTaskIdThreadLocal.get().peek();
    }

    private void pushPSSysDevBKTaskId(String strPSSysDevBKTaskId) {
        psSysDevBKTaskIdThreadLocal.get().push(strPSSysDevBKTaskId);
    }

    private String pollPSSysDevBKTaskId() {
        Deque<String> deque = psSysDevBKTaskIdThreadLocal.get();
        String strPSSysDevBKTaskId = deque.poll();
        if (deque.isEmpty()) {
            psSysDevBKTaskIdThreadLocal.remove();
        }
        return strPSSysDevBKTaskId;
    }

    /**
     * 将map转换成url
     *
     * @param map
     * @return
     */
    public static String getUrlParamsByMap(Map<String, Object> map) throws Exception {
        if (map == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        boolean bFirst = true;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            } else {
                if (bFirst) {
                    bFirst = false;
                } else {
                    sb.append("&");
                }
                if (entry.getValue() instanceof String) {
                    sb.append(entry.getKey() + "=" + entry.getValue());
                    // sb.append(entry.getKey() + "=" +
                    // URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                } else {
                    sb.append(entry.getKey() + "=" + entry.getValue());
                }
            }
        }
        return sb.toString();
    }

    protected String getAuthorizationBearer(PSModelServiceSession psModelServiceSession) throws Throwable {
        String strBearer = psModelServiceSession.getBearer();
        if (StringUtils.hasLength(strBearer)) {
            return strBearer;
        }

        try {
            Map<String, String> bodyMap = new LinkedHashMap<String, String>();
            bodyMap.put("loginname", psModelServiceSession.getUserName());
            bodyMap.put("password", psModelServiceSession.getPassword());

            Mono<Map> mono = getWebClient().post().uri(psModelServiceSession.getAccessTokenUrl()).bodyValue(bodyMap).retrieve().bodyToMono(Map.class);

            Map t = mono.block();

            String strToken = (String) t.get("token");
            psModelServiceSession.setBearer(strToken);

            return strToken;

        } catch (WebClientResponseException ex) {
            String strError = new String(ex.getResponseBodyAsByteArray(), "UTF-8");
            if (StringUtils.hasLength(strError) && (strError.indexOf("{") == 0)) {
                ObjectNode objNode = (ObjectNode) MAPPER.readTree(strError);
                if (objNode.get("message") != null) {
                    String strMessage = objNode.get("message").asText();
                    throw new Exception(strMessage, ex);
                }
            }

            throw ex;
        }

    }


}
