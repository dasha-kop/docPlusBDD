package ru.dasha.kop;

public class Therapist {
    private IVirtualDoctor virtualDoctor;

    public Therapist(IVirtualDoctor virtualDoctor) {
        this.virtualDoctor = virtualDoctor;
    }

    public void printQuestions(){
        virtualDoctor.printQuestions();
    }

    public int getCount(){
        return virtualDoctor.countQuestions();
    }

    public void getAnswer(int num){
        virtualDoctor.diagnosis(num);
    }

}
