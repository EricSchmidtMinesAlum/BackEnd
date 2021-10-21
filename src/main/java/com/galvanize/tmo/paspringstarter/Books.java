
package com.galvanize.tmo.paspringstarter;



import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

//create class with:
//id
//title
//author
//yearPublishedpublished

@Entity
public class Books {
    //can't delete individual books, so no need to keep track of vacant ids
    private @Id @GeneratedValue Long id;
    private String author;
    private String title;
    @JsonProperty("yearPublished")
    private Integer yearPublished;

    Books(){};
    Books(String author,String title, Integer yearPublished){
        this.author=author;
        this.title=title;
        this.yearPublished=yearPublished;
    }

    //temp settters adn getters below
    public Long getId() {
        return this.id;
      }
    
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setYear(Integer newYear){
        this.yearPublished=newYear;
    }
    public Integer getYear(){
        return this.yearPublished;
    }




    @Override
    public String toString() {
    return "{" + "id=" + this.id + ", author='" + this.author + ", title='" + this.title +", yearPublished='" + this.yearPublished +'}';
    }

    @Override
    public boolean equals(Object o) {
  
      if (this == o)
        return true;
      if (!(o instanceof Books))
        return false;
        Books employee = (Books) o;
      return Objects.equals(this.id, employee.id) && Objects.equals(this.author, employee.author)
          && Objects.equals(this.title, employee.title)&& Objects.equals(this.yearPublished, employee.yearPublished);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.author, this.title,this.yearPublished);
    }
}