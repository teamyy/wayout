package com.github.teamyy.wayout.repository;

import com.github.teamyy.wayout.model.entity.Feedback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends PagingAndSortingRepository<Feedback, Long> {
}
