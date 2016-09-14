package com.github.teamyy.wayout.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Table(name = "article_tags")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ArticleTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private Long id;

    @Column(name = "article_id", nullable = false, length = 20)
    private Long articleId;

    @Column(name = "tag", nullable = false, length = 64)
    private String tag;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="article_id", nullable=false, updatable=false)
    private Article article;
}
