package system.manager.service;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
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
@Api("sysuser相关API")
public class SysUserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysUserDomain sysUserDomain;

    @GetMapping("/{userid}")
    @ApiOperation("根据用户ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "userid", dataType = "Long", required = true, value = "用户ID")})
    @ApiResponses({
            @ApiResponse(code = 400, message = "参数填写不正确")
    })
    public SysUserInfo getSysUserInfoByUserId(@PathVariable("userid") Long userId) {
        return sysUserDomain.getSysUserInfoByUserId(userId);
    }

    @GetMapping("/all")
    @ApiOperation("分页获取用户信息")
    public PageInfo<SysUserInfo> getSysUserInfoList() {
        logger.debug("调用：getSysUserInfoList");

        return sysUserDomain.getSysUserInfoList();
    }
}
