package com.biolab.security.dto;

import com.biolab.security.entities.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginDTO {

    @NotBlank
    private String cpf;
    @NotBlank
    private String senha;

}
