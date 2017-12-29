package system.manager.persist.daomapper;

import system.manager.model.SysUserInfo;

public interface SysUserInfoMapper {
    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    SysUserInfo getSysUserInfoByUserId(Long userId);
}