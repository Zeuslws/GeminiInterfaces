package edu.gemini;

import java.sql.Date;

import edu.gemini.model.AbstractSciencePlan;
import edu.gemini.model.StarSystem;


public class SciencePlan extends AbstractSciencePlan {
<<<<<<< HEAD
        SciencePlan sp = (SciencePlan) spAbs;

    boolean valid = true;
    
    private String name;
=======
    private int id;                 
    private String name;           
    private Astronomer creator;     
    private double funding;         
    private String objective;       
    private Date startDate;         
    private Date endDate;           
    private String telescope;       
    private StarSystem.CONSTELLATIONS target;  
    private boolean draft;   
    private STATUS status;
    

    // data processing
    private String fileType;        
    private String fileQuality;     
    private String colorType;       
    private Float contrast;
    private Float brightness;      
    private Float saturation;
    private Float saturationLuminance;
    private Float hue;
    private Float highlights;
    private Float shadows;
    private Float whites;
    private Float blacks;
    private Float luminance;
    private Float exposure;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Astronomer getCreator() {
        return creator;
    }

    public void setCreator(Astronomer creator) {
        this.creator = creator;
    }

    public double getFunding() {
        return funding;
    }

    public void setFunding(double funding) {
        this.funding = funding;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTelescope() {
        return telescope;
    }

    public void setTelescope(String telescope) {
        this.telescope = telescope;
    }

    public StarSystem.CONSTELLATIONS getTarget() {
        return target;
    }

    public void setTarget(StarSystem.CONSTELLATIONS target) {
        this.target = target;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

        public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileQuality() {
        return fileQuality;
    }

    public void setFileQuality(String fileQuality) {
        this.fileQuality = fileQuality;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public Float getContrast() {
        return contrast;
    }

    public void setContrast(Float contrast) {
        this.contrast = contrast;
    }

    public Float getBrightness() {
        return brightness;
    }

    public void setBrightness(Float brightness) {
        this.brightness = brightness;
    }

    public Float getSaturation() {
        return saturation;
    }

    public void setSaturation(Float saturation) {
        this.saturation = saturation;
    }

    public Float getSaturationLuminance() {
        return saturationLuminance;
    }

    public void setSaturationLuminance(Float saturationLuminance) {
        this.saturationLuminance = saturationLuminance;
    }

    public Float getHue() {
        return hue;
    }

    public void setHue(Float hue) {
        this.hue = hue;
    }

    public Float getHighlights() {
        return highlights;
    }

    public void setHighlights(Float highlights) {
        this.highlights = highlights;
    }

    public Float getShadows() {
        return shadows;
    }

    public void setShadows(Float shadows) {
        this.shadows = shadows;
    }

    public Float getWhites() {
        return whites;
    }

    public void setWhites(Float whites) {
        this.whites = whites;
    }

    public Float getBlacks() {
        return blacks;
    }

    public void setBlacks(Float blacks) {
        this.blacks = blacks;
    }

    public Float getLuminance() {
        return luminance;
    }

    public void setLuminance(Float luminance) {
        this.luminance = luminance;
    }

    public Float getExposure() {
        return exposure;
    }

    public void setExposure(Float exposure) {
        this.exposure = exposure;
    }
>>>>>>> 14d7642747755fcc8dd5ee01c8f6ae0cc0e94b51

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}
