# Spring completion demo

1. Spring beans auto-injection using completion
    1. Open `org.example.springCompletionDemo.checkBeansCompletion.DayGreeting` class
    2. Inside the method body, type `user`:
       the completion should be shown that contains the `userService` bean name, select it and observe the results
    3. Then type `greeting`, select `greeting` and then one of implementations. Observe the results.
2. Spring JPA repository method completion inside the repository interface
    1. Open the `org.example.springCompletionDemo.checkWithExistingRepository.PersonRepository` class
    2. type `findBy`:
        the completion for the possible variants should appear. Start creating the method from the suggested variants.
3. Spring JPA repository method creating from the repository reference
    1. Open the `org.example.springCompletionDemo.checkWithExistingRepository.PersonRestController` class
    2. Inside the `getAllStudents()` method body type the repository reference (`personRepository`) 
    3. type `.` and get the completion for methods, including the not existing ones.
    4. using completion compose the method that should find all person with the specific occupation, 
       use `"student"` as the created method argument.
    5. observe the results in the repository class
4. Spring JPA repository creation from completion
    1. Open the `org.example.springCompletionDemo.checkWithExistingRepository.PersonRestController` class
    2. Inside the `test()` method body type `teamRepo`:
       the completion should appear suggesting the `teamRepository` item
    3. Select it, from the completion drop-down select any repository type variant, for example the
       `JpaRepository`. Observe the results.