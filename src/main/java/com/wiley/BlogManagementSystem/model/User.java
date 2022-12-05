package com.wiley.BlogManagementSystem.model;


import jakarta.persistence.*;
import java.util.Objects;


@Entity
@Table(name="user")

public class User {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int user_id;

    @Column
    private String user_name;

    @Column
    private String role;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (user_id != user.user_id) return false;
        if (!Objects.equals(user_name, user.user_name)) return false;
        return Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        int result = user_id;
        result = 31 * result + (user_name != null ? user_name.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
