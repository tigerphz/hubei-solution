package system.manager.service;

import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.manager.domain.SysUserDomain;
import system.manager.model.SysUserInfo;

@RestController
@RequestMapping("sysuser")
public class SysUserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysUserDomain sysUserDomain;

    @GetMapping("/{userid}")
    public SysUserInfo getSysUserInfoByUserId(@PathVariable("userid") Long userId) {
        return sysUserDomain.getSysUserInfoByUserId(userId);
    }

    @GetMapping("/all")
    public PageInfo<SysUserInfo> getSysUserInfoList() {
        logger.debug("调用：getSysUserInfoList");

        return sysUserDomain.getSysUserInfoList();
    }
}
