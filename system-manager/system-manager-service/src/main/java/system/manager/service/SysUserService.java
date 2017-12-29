package system.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.manager.domain.SysUserDomain;
import system.manager.model.SysUserInfo;

@RestController
@RequestMapping("sysuser")
public class SysUserService {
    @Autowired
    private SysUserDomain sysUserDomain;

    @GetMapping("/{userid}")
    public SysUserInfo getSysUserInfoByUserId(@PathVariable("userid") Long userId) {
        return sysUserDomain.getSysUserInfoByUserId(userId);
    }
}
