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

    public Author(int id, String name, String surname, String email, LocalDate dataDiNascita) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.setAvatar("https://ui-avatars.com/api/?name=" + this.getName() + this.getSurname());
    }
}
