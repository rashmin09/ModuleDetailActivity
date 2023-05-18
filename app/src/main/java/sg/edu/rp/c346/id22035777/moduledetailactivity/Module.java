package sg.edu.rp.c346.id22035777.moduledetailactivity;

import java.util.ArrayList;
import java.util.List;

public class Module implements java.io.Serializable {
    private String moduleCode;
    private String moduleName;
    private int academicYear;
    private int semester;
    private double moduleCredit;
    private String venue;

    public Module(String moduleCode, String moduleName, int academicYear, int semester, double moduleCredit, String venue) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.academicYear = academicYear;
        this.semester = semester;
        this.moduleCredit = moduleCredit;
        this.venue = venue;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public int getSemester() {
        return semester;
    }

    public double getModuleCredit() {
        return moduleCredit;
    }

    public String getVenue() {
        return venue;
    }
}