package system.manager.persist.daorepository;

import system.manager.model.SysUserInfo;

public interface SysUserInfoDaoRepository {
    SysUserInfo getSysUserInfoByUserId(Long userId);
}
