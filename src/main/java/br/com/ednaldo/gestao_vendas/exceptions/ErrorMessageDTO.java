package br.com.ednaldo.gestao_vendas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    

    private String message;
    private String field;
}
