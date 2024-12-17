package com.syam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.Account;
import com.syam.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> { 

} 
