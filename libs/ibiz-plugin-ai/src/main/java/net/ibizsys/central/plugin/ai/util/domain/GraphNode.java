package net.ibizsys.central.plugin.ai.util.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * 图节点
 * @author lionlau
 *
 */
public class GraphNode<T> {
    private final String id; // 节点唯一标识符
    private T data; // 节点存储的数据
    private final Map<String, Object> attributes; // 节点属性映射
    private final Set<String> neighbors;
    
    public GraphNode(String id) {
        this.id = Objects.requireNonNull(id, "Node ID cannot be null");
        this.attributes = new LinkedHashMap<>();
        this.neighbors = new HashSet<String>();
    }
    
    public GraphNode(String id, T data) {
        this(id);
        this.data = data;
    }
    
    // Getters and Setters
    public String getId() { return id; }
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
    
    // 属性管理方法
    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }
    
    public Object getAttribute(String key) {
        return attributes.get(key);
    }
    
    public boolean hasAttribute(String key) {
        return attributes.containsKey(key);
    }
    
    public void putAttributes(Map<String, Object> attributes) {
    	this.attributes.putAll(attributes);
    }
    
    public Map<String, Object> getAttributes() {
        return Collections.unmodifiableMap(attributes);
    }
    
    public void addNeighbor(String strNeighborId) {
    	this.neighbors.add(strNeighborId);
    }
    
    public boolean removeNeighbor(String strNeighborId) {
    	return this.neighbors.remove(strNeighborId);
    }
    
    
    public Set<String> getNeighbors() {
    	return Collections.unmodifiableSet(this.neighbors);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNode<?> graphNode = (GraphNode<?>) o;
        return id.equals(graphNode.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "GraphNode{id='" + id + "', data=" + data + ", attributes=" + attributes + "}";
    }
}