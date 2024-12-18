package com.syam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syam.form.MyForm;


@Repository
public interface MyRepo extends JpaRepository<MyForm, Integer>{

}
