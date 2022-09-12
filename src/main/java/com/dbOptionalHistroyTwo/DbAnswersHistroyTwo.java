package com.dbOptionalHistroyTwo;

import java.sql.*;

public class DbAnswersHistroyTwo {

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

    public void answerForOnePartQuestionOne() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=1");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForOnePartQuestionTwo() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=2");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }

    public void answerForTwoPartQuestionOne() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=3");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForTwoPartQuestionTwo() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=4");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForThreePartQuestionOne() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=5");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForThreePartQuestionTwo() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=6");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForFourPartQuestionOne() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=7");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForFourPartQuestionTwo() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=8");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForFivePartQuestionAll() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=9");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForSixPartQuestionAll() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=10");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForSevenPartQuestionOne() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=11");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForSevenPartQuestionTwo() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=12");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForEightPartQuestionAll() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=13");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForNinePartQuestionOne() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=14");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForNinePartQuestionTwo() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=15");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForTenPartQuestionOne() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=16");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForTenPartQuestionTwo() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=17");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    public void answerForElevenPartQuestionAll() throws SQLException {

        String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE id=18");

        ResultSet resultSet = statement.executeQuery(SelectQuery);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString("text") + " "
            );
        }

        resultSet.close();
    }
    }

