package system.manager.model;

import java.util.Date;

public class SysRoleInfo {
    private Long roleid;

    private String rolename;

    private Integer status;

    private String description;

    private Long createuserid;

    private Date createdate;

    private String createusername;

    private Long modifyuserid;

    private Date modifydate;

    private String modifyusername;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Long createuserid) {
        this.createuserid = createuserid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public Long getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(Long modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getModifyusername() {
        return modifyusername;
    }

    public void setModifyusername(String modifyusername) {
        this.modifyusername = modifyusername == null ? null : modifyusername.trim();
    }
}