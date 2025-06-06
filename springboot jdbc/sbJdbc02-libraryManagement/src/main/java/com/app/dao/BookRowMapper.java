package com.app.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.entity.Book;

public class BookRowMapper implements RowMapper<Book> {


    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {

        Book book = new Book();
        book.setBookId(rs.getLong("book_id"));
        book.setName(rs.getString("name"));
        book.setAuthor(rs.getString("author"));
        book.setAvailable(rs.getBoolean("available"));
        book.setDescription(rs.getString("description"));
        book.setPricePerDay(rs.getDouble("price_per_day"));
        book.setPenaltyPerDay(rs.getDouble("penalty_per_day"));
        return book;
    }
}