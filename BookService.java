package com.apps.bookfarm.service;

import com.apps.bookfarm.model.Book;

public interface BookService {
    public void addNewBook(Book book);

    public void removeBook(Long id);

    public Iterable<Book> getBook();
}
