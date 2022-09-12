package com.dbOptionalHistroyOne;

import java.sql.*;

public class DbAnswers {

    public void AnswersParthOne() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 1");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }

    public void AnswersParthTwo() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 4");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }

    public void AnswersParthThree() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 7");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }

    public void AnswersParthFour() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 12");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }

    public void AnswersParthFive() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 15");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }

    public void AnswersParthSix() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 18");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }

    public void AnswersParthSeven() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 21");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }
}