package com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.repository;

import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.model.ToInForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToInFormRepository extends JpaRepository<ToInForm,Long> {
    public Iterable<ToInForm> findAllByLawContaining(String filter);
}
