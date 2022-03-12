package com.example.demo.SpringCache.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.SpringCache.Entity.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, String> {

}
