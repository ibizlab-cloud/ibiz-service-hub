package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenUserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.OpenUserServiceImpl;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import javax.annotation.Priority;

@Priority(100)
@Service
public class OpenUserServiceImplEx extends OpenUserServiceImpl { 



}

