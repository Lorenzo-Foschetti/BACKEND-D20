package lorenzofoschetti.u5d7.controllers;

import lorenzofoschetti.u5d7.entities.Author;
import lorenzofoschetti.u5d7.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping

    private List<Author> getAllAuthors() {
        return this.authorService.getAuthorsList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    private Author saveAuthor(@RequestBody Author body) {

        return this.authorService.saveAuthor(body);
    }

}
