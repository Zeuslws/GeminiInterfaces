import edu.gemini.Astronomer;
import edu.gemini.OCS;
import edu.gemini.SciencePlan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCreateSciencePlan {
    @Test
    public void testCreateSciencePlan1() {
        OCS ocs = new OCS();
        SciencePlan sp = new SciencePlan();
        Astronomer as = new Astronomer();
        as.setId(1);
        as.setInstitution("Mahidol University");
        as.setFirstName("Chaiyong");
        as.setLastName("Ragkhitwetsagul");
        sp.setName("This is a test science plan.");
        ocs.createSciencePlan(sp, as);
        assertEquals("Chaiyong", as.getFirstName());
        assertEquals("This is a test science plan.", sp.getName());
    }
    
}
