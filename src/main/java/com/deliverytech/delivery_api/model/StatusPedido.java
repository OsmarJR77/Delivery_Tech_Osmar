package com.deliverytech.delivery_api.model;

public enum StatusPedido {
    CRIADO("Criado"),// momento em que o pedido foi criado pelo cliente enão foi confirmado pelo restaurante
    PENDENTE("Pendente"), // aguardando ser confirmado
    CONFIRMADO("Confirmado"), // o restaurante confirmou que recebeu o pedido
    PREPARANDO("Preparando"), // o restaurante está preparando o pedido
    SAIU_PARA_ENTREGA("Saiu para Entrega"), // saiu o pedido para a entrega ao cliente
    ENTREGUE("Entregue"), // o pedido foi entregue com sucesso ao cliente
    CANCELADO("Cancelado"); // pedido foi cancelado

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
} // fim do enum StatusPedido