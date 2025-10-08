package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.DiscussGifFavoriteDTO;

/**
 * 实体[DISCUSS_GIF_FAVORITE]服务对象接口
 * 
 */
@Qualifier(OdooModels.DISCUSS_GIF_FAVORITE)
public interface IDiscussGifFavoriteService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<DiscussGifFavoriteDTO, net.ibizsys.central.util.ISearchContextDTO>{



}