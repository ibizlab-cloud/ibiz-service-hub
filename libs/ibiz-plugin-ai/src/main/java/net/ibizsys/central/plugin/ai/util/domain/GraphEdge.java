package net.ibizsys.central.plugin.ai.util.domain;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 边类，表示图中两个节点之间的连接
 * 支持有向/无向边和边属性
 */
public class GraphEdge<T> {
    private final GraphNode<T> source;
    private final GraphNode<T> target;
    private final Map<String, Object> attributes;
    private final boolean directed;
    private T data;
    
    public GraphEdge(GraphNode<T> source, GraphNode<T> target, T data) {
        this(source, target, data, false, new LinkedHashMap<>());
    }
    
    public GraphEdge(GraphNode<T> source, GraphNode<T> target, T data, boolean directed) {
        this(source, target, data, directed, new LinkedHashMap<>());
    }
    
    public GraphEdge(GraphNode<T> source, GraphNode<T> target, T data, boolean directed, 
                Map<String, Object> attributes) {
        this.source = Objects.requireNonNull(source, "Source node cannot be null");
        this.target = Objects.requireNonNull(target, "Target node cannot be null");
        this.directed = directed;
        this.data = data;
        this.attributes = new LinkedHashMap<>(attributes);
    }
    
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
    
    // Getters
    public GraphNode<T> getSource() { return source; }
    public GraphNode<T> getTarget() { return target; }
    public boolean isDirected() { return directed; }
    
    // 属性管理
    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }
    
    public Object getAttribute(String key) {
        return attributes.get(key);
    }
    
    public void putAttributes(Map<String, Object> attributes) {
    	this.attributes.putAll(attributes);
    }
    
    public Map<String, Object> getAttributes() {
        return Collections.unmodifiableMap(attributes);
    }
    
    // 获取边的另一端的节点
    public GraphNode<T> getOtherNode(GraphNode<T> node) {
        if (node.equals(source)) return target;
        if (node.equals(target)) return source;
        throw new IllegalArgumentException("Node is not part of this edge");
    }
    
    public boolean containsNode(GraphNode<T> node) {
        return source.equals(node) || target.equals(node);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphEdge<?> edge = (GraphEdge<?>) o;
        if (directed != edge.directed) return false;
        if (directed) {
            return source.equals(edge.source) && target.equals(edge.target);
        } else {
            return (source.equals(edge.source) && target.equals(edge.target)) ||
                   (source.equals(edge.target) && target.equals(edge.source));
        }
    }
    
    @Override
    public int hashCode() {
        if (directed) {
            return Objects.hash(source, target, directed);
        } else {
            // 对于无向边，确保source和target顺序不影响hashCode
            int hash1 = Objects.hash(source, target);
            int hash2 = Objects.hash(target, source);
            return Math.min(hash1, hash2);
        }
    }
    
    @Override
    public String toString() {
        String connector = directed ? " -> " : " -- ";
        return source.getId() + connector + target.getId() + " " + attributes;
    }
}