package lorenzofoschetti.u5d7.services;


import lorenzofoschetti.u5d7.entities.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {

    private List<Author> authorsList = new ArrayList<>();

    public Author saveAuthor(Author body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 999999));
        body.setAvatar("https://ui-avatars.com/api/?name=" + body.getName() + body.getSurname());
        this.authorsList.add(body);
        return body;
    }

    public List<Author> getAuthorsList() {
        return this.authorsList;
    }
}
