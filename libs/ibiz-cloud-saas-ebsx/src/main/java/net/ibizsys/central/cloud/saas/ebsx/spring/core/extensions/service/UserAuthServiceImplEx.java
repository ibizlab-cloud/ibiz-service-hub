package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserAuthDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.UserAuthServiceImpl;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import javax.annotation.Priority;

@Priority(100)
@Service
public class UserAuthServiceImplEx extends UserAuthServiceImpl { 



}

