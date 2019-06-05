package ru.dasha.kop;

import java.util.ArrayList;
import java.util.List;

public class HeadHealth implements IVirtualDoctor {

    private static final int PLUS_ONE = 1;
    private List<String> questions;
    private final static String FORVARD_SIDE = "Боль в передней части головы?";
    private final static String BACK_SIDE = "Боль в задней части головы?";
    private final static String PERIOD_PAIN = "Переодические головные боли?";
    private List<String> answers;
    private final static String SCULL = "Внутречерепное кровоизлияние";
    private final static String ALKOGOL = "Алкогольная энцефалопатия";
    private final static String MIGREN = "Мигрень";
    @Override
    public void printTitle() {
        System.out.println("1) Голова");
    }

    public HeadHealth() {
        questions = new ArrayList<>();
        questions.add(FORVARD_SIDE);
        questions.add(BACK_SIDE);
        questions.add(PERIOD_PAIN);
        answers = new ArrayList<>();
        answers.add(SCULL);
        answers.add(ALKOGOL);
        answers.add(MIGREN);
    }

    @Override
    public void printQuestions() {
        int i = 0;
        for (String each :
                questions) {
            System.out.println(i++ + PLUS_ONE + ") " + each);
        }
    }

    @Override
    public void diagnosis(int number) {
        System.out.println("Поздравляем у вас " + answers.get(number));
    }

    @Override
    public int countQuestions() {
        return questions.size();
    }
}
