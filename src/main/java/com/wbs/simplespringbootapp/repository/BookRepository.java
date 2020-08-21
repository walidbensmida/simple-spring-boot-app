package com.wbs.simplespringbootapp.repository;
import java.util.List;
import com.wbs.simplespringbootapp.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
