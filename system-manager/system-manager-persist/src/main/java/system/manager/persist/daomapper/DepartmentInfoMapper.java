package system.manager.persist.daomapper;

import system.manager.model.DepartmentInfo;

public interface DepartmentInfoMapper {
    int insert(DepartmentInfo record);

    int insertSelective(DepartmentInfo record);
}