package com.dians.BankomatiVoBitolaJavaSpring.Service;

import com.dians.BankomatiVoBitolaJavaSpring.Model.ATMPosts;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ATMPostsService {
    List<ATMPosts> getAllATMPosts();
}
