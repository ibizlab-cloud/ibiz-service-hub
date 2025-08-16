package net.ibizsys.psmodel.core.service;

import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.domain.PSAppView;
import net.ibizsys.psmodel.core.filter.PSAppViewFilter;

public interface IPSAppViewService<M extends PSAppView, F extends PSAppViewFilter> extends IPSModelService<M, F>{

}
