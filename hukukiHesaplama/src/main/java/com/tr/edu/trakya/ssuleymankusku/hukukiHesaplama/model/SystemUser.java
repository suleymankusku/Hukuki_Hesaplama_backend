package com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@EqualsAndHashCode
public class SystemUser {

    @Id
    private int id;
    private UserType userType;
    private String nameSurname;
    private String email;
    private String phoneNumber;
    private Date createTime;
    private boolean isDeleted;
}
