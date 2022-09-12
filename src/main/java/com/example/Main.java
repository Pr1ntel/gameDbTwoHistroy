package com.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {



        LogicGame logicGame = new LogicGame();



            int start = Util.inputInt( "Выбирайте рассказ: 1 - история Геральта, 2 - история Вито и Джо",1,2 );

            if (start == 1) {
                logicGame.histroyOne();
            }else {
                logicGame.histroyTwo();
        }

        // logicGame.histroyOne();




//        Connection connection = DriverManager
//                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
//                        "java_eqxonee2_user", "123456");
//
//        Statement statement = connection.createStatement();
//String SelectQuery;
//
////         String insertQuery = String.format(Locale.US,"insert into authors (name, age, rating) values ('%s',%d,%f)", "name", 83, 2.8);
////
////        statement.executeUpdate(insertQuery);
////
////       // String deleteQuery = String.format("delete from authors where rating = 2.8");
////        //statement.executeUpdate(deleteQuery);
////
////
////        String updateQuery = String.format("update authors set age=age+10 where id=20");
////        statement.executeUpdate(updateQuery);
////
////
////
////        String query = String.format("SELECT * FROM authors ORDER BY id ASC ");
////
////        ResultSet resultSet = statement.executeQuery(query);
////
////        while (resultSet.next()) {
////            System.out.println(
////                    resultSet.getInt("id") + " " +
////                            resultSet.getString("name") + " " +
////                            resultSet.getInt("age") + " " +
////                            resultSet.getDouble("rating")
////            );
////        }
////
////        resultSet.close();
//
//
//
//
//
//         SelectQuery = String.format("SELECT * FROM questions WHERE id=1");
//
//
//        ResultSet resultSet = statement.executeQuery(SelectQuery);
//
//
//        while (resultSet.next() ) {
//            System.out.println(
//                  //  resultSet.getInt("id") + " " +
//                            resultSet.getString("text") + "  "
//            );
//        }
//        resultSet.close();
//         SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 1");
//
//        ResultSet resultSet2 = statement.executeQuery(SelectQuery);
//        while (resultSet2.next()) {
//            System.out.println(
//                    resultSet.getInt("id") + " " +
//                            resultSet.getString("text") + " "
//            );
//        }
//
//
//
//
//        resultSet2.close();
//
//
//      //  String SelectQuery2 = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 1");
//
//
//

    }



}


