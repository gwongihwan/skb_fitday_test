package com.skb.fitday.springboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {

    private String name;
    private String isbn13;
    private String isbn10;

    // IntelliJ + Lombok + Junit 에서 에러가 발생함.
    // IntelliJ 설정에서 Annotaion Processors 메뉴에 Enable annotation processing 체크 해주면 동작함.
    // Lombok 쒯!

    /*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }
    */
}
