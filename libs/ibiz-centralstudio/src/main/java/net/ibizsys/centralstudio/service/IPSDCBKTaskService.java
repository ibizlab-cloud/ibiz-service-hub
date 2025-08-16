package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCBKTaskService{

    PSDCBKTaskDTO create(PSDCBKTaskDTO arg) throws Throwable;

    PSDCBKTaskDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCBKTaskDTO update(PSDCBKTaskDTO arg) throws Throwable;

    Integer checkKey(PSDCBKTaskDTO arg) throws Throwable;

    PSDCBKTaskDTO getDraft(PSDCBKTaskDTO arg) throws Throwable;

    Page<PSDCBKTaskDTO> fetchDefault(PSDCBKTaskFilter filter) throws Throwable;
    
}