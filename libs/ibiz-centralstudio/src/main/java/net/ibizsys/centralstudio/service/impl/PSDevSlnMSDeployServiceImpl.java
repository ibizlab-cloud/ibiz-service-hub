package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnMSDeployServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnMSDeployService{

    @Override
    public PSDevSlnMSDeployDTO create(PSDevSlnMSDeployDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys", arg, PSDevSlnMSDeployDTO.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys", arg, PSDevSlnMSDeployDTO.class);
        }
        return this.executePost("/psdevslnmsdeploys", arg, PSDevSlnMSDeployDTO.class);
    }

    @Override
    public PSDevSlnMSDeployDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdeploys/{key}", arg, PSDevSlnMSDeployDTO.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{key}", arg, PSDevSlnMSDeployDTO.class);
        }
        return this.executeGet("/psdevslnmsdeploys/{key}", arg, PSDevSlnMSDeployDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnmsdeploys/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")){
            this.executeDelete("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnmsdeploys/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnMSDeployDTO update(PSDevSlnMSDeployDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnmsdeploys/{key}", arg, PSDevSlnMSDeployDTO.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executePut("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{key}", arg, PSDevSlnMSDeployDTO.class);
        }
        return this.executePut("/psdevslnmsdeploys/{key}", arg, PSDevSlnMSDeployDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnMSDeployDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/checkkey", arg, Integer.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnmsdeploys/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnMSDeployDTO getDraft(PSDevSlnMSDeployDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnmsdeploys/getdraft", arg, PSDevSlnMSDeployDTO.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/getdraft", arg, PSDevSlnMSDeployDTO.class);
        }
        return this.executeGet("/psdevslnmsdeploys/getdraft", arg, PSDevSlnMSDeployDTO.class);
    }

    @Override
    public void pubConfig(PSDevSlnMSDeployDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnmsdeploys/{key}/pubconfig", arg, String.class);
            return;
        }

        if(containsContext("psdcmsplatform")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/{key}/pubconfig", arg, String.class);
            return;
        }
        this.executePost("/psdevslnmsdeploys/{key}/pubconfig", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevSlnMSDeployDTO> fetchCurDC(PSDevSlnMSDeployFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdeploys/fetchcurdc", filter, PSDevSlnMSDeployDTO.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/fetchcurdc", filter, PSDevSlnMSDeployDTO.class);
        }

        return this.executeFetch("/psdevslnmsdeploys/fetchcurdc", filter, PSDevSlnMSDeployDTO.class);
    }
    
    @Override
    public Page<PSDevSlnMSDeployDTO> fetchCurSln(PSDevSlnMSDeployFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdeploys/fetchcursln", filter, PSDevSlnMSDeployDTO.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/fetchcursln", filter, PSDevSlnMSDeployDTO.class);
        }

        return this.executeFetch("/psdevslnmsdeploys/fetchcursln", filter, PSDevSlnMSDeployDTO.class);
    }
    
    @Override
    public Page<PSDevSlnMSDeployDTO> fetchDefault(PSDevSlnMSDeployFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnmsdeploys/fetchdefault", filter, PSDevSlnMSDeployDTO.class);
        }

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdevslnmsdeploys/fetchdefault", filter, PSDevSlnMSDeployDTO.class);
        }

        return this.executeFetch("/psdevslnmsdeploys/fetchdefault", filter, PSDevSlnMSDeployDTO.class);
    }
    
}