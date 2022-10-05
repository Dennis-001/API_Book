
package com.apps.bookfarm.serviceimpl;

import com.apps.bookfarm.model.Author;
import com.apps.bookfarm.model.Book;
import com.apps.bookfarm.repository.BookRepository;
import com.apps.bookfarm.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Override
    public void addNewBook(Book book) {
        List<Book> optionalAuthor = BookRepository.findByTitle(book.getTitle());
        if(!optionalAuthor.isEmpty()){
            throw new IllegalStateException("Author already exists");
        }else {
            BookRepository.save(book)
        }
    }

    @Override
    public void removeBook(Long id) {

    }

    @Override
    public Iterable<Book> getBook() {
        return null;
    }
}
