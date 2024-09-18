package com.centaurosbank.sastc.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaDto {

    private Integer id;
    private String nombreCliente;
    private boolean aprovado;
    private BigDecimal montoAprobado;

}
