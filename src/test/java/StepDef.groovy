import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Дано(~/^При выборе части тела нужно ввести номер  согласно выданному списку |(\d+)|$/) { int arg1 ->
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
    }
}
Когда(~/^Пользователь ввел правильное число |(\d+)|$/) { int arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Тогда(~/^Выводим вопросы согласно выбранному пункту$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}