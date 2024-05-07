package org.jsp.SpringMvcBoot;

import java.util.Iterator;
//import java.util.List;
import java.util.Optional;
import java.util.Scanner;

//import org.jsp.SpringMvcBoot.Dao.ProductDao;
//import org.jsp.SpringMvcBoot.Dao.UserRepositary;
import org.jsp.SpringMvcBoot.ProductModel.ProductEntity;
import org.jsp.SpringMvcBoot.Repositary.ProductRepositary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductDatabaseManagmentApplication {

	public static void main(String[] args) {
		
		
	ApplicationContext context=	SpringApplication.run(ProductDatabaseManagmentApplication.class, args);
		ProductRepositary productRepositary=context.getBean(ProductRepositary.class);
		ProductEntity product=new ProductEntity();
//		ProductDao dao=new ProductDao();
		System.out.println("---Welcome to Product Database----");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. Enter Details of products:");
			System.out.println("2. Fetch Records By ProductId:");
			System.out.println("3. Update Record By ProductId:");
			System.out.println("4. Delete Record By ProductId:");
			System.out.println("5. Fetch All the Records:");
			System.out.println("6. Filter the Record By Price:");
			System.out.println("7. Exit");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Product Name:");
//				String pr_name=sc.next();
				product.setP_name(sc.next());
				System.out.println("Enter Product Discription:");
				product.setP_discription(sc.next());
				System.out.println("Enter Product price:");
				product.setP_price(sc.nextDouble());
//				dao.saveRecord(product);
				productRepositary.save(product);
				break;
				
			case 2:
				System.out.println("Enter ProductId:");
				int id=sc.nextInt();
//				product.setId(sc.nextInt());
				Optional<ProductEntity> optional=productRepositary.findById(id);
				ProductEntity pr=optional.get();
				System.out.println(pr);
				break;
				
			case 3:
				System.out.println("Enter product id: ");
				int id1=sc.nextInt();
				Optional<ProductEntity>optional2=productRepositary.findById(id1);
				ProductEntity pr2=optional2.get();
				System.out.println("Update Name:");
				pr2.setP_name(sc.next());
				System.out.println("Update discription:");
				pr2.setP_discription(sc.next());
				System.out.println("Update price:");
				pr2.setP_price(sc.nextDouble());
				productRepositary.save(pr2);
				System.out.println("Its been updated");
				break;
				
			case 4:
				System.out.println("Enter product id:");
				int id2=sc.nextInt();
				Optional<ProductEntity>optional3=productRepositary.findById(id2);
				ProductEntity pr3=optional3.get();
				productRepositary.delete(pr3);
				System.out.println("Deleted successfully!");
				break;
				
				
			case 5:
				Iterable<ProductEntity> itr=productRepositary.findAll();
				Iterator<ProductEntity>iterator=itr.iterator();
				while(iterator.hasNext()) {
					ProductEntity prd=iterator.next();
					System.out.println(prd);
				}
				break;
//				
			case 6: 
				System.out.println("Min price:");
				double min_price=sc.nextDouble();
				System.out.println("Max Price:");
				double max_price=sc.nextDouble();
				Iterable<ProductEntity>itr2=productRepositary.getAllProductInRange(min_price, max_price);
				Iterator<ProductEntity>iterator2=itr2.iterator();
				while(iterator2.hasNext()) {
					ProductEntity prd2=iterator2.next();
					System.out.println(prd2);
				}
				break;
			case 7:
				System.out.println("Exiting Program.");
				sc.close();
				System.exit(0);
			}
			
		}
	
	}

}
