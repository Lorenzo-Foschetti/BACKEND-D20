package lorenzofoschetti.u5d7.entities;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Blogpost {

    private int id;

    private String title;

    private String category;

    private String cover;

    private String content;

    private int lectureTime;


}
