import java.util.Optional;

/**
 * @version 1.0
 * @Author Dominic Wang
 * @Date 2025/3/29 15:47
 * @注释
 */
public class UserService {
    private UserRepository userRepository;

    public boolean validateUser(int userId, String userPassword) {
        Optional<UserAccount > userOptional = userRepository.findById(userId);
        return userOptional.isPresent() && userOptional.get().getPassword().equals(userPassword);
    }
}
