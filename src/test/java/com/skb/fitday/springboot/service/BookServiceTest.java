package com.skb.fitday.springboot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test(expected = RuntimeException.class)
    public void testFindById() {
        Long id = 1L;
        bookService.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
    }

}