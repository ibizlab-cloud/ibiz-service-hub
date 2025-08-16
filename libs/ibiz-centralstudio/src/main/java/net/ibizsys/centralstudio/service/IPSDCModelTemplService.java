package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCModelTemplService{

    PSDCModelTemplDTO create(PSDCModelTemplDTO arg) throws Throwable;

    PSDCModelTemplDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCModelTemplDTO update(PSDCModelTemplDTO arg) throws Throwable;

    Integer checkKey(PSDCModelTemplDTO arg) throws Throwable;

    PSDCModelTemplDTO getDraft(PSDCModelTemplDTO arg) throws Throwable;

    Page<PSDCModelTemplDTO> fetchCurDCAll(PSDCModelTemplFilter filter) throws Throwable;
    
    Page<PSDCModelTemplDTO> fetchDefault(PSDCModelTemplFilter filter) throws Throwable;
    
}