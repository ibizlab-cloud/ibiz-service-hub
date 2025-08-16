package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSStudioPluginDataServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSStudioPluginDataService{

    @Override
    public PSStudioPluginDataDTO create(PSStudioPluginDataDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psstudioplugindata", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslntempl")){
            return this.executePost("/psdevslntempls/{psdevslntempl}/psstudioplugindata", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psstudioplugindata", arg, PSStudioPluginDataDTO.class);
        }
        return this.executePost("/psstudioplugindata", arg, PSStudioPluginDataDTO.class);
    }

    @Override
    public PSStudioPluginDataDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslntempl")){
            return this.executeGet("/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }
        return this.executeGet("/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psstudioplugindata/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslntempl")){
            this.executeDelete("/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executeDelete("/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psstudioplugindata/{key}", arg, String.class);
        return;
    }

    @Override
    public PSStudioPluginDataDTO update(PSStudioPluginDataDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslntempl")){
            return this.executePut("/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePut("/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
        }
        return this.executePut("/psstudioplugindata/{key}", arg, PSStudioPluginDataDTO.class);
    }

    @Override
    public Integer checkKey(PSStudioPluginDataDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psstudioplugindata/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslntempl")){
            return this.executePost("/psdevslntempls/{psdevslntempl}/psstudioplugindata/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psstudioplugindata/checkkey", arg, Integer.class);
        }
        return this.executePost("/psstudioplugindata/checkkey", arg, Integer.class);
    }

    @Override
    public void executeAgain(PSStudioPluginDataDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            this.executePost("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}/executeagain", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}/executeagain", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psstudioplugindata/{key}/executeagain", arg, String.class);
            return;
        }

        if(containsContext("psdevslntempl")){
            this.executePost("/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}/executeagain", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executePost("/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}/executeagain", arg, String.class);
            return;
        }
        this.executePost("/psstudioplugindata/{key}/executeagain", arg, String.class);
        return;
    }

    @Override
    public void executePlugin(PSStudioPluginDataDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            this.executePost("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}/executeplugin", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}/executeplugin", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psstudioplugindata/{key}/executeplugin", arg, String.class);
            return;
        }

        if(containsContext("psdevslntempl")){
            this.executePost("/psdevslntempls/{psdevslntempl}/psstudioplugindata/{key}/executeplugin", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executePost("/psdevslnsys/{psdevslnsys}/psstudioplugindata/{key}/executeplugin", arg, String.class);
            return;
        }
        this.executePost("/psstudioplugindata/{key}/executeplugin", arg, String.class);
        return;
    }

    @Override
    public PSStudioPluginDataDTO getDraft(PSStudioPluginDataDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/getdraft", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/getdraft", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psstudioplugindata/getdraft", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslntempl")){
            return this.executeGet("/psdevslntempls/{psdevslntempl}/psstudioplugindata/getdraft", arg, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psstudioplugindata/getdraft", arg, PSStudioPluginDataDTO.class);
        }
        return this.executeGet("/psstudioplugindata/getdraft", arg, PSStudioPluginDataDTO.class);
    }

    @Override
    public Page<PSStudioPluginDataDTO> fetchDefault(PSStudioPluginDataFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslntempl")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslntempls/{psdevslntempl}/psstudioplugindata/fetchdefault", filter, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psstudioplugindata/fetchdefault", filter, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psstudioplugindata/fetchdefault", filter, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslntempl")){
            return this.executeFetch("/psdevslntempls/{psdevslntempl}/psstudioplugindata/fetchdefault", filter, PSStudioPluginDataDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psstudioplugindata/fetchdefault", filter, PSStudioPluginDataDTO.class);
        }

        return this.executeFetch("/psstudioplugindata/fetchdefault", filter, PSStudioPluginDataDTO.class);
    }
    
}