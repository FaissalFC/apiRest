package me.dio.santander.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import me.dio.santander.model.user;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
    
        boolean existsByAccountNumber(String accountNumber);

}
 