package com.github.teamyy.wayout.repository;

import com.github.teamyy.wayout.model.entity.ArticleTag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleTagRepository extends PagingAndSortingRepository<ArticleTag, Long> {
}
