package core.service.user;

import core.model.user.User;
import util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private Connection connection;

    public UserService() {
        connection = DbUtil.getConnection();
    }

    public void addUser(User user) {

        try {

            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO user(id, firstName, lastName, username, password) values (?, ?, ?, ?, ?)");

            preparedStatement.setLong(1, user.getId());

            preparedStatement.setString(2, user.getFirstName());

            preparedStatement.setString(3, user.getLastName());

            preparedStatement.setString(4, user.getUsername());

            preparedStatement.setString(5, user.getPassword());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void deleteUser(Long userId) {

        try {

            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from users where userId=?");

            preparedStatement.setLong(1, userId);

            preparedStatement.executeUpdate();


        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void updateUser(User user) {

        try {

            PreparedStatement preparedStatement = connection
                    .prepareStatement("update users set firstName=?, lastName=?, username=?, password=?" +
                            "where userId=?");

            preparedStatement.setLong(1, user.getId());

            preparedStatement.setString(2, user.getFirstName());

            preparedStatement.setString(3, user.getLastName());

            preparedStatement.setString(4, user.getUsername());

            preparedStatement.setString(5, user.getPassword());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public List<User> getAllUsers() {

        List<User> users = new ArrayList<User>();

        try {

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from users");

            while (resultSet.next()) {

                User user = new User();

                user.setId();

                user.setFirstName(resultSet.getString("firstName"));

                user.setLastName(resultSet.getString("lastName"));

                user.setUsername(resultSet.getString("username"));

                user.setUsername(resultSet.getString("password"));

                users.add(user);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return users;

    }

    public User getUserById(Long userId) {

        User user = new User();

        try {

            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from users where userId=?");

            preparedStatement.setLong(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                user.setId();

                user.setFirstName(resultSet.getString("firstName"));

                user.setLastName(resultSet.getString("lastName"));

                user.setUsername(resultSet.getString("username"));

                user.setPasword(resultSet.getString("password"));

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return user;

    }
}
