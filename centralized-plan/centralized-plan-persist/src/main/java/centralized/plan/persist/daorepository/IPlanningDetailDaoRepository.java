package centralized.plan.persist.daorepository;

import centralized.plan.model.PlanningDetailEntity;

public interface IPlanningDetailDaoRepository {

    int insert(PlanningDetailEntity record);

    PlanningDetailEntity selectByWorkId(long workid);
}
