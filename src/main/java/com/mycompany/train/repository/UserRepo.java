package com.mycompany.train.repository;

import com.mycompany.train.aop.anotation.MapResult;
import com.mycompany.train.entiry.User;
import com.mycompany.train.model.UserModel;
import jakarta.persistence.EntityResult;
import jakarta.persistence.SqlResultSetMappings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @MapResult
    @Query(nativeQuery = true, value = " SELECT * FROM users ")
    List<Map<String,Object>> findsdsds(Integer ID);

    interface Test{
        String getUsername();

    }

    List< Test> getAllByPassword(String password);
}
