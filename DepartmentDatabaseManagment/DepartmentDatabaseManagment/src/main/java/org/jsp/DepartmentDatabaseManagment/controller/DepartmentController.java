package org.jsp.DepartmentDatabaseManagment.controller;

import org.jsp.DepartmentDatabaseManagment.entity.DepartmentEntity;
import org.jsp.DepartmentDatabaseManagment.service.DepartmentService;
// import org.jsp.DepartmentDatabaseManagment.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public DepartmentEntity saveDepartment(@Valid @RequestBody DepartmentEntity department){
        
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/department")
    public List<DepartmentEntity>fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/department/{id}")
    public DepartmentEntity fetchDepartmentById(@PathVariable("id") Long deparmtId){
        return departmentService.fetchDepartmentById(deparmtId);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
    return "Department Deleted Successfully";
    }
    @PutMapping("/department/{id}")
    public DepartmentEntity updateDepartmentEntity(@PathVariable("id") Long departmentId, @RequestBody DepartmentEntity department){
        return departmentService.updateDepartmentEntity(departmentId, department);
    }

    @GetMapping("/department/name/{name}")
    public DepartmentEntity fetchDepartmentEntityByName(@PathVariable("departmentName") String departmentName){
    //    System.out.println("dname handled...");
        return departmentService.fetchDepartmentEntityByName(departmentName);
    }
}
