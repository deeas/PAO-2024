package jdbc.repository;



import jdbc.config.DatabaseConfiguration;
import jdbc.entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRepositoryUsingPreparedStatement {
    public void insertPerson(String name, double age) {
        String insertPersonSql = "INSERT INTO persons(name, age) VALUES(?, ?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, age);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Person getPersonById(int id) {
        String selectSql = "SELECT * FROM persons WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToPerson(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updatePersonName(String name, int id) {
        String updateNameSql = "UPDATE persons SET name=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateNameSql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Person mapToPerson(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            return new Person(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getDouble(3));
        }
        return null;
    }
}
