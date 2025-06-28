package com.repository;

@Repository
public  interface UserRepository extends JpaRepositry<user, Long> {
    Optional<User> findByEmail(String email);
}