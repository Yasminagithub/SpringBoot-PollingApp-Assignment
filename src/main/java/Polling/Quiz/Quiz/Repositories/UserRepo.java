package Polling.Quiz.Quiz.Repositories;

import Polling.Quiz.Quiz.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
