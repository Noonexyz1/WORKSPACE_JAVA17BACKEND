package org.example;

import lombok.*;

import java.time.LocalDate;

//@Value //genera metodos getters pero no seters!! asi controlas la inmutabilidad y tambien los attr son finales
@Data
@RequiredArgsConstructor    //obliga a iniciar un valor por defecto a los atributos marcados con final
                            //y tambien obliga a llnar de valor a atributos que esten marcados como noeMull
public class Person3 {
    Long id;
    @NonNull    //este valor nunca puede estar nullo
                //tambien puedo trabajarlo con @Data pero @RequiredArgsCo.. requiere que los artribtos sean finales
                //entonces, nonnull generara un Constructor con este atributo unico
    String name;
    @NonNull    //ahora tengo un constructor con estos dos parametros
    String lastName;
    String email;
    final Integer age; //ahora son tres
    Integer phoneNumber;
    LocalDate dateOfBirth;

    //Los DTOs son clases inmutables
}