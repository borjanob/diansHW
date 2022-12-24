package com.dians.BankomatiVoBitolaJavaSpring.Repository;

import com.dians.BankomatiVoBitolaJavaSpring.Entity.ATM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ATMRepository extends JpaRepository<ATM, Long> {
}
