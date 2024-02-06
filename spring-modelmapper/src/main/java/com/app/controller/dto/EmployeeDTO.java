package com.app.controller.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotNull(message = "El campo nombre no puede ser null")
    private String name;

    @NotNull
    @Size(min = 3, max = 10) //Para un minimo y maximo de caracteres
    private String lastName;

    @NotBlank
    @Email
    private String email;

    //@CreditCardNumber para validar tarjetas de credito
    private Long phone;

    @Min(18)
    @Max(25)
    private byte age;

    @Digits(integer = 2, fraction = 3)  //maximo dos digitos enteros con tres decimales maximo
    private double height;

    //@AssertFalse
    @AssertTrue //unicamente se acepta TRUE
    private boolean married;

    //@NotEmpty se usa para validar si una lista esta vacia, como minimo una fila o valor dentro

    //@Past para validar unicamente fechas pasadas a la actual
    //@Future para validar unicamente fechas futuras a la actual
    private LocalDate dateOfBirth;

    /*COMO VALIDAR OBJETOS ANIDADOS*/
    @Valid
    private DepartmentDTO departmentDTO;



}
