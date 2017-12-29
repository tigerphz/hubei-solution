package system.manager.model;

import java.util.Date;

public class SysPermissionInfo {
    private Long permid;

    private String permname;

    private Integer status;

    private String description;

    private Integer type;

    private String icon;

    private Integer sort;

    private Long parentid;

    private String url;

    private Long createuserid;

    private Date createdate;

    private String createusername;

    private Long modifyuserid;

    private Date modifydate;

    private String modifyusername;

    public Long getPermid() {
        return permid;
    }

    public void setPermid(Long permid) {
        this.permid = permid;
    }

    public String getPermname() {
        return permname;
    }

    public void setPermname(String permname) {
        this.permname = permname == null ? null : permname.trim();
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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