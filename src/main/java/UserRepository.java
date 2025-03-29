import java.util.Optional;

/**
 * @version 1.0
 * @Author Dominic Wang
 * @Date 2025/3/29 15:46
 * @注释
 */
public interface UserRepository {
    Optional<UserAccount> findById(int id); // 根据id查找用户
}
