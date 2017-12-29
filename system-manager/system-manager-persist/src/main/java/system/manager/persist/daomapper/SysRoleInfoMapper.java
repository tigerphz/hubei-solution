package system.manager.persist.daomapper;

import system.manager.model.SysRoleInfo;

public interface SysRoleInfoMapper {
    int insert(SysRoleInfo record);

    int insertSelective(SysRoleInfo record);
}