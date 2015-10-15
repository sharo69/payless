package com.payless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by nikola_kaloyanov on 10/14/15.
 */
@RestController
@RequestMapping("dai")
public class Aaaaa {

    @Autowired
    private UserRepository rep;

    @Autowired
    private UserRolesRepository rolesRepository;

    @RequestMapping("/")
    public List<User> dai() {
        rep.save(createUser());
        List<User> list = new ArrayList<>();
        rep.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    private User createUser()
    {
        User u = new User();
        long time = System.currentTimeMillis();

        u.setEmail("nikola-"+time+"@test.com");
        u.setPassword("123456");
        u.setUsername("nikola-"+time+"@test.com");
        Set<UserRole> roles = new HashSet<>();
        roles.add(new UserRole("opala"));
        u.setRoles(roles);

        return u;

    }

}
