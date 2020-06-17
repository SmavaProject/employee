package com.example.team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMembersRepository extends CrudRepository<TeamMembers, String> {
}
