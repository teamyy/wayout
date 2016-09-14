package com.github.teamyy.wayout.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "articles")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private Long id;

    @Column(name = "title", nullable = false, columnDefinition = "TEXT")
    private String title;

    @Column(name = "content", nullable = false, columnDefinition = "LONGTEXT")
    private String content;

    @Column(name = "writer", nullable = false, length = 64)
    private String writer;

    @Column(name = "url", unique = true, nullable = false, length = 240)
    private String url;

    @Column(name = "category", nullable = false, length = 32)
    private String category;

    @Column(name = "writed_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date writedAt;

    @Column(name = "modified_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private List<ArticleImage> articleImages;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private List<ArticleTag> articleTags;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private List<Favorite> favorites;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private List<Feedback> feedbacks;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private List<Review> reviews;

}
