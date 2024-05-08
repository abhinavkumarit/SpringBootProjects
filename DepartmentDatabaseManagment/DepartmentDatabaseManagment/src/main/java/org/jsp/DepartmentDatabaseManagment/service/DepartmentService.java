package org.jsp.DepartmentDatabaseManagment.service;

import org.jsp.DepartmentDatabaseManagment.entity.DepartmentEntity;
import java.util.*;

public interface DepartmentService {
    public DepartmentEntity saveDepartment(DepartmentEntity department);
    public List<DepartmentEntity> fetchDepartmentList();
    public DepartmentEntity fetchDepartmentById(Long deparmtId);
    public void deleteDepartmentById(Long departmentId);
    public DepartmentEntity updateDepartmentEntity(Long deparmtId, DepartmentEntity departmentEntity);
    public DepartmentEntity fetchDepartmentEntityByName(String departmentName);

}
