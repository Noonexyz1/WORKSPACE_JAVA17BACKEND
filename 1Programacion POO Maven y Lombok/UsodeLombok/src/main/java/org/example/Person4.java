package org.example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.Value;

import java.time.LocalDate;

@Value
@RequiredArgsConstructor
@ToString(includeFieldNames = false)
public class Person4 {
    Long id;
    @NonNull    //este valor nunca puede estar nullo
                //tambien puedo trabajarlo con @Data pero @RequiredArgsCo.. requiere que los artribtos sean finales
                //entonces, nonnull generara un Constructor con este atributo unico
    String name;
    @NonNull    //ahora tengo un constructor con estos dos parametros
    String lastName;
    String email;
    Integer age; //ahora son tres
    Integer phoneNumber;
    LocalDate dateOfBirth;

    //Los DTOs son clases inmutables
}