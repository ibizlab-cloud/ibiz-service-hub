package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCBKTaskServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCBKTaskService{

    @Override
    public PSDCBKTaskDTO create(PSDCBKTaskDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdcbktasks", arg, PSDCBKTaskDTO.class);
        }
        return this.executePost("/psdcbktasks", arg, PSDCBKTaskDTO.class);
    }

    @Override
    public PSDCBKTaskDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdcbktasks/{key}", arg, PSDCBKTaskDTO.class);
        }
        return this.executeGet("/psdcbktasks/{key}", arg, PSDCBKTaskDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdcbktasks/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdcbktasks/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCBKTaskDTO update(PSDCBKTaskDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdcbktasks/{key}", arg, PSDCBKTaskDTO.class);
        }
        return this.executePut("/psdcbktasks/{key}", arg, PSDCBKTaskDTO.class);
    }

    @Override
    public Integer checkKey(PSDCBKTaskDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdcbktasks/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdcbktasks/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCBKTaskDTO getDraft(PSDCBKTaskDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdcbktasks/getdraft", arg, PSDCBKTaskDTO.class);
        }
        return this.executeGet("/psdcbktasks/getdraft", arg, PSDCBKTaskDTO.class);
    }

    @Override
    public Page<PSDCBKTaskDTO> fetchDefault(PSDCBKTaskFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdcbktasks/fetchdefault", filter, PSDCBKTaskDTO.class);
        }

        return this.executeFetch("/psdcbktasks/fetchdefault", filter, PSDCBKTaskDTO.class);
    }
    
}