package service;

import domain.Book;
import domain.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenjie yang on 2018/3/19.
 */
@Service
public class BookServiceImpl implements BookService{
    private List<Category> categories;
    private List<Book> books;

    public BookServiceImpl() {
        categories = new ArrayList<Category>();
        Category category1 = new Category(1, "Computing");
        Category category2 = new Category(2, "Travel");
        Category category3 = new Category(3, "Health");
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);

        books = new ArrayList<Book>();
        books.add(new Book(1L, "9780980839623", "Servlet & JSP", category1, "Budi"));
        books.add(new Book(2L, "9780980839624", "Spring MVC", category1, "Jame"));
    }

    public List<Category> getAllCategories() {
        return categories;
    }

    public Category getCaegory(long id) {
        for (Category category : categories) {
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book save(Book book) {
        book.setId(getNextId());
        books.add(book);
        return book;
    }

    public Book update(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == book.getId()){
                books.set(i, book);
                return book;
            }
        }
        return book;
    }

    public Book get(long id) {
        for (Book book : books) {
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public long getNextId() {
        long maxId = 0l;
        for (Book book : books) {
            if(book.getId() > maxId){
                maxId = book.getId();
            }
        }
        return maxId + 1;
    }
}
