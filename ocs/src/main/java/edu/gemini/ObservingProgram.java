package edu.gemini;

import edu.gemini.model.AbstractObservingProgram;
import edu.gemini.model.AbstractTelePositionPair;

public class ObservingProgram extends AbstractObservingProgram {

    private SciencePlan sciencePlan;
    private String opticsPrimary;
    private double fStop;
    private double opticsSecondaryRMS;
    private double scienceFoldMirrorDegree;
    private ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType;
    private int moduleContent;
    private ObservingProgramConfigs.CalibrationUnit calibrationUnit;
    private ObservingProgramConfigs.LightType lightType;
    private AbstractTelePositionPair[] telePositionPair;
    private ScienceObserver observer;

    // --- getters & setters ---

    public SciencePlan getSciencePlan() {
        return sciencePlan;
    }

    public void setSciencePlan(SciencePlan sciencePlan) {
        this.sciencePlan = sciencePlan;
    }

    public String getOpticsPrimary() {
        return opticsPrimary;
    }

    public void setOpticsPrimary(String opticsPrimary) {
        this.opticsPrimary = opticsPrimary;
    }

    public double getFStop() {
        return fStop;
    }

    public void setFStop(double fStop) {
        this.fStop = fStop;
    }

    public double getOpticsSecondaryRMS() {
        return opticsSecondaryRMS;
    }

    public void setOpticsSecondaryRMS(double opticsSecondaryRMS) {
        this.opticsSecondaryRMS = opticsSecondaryRMS;
    }

    public double getScienceFoldMirrorDegree() {
        return scienceFoldMirrorDegree;
    }

    public void setScienceFoldMirrorDegree(double scienceFoldMirrorDegree) {
        this.scienceFoldMirrorDegree = scienceFoldMirrorDegree;
    }

    public ObservingProgramConfigs.FoldMirrorType getScienceFoldMirrorType() {
        return scienceFoldMirrorType;
    }

    public void setScienceFoldMirrorType(ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType) {
        this.scienceFoldMirrorType = scienceFoldMirrorType;
    }

    public int getModuleContent() {
        return moduleContent;
    }

    public void setModuleContent(int moduleContent) {
        this.moduleContent = moduleContent;
    }

    public ObservingProgramConfigs.CalibrationUnit getCalibrationUnit() {
        return calibrationUnit;
    }

    public void setCalibrationUnit(ObservingProgramConfigs.CalibrationUnit calibrationUnit) {
        this.calibrationUnit = calibrationUnit;
    }

    public ObservingProgramConfigs.LightType getLightType() {
        return lightType;
    }

    public void setLightType(ObservingProgramConfigs.LightType lightType) {
        this.lightType = lightType;
    }

    public AbstractTelePositionPair[] getTelePositionPair() {
        return telePositionPair;
    }

    public void setTelePositionPair(AbstractTelePositionPair[] telePositionPair) {
        this.telePositionPair = telePositionPair;
    }

    public ScienceObserver getObserver() {
        return observer;
    }

    public void setObserver(ScienceObserver observer) {
        this.observer = observer;
    }
}
