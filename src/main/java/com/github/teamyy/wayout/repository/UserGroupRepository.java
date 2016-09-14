package com.github.teamyy.wayout.repository;

import com.github.teamyy.wayout.model.entity.UserGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends PagingAndSortingRepository<UserGroup, Long> {
}
