```
Para practicar TDD se proponen una serie de ejercios, estos deberan realizarse respetando los ciclos Red, Green y Blue
Se debe trabajar de al menos 2 personas. 
Utilize Pomodoros de 25 Minutos
````
# Tablero de Tenis

Ejemplos:
* "0 - 0"
* "15 - 0"
* "30 - 0"
* "40 - 0"
* "Ganador Jugador 1"
 
>Sin Tiebreak

# String Calculator

1) Crear un metodo con la siguiente definicion int add(String numbers)
El metodo retornara un entero (int) con la suma de los numeros incluidos
Puede sumar 0 , 1 , 2 o 3 numeros.

Ejemplo:
* "" or "1" or "1,2" or "8,3,9" 
* El caso de "" retorna
* El caso de "1,2" retorna 3
* El caso de "8,3,9" Retorna 20

2) Agrega el soporte del caracter "New Line" \n

Ejemplo: 
* "1\n2,3" Retorna 3

3) Agrega si cualquier numero es negativo imprimir por pantalla un "ERROR el numero x es negativo" y retornar -1


# Tablero de Bowling
1) Crea un metodo public void tirar(int pinosDerribados) y un metodo public int total()
2) En un partido de bowling hay 10 turnos, en cada turno puede tirar hasta 2 veces (tira 2 veces solo si no tira los 10 pinos en el primer intento), y existen 3 opciones para sumar puntos, 
* Opcion 1:
    Tira menos de 10 pinos utilizando los 2 tiros
* Opcion 2:
    Tira 10 pinos utilizando 2 tiros (suma 10 + (Pinos del proximo tiro))
* Opcion 3
    Tira 10 pinos(chuza) con su primer tiro (suma 10 + los proximos 2 tiradas de pinos)

> Aclaracion, en caso que en el turno 10 tire chuza, tiene un 2 tiros extras

Tips por donde arrancar:
Asumir que nunca se van a tirar mas de 12 veces (en el mejor de los casos)
Asumir que pinosDerribados es un valor entreo 0 y 10

1) Peor Juego , 10 tiros, 0 pinos, 0 puntos
2) Juego Perfecto, 12 tiros 10 pinos, 300 puntos.



 Problem Description

Imagine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your Maths teacher decides he should make his class more "fun" by introducing a "game". He explains that he is going to point at each pupil in turn and ask them to say the next number in sequence, starting from one. The "fun" part is that if the number is divisible by three, you instead say "Fizz" and if it is divisible by five you say "Buzz". So now your maths teacher is pointing at all of your classmates in turn, and they happily shout "one!", "two!", "Fizz!", "four!", "Buzz!"... until he very deliberately points at you, fixing you with a steely gaze... time stands still, your mouth dries up, your palms become sweatier and sweatier until you finally manage to croak "Fizz!". Doom is avoided, and the pointing finger moves on.

So of course in order to avoid embarassment infront of your whole class, you have to get the full list printed out so you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for breaktime. Next maths lesson is on Thursday. Get coding!

Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz?".

Sample output:

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100

Stage 2 - new requirements

 * A number is fizz if it is divisible by 3 or if it has a 3 in it
 * A number is buzz if it is divisible by 5 or if it has a 5 in it

        Map<String,String> mapa = new HashMap<String, String>() {{
            put("a","b");
        }};

1       | "I"
            2       | "II"
            3       | "III"
            4       | "IV"
            5       | "V"
            6       | "VI"
            7       | "VII"
            8       | "VIII"
            9       | "IX"
            10      | "X"
            11      | "XI"
            12      | "XII"
            13      | "XIII"
            14      | "XIV"
            15      | "XV"
            16      | "XVI"
            17      | "XVII"
            18      | "XVIII"
            19      | "XIX"
            20      | "XX"
            21      | "XXI"
            22      | "XXII"
            23      | "XXIII"
            24      | "XXIV"
            25      | "XXV"
            26      | "XXVI"
            27      | "XXVII"
            28      | "XXVIII"
            29      | "XXIX"
            30      | "XXX"
            31      | "XXXI"
            32      | "XXXII"
            33      | "XXXIII"
            34      | "XXXIV"
            35      | "XXXV"
            36      | "XXXVI"
            37      | "XXXVII"
            38      | "XXXVIII"
            39      | "XXXIX"
            40      | "XL"
            41      | "XLI"
            42      | "XLII"
            43      | "XLIII"
            44      | "XLIV"
            45      | "XLV"
            46      | "XLVI"
            47      | "XLVII"
            48      | "XLVIII"
            49      | "XLIX"
            50      | "L"
            51      | "LI"
            52      | "LII"
            53      | "LIII"
            54      | "LIV"
            55      | "LV"
            56      | "LVI"
            57      | "LVII"
            58      | "LVIII"
            59      | "LIX"
            60      | "LX"
            61      | "LXI"
            62      | "LXII"
            63      | "LXIII"
            64      | "LXIV"
            65      | "LXV"
            66      | "LXVI"
            67      | "LXVII"
            68      | "LXVIII"
            69      | "LXIX"
            70      | "LXX"
            71      | "LXXI"
            72      | "LXXII"
            73      | "LXXIII"
            74      | "LXXIV"
            75      | "LXXV"
            76      | "LXXVI"
            77      | "LXXVII"
            78      | "LXXVIII"
            79      | "LXXIX"
            80      | "LXXX"
            81      | "LXXXI"
            82      | "LXXXII"
            83      | "LXXXIII"
            84      | "LXXXIV"
            85      | "LXXXV"
            86      | "LXXXVI"
            87      | "LXXXVII"
            88      | "LXXXVIII"
            89      | "LXXXIX"
            90      | "XC"
            91      | "XCI"
            92      | "XCII"
            93      | "XCIII"
            94      | "XCIV"
            95      | "XCV"
            96      | "XCVI"
            97      | "XCVII"
            98      | "XCVIII"
            99      | "XCIX"
            100      | "C"