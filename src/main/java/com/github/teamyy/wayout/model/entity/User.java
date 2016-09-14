package com.github.teamyy.wayout.model.entity;

import com.github.teamyy.wayout.model.entity.addon.Gender;
import com.github.teamyy.wayout.model.entity.addon.UserStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "users")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private Long id;

    @Column(name = "user_group_id", nullable = false, length = 20)
    private Long userGroupId;

    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @Column(name = "nickname", nullable = false, length = 32)
    private String nickname;

    @Column(name = "gender", nullable = false, length = 1)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "birthday", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;

    @Column(name = "status", nullable = false, length = 4)
    @Enumerated(EnumType.ORDINAL)
    private UserStatus status;

    @ManyToOne
    @JoinColumn(name="user_group_id", nullable=false, updatable=false)
    private UserGroup userGroup;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Favorite> favorites;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Feedback> feedbacks;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Review> reviews;
}
