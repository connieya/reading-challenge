package java_performance_tuning.story01;

import java.io.Serializable;

public class EmployeeTO implements Serializable {
    private String empName;
    private String empId;
    private String empPhone;

    public EmployeeTO() {
        super();
    }

    public EmployeeTO(String empName, String empId, String empPhone) {
        this.empName = empName;
        this.empId = empId;
        this.empPhone = empPhone;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        if (empName == null) return "";
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("empName=").append(empName).append("empID=").append(empId)
                .append(" empPhone=").append(empPhone);
        return sb.toString();
    }
}
