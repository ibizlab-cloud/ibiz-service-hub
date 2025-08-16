package net.ibizsys.central.plugin.mybatisplus.util;

import java.util.ArrayList;
import java.util.List;


public class GroupQuery {

    String datasql ;
    List<String> dataConditions = new ArrayList<>();
    List<String> datafield = new ArrayList<>();
    List<String> joinFields = new ArrayList<>();
    List<String> dataJoins = new ArrayList<>();
    List<String> group = new ArrayList<>();

    List<String> resultfield = new ArrayList<>();
    List<String> resultConditions = new ArrayList<>();

    public String getDatasql() {
        return datasql;
    }

    public void setDatasql(String datasql) {
        this.datasql = datasql;
    }

    public List<String> getDataConditions() {
        return dataConditions;
    }

    public void setDataConditions(List<String> dataConditions) {
        this.dataConditions = dataConditions;
    }
    
    public List<String> getDataJoins() {
        return dataJoins;
    }

    public void setDataJoins(List<String> dataJoins) {
        this.dataJoins = dataJoins;
    }
    
    public List<String> getJoinFields() {
        return joinFields;
    }

    public void setJoinFields(List<String> joinFields) {
        this.joinFields = joinFields;
    }

    public List<String> getDatafield() {
        return datafield;
    }

    public void setDatafield(List<String> datafield) {
        this.datafield = datafield;
    }

    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public List<String> getResultfield() {
        return resultfield;
    }

    public void setResultfield(List<String> resultfield) {
        this.resultfield = resultfield;
    }

    public List<String> getResultConditions() {
        return resultConditions;
    }

    public void setResultConditions(List<String> resultConditions) {
        this.resultConditions = resultConditions;
    }
}
