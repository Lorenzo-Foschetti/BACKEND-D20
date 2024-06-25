package lorenzofoschetti.u5d7.controllers;


import lorenzofoschetti.u5d7.entities.Blogpost;
import lorenzofoschetti.u5d7.services.BlogpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class BlogpostController {

    @Autowired
    private BlogpostService blogpostService;


    @GetMapping
    //GET per tornare tutti i blogpost
    private List<Blogpost> getAllBlogPosts() {
        return this.blogpostService.getBlogPostList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
//POST per creare un nuovo blogpost
    private Blogpost saveBlogPost(@RequestBody Blogpost body) {

        return this.blogpostService.saveBlogPost(body);
    }

    @GetMapping("/{blogPostId}")
    //GET per cercare tramite id
    private Blogpost findById(@PathVariable int blogPostId) {
        return this.blogpostService.findById(blogPostId);
    }

    @PutMapping("{blogPostId}")
    //PUT attraverso la quale andiamo a modificare un elemento
    private Blogpost FindByIdAndUpdate(@PathVariable int blogPostId, @RequestBody Blogpost body) {
        return this.blogpostService.findByIdAndUpdate(blogPostId, body);
    }

    @DeleteMapping("{blogPostId}")
    private void fibdByIdAndDelete(@PathVariable int blogPostId) {
        this.blogpostService.findByIdAndDelete(blogPostId);
    }

}
