package edu.gemini;

import edu.gemini.model.AbstractSciencePlan;

public class SciencePlan extends AbstractSciencePlan {
        SciencePlan sp = (SciencePlan) spAbs;

    boolean valid = true;
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}
