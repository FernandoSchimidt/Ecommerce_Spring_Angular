package com.fernandoschimidt.ecommerce.entity;

import com.fernandoschimidt.ecommerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String password;

    private String name;

    private String username;

    private String email;

    private UserRole role;

    @Lob
    @Column(columnDefinition = "longlob")
    private byte[] img;

}
