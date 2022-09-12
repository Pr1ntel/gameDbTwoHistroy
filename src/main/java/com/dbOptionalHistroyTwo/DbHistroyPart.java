package com.dbOptionalHistroyTwo;

import java.sql.*;

public class DbHistroyPart {
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
    public void introPartOne() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 2");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartTwo() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 3");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartThree() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 4");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartFour() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 5");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartFive() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 6");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartSix() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 7");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartSeven() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 8");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartEight() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 9");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartNine() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 10");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartTen() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 11");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartEleven() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 12");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    public void introPartEnd() throws SQLException {
        String SelectQuery = String.format("SELECT part FROM questions WHERE id = 13");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("part") + " "
            );
        }

        resultSet.close();
    }
    }

