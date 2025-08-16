package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCMSPlatformFuncServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCMSPlatformFuncService{

    @Override
    public PSDCMSPlatformFuncDTO create(PSDCMSPlatformFuncDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformfuncs", arg, PSDCMSPlatformFuncDTO.class);
        }
        return this.executePost("/psdcmsplatformfuncs", arg, PSDCMSPlatformFuncDTO.class);
    }

    @Override
    public PSDCMSPlatformFuncDTO get(String arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformfuncs/{key}", arg, PSDCMSPlatformFuncDTO.class);
        }
        return this.executeGet("/psdcmsplatformfuncs/{key}", arg, PSDCMSPlatformFuncDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            this.executeDelete("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformfuncs/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdcmsplatformfuncs/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCMSPlatformFuncDTO update(PSDCMSPlatformFuncDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePut("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformfuncs/{key}", arg, PSDCMSPlatformFuncDTO.class);
        }
        return this.executePut("/psdcmsplatformfuncs/{key}", arg, PSDCMSPlatformFuncDTO.class);
    }

    @Override
    public Integer checkKey(PSDCMSPlatformFuncDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformfuncs/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdcmsplatformfuncs/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCMSPlatformFuncDTO getDraft(PSDCMSPlatformFuncDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformfuncs/getdraft", arg, PSDCMSPlatformFuncDTO.class);
        }
        return this.executeGet("/psdcmsplatformfuncs/getdraft", arg, PSDCMSPlatformFuncDTO.class);
    }

    @Override
    public Page<PSDCMSPlatformFuncDTO> fetchDefault(PSDCMSPlatformFuncFilter filter) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformfuncs/fetchdefault", filter, PSDCMSPlatformFuncDTO.class);
        }

        return this.executeFetch("/psdcmsplatformfuncs/fetchdefault", filter, PSDCMSPlatformFuncDTO.class);
    }
    
}