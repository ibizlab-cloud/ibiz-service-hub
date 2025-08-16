package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnMSDepAppServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnMSDepAppService{

    @Override
    public PSDevSlnMSDepAppDTO create(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapps", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps", arg, PSDevSlnMSDepAppDTO.class);
        }
        return this.executePost("/psdevslnmsdepapps", arg, PSDevSlnMSDepAppDTO.class);
    }

    @Override
    public PSDevSlnMSDepAppDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }
        return this.executeGet("/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executeDelete("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnmsdepapps/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executeDelete("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnmsdepapps/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnMSDepAppDTO update(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executePut("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executePut("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
        }
        return this.executePut("/psdevslnmsdepapps/{key}", arg, PSDevSlnMSDepAppDTO.class);
    }

    @Override
    public void batchAdd(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/batchadd", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/batchadd", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapps/{key}/batchadd", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/batchadd", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdepapps/{key}/batchadd", arg, String.class);
        return;
    }

    @Override
    public void calcHttpAddress(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/calchttpaddress", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/calchttpaddress", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapps/{key}/calchttpaddress", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/calchttpaddress", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdepapps/{key}/calchttpaddress", arg, String.class);
        return;
    }

    @Override
    public Integer checkKey(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/checkkey", arg, Integer.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapps/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnmsdepapps/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnMSDepAppDTO getDraft(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/getdraft", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/getdraft", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdepapps/getdraft", arg, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeGet("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/getdraft", arg, PSDevSlnMSDepAppDTO.class);
        }
        return this.executeGet("/psdevslnmsdepapps/getdraft", arg, PSDevSlnMSDepAppDTO.class);
    }

    @Override
    public void restart(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/restart", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/restart", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapps/{key}/restart", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/restart", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdepapps/{key}/restart", arg, String.class);
        return;
    }

    @Override
    public void stop(PSDevSlnMSDepAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/stop", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/stop", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdepapps/{key}/stop", arg, String.class);
            return;
        }

        if(containsContext("psdevslnmsdeploy")){
            this.executePost("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/{key}/stop", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdepapps/{key}/stop", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevSlnMSDepAppDTO> fetchCurSlnUnused(PSDevSlnMSDepAppFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/fetchcurslnunused", filter, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/fetchcurslnunused", filter, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdepapps/fetchcurslnunused", filter, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/fetchcurslnunused", filter, PSDevSlnMSDepAppDTO.class);
        }

        return this.executeFetch("/psdevslnmsdepapps/fetchcurslnunused", filter, PSDevSlnMSDepAppDTO.class);
    }
    
    @Override
    public Page<PSDevSlnMSDepAppDTO> fetchDefault(PSDevSlnMSDepAppFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/fetchdefault", filter, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdcmsplatform")&&containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/fetchdefault", filter, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdepapps/fetchdefault", filter, PSDevSlnMSDepAppDTO.class);
        }

        if(containsContext("psdevslnmsdeploy")){
            return this.executeFetch("/psdevslnmsdeploys/{psdevslnmsdeploy}/psdevslnmsdepapps/fetchdefault", filter, PSDevSlnMSDepAppDTO.class);
        }

        return this.executeFetch("/psdevslnmsdepapps/fetchdefault", filter, PSDevSlnMSDepAppDTO.class);
    }
    
}