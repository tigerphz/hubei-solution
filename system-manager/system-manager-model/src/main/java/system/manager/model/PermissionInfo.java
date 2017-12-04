package system.manager.model;

public class PermissionInfo {

    private String PermissionAction;

    private String PermissionName;

    private Integer Sort;

    private Integer Status;

    private String Script;

    private String Icon;

    private String PermissionController;

    private String Description;

    private Boolean IsButton;

    private Long ParentID;

    public String getPermissionAction() {
        return PermissionAction;
    }

    public void setPermissionAction(String permissionAction) {
        PermissionAction = permissionAction;
    }

    public String getPermissionName() {
        return PermissionName;
    }

    public void setPermissionName(String permissionName) {
        PermissionName = permissionName;
    }

    public Integer getSort() {
        return Sort;
    }

    public void setSort(Integer sort) {
        Sort = sort;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getScript() {
        return Script;
    }

    public void setScript(String script) {
        Script = script;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getPermissionController() {
        return PermissionController;
    }

    public void setPermissionController(String permissionController) {
        PermissionController = permissionController;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Boolean getButton() {
        return IsButton;
    }

    public void setButton(Boolean button) {
        IsButton = button;
    }

    public Long getParentID() {
        return ParentID;
    }

    public void setParentID(Long parentID) {
        ParentID = parentID;
    }
}
