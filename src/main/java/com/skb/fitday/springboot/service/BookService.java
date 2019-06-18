package com.skb.fitday.springboot.service;

import java.util.Optional;

public interface BookService {

    Optional<Object> findById(Long id);

}
