package com.example.clinic.dao;


import com.example.clinic.model.User;

import java.util.Collection;

public interface UserDAO extends AbstractDAO<User>{
    User getByLogin(String login);

    Collection<User> findAll();

}
