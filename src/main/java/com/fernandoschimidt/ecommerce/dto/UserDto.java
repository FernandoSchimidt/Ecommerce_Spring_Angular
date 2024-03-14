package com.fernandoschimidt.ecommerce.dto;

import com.fernandoschimidt.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long Id;
    private String email;
    private String name;
    private UserRole userRole;

}
