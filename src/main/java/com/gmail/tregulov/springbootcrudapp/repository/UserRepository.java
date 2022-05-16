package com.gmail.tregulov.springbootcrudapp.repository;
import com.gmail.tregulov.springbootcrudapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
