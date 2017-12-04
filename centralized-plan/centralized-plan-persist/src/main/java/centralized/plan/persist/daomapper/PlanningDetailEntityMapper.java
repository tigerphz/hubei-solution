package centralized.plan.persist.daomapper;

import centralized.plan.model.PlanningDetailEntity;

public interface PlanningDetailEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlanningDetailEntity record);

    int insertSelective(PlanningDetailEntity record);

    PlanningDetailEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlanningDetailEntity record);

    int updateByPrimaryKey(PlanningDetailEntity record);
}