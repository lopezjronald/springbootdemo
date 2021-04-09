package com.sandbox.demo.repository;

import com.sandbox.demo.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "orderProduct", path = "order-products")
@CrossOrigin("http://localhost:4200")
public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> {
}
