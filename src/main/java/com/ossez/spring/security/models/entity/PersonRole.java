package com.ossez.spring.security.models.entity;

import com.ossez.spring.security.models.ERole;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PersonRole extends AbstractPersistable<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole personRoleKey;
}