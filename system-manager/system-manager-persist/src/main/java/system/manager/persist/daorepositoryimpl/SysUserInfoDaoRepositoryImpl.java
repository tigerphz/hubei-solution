package system.manager.persist.daorepositoryimpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.manager.model.SysUserInfo;
import system.manager.persist.daomapper.SysUserInfoMapper;
import system.manager.persist.daorepository.SysUserInfoDaoRepository;

@Repository("sysUserInfoDaoRepository")
public class SysUserInfoDaoRepositoryImpl implements SysUserInfoDaoRepository {

    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;

    public SysUserInfo getSysUserInfoByUserId(Long userId) {
        return sysUserInfoMapper.getSysUserInfoByUserId(userId);
    }

    public PageInfo<SysUserInfo> getSysUserInfoList() {
        PageHelper.startPage(10, 1);
        Page<SysUserInfo> sysUserInfoList = sysUserInfoMapper.getSysUserInfoList();
        PageInfo<SysUserInfo> pageInfo = new PageInfo<SysUserInfo>(sysUserInfoList);

        return pageInfo;
    }
}
