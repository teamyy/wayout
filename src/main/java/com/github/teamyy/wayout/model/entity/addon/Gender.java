package com.github.teamyy.wayout.model.entity.addon;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Gender {
    F("Female"), M("Male");

    String fullname;

    Gender(String fullname) {
        this.fullname = fullname;
    }
}
