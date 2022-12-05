package com.wiley.BlogManagementSystem.model;



import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.*;


@Entity
@Table(name="Blog")

public class Blog {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int blog_id;

    @Column
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "DATE")
    private LocalDate date;

    @Column
    private boolean isApproved;

    @ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "BlogTag",joinColumns = {@JoinColumn(name = "blog_id")},
            inverseJoinColumns = {@JoinColumn(name = "tag_id")})
    private Set<Tag> tags = new HashSet<>();


    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public Set<Tag> getTag() {
        return tags;
    }

    public void setTag(Set<Tag> tag) {
        this.tags = tag;
    }


    public void addTag(Tag tag){
        this.tags.add(tag);
    }
    public void removeTag(Tag tag){
        this.tags.remove(tag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Blog blog = (Blog) o;

        if (blog_id != blog.blog_id) return false;
        if (isApproved != blog.isApproved) return false;
        if (!Objects.equals(title, blog.title)) return false;
        if (!Objects.equals(body, blog.body)) return false;
        if (!Objects.equals(date, blog.date)) return false;
        return Objects.equals(tags, blog.tags);
    }

    @Override
    public int hashCode() {
        int result = blog_id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (isApproved ? 1 : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blog_id=" + blog_id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", date=" + date +
                ", isApproved=" + isApproved +
                ", tags=" + tags +
                '}';
    }
}
