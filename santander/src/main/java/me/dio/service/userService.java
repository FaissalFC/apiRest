package me.dio.service;

import me.dio.santander.model.user;

public interface userService {
    
    user findById(long Id);
    user create(user userToCreate);
}
