package org.jsp.DepartmentDatabaseManagment.repositary;

import org.jsp.DepartmentDatabaseManagment.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositary extends JpaRepository<DepartmentEntity,Long> {
    

    public DepartmentEntity findByDepartmentName(String departmentName);

}
