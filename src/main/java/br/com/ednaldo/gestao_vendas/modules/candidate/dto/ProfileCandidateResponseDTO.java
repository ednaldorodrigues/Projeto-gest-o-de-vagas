package br.com.ednaldo.gestao_vendas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {
    
    private UUID id;

    @Schema( example = "John Doe")
    private String name;

    @Schema(example = "John")
    private String username;

    @Schema(example = "johndoe@example.com")
    private String email;

    @Schema(example = "Desenvolvedor Java")
    private String description;
}
