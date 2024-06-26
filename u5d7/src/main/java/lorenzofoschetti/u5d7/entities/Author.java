package lorenzofoschetti.u5d7.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

@ToString
public class Author {
    private int id;

    private String name;

    private String surname;

    private String email;

    private LocalDate dataDiNascita;

    private String avatar;

    public Author(String name, String surname, String email, LocalDate dataDiNascita, String avatar) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.avatar = avatar;
    }
}
