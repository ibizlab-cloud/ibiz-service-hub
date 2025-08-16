package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCMSPlatformNodeServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCMSPlatformNodeService{

    @Override
    public PSDCMSPlatformNodeDTO create(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes", arg, PSDCMSPlatformNodeDTO.class);
        }
        return this.executePost("/psdcmsplatformnodes", arg, PSDCMSPlatformNodeDTO.class);
    }

    @Override
    public PSDCMSPlatformNodeDTO get(String arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}", arg, PSDCMSPlatformNodeDTO.class);
        }
        return this.executeGet("/psdcmsplatformnodes/{key}", arg, PSDCMSPlatformNodeDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            this.executeDelete("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdcmsplatformnodes/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCMSPlatformNodeDTO update(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePut("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}", arg, PSDCMSPlatformNodeDTO.class);
        }
        return this.executePut("/psdcmsplatformnodes/{key}", arg, PSDCMSPlatformNodeDTO.class);
    }

    @Override
    public void assignSlnDep(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}/assignslndep", arg, String.class);
            return;
        }
        this.executePost("/psdcmsplatformnodes/{key}/assignslndep", arg, String.class);
        return;
    }

    @Override
    public Integer checkKey(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdcmsplatformnodes/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCMSPlatformNodeDTO createWithState(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/createwithstate", arg, PSDCMSPlatformNodeDTO.class);
        }
        return this.executePost("/psdcmsplatformnodes/createwithstate", arg, PSDCMSPlatformNodeDTO.class);
    }

    @Override
    public PSDCMSPlatformNodeDTO getDraft(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/getdraft", arg, PSDCMSPlatformNodeDTO.class);
        }
        return this.executeGet("/psdcmsplatformnodes/getdraft", arg, PSDCMSPlatformNodeDTO.class);
    }

    @Override
    public PSDCMSPlatformNodeDTO getWithState(String arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeGet("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}/getwithstate", arg, PSDCMSPlatformNodeDTO.class);
        }
        return this.executeGet("/psdcmsplatformnodes/{key}/getwithstate", arg, PSDCMSPlatformNodeDTO.class);
    }

    @Override
    public void restart(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}/restart", arg, String.class);
            return;
        }
        this.executePost("/psdcmsplatformnodes/{key}/restart", arg, String.class);
        return;
    }

    @Override
    public void stop(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            this.executePost("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}/stop", arg, String.class);
            return;
        }
        this.executePost("/psdcmsplatformnodes/{key}/stop", arg, String.class);
        return;
    }

    @Override
    public PSDCMSPlatformNodeDTO updateWithState(PSDCMSPlatformNodeDTO arg) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executePut("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/{key}/updatewithstate", arg, PSDCMSPlatformNodeDTO.class);
        }
        return this.executePut("/psdcmsplatformnodes/{key}/updatewithstate", arg, PSDCMSPlatformNodeDTO.class);
    }

    @Override
    public Page<PSDCMSPlatformNodeDTO> fetchAPINode(PSDCMSPlatformNodeFilter filter) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/fetchapinode", filter, PSDCMSPlatformNodeDTO.class);
        }

        return this.executeFetch("/psdcmsplatformnodes/fetchapinode", filter, PSDCMSPlatformNodeDTO.class);
    }
    
    @Override
    public Page<PSDCMSPlatformNodeDTO> fetchAppNode(PSDCMSPlatformNodeFilter filter) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/fetchappnode", filter, PSDCMSPlatformNodeDTO.class);
        }

        return this.executeFetch("/psdcmsplatformnodes/fetchappnode", filter, PSDCMSPlatformNodeDTO.class);
    }
    
    @Override
    public Page<PSDCMSPlatformNodeDTO> fetchCurMSPWithState(PSDCMSPlatformNodeFilter filter) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/fetchcurmspwithstate", filter, PSDCMSPlatformNodeDTO.class);
        }

        return this.executeFetch("/psdcmsplatformnodes/fetchcurmspwithstate", filter, PSDCMSPlatformNodeDTO.class);
    }
    
    @Override
    public Page<PSDCMSPlatformNodeDTO> fetchDefault(PSDCMSPlatformNodeFilter filter) throws Throwable{

        if(containsContext("psdcmsplatform")){
            return this.executeFetch("/psdcmsplatforms/{psdcmsplatform}/psdcmsplatformnodes/fetchdefault", filter, PSDCMSPlatformNodeDTO.class);
        }

        return this.executeFetch("/psdcmsplatformnodes/fetchdefault", filter, PSDCMSPlatformNodeDTO.class);
    }
    
}