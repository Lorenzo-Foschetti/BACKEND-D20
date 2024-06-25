package lorenzofoschetti.u5d7.services;

import lorenzofoschetti.u5d7.entities.Blogpost;
import lorenzofoschetti.u5d7.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogpostService {

    private List<Blogpost> blogPostList = new ArrayList<>();


    public Blogpost saveBlogPost(Blogpost body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 999999));
        this.blogPostList.add(body);
        return body;
    }

    public List<Blogpost> getBlogPostList() {
        return this.blogPostList;
    }

    public Blogpost findById(int id) {
        Blogpost blogPostFound = null;
        for (Blogpost blogpost : this.blogPostList) {
            if (blogpost.getId() == id) blogPostFound = blogpost;
        }
        if (blogPostFound == null) throw new NotFoundException(id);
        else return blogPostFound;
    }

    public Blogpost findByIdAndUpdate(int id, Blogpost updatedBlogPost) {
        Blogpost found = null;
        for (Blogpost blogPost : this.blogPostList) {
            if (blogPost.getId() == id) {
                found = blogPost;
                //found.setName(updatedUser.getName());
                found.setCategory(updatedBlogPost.getCategory());
                found.setCover(updatedBlogPost.getCover());
                found.setTitle(updatedBlogPost.getTitle());
                found.setContent(updatedBlogPost.getContent());
                found.setLectureTime(updatedBlogPost.getLectureTime());
            }
        }
        if (found == null) throw new NotFoundException(id);
        else return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Blogpost> iterator = this.blogPostList.iterator();

        while (iterator.hasNext()) {
            Blogpost current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }
}
