# CYCLES ANNOTATION

  ### FOR
 
 __For__ - у циклі ми вводимо початкову [ і = 0 ]. Тому що в будь який масив
 починається з нульового індексу. Після чого ми задаємо умови циклу, що 
 [ і < args.length ]. Аrgs.length - розмір масиву. Це зроблено для того щоб 
 цикл не виходив за межі масиву і зупинявся на потрібній нам величині. І 
 остання операція яку ми робимо з масивом це змінюємо розмір [ і ++ ] 
 пысля кожного кола циклу, це для того щоб цикл рухався і не стояв на місці. 
 Після кожного кола ми виводимо значення масиву за допомогою команди Sout.

    for (int i = 0; i < args.length; i++) {<br>
        System.out.println(args[i]);<br>
    }

  ### WHILE
 
 __While__ - цей цикл працює по принципу "True", "False". В даному циклі
 ми задаємо змінну [ і = 0 ] початкове значення зі значенням "True". Після 
 чого також задаємо умови циклу що [ і < args.length ]. Аrgs.length - розмір
 масиву. Після чого наш цикл проходить коло, ми виводимо значення масиву за 
 допомогою Sout і після того як ми вивели значення масиву ми можемо перейди 
 до наступного значення масиву за допомогою команди [ і ++ ]. І тільки після 
 цього коло починається наново. І коли в нас змінна виходе за рамки умов цикл
 видає значення "False" і цикл зупиняється.

    int i = 0;
    while (i < args.length) {
        System.out.println(args[i]);
        i++;
    }
 
  ### DO WHILE

 __Do While__ - цей цикл використовує початкову змінну [ а = 0 ]. 
 Після оголошення цієї змінної починається цикл __Do__ який одразу виводить 
 значення першого значення масиву. Після він збільшує початкову змінну на 
 вказане число в нашому випадку на 1 [ а ++ ]. Після вище вказаних операцій 
 вмикається цикл __While__ який робить кінцеву перевірку [ а < args.length ] 
 псля як цикл виконав перевірку і ніяких заперечень не має він починає коло 
 наново.

    іnt a = 0;
    do{
       System.out.println(args[a]);
       a++;
    } while(a < args.length);

  ### RECURSION 

 __Recursion__ - це процес, за допомогою якого функція або метод викликає 
 себе знову і знову. Ця функція, що викликається знову і знову, прямо чи 
 опосередковано, називається “рекурсивною функцією”. В кінці циклу ми 
 вводимо функцію вихіду з циклу.

    private static void recursion(String[] array, int i) {
        System.out.println(array[i]);

        if (i + 1 < array.length) {
            recursion(array, i + 1);
        }
    }
 ## Вхідні дані

![Photo 1](Docs/Images/Вхідні данні.png)

 ## Вихідні дані

![Photo 2](Docs/Images/Вихідні данні.png)