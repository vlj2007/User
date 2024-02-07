package pro.sky.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.users.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
