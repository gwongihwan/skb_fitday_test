package com.skb.fitday.springboot.service;

import com.skb.fitday.springboot.domain.Book;
import com.skb.fitday.springboot.domain.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }
}
