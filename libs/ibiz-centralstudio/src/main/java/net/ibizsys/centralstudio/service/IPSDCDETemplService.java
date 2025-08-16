package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCDETemplService{

    PSDCDETemplDTO create(PSDCDETemplDTO arg) throws Throwable;

    PSDCDETemplDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCDETemplDTO update(PSDCDETemplDTO arg) throws Throwable;

    Integer checkKey(PSDCDETemplDTO arg) throws Throwable;

    PSDCDETemplDTO getDraft(PSDCDETemplDTO arg) throws Throwable;

    Page<PSDCDETemplDTO> fetchDefault(PSDCDETemplFilter filter) throws Throwable;
    
}