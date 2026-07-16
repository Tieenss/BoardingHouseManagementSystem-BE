package com.example.boardinghouse.features.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLandlordIdAndRole(Long landlordId, String role);
    Optional<User> findByPhone(String phone);
    Optional<User> findByIdAndLandlordId(Long id, Long landlordId);
}
