package system.manager.model;

public class MenuInfo {
    private String MenuName;

    private String MenuLinkUrl;

    private String MenuIcon;

    private Long ParentNo;

    private Integer Sort;

    private Integer Status;

    private Boolean IsLeaf;

    private Boolean IsSelected;

    private String ModuleController;

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        MenuName = menuName;
    }

    public String getMenuLinkUrl() {
        return MenuLinkUrl;
    }

    public void setMenuLinkUrl(String menuLinkUrl) {
        MenuLinkUrl = menuLinkUrl;
    }

    public String getMenuIcon() {
        return MenuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        MenuIcon = menuIcon;
    }

    public Long getParentNo() {
        return ParentNo;
    }

    public void setParentNo(Long parentNo) {
        ParentNo = parentNo;
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

    public Boolean getLeaf() {
        return IsLeaf;
    }

    public void setLeaf(Boolean leaf) {
        IsLeaf = leaf;
    }

    public Boolean getSelected() {
        return IsSelected;
    }

    public void setSelected(Boolean selected) {
        IsSelected = selected;
    }

    public String getModuleController() {
        return ModuleController;
    }

    public void setModuleController(String moduleController) {
        ModuleController = moduleController;
    }
}
