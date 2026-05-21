package net.ibizsys.central.cloud.core.util.domain;

public enum ChunkType {

    ORIGINAL("ORIGINAL", "原始文本"),

    CLUSTER("CLUSTER", "聚合文本"),

    MANUAL("MANUAL", "手动文本"),

    PAGE("PAGE", "页面内容"),

    INDEX("INDEX", "片段索引"),

    //AI请求资料库时，由于片段会被聚合，为避免因为聚合导致资料重复，将已经被聚合的片段设置为SOURCE，仅用于观察
    SOURCE("SOURCE", "素材文本"),

    KBGUIDANCE("KBGUIDANCE", "知识库介绍"),

    GRAPH("GRAPH", "知识图谱"),

    DAILYMEMORY("DAILYMEMORY", "每日记忆"),

    REGULARMEMORY("REGULARMEMORY", "常规记忆"),

    RESIDENTMEMORY("RESIDENTMEMORY", "常驻记忆");


    private String value;
    private String text;


    ChunkType(String value , String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return this.value;
    }

    public String getText() {
        return this.text;
    }


}