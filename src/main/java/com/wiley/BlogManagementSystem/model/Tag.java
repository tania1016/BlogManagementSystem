package com.wiley.BlogManagementSystem.model;



import jakarta.persistence.*;
import java.util.Objects;



@Entity
@Table(name="Tag")

public class Tag  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int tag_id;

    @Column
    private String tag_name;




    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tag tag = (Tag) o;

        if (tag_id != tag.tag_id) return false;
        return Objects.equals(tag_name, tag.tag_name);
    }

    @Override
    public int hashCode() {
        int result = tag_id;
        result = 31 * result + (tag_name != null ? tag_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return tag_name;
    }
}
