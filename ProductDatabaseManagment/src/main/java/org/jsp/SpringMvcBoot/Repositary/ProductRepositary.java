package org.jsp.SpringMvcBoot.Repositary;

import java.util.List;

//import org.jsp.SpringMvcBoot.UserEntity.User;
import org.jsp.SpringMvcBoot.ProductModel.ProductEntity;
//import org.jsp.SpringMvcBoot.UserEntity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepositary extends  CrudRepository<ProductEntity, Integer> {

	@Query("select p from ProductEntity p where p.p_price between ?1 and ?2")
	public List<ProductEntity> getAllProductInRange(double MinPrice, double MaxPrice);
}
