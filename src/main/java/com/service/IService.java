package com.service;

import com.exception.DuplicateEmailException;

import java.util.Optional;

public interface IService <T> {
    Iterable<T> findAll();

    void save(T t) throws DuplicateEmailException;

    Optional<T> findById(Long id);

    void remove(Long id);
}
