package org.jsp.DepartmentDatabaseManagment.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;
    @NotBlank(message = "Please Enter name")
    private String departmentName;
    @NotBlank(message = "Please Enter code")
    private String departmentCode;

    


    public DepartmentEntity(long departmentId, String departmentName, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }


    


    public DepartmentEntity() {
    
    super();
}





    public long getDepartmentId() {
        return departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public String getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
    @Override
    public String toString() {
        return "DepartmentEntity [departmentId=" + departmentId + ", departmentName=" + departmentName
                + ", departmentCode=" + departmentCode + "]";
    }

    
}
