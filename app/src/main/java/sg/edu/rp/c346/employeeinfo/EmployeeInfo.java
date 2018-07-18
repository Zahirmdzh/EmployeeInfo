package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 17042725 on 18/7/2018.
 */

public class EmployeeInfo {
    private String EmployeeName;
    private String EmployeeTitle;
    private double EmployeeSalary;

    public EmployeeInfo(String employeeName, String employeeTitle, double employeeSalary) {
        EmployeeName = employeeName;
        EmployeeTitle = employeeTitle;
        EmployeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public String getEmployeeTitle() {
        return EmployeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.EmployeeTitle = employeeTitle;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.EmployeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeTitle='" + EmployeeTitle + '\'' +
                ", EmployeeSalary=" + EmployeeSalary +
                '}';
    }
}
