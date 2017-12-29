package system.manager.persist.daorepositoryimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.manager.model.SysUserInfo;
import system.manager.persist.daorepository.SysUserInfoDaoRepository;
import system.manager.persist.daomapper.SysUserInfoMapper;

@Repository("sysUserInfoDaoRepository")
public class SysUserInfoDaoRepositoryImpl implements SysUserInfoDaoRepository {

    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;

    public SysUserInfo getSysUserInfoByUserId(Long userId) {
        return sysUserInfoMapper.getSysUserInfoByUserId(userId);
    }
}
