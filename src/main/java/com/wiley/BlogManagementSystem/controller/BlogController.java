package com.wiley.BlogManagementSystem.controller;


import com.wiley.BlogManagementSystem.dao.BlogRepository;
import com.wiley.BlogManagementSystem.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller

public class BlogController {


    @Autowired
    BlogRepository blogRepo;


    @GetMapping("blogs")
    public String showBlogList(Model model){
        List<Blog> blogList = blogRepo.findAll();
        model.addAttribute("blogList", blogList);
        return "blogs";
    }


}
