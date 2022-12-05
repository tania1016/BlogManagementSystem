package com.wiley.BlogManagementSystem.dao;

import com.wiley.BlogManagementSystem.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BlogRepository extends JpaRepository <Blog, Integer> {
}
