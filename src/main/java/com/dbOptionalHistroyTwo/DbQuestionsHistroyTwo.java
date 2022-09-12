package com.dbOptionalHistroyTwo;

import com.dbOptionalHistroyOne.DbConnect;

import java.sql.*;

public class DbQuestionsHistroyTwo {
    Connection connection;

    {
        try {
            connection = DriverManager
                    .getConnection("jdbc:postgresql://194.67.105.79:5432/java_serega_db",
                            "java_serega_user", "12345");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    Statement statement;

    {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void introPart() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=1");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void partOne() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=2");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
        public void partTwo() throws SQLException {
            String SelectQuery = String.format("SELECT * FROM questions WHERE id=3");

            ResultSet resultSet = statement.executeQuery(SelectQuery);
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("text") + " "
                );
            }

            resultSet.close();
        }
    public void partThree() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=4");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partFour() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=5");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partFive() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=6");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partSix() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=7");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partSeven() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=8");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partEight() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=9");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partNine() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=10");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partTen() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=11");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partEleven() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=12");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void partEnd() throws SQLException {
        String SelectQuery = String.format("SELECT * FROM questions WHERE id=13");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    }



