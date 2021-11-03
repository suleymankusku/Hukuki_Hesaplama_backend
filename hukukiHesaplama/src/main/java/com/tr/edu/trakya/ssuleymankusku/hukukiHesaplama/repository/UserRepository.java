package com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.repository;

import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SystemUser,Integer> {

}
