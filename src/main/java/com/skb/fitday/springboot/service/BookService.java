package com.skb.fitday.springboot.service;

import com.skb.fitday.springboot.domain.Book;

import java.util.Optional;

public interface BookService {

    Optional<Book> findById(Long id);

}
