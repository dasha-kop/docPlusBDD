import cucumber.api.PendingException
import ru.dasha.kop.BackHealth
import ru.dasha.kop.HeadHealth
import ru.dasha.kop.Therapist

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)


Когда(~/^Пользователь ввел правильное число |(\d+)|$/) { int arg1 ->
    BackHealth backHealth = new BackHealth()
    HeadHealth headHealth = new HeadHealth()
    Therapist therapist

    headHealth.welcome()
    switch (arg1) {
        case 1:
            therapist = new Therapist(headHealth)
            break
        case 2:
            therapist = new Therapist(backHealth)
            break
            therapist.printQuestions()
    }
}
Тогда(~/^Выводим вопросы согласно выбранному пункту$/) { ->
    BackHealth backHealth = new BackHealth()
    backHealth.printQuestions()
}

Когда(~/^Пользователь ввел не праильное число |(\d+)|$/) { int arg1 ->
    BackHealth backHealth = new BackHealth()
    HeadHealth headHealth = new HeadHealth()
    Therapist therapist

    headHealth.welcome()
    switch (arg1) {
        case 1:
            therapist = new Therapist(headHealth)
            break
        case 2:
            therapist = new Therapist(backHealth)
            break
            therapist.printQuestions()
        default: System.out.println("Попробуйте еще разок")
    }

}
Тогда(~/^Выоводится сообщение "([^"]*)"$/) { String arg1 ->
    System.out.println("Попробуйте еще разок")
}
Тогда(~/^Предлагают ввести заного$/) { ->
    System.out.println("Попробуйте еще разок")
    Scanner ine = new Scanner(System.in)
    String str = ine.next()
}
