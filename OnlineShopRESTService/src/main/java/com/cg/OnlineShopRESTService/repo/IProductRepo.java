package com.cg.OnlineShopRESTService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.OnlineShopRESTService.bean.Product;

@Repository
public interface IProductRepo extends JpaRepository<Product, String>{
		
}
