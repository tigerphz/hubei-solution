package system.manager.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import system.manager.model.SysUserInfo;
import system.manager.persist.daorepository.SysUserInfoDaoRepository;

@Service
public class SysUserDomain {

    @Autowired
    @Qualifier("sysUserInfoDaoRepository")
    private SysUserInfoDaoRepository sysUserInfoDaoRepository;

    public SysUserInfo getSysUserInfoByUserId(Long userId) {
        return sysUserInfoDaoRepository.getSysUserInfoByUserId(userId);
    }
}
