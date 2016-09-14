package com.github.teamyy.wayout.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Table(name = "user_groups")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private Long id;

    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @Column(name = "name", nullable = true, columnDefinition = "TEXT")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userGroup")
    private List<User> users;

}
