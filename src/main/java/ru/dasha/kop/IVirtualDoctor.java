package ru.dasha.kop;

public interface IVirtualDoctor {

    default void welcome() {
        System.out.println("Здравствуйте, вас приветствует альфа версия ПО виртуальный доктор \"DocPlus\" ");
    }

    void printTitle();

    void printQuestions();

    void diagnosis(int number);

    int countQuestions();

}
