package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.SysHeroInfoMapper;
import course.linkflower.link.oneframework.members.model.SysRoleMenu;
import course.linkflower.link.oneframework.members.service.SysHeroInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysHeroInfoServicelmpl implements SysHeroInfoService {
    @Resource
    private SysHeroInfoMapper sysHeroInfoMapper;
    public List<SysRoleMenu> getAllMenus() {
        return sysHeroInfoMapper.listAllMenus();
    }
}
