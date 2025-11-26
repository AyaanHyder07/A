package com.infy.dto;

public class EmployeeDTO {
    private int empIdid;
    private String empName;
    private String empDept;

    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(int empIdid, String empName, String empDept) {
        this.empIdid = empIdid;
        this.empName = empName;
        this.empDept = empDept;
    }

    public int getEmpIdid() {
        return empIdid;
    }

    public void setEmpIdid(int empIdid) {
        this.empIdid = empIdid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [empIdid=" + empIdid + ", "
                + (empName != null ? "empName=" + empName + ", " : "")
                + (empDept != null ? "empDept=" + empDept : "") + "]";
    }
}
