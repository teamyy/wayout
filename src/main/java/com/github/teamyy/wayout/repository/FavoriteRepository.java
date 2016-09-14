package com.github.teamyy.wayout.repository;

import com.github.teamyy.wayout.model.entity.Favorite;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteRepository extends PagingAndSortingRepository<Favorite, Long> {

}
