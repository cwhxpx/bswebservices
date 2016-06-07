package com.babblesnap.ws;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by cwh on 7/06/2016.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
