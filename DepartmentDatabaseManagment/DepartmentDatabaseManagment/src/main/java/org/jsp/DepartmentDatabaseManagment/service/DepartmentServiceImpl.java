package org.jsp.DepartmentDatabaseManagment.service;

import org.jsp.DepartmentDatabaseManagment.entity.DepartmentEntity;
import org.jsp.DepartmentDatabaseManagment.repositary.DepartmentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    
    @Autowired
    private DepartmentRepositary departmentRepositary;

    public DepartmentEntity saveDepartment(DepartmentEntity department){
        return departmentRepositary.save(department);
    }

    public List<DepartmentEntity> fetchDepartmentList(){
            return departmentRepositary.findAll();
    }
    public DepartmentEntity fetchDepartmentById( Long deparmtId){
        return departmentRepositary.findById(deparmtId).get();
    }
    public void deleteDepartmentById(Long departmentId){
        departmentRepositary.deleteById(departmentId);
    }

    public DepartmentEntity updateDepartmentEntity(Long departmentId, DepartmentEntity departmentEntity){
        DepartmentEntity depdb=departmentRepositary.findById(departmentId).get();
        if(Objects.nonNull(departmentEntity.getDepartmentName()) && !"" .equalsIgnoreCase(departmentEntity.getDepartmentName())){
            depdb.setDepartmentName(departmentEntity.getDepartmentName());
        }
        if(Objects.nonNull(departmentEntity.getDepartmentCode()) && !"" .equalsIgnoreCase(departmentEntity.getDepartmentCode())){
            depdb.setDepartmentCode(departmentEntity.getDepartmentCode());
        }
        return departmentRepositary.save(depdb);
    }

    public DepartmentEntity fetchDepartmentEntityByName(String departmentName){
        return departmentRepositary.findByDepartmentName(departmentName);
    }

}
