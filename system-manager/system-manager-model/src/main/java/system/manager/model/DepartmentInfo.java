package system.manager.model;

/***
 * 部门
 */
public class DepartmentInfo {

    private String DeptName;

    private String DeptDescription;

    private long ParentID;

    private int Status;

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDeptDescription() {
        return DeptDescription;
    }

    public void setDeptDescription(String deptDescription) {
        DeptDescription = deptDescription;
    }

    public long getParentID() {
        return ParentID;
    }

    public void setParentID(long parentID) {
        ParentID = parentID;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
