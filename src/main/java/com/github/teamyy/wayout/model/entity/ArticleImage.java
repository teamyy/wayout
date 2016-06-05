package com.github.teamyy.wayout.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Table(name = "article_images")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ArticleImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private Long id;

    @Column(name = "article_id", nullable = false, insertable = false, updatable = false)
    private Long articleId;

    @Column(name = "image_url", nullable = false, length = 240)
    private String imageUrl;

    @Column(name = "modified_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;
}
