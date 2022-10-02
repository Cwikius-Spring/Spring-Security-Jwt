package com.ossez.spring.security.models.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Person Entity
 *
 * @author YuCheng Hu
 */


@Entity
@Getter
@Setter
@Accessors(chain = true)
//@Table(name = "person", uniqueConstraints = {@UniqueConstraint(columnNames = "user_name"), @UniqueConstraint(columnNames = "user_email")})
public class Person extends AbstractPersistable<Long> {

    @NotBlank
    @Size(max = 20)
    private String userName;

    @NotBlank
    @Size(max = 120)
    private String userPassword;

    @NotBlank
    @Email
    private String userEmail;

    ////    @ManyToMany(fetch = FetchType.LAZY)
////    @JoinTable(name = "person_role", joinColumns = @JoinColumn(name = "id"))
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<PersonRole> personRoles;
}
