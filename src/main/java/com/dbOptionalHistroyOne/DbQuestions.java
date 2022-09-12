package com.dbOptionalHistroyOne;

import java.sql.*;


public class DbQuestions {

    public void PartOne() throws SQLException {

        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=1");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionOne() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=3");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionOne2() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=2");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartTwo() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=4");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionTwo() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=5");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionTwo2() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=6");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartThree() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=7");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionThree() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=8");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionThree2() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=9");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionThree3() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=10");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionThree4() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=11");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartFour() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=12");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionFour() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=13");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionFour2() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=14");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartFive() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=15");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionFive() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=16");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionFive2() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=17");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartSix() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=18");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionSix() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=19");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionSix2() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=20");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartSeven() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=21");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionSeven() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=22");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void PartAnswerOnQuestionSeven2() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

        String SelectQuery = String.format("SELECT * FROM questions WHERE id=23");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

}