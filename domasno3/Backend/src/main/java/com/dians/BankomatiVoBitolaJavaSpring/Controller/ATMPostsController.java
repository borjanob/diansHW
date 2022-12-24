package com.dians.BankomatiVoBitolaJavaSpring.Controller;

import com.dians.BankomatiVoBitolaJavaSpring.Model.ATMPosts;
import com.dians.BankomatiVoBitolaJavaSpring.Service.ATMPostsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin
public class ATMPostsController {

   private final ATMPostsService atmPostsService;

    public ATMPostsController(ATMPostsService atmPostsService) {
        this.atmPostsService = atmPostsService;
    }

    @GetMapping
    public List<ATMPosts> getAllPosts(){
        return  atmPostsService.getAllATMPosts();
    }
}
