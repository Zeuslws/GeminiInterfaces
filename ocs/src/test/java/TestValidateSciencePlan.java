import edu.gemini.Astronomer;
import edu.gemini.OCS;
import edu.gemini.SciencePlan;
import edu.gemini.ScienceObserver;
import edu.gemini.model.AbstractSciencePlan;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestValidateSciencePlan {

    @Test
    public void testValidateSciencePlanSuccess() {
        OCS ocs = new OCS();

        // Astronomer
        Astronomer as = new Astronomer();
        as.setId(1);
        as.setInstitution("Mahidol University");
        as.setFirstName("Chaiyong");
        as.setLastName("Ragkhitwetsagul");

        ScienceObserver so = new ScienceObserver();  // <- just create it

        // Science plan
        SciencePlan sp = new SciencePlan();
        sp.setName("Validation Test Plan");
        sp.setObjective("Validate science plan");
        sp.setFunding(2000);
        sp.setStartDate(new Date());
        sp.setEndDate(new Date());

        ocs.createSciencePlan(sp, as);
        ocs.updateSciencePlanStatus(sp.getId(), AbstractSciencePlan.STATUS.TESTED);
        ocs.submitSciencePlan(sp, as);

        SciencePlan validated = ocs.validateSciencePlan(sp, so);

        assertEquals(AbstractSciencePlan.STATUS.VALIDATED, validated.getStatus());
    }
}
