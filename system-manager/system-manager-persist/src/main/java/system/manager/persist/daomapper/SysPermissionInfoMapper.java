package system.manager.persist.daomapper;

import system.manager.model.SysPermissionInfo;

public interface SysPermissionInfoMapper {
    int insert(SysPermissionInfo record);

    int insertSelective(SysPermissionInfo record);
}