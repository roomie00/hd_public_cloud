package com.roomie.db_connect_spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Member extends Timestamped {
    @Id
    private String id;

    @Column(length = 18, nullable=false)
    private String name;

    @Builder

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
