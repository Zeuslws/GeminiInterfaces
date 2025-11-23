package edu.gemini;

public class Main {
    public static void main(String[] args) {

        OCS ocs = new OCS();

        // Create an astronomer
        Astronomer as = new Astronomer();
        // if Astronomer has no setName(), just leave it like this
        // as.setName("John Doe");

        // Create a science plan
        SciencePlan sp = new SciencePlan();
        sp.setName("This is a test science plan.");
        sp.setObjective("Test objective");
        sp.setFunding(1000);

        // Set dummy dates (required fields)
        sp.setStartDate(new java.util.Date());
        sp.setEndDate(new java.util.Date());

        // Create science plan
        String result = ocs.createSciencePlan(sp, as);
        System.out.println(result);
    }
}
