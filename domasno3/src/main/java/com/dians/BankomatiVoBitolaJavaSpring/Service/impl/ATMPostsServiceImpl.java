package com.dians.BankomatiVoBitolaJavaSpring.Service.impl;

import com.dians.BankomatiVoBitolaJavaSpring.Model.ATMPosts;
import com.dians.BankomatiVoBitolaJavaSpring.Repository.ATMPostRepository;
import com.dians.BankomatiVoBitolaJavaSpring.Service.ATMPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ATMPostsServiceImpl implements ATMPostsService {

    public final ATMPostRepository atmPostRepository;


    public ATMPostsServiceImpl(ATMPostRepository atmPostRepository) {
        this.atmPostRepository = atmPostRepository;
    }

    @Override
    public List<ATMPosts> getAllATMPosts() {
        List<ATMPosts> allAtmPosts = atmPostRepository.findAll();
        return allAtmPosts;
    }
}
