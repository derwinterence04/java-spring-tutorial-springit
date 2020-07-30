package com.derwin.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.derwin.springit.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
