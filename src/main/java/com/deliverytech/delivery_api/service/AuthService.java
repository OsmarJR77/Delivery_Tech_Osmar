package com.deliverytech.delivery_api.service;

import com.deliverytech.delivery_api.dto.request.LoginRequest;
import com.deliverytech.delivery_api.dto.request.RegisterRequest;
import com.deliverytech.delivery_api.dto.response.LoginResponse;
import com.deliverytech.delivery_api.dto.response.UserResponse;
import com.deliverytech.delivery_api.model.Usuario;

public interface AuthService {
    
    // Cláusula número 1 : deve saber como processar um login
    LoginResponse login(LoginRequest request);

    // Cláusula número 2 : deve saber como registrar um novo usuário
    Usuario register(RegisterRequest request);

    // Cláusula número 3 : deve saber como obter informações do usuario logado
    UserResponse getCurrentUser();
}