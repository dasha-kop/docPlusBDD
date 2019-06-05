import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Дано(~/^При выборе части тела нужно ввести номер  согласно выданному списку |(\d+)|$/) { int arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Когда(~/^Пользователь ввел правильное число |(\d+)|$/) { int arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Тогда(~/^Выводим вопросы согласно выбранному пункту$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}