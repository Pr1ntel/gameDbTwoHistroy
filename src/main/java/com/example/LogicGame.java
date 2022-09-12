package com.example;

import com.dbOptionalHistroyOne.DbAnswers;
import com.dbOptionalHistroyOne.DbConnect;
import com.dbOptionalHistroyOne.DbQuestions;
import com.dbOptionalHistroyTwo.DbAnswersHistroyTwo;
import com.dbOptionalHistroyTwo.DbHistroyPart;
import com.dbOptionalHistroyTwo.DbQuestionsHistroyTwo;

import java.sql.SQLException;
import java.sql.Statement;

public class LogicGame {


    public void histroyTwo() throws SQLException {
        int moneyVito = 150;
        DbQuestionsHistroyTwo dbQuestions = new DbQuestionsHistroyTwo();
        DbAnswersHistroyTwo dbAnswers = new DbAnswersHistroyTwo();
        DbHistroyPart histroyPart = new DbHistroyPart();
        dbQuestions.introPart();
        histroyPart.introPartOne();
        dbQuestions.partOne();
        int choosePartOne = Util.inputInt("Choose: ", 1, 2);
        if (choosePartOne == 1) {
            dbAnswers.answerForOnePartQuestionOne();
            moneyVito += 50;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartTwo();
            dbQuestions.partTwo();
        } else {
            dbAnswers.answerForOnePartQuestionTwo();
            moneyVito += 800;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartTwo();
            dbQuestions.partTwo();
        }
        int choosePartTwo = Util.inputInt("Choose: ", 1, 2);
        if (choosePartTwo == 1) {
            dbAnswers.answerForTwoPartQuestionOne();
            moneyVito += 1500;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartThree();
            dbQuestions.partThree();
        } else {
            dbAnswers.answerForTwoPartQuestionTwo();
            moneyVito += 800;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartThree();
            dbQuestions.partThree();
        }
        int choosePartThree = Util.inputInt("Choose: ", 1, 2);
        if (choosePartThree == 1) {
            dbAnswers.answerForThreePartQuestionOne();
            moneyVito += 2000;
            System.out.println("Ваши деньги = " + moneyVito + "$");
        } else {
            dbAnswers.answerForThreePartQuestionTwo();
            moneyVito += 500;
            System.out.println("Ваши деньги = " + moneyVito + "$");
        }
        if (moneyVito >= 2000) {
            System.out.println("Вы хорошо зарабатываете работая на семью Клементе и отдаете долг, но в один день все меняется.");
            System.out.println("Вас у дома поджидают копы и выставляют обвинение в краже камне в ювелирном магазине, из-за чего вы попадаете в тюрьму.");
            histroyPart.introPartFour();
            dbQuestions.partFour();
        } else {
            System.out.println("Кто то видел вас грабящим ювелирный магазин и настучал копам.");
            System.out.println("С вас требуют много денег, но из-за оплаты долга семьи вы не можете его оплатить. Вы попадаете в тюрьму.");
            histroyPart.introPartFour();
            dbQuestions.partFour();
        }
        int choosePartFour = Util.inputInt("Choose: ", 1, 2);
        if (choosePartFour == 1) {
            dbAnswers.answerForFourPartQuestionOne();
            histroyPart.introPartFive();
            dbQuestions.partFive();
        } else {
            dbAnswers.answerForFourPartQuestionTwo();
            histroyPart.introPartFive();
            dbQuestions.partFive();
        }
        moneyVito = 0;
        int choosePartFive = Util.inputInt("Choose: ", 1, 2);
        if (choosePartFive == 1) {
            dbAnswers.answerForFivePartQuestionAll();
            moneyVito += 1500;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartSix();
            dbQuestions.partSix();
        } else {
            dbAnswers.answerForFivePartQuestionAll();
            moneyVito += 1500;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartSix();
            dbQuestions.partSix();
        }
        int choosePartSix = Util.inputInt("Choose: ", 1, 2);
        if (choosePartSix == 1) {
            dbAnswers.answerForSixPartQuestionAll();
            moneyVito += 1000;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartSeven();
            dbQuestions.partSeven();
        } else {
            histroyPart.introPartSeven();
            dbQuestions.partSeven();
        }
        int choosePartSeven = Util.inputInt("Choose: ", 1, 2);
        if (choosePartSeven == 1) {
            dbAnswers.answerForSevenPartQuestionOne();
            moneyVito += 900;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartEight();
            dbQuestions.partEight();
        } else {
            dbAnswers.answerForSevenPartQuestionTwo();
            moneyVito += 800;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartEight();
            dbQuestions.partEight();
        }
        int choosePartEight = Util.inputInt("Choose: ", 1, 2);
        if (choosePartEight == 1) {
            dbAnswers.answerForEightPartQuestionAll();
            histroyPart.introPartNine();
            dbQuestions.partNine();
        }else {
            dbAnswers.answerForEightPartQuestionAll();
            histroyPart.introPartNine();
            dbQuestions.partNine();
        }
        int choosePartNine = Util.inputInt("Choose: ", 1, 2);
        if (choosePartNine == 1){
            dbAnswers.answerForNinePartQuestionOne();
            histroyPart.introPartTen();
            dbQuestions.partTen();
        }else{
            dbAnswers.answerForNinePartQuestionTwo();
            histroyPart.introPartTen();
            dbQuestions.partTen();
        }
        int choosePartTen = Util.inputInt("Choose: ", 1, 2);
        if (choosePartTen == 1){
            dbAnswers.answerForTenPartQuestionOne();
            moneyVito+=20000;
            System.out.println("Ваши деньги = " + moneyVito + "$");
            histroyPart.introPartEleven();
            dbQuestions.partEleven();
        }else {
            dbAnswers.answerForTenPartQuestionTwo();
            histroyPart.introPartEleven();
            dbQuestions.partEleven();
        }
        int choosePartEleven = Util.inputInt("Choose: ", 1, 2);
        if (choosePartEleven == 1){
            dbAnswers.answerForElevenPartQuestionAll();
            histroyPart.introPartEnd();
            dbQuestions.partEnd();
        }else {
            dbAnswers.answerForElevenPartQuestionAll();
            histroyPart.introPartEnd();
            dbQuestions.partEnd();
        }
    }

    public void histroyOne() throws SQLException {
        DbQuestions dbQuestions = new DbQuestions();
        DbAnswers dbAnswers = new DbAnswers();

        dbQuestions.PartOne();
        dbAnswers.AnswersParthOne();

        int choosePartOne = Util.inputInt("Choose: ", 1, 2);

        if (choosePartOne == 1) {
            dbQuestions.PartAnswerOnQuestionOne2();
            dbQuestions.PartTwo();
            dbAnswers.AnswersParthTwo();
        } else {
            dbQuestions.PartAnswerOnQuestionOne();
            dbQuestions.PartTwo();
            dbAnswers.AnswersParthTwo();
        }

        int choosePartTwo = Util.inputInt("Choose: ", 1, 2);

        if (choosePartTwo == 1) {
            dbQuestions.PartAnswerOnQuestionTwo();
            dbQuestions.PartThree();
            dbAnswers.AnswersParthThree();
        } else {
            dbQuestions.PartAnswerOnQuestionTwo2();
            dbQuestions.PartThree();
            dbAnswers.AnswersParthThree();
        }

        int choosePartThree = Util.inputInt("Choose: ", 1, 4);

        if (choosePartThree == 1) {
            dbQuestions.PartAnswerOnQuestionThree();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        } else if (choosePartThree == 2) {
            dbQuestions.PartAnswerOnQuestionThree2();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        } else if (choosePartThree == 3) {
            dbQuestions.PartAnswerOnQuestionThree3();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        } else {
            dbQuestions.PartAnswerOnQuestionThree4();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        }

        int choosePartFour = Util.inputInt("Choose: ", 1, 2);

        if (choosePartFour == 1) {
            dbQuestions.PartAnswerOnQuestionFour();
            dbQuestions.PartFive();
            dbAnswers.AnswersParthFive();
        } else {
            dbQuestions.PartAnswerOnQuestionFour2();
            dbQuestions.PartFive();
            dbAnswers.AnswersParthFive();
        }

        int choosePartFive = Util.inputInt("Choose: ", 1, 2);

        if (choosePartFive == 1) {
            dbQuestions.PartAnswerOnQuestionFive();
            dbQuestions.PartSix();
            dbAnswers.AnswersParthSix();
        } else {
            dbQuestions.PartAnswerOnQuestionFive2();
            dbQuestions.PartSix();
            dbAnswers.AnswersParthSix();
        }

        int choosePartSix = Util.inputInt("Choose: ", 1, 2);

        if (choosePartSix == 1) {
            dbQuestions.PartAnswerOnQuestionSix();
            dbQuestions.PartSeven();
            dbAnswers.AnswersParthSeven();
        } else {
            dbQuestions.PartAnswerOnQuestionSix2();
            dbQuestions.PartSeven();
            dbAnswers.AnswersParthSeven();
        }

        int choosePartSeven = Util.inputInt("Choose: ", 1, 2);

        if (choosePartSeven == 1) {
            dbQuestions.PartAnswerOnQuestionSeven();
        } else {
            dbQuestions.PartAnswerOnQuestionSeven2();
        }


    }


}