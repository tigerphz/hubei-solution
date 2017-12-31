package system.manager.persist.daorepository;

import com.github.pagehelper.PageInfo;
import system.manager.model.SysUserInfo;

public interface SysUserInfoDaoRepository {
    SysUserInfo getSysUserInfoByUserId(Long userId);

    PageInfo<SysUserInfo> getSysUserInfoList();
}
