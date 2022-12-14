package com.example.desafio_quality.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyRequestDTO {
    @NotBlank(message = "O nome da propriedade não pode estar vazio.")
    @Pattern(regexp = "([A-Z]{1}[a-zA-Z0-9_ \\-]+\\s??)+", message = "O nome da propriedade deve começar com a letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    private String propName;

    private int districtId;

    @NotEmpty(message = "O campo não pode estar vazio.")
    private List<@Valid RoomRequestDTO> rooms;
}
