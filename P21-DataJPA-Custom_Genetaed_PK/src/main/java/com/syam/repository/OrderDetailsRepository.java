package com.syam.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.ProductOrder;

public interface OrderDetailsRepository extends JpaRepository<ProductOrder, Serializable> {

}
