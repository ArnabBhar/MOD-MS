package com.mod.repository;

import com.mod.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDetailsEntity, Integer> {
    @Query(value="select * from user_details user where user.user_email = ?1 ",nativeQuery = true)
    UserDetailsEntity searchUserName(String userName);

    @Query(value="update actors actor set actor.actor_status = true where actor.user_id = ?1 ",nativeQuery = true)
    void unblockUser(Integer id);
}
