/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

/**
 *
 * @author pupil
 */
public class Book {
    private String caption;// конструктор для того что бы охарактеризовать класс : название у книги - тип данных будет string_ имя у переменно - caption
    private Author[] author;// автор один, что бы много было мы создаем массив авторов
    private int publishedYear;
    public Book() { 
        //вручную создаем методы для полей.с помощью этих методов мы можем изменить состояние класса INSERT CODE - GETTER AND SETTER
        
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    
}
