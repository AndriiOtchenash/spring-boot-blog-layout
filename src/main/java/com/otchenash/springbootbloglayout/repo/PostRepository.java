package com.otchenash.springbootbloglayout.repo;

import com.otchenash.springbootbloglayout.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {
}
