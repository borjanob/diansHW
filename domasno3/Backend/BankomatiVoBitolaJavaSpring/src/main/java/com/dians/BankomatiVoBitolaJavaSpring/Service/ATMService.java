package com.dians.BankomatiVoBitolaJavaSpring.Service;

import com.dians.BankomatiVoBitolaJavaSpring.Entity.ATM;

import java.util.List;
import java.util.Optional;

public interface ATMService {
    List<ATM> getAllAtm();
    Optional<ATM> saveAll(String name, String address, String city);

}
