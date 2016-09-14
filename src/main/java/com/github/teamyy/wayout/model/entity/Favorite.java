package com.github.teamyy.wayout.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Table(name = "favorites")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private Long id;

    @Column(name = "article_id", nullable = false, length = 20)
    private Long articleId;

    @Column(name = "user_id", nullable = false, length = 20)
    private Long userId;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="article_id", nullable=false, updatable=false)
    private Article article;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false, updatable=false)
    private User user;
}
