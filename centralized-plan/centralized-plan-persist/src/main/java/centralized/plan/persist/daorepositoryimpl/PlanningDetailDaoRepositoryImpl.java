package centralized.plan.persist.daorepositoryimpl;

import centralized.plan.model.PlanningDetailEntity;
import centralized.plan.persist.daomapper.PlanningDetailEntityMapper;
import centralized.plan.persist.daorepository.IPlanningDetailDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("planningDetailDaoRepositoryImpl")
public class PlanningDetailDaoRepositoryImpl implements IPlanningDetailDaoRepository {

    @Autowired
    private PlanningDetailEntityMapper planningDetailEntityMapper;

    public PlanningDetailEntity selectByWorkId(long workid) {
        return null;
    }

    public int insert(PlanningDetailEntity record) {
        return planningDetailEntityMapper.insert(record);
    }
}
