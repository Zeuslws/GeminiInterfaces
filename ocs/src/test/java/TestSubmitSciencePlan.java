import edu.gemini.Astronomer;
import edu.gemini.OCS;
import edu.gemini.SciencePlan;
import edu.gemini.model.AbstractSciencePlan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

public class TestSubmitSciencePlan {

    @Test
    public void testSubmitSciencePlanSuccess() {
        OCS ocs = new OCS();

        // Astronomer
        Astronomer as = new Astronomer();
        as.setId(1);
        as.setInstitution("Mahidol University");
        as.setFirstName("Chaiyong");
        as.setLastName("Ragkhitwetsagul");

        // Science plan
        SciencePlan sp = new SciencePlan();
        sp.setName("Plan A");
        sp.setObjective("Testing submit operation");
        sp.setFunding(1000);

        sp.setStartDate(new Date());
        sp.setEndDate(new Date());

        // Create => status SAVED
        ocs.createSciencePlan(sp, as);

        // Test => status TESTED
        ocs.updateSciencePlanStatus(sp.getId(), AbstractSciencePlan.STATUS.TESTED);

        // Submit
        String result = ocs.submitSciencePlan(sp, as);

        assertEquals("Submit science plan success. ID: " + sp.getId(), result);
        assertEquals(AbstractSciencePlan.STATUS.SUBMITTED, sp.getStatus());
    }

    @Test
    public void testSubmitSciencePlanFailNotTested() {
        OCS ocs = new OCS();

        Astronomer as = new Astronomer();
        as.setId(1);
        as.setInstitution("Mahidol University");
        as.setFirstName("Chaiyong");
        as.setLastName("Ragkhitwetsagul");

        SciencePlan sp = new SciencePlan();
        sp.setName("Plan B");
        sp.setObjective("Testing failure");
        sp.setFunding(1000);

        sp.setStartDate(new Date());
        sp.setEndDate(new Date());

        // Create => status SAVED
        ocs.createSciencePlan(sp, as);

        // Do NOT test, directly submit
        String result = ocs.submitSciencePlan(sp, as);

        assertEquals("This science plan is incomplete. Please complete and test it before submission.", result);
        assertEquals(AbstractSciencePlan.STATUS.SAVED, sp.getStatus());
    }
}
