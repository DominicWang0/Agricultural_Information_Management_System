/**
 * @version 1.0
 * @Author Dominic Wang
 * @Date 2025/3/29 16:02
 * @注释
 */
public class UserController {
    private UserService userService;
    public boolean login(int userId,  String userPassword) {
        return userService.validateUser(userId, userPassword);
    }
}
