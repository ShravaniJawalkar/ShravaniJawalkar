package org.example.userservice.Repository;

import org.example.userservice.Dao.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByUsernameAfterAndPassword(String usernameAfter, String password);
}
