package edu.gemini;

import edu.gemini.model.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class OCS implements GeminiAPI<SciencePlan, ObservingProgram, ObservingProgramConfigs,
        AstronomicalData, Astronomer, ScienceObserver> {

    private ArrayList<SciencePlan> sciencePlans = new ArrayList<>();
    private ArrayList<ObservingProgram> observingPrograms = new ArrayList<>();
    private int nextPlanId = 1; 

    @Override
    public ArrayList<SciencePlan> getAllSciencePlans() {
         return sciencePlans;
    }

    @Override
    public SciencePlan getSciencePlanByNo(int planNo) {
       for (SciencePlan sp : sciencePlans) {
        if (sp.getId() == planNo) {
            return sp;
        }
    }
    return null;
    }

    @Override
public String createSciencePlan(SciencePlan sciencePlan, Astronomer an) {

    sciencePlan.setId(nextPlanId++);
    sciencePlan.setCreator(an);

    if (sciencePlan.getName() == null || sciencePlan.getName().trim().isEmpty()) {
        return "Please complete all required fields before saving the science plan.";
    }
    if (sciencePlan.getObjective() == null || sciencePlan.getObjective().trim().isEmpty()) {
        return "Please complete all required fields before saving the science plan.";
    }
    if (sciencePlan.getStartDate() != null && sciencePlan.getEndDate() != null &&
        sciencePlan.getStartDate().after(sciencePlan.getEndDate())) {
        return "Start date cannot be after the end date";
    }
    if (sciencePlan.getFunding() <= 0) {
        return "Funding amount must be a positive numerical value.";
    }

    for (SciencePlan sp : sciencePlans) {
        if (sp.getName().equals(sciencePlan.getName())) {
            return "A science plan with this name already exists. Please use a different plan name.";
        }
    }

    sciencePlan.setStatus(AbstractSciencePlan.STATUS.SAVED);
    sciencePlans.add(sciencePlan);

    return "Create science plan success. ID: " + sciencePlan.getId();
}

    @Override
    public String submitSciencePlan(SciencePlan sciencePlan, Astronomer an) {
    SciencePlan sp = getSciencePlanByNo(sciencePlan.getId());
    if (sp == null) {
        return "Science plan not found.";
    }

    // can only submit TESTED and complete plans
    if (sp.getStatus() != AbstractSciencePlan.STATUS.TESTED) {
        return "This science plan is incomplete. Please complete and test it before submission.";
    }

    // prevent resubmission
    if (sp.getStatus() == AbstractSciencePlan.STATUS.SUBMITTED
            || sp.getStatus() == AbstractSciencePlan.STATUS.VALIDATED
            || sp.getStatus() == AbstractSciencePlan.STATUS.RUNNING) {
        return "This science plan has already been submitted or executed.";
    }

    sp.setStatus(AbstractSciencePlan.STATUS.SUBMITTED);
        return "Submit science plan success. ID: " + sp.getId();
    }

    @Override
    public boolean updateSciencePlanStatus(int planno, AbstractSciencePlan.STATUS stssp) {
        return false;
    }

    @Override
    public String testSciencePlan(SciencePlan sciencePlan) {
        return null;
    }

    @Override
    public void deleteAllSciencePlans() {

    }

    @Override
    public boolean deleteSciencePlanByNo(int planNo) {
        return false;
    }

    @Override
    public String addUnavailableDate(Date datevalue) {
        return null;
    }

    @Override
    public String deleteUnavailableDate(Date datevalue) {
        return null;
    }

    @Override
    public ArrayList<Date> getAllObservationSchedule() {
        return null;
    }

    @Override
    public AstronomicalData getAstronomicalData(SciencePlan sciencePlan) throws IOException {
        return null;
    }

    @Override
    public AstronomicalData removeAstronomicalData(SciencePlan sciencePlan, int index) throws IOException {
        return null;
    }

    @Override
    public String accessTelescopeLiveView() throws IOException {
        return null;
    }

    @Override
    public String executeCommand(String command) {
        return null;
    }

    @Override
    public String getConfigurations() {
        return null;
    }

    @Override
    public boolean addConfiguration(String confFilePath) {
        return false;
    }

    @Override
    public boolean removeConfiguration(int confNo) {
        return false;
    }

    @Override
    public AbstractObservingProgramConfigs.FoldMirrorType[] getFoldMirrorTypes() {
        return new AbstractObservingProgramConfigs.FoldMirrorType[0];
    }

    @Override
    public AbstractObservingProgramConfigs.CalibrationUnit[] getCalibrationUnits() {
        return new AbstractObservingProgramConfigs.CalibrationUnit[0];
    }

    @Override
    public AbstractObservingProgramConfigs.LightType[] getLightTypes() {
        return new AbstractObservingProgramConfigs.LightType[0];
    }

    @Override
    public ObservingProgram createObservingProgram(AbstractSciencePlan sp, String opticsPrimary, double fStop, double opticsSecondaryRMS, double scienceFoldMirrorDegree, AbstractObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType, int moduleContent, AbstractObservingProgramConfigs.CalibrationUnit calibrationUnit, AbstractObservingProgramConfigs.LightType lightType, AbstractTelePositionPair[] telePositionPair, ScienceObserver so) {
        return null;
    }

    @Override
    public ObservingProgram validateSciencePlan(AbstractSciencePlan sp, ScienceObserver so) {
        return null;
    }

    @Override
    public boolean saveObservingProgram(AbstractObservingProgram op) {
        return false;
    }

    @Override
    public ObservingProgram getObservingProgramBySciencePlan(AbstractSciencePlan sp) {
        return null;
    }

    @Override
    public void getDefaultConfiguration() throws IOException {

    }

    @Override
    public void getCurrentConfiguration() throws IOException {

    }

    @Override
    public String updateConfiguration() throws FileNotFoundException {
        return null;
    }
}
