package com.github.teamyy.wayout.model.entity;

import com.github.teamyy.wayout.model.entity.addon.FeedbackEmotion;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Table(name = "feedbacks")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private Long id;

    @Column(name = "article_id", nullable = false, length = 20)
    private Long articleId;

    @Column(name = "user_id", nullable = false, length = 20)
    private Long userId;

    @Column(name = "emotion", nullable = false, length = 1)
    @Enumerated(EnumType.STRING)
    private FeedbackEmotion emotion;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "modified_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @ManyToOne
    @JoinColumn(name="article_id", nullable=false, updatable=false)
    private Article article;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false, updatable=false)
    private User user;
}
