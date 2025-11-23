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
             AbstractTelePositionPair[] telePositionPair,
        ScienceObserver ;
           
        SciencePlan sp = (SciencePlan) spAbs;

        
}
