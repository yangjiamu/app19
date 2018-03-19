package service;

import domain.Book;
import domain.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wenjie yang on 2018/3/19.
 */
public interface BookService {
    List<Category> getAllCategories();
    Category getCaegory(long id);
    List<Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(long id);
    long getNextId();
}
