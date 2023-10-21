package me.dio.service.imp;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import me.dio.service.userService;
import me.dio.santander.model.user;
import me.dio.santander.repository.userRepository;

@Service    
public class userServiceImp implements userService {

    private final userRepository userRepository;

    public userServiceImp(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public user findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public user create(user userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("Conta ja existente.");
        }
        return userRepository.save(userToCreate);
    }
}
