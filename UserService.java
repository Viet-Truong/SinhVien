/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import SinhVien.User;
import SinhVien.UserDao;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author AD
 */
public class UserService {
    private UserDao userNgu;
    public UserService(){
        userNgu = new UserDao();
    }
    public List<User> getAllUser() throws SQLException{
        return userNgu.getAllUsers();
    }
    public void addUser(User user) throws SQLException{
        userNgu.addUser(user);
    }
}
