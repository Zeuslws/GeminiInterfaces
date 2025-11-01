package edu.gemini;

public class Main {
    public static void main(String[] args) {
        OCS ocs = new OCS();
        SciencePlan sp = new SciencePlan();
<<<<<<< HEAD
        sp.setName("This is a test science plan.");
        System.out.println(ocs.createSciencePlan(sp));
=======
        Astronomer as = new Astronomer();
        sp.setName("This is a test science plan.");
        System.out.println(ocs.createSciencePlan(sp, as));
>>>>>>> b54e050 (Updated the details of each method)
    }
}
