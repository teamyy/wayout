package com.github.teamyy.wayout.model.entity.addon;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum FeedbackEmotion {
    B("Bad"), L("Like");

    String fullname;

    FeedbackEmotion(String fullname) {
        this.fullname = fullname;
    }
}
