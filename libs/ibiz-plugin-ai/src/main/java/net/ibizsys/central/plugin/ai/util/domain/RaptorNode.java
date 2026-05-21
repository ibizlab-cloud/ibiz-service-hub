package net.ibizsys.central.plugin.ai.util.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.Chunk;

public class RaptorNode {

	//private String id;
    private String text;
    private double[] embedding;
    private double[] reducedEmbedding;
    private List<RaptorNode> children;
    private RaptorNode parent;
    private int level; // 0: 叶子节点, 1+: 摘要节点
    private List<Integer> sourceIndices;
    private Map<Integer, Double> clusterProbabilities;
    private Map<String, Object> metadata;
    
    public RaptorNode(Chunk chunk) {
    	this(chunk.getContent(), (double[]) chunk.get("content_vector"), 0 , null);
    }
    
    public RaptorNode(String text, double[] embedding, int level, List<Integer> sourceIndices) {
        this.text = text;
        this.embedding = embedding;
        this.children = new ArrayList<>();
        this.level = level;
        this.metadata = new HashMap<>();
        this.sourceIndices = sourceIndices != null ? new ArrayList<>(sourceIndices) : new ArrayList<>();
    }
    
    public void addChild(RaptorNode child) {
        children.add(child);
        child.setParent(this);
    }
    
    public void setParent(RaptorNode parent) {
    	this.parent = parent;
    }
    
    public RaptorNode getParent() {
    	return this.parent;
    }
    
    public double[] getEmbedding() {
    	return this.embedding;
    }
    
    public String getText() {
    	return this.text;
    }
    
    public double[] getReducedEmbedding() {
    	return this.reducedEmbedding;
    }
    
    public void setReducedEmbedding(double[] reducedEmbedding) {
    	this.reducedEmbedding = reducedEmbedding;
    }
    
    
    public List<Integer> getSourceIndices() { return sourceIndices; }
    public void setSourceIndices(List<Integer> sourceIndices) { this.sourceIndices = sourceIndices; }
    
    public Map<Integer, Double> getClusterProbabilities() { return clusterProbabilities; }
    public void setClusterProbabilities(Map<Integer, Double> probs) { this.clusterProbabilities = probs; }
    
    public Map<String, Object> getMetadata() { return metadata; }
    
    public int getLevel() {
    	return this.level;
    }
    
    // 计算与其他节点的余弦相似度
    public double cosineSimilarity(RaptorNode other) {
        if (this.embedding.length != other.embedding.length) {
            throw new IllegalArgumentException("Embedding dimensions must match");
        }
        
        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;
        
        for (int i = 0; i < this.embedding.length; i++) {
            dotProduct += this.embedding[i] * other.embedding[i];
            normA += Math.pow(this.embedding[i], 2);
            normB += Math.pow(other.embedding[i], 2);
        }
        
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }
	
	
}
