package com.app.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Validated  //Para validaciones anidadas
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    @NotBlank
    private String name;

    @NotBlank
    @Size(min = 3, max = 10)
    private String city;

}
