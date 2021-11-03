package com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.controller;

import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.model.SystemUser;
import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.model.ToInForm;
import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.repository.ToInFormRepository;
import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProcessController {

    @Autowired
    public ToInFormRepository toInFormRepository;


    @GetMapping("/api/ToInForm/formGetAll")
    public Iterable<ToInForm> formGetAll(@RequestParam String filter){
        return toInFormRepository.findAllByLawContaining(filter);
    }

    @PostMapping("/api/ToInForm/saveForm")
    public Long saveForm(@RequestBody ToInForm toInForm){
        toInFormRepository.save(toInForm);
        return 1L;
    }

}
