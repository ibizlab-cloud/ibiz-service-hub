package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnMSDepAPIServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnMSDepAPIService{

    @Override
    public PSDevSlnMSDepAPIDTO create(PSDevSlnMSDepAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapis", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis", arg, PSDevSlnMSDepAPIDTO.class);
        }
        return this.executePost("/psdevslnmsdepapis", arg, PSDevSlnMSDepAPIDTO.class);
    }

    @Override
    public PSDevSlnMSDepAPIDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }
        return this.executeGet("/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executeDelete("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnmsdepapis/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executeDelete("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnmsdepapis/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnMSDepAPIDTO update(PSDevSlnMSDepAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executePut("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executePut("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
        }
        return this.executePut("/psdevslnmsdepapis/{key}", arg, PSDevSlnMSDepAPIDTO.class);
    }

    @Override
    public void batchAdd(PSDevSlnMSDepAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/batchadd", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/batchadd", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapis/{key}/batchadd", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/batchadd", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdepapis/{key}/batchadd", arg, String.class);
        return;
    }

    @Override
    public Integer checkKey(PSDevSlnMSDepAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/checkkey", arg, Integer.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapis/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnmsdepapis/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnMSDepAPIDTO getDraft(PSDevSlnMSDepAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/getdraft", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/getdraft", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdepapis/getdraft", arg, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/getdraft", arg, PSDevSlnMSDepAPIDTO.class);
        }
        return this.executeGet("/psdevslnmsdepapis/getdraft", arg, PSDevSlnMSDepAPIDTO.class);
    }

    @Override
    public void restart(PSDevSlnMSDepAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/restart", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/restart", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapis/{key}/restart", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/restart", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdepapis/{key}/restart", arg, String.class);
        return;
    }

    @Override
    public void stop(PSDevSlnMSDepAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/stop", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/stop", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapis/{key}/stop", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/{key}/stop", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdepapis/{key}/stop", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevSlnMSDepAPIDTO> fetchCurSlnUnused(PSDevSlnMSDepAPIFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/fetchcurslnunused", filter, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/fetchcurslnunused", filter, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdepapis/fetchcurslnunused", filter, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/fetchcurslnunused", filter, PSDevSlnMSDepAPIDTO.class);
        }

        return this.executeFetch("/psdevslnmsdepapis/fetchcurslnunused", filter, PSDevSlnMSDepAPIDTO.class);
    }
    
    @Override
    public Page<PSDevSlnMSDepAPIDTO> fetchDefault(PSDevSlnMSDepAPIFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/fetchdefault", filter, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/fetchdefault", filter, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdepapis/fetchdefault", filter, PSDevSlnMSDepAPIDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapis/fetchdefault", filter, PSDevSlnMSDepAPIDTO.class);
        }

        return this.executeFetch("/psdevslnmsdepapis/fetchdefault", filter, PSDevSlnMSDepAPIDTO.class);
    }
    
}