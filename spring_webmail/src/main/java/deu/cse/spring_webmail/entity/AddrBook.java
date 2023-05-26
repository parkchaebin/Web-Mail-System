/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.spring_webmail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author JaeHyuk
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addrbook")
public class AddrBook {
    
    @Id
    @Column(name = "email")
    private String email;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "userid")
    private String userId;
    
}
