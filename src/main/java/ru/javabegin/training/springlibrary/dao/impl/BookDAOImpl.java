package ru.javabegin.training.springlibrary.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.javabegin.training.springlibrary.dao.interfaces.BookDAO;
import ru.javabegin.training.springlibrary.entities.Author;
import ru.javabegin.training.springlibrary.entities.Book;
import ru.javabegin.training.springlibrary.entities.Genre;

import java.util.List;

@Component
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional
//    @Override
    public List<Book> getBooks() {
        List<Book> bookList =  sessionFactory.getCurrentSession()
                .createCriteria(Book.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return bookList;
    }

//    @Override
    public List<Book> getBooks(Author author) {
        return null;
    }

//    @Override
    public List<Book> getBooks(String bookName) {
        return null;
    }

//    @Override
    public List<Book> getBooks(Genre genre) {
        return null;
    }

//    @Override
    public List<Book> getBooks(Character letter) {
        return null;
    }

}
