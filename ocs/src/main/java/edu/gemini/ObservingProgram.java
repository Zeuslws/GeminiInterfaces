package edu.gemini;

import edu.gemini.model.AbstractObservingProgram;
import edu.gemini.model.AbstractTelePositionPair;

public class ObservingProgram extends AbstractObservingProgram {

    String opticsPrimary;
    float fStop;
    float opticsSecondaryRMS;
    float scienceFoldMirrorDegree;
    ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType;
    int moduleContent;
    ObservingProgramConfigs.CalibrationUnit calibrationUnit;
    ObservingProgramConfigs.LightType lightType;
    AbstractTelePositionPair[] telePositionPair, ScienceObserver;


    public ObservingProgram createOP(AbstractObservingProgram spAbs) {

        SciencePlan sp = (SciencePlan) spAbs;

        
        if ("GNZ".equalsIgnoreCase(opticsPrimary)) {
            if (fStop < 1.8 || fStop > 8.1) return null;
        } else if ("GSZ".equalsIgnoreCase(opticsPrimary)) {
            if (fStop < 2.9 || fStop > 18.0) return null;
        } else {
            return null;
        }

        String tel = sp.getTelescope();
        if ("Chile".equalsIgnoreCase(tel)) {
            if (opticsSecondaryRMS < 5 || opticsSecondaryRMS > 13) return null;
        } else {
            if (opticsSecondaryRMS < 5 || opticsSecondaryRMS > 17) return null;
        }

      
        if (scienceFoldMirrorDegree < 30 || scienceFoldMirrorDegree > 45) return null;

       
        if (moduleContent < 1 || moduleContent > 4) return null;

       
        ObservingProgram op = new ObservingProgram();



        observingPrograms.add(op);
        return op;
    }
}
