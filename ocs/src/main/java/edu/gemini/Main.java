package edu.gemini;

public class Main {
    public static void main(String[] args) {
        OCS ocs = new OCS();
        SciencePlan sp = new SciencePlan();
        sp.setName("This is a test science plan.");
        System.out.println(ocs.createSciencePlan(sp));

        Astronomer as = new Astronomer();
        sp.setName("This is a test science plan.");
        System.out.println(ocs.createSciencePlan(sp, as));

    }
}
