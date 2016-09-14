package com.github.teamyy.wayout.repository;

import com.github.teamyy.wayout.model.entity.ArticleImage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleImageRepository extends PagingAndSortingRepository<ArticleImage, Long> {

}
