package com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class ToInForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;
    private String processName;
    private String emplanation;
    private String law;
    private int lawNumber;
    private boolean gender;
    private boolean isDeleted;
}
