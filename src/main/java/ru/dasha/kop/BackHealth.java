package ru.dasha.kop;

import java.util.ArrayList;
import java.util.List;

public class BackHealth implements IVirtualDoctor {
    public static final int PLUS_ONE = 1;
    private List<String> questions;
    private final static String LOIN_PAIN = "Боль в пояснице?";
    private final static String STRESS_PAIN = "Боль в спине при нагрузке?";
    private final static String PERIOD_PAIN = "Воспаление седалищного нерва?";
    private List<String> answers;
    private final static String ARTRITT = "Артрит позвоночника";
    private final static String ARTROZ = "Артроз позвоночника";
    private final static String ISHIAZ = "Ишиас";
    @Override
    public void printTitle() {
        System.out.println("2) Спина");
    }

    public BackHealth() {
        questions = new ArrayList<>();
        questions.add(LOIN_PAIN);
        questions.add(STRESS_PAIN);
        questions.add(PERIOD_PAIN);
        answers = new ArrayList<>();
        answers.add(ARTRITT);
        answers.add(ARTROZ);
        answers.add(ISHIAZ);
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
