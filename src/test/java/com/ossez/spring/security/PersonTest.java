package com.ossez.spring.security;

import com.ossez.spring.security.models.entity.Person;
import com.ossez.spring.security.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author YuCheng Hu
 */
@Transactional
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
public class PersonTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Commit
    void testQueryPerson() {

        Person person = userRepository.findByUserName("huyuchengus").stream().findFirst().orElse(null);

        log.debug("Get Person Email - [{}]", person.getUserEmail());
        log.debug("ROLEs - [{}]", person.getPersonRoles().size());
    }

}