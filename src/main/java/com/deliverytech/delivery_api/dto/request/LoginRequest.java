package com.deliverytech.delivery_api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginRequest {

    @NotBlank(message = "Username é obrigatório")
    private String username;

    @NotBlank(message = "Passwoerd é obrigatório")
    private String password;

}
