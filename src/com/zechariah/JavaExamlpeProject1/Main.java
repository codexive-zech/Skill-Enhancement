package com.zechariah.JavaExamlpeProject1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        /* 1. How To Print an Integer Entered by User*/
        /*System.out.print("Enter A Number: ");
        int number1 = reader.nextInt();
        System.out.println("The User Number is " + number1);*/

        /* 2. Multiply Two Floating Point*/
        /*System.out.print("Enter The First Number: ");
        float number1 = reader.nextFloat();
        System.out.print("Enter The second Number: ");
        float number2 = reader.nextFloat();
        float total;
        total = number1 * number2;
        System.out.println("The Total Multiplication is " + total);*/

        /* 3. Compute Quotient and Remainder*/
        /*System.out.print("Enter The Divider : ");
        int divider = reader.nextInt();
        System.out.print("Enter The Divisor : ");
        int divisor = reader.nextInt();

        int quotient = divider / divisor;
        int remainder = divider % divisor;
        System.out.println("The Quotient Total is " + quotient);
        System.out.println("The Remainder Total is " + remainder);*/

        /* 4. Program to Swap Two Numbers*/
        /*System.out.println("Before Swapping...");
        System.out.print("Enter Your First Number: ");
        float first = reader.nextFloat();
        System.out.println("The First Number is " + first);
        System.out.print("Enter Your Second Number: ");
        float second = reader.nextFloat();
        System.out.println("The Second Number is " + second);

        float temporary = first;
        first = second;
        second = temporary;

        System.out.println("The New First Number is " + first);
        System.out.println("The New Second Number is " + second);*/

        /* 5. Check whether a Number is Even or Odd*/
        /*System.out.print("Enter A Number: ");
        int number = reader.nextInt();
        if (number % 2 == 0){
            System.out.println("The Number " + number + " is an Even Number");
        } else {
            System.out.println("The Number " + number + " is an Odd Number");
        }*/

        /* 6. Check Whether an Alphabet is a Vowel or Consonant*/
        /*System.out.print("Enter an Alphabet: ");
        char letter = reader.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println(letter + " is a Vowel Alphabet");
        } else {
            System.out.println(letter + " is a Consonant Alphabet");
        }

     //   Using Switch Statement

        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Is Vowel Alphabet");
                break;
            default:
                System.out.println("Is Consonant Alphabet");
        }*/

        /* 7. Find Largest among Three Numbers*/
        /*System.out.print("Enter First Number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = reader.nextInt();
        System.out.print("Enter Third Number: ");
        int thirdNumber = reader.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println("The First Number " + firstNumber + " is the Largest Number");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println("The Second Number " + secondNumber + " is the Largest Number");
        } else {
            System.out.println("The Third Number " + thirdNumber + " is the Largest Number");
        }*/

        /* 8. Root of Quadratic Equation*/
        /*System.out.print("Enter First Equation: ");
        double a = reader.nextDouble();
        System.out.print("Enter Second Equation: ");
        double b = reader.nextDouble();
        System.out.print("Enter Third Equation: ");
        double c = reader.nextDouble();

        double root1, root2, determinant;
        determinant = b * b - 4 * a * c;
        System.out.println("The Determinant is " + determinant);

        if (determinant > 0){
            root1 = (- b + Math.sqrt(determinant)) / (2 / a);
            root2 = (- b - Math.sqrt(determinant)) / (2 / a);
            System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (determinant == 0){
            root1 = root2 = - b / (2 * a);
            System.out.printf("root1 = root2 = %.2f;");
        } else {
            double realPart = - b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginary, realPart, imaginary);
        }*/

        /* 9. Check if Number is Positive or Negative*/
        /*System.out.print("Enter A Number: ");
        double number = reader.nextDouble();
        if (number > 0.0){
            System.out.println(number + " is a Positive Number");
        } else if (number < 0.0){
            System.out.println(number + " is a Negative Number");
        } else {
            System.out.println(number + " is Zero");
        }*/

        /* 10. Check whether a character is an Alphabet or Not*/
        /*System.out.print("Enter an Alphabet: ");
        char alpha = reader.next().charAt(0);
        if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')){
            System.out.println(alpha + " is an Alphabet");
        } else {
            System.out.println(alpha + " is not an Alphabet");
        }*/

        /* To check for Capital and Small letter*/
        /*System.out.print("Enter Alphabet To Check: ");
        char checkAlpha = reader.next().charAt(0);
        if (checkAlpha >= 'a' && checkAlpha <= 'z'){
            System.out.println(checkAlpha + " is a Small Letter");
        } else if (checkAlpha >= 'A' && checkAlpha <= 'Z'){
            System.out.println(checkAlpha + " is a Capital Letter");
        } else {
            System.out.println(checkAlpha + " is Not an Alphabet");
        }*/

        /* 11. calculate the sum of Natural Numbers */
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println("The Sum is " + sum);*/

        /* 12. Find Factorial of a Number*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.printf("The Factorial of %d = %d ", number, factorial);*/

        /*Using BigInter var declaration*/
        /*System.out.print("Enter a Number: ");
        int facNumber = reader.nextInt();
        BigInteger bigFactorial = BigInteger.ONE;
        for (int i = 1; i <= facNumber; i++){
            bigFactorial = bigFactorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("The Factorial 0f %d = %d ", facNumber, bigFactorial);*/

        /* 13. Check Leap Year*/
        /*System.out.print("Enter a Year: ");
        int year = reader.nextInt();
        boolean leap = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;

        if (leap){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }*/

        /* 14. To Generate Multiplication Table*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        System.out.println("The " + number + " Multiplication Table");
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d *%d = %d\n", number, i, number * i);
        }

        /*Using While Loop*/
        /*System.out.print("Enter a Number: ");q
        int numb = reader.nextInt();
        System.out.println("The " + numb + " Multiplication Table");
        int j = 1;
        while (j <= 10){
            System.out.printf("%d * %d = %d\n", numb, j, numb * j);
            j++;
        }*/

        /* 15. Display Fibonacci Series*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int term1 = 0;
        int term2 = 1;
        System.out.print("First " + number + " terms: ");
        for (int i = 1; i <= number; i++){
            System.out.printf(term1 + "+");
            int sum = term1 + term2;
            term1 = term2;
            term2 = sum;
        }*/

        /* 16. Find HCF or GCD of Two Numbers*/
        /*System.out.print("Enter First Number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = reader.nextInt();
        System.out.print("Enter GCD: ");
        int gcd = reader.nextInt();

        for (int i = 1; i <= firstNumber && i <= secondNumber; i++){
            if (firstNumber % i == 0 && secondNumber % i == 0)
                gcd = i;
        }
        System.out.printf("The HCF of %d and %d is %d", firstNumber, secondNumber, gcd);*/

        /* 17. Calculate LCM using HCF*/
        /*System.out.print("Enter First Number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = reader.nextInt();
        System.out.print("Enter GCD: ");
        int gcd = reader.nextInt();
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++){
            if (firstNumber % i == 0 && secondNumber % i == 0)
                gcd = i;
        }
        int lcm = (firstNumber * secondNumber) / gcd;
        System.out.printf("The LCM of %d and %d = %d", firstNumber, secondNumber, lcm);*/

        /* 18. Display Character from A to Z*/
        /*Capital Letter*/
        /*char alpha;
        for (alpha = 'A'; alpha <= 'Z'; alpha++){
            System.out.println(alpha);
        }*/

        /*Small Letter*/
        /*char alphaSmall;
        for (alphaSmall = 'a'; alphaSmall <= 'z'; alphaSmall++){
            System.out.println(alphaSmall);
        }*/

        /* 19. Reverse a Number using While*/
        /*int number = 291837465;
        int reverse = 0;
        while (number != 0){
            int value = number % 10;
            reverse = reverse * 10 + value;
            number /= 10;
        }
        System.out.println(reverse);*/

        /*using For Loop*/
        /*int number = 291837465;
        int reversed = 0;
        for (; number != 0; number /= 10){
            int value = number % 10;
            reversed = reversed * 10 + value;
        }
        System.out.println("The Reverse is " + reversed);*/

        /* 20. Calculate the Power of a Number using while loop*/
        /*System.out.print("Enter a Base: ");
        int base = reader.nextInt();
        System.out.print("Enter an Exponent: ");
        int exponent = reader.nextInt();
        long result = 1;
        while (exponent != 0){
            result *= base;
            --exponent;
        }
        System.out.println(result);*/

        /*using for Loop*/
        /*System.out.print("Enter a Base: ");
        int base = reader.nextInt();
        System.out.print("Enter an Exponent: ");
        int exponent = reader.nextInt();
        long result = 1;
        for (; exponent != 0; --exponent){
            result *= base;
        }
        System.out.println(result);*/

        /*using the Power fun*/
        /*System.out.print("Enter a Base: ");
        int base = reader.nextInt();
        System.out.print("Enter an Exponent: ");
        int exponent = reader.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println(result);*/

        /* 21. Check whether Number is Palindrome or Not using While Loop*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int reverserInteger = 0;
        int remainder;
        int originalInteger;

        originalInteger = number;

        while (number != 0){
            remainder = number % 10;
            reverserInteger = reverserInteger * 10 + remainder;
            number /= 10;
        }
        if (originalInteger == reverserInteger){
            System.out.println(originalInteger + " is a Palindrome");
        } else {
            System.out.println(originalInteger + " is Not a Palindrome");
        }*/

        /*using For Loop*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int reversedInteger = 0;
        int remainder;
        int originalInteger;

        originalInteger = number;
        for (; number != 0; number /= 10){
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }

        if (originalInteger == reversedInteger){
            System.out.println(originalInteger + " is a Palindrome");
        } else {
            System.out.println(originalInteger + " is Not a Palindrome");
        }*/

        /* 22. Check if a Number is Prime or Not (using For Loop)*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        boolean flag = false;
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(number + " is a Prime Number");
        } else
            System.out.println(number + " is Not a Prime Number");
        }*/

        /* using While Loop*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        boolean flag = false;
        int i = 2;
        while (i <= number/2){
            if (number % i == 0){
                flag = true;
                break;
            }
            i++;
        }

        if (!flag){
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is Not a Prime Number");
        }*/

        /* 23. Find Frequency of Character in a String using For Loop*/
        /*String sentence = "if ada is a girl and obi is a boy who is adaobi";
        char ch = 'i';
        int frequency = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (ch == sentence.charAt(i))
                frequency++;
        }
        System.out.println("The Frequency of " + ch + " is " + frequency);*/

        /*using While Loop*/
        /*String sentence = "if ada is a girl and obi is a boy who is adaobi";
        char ch = 'd';
        int frequency = 0;
        int j = 0;
        while (j < sentence.length()){
            if (ch == sentence.charAt(j)){
                frequency++;
            }
            j++;
        }
        System.out.println("The Frequency of " + ch + " is " + frequency );*/

        /* 24. Round up Number to Decimal Places*/
        /*System.out.print("Enter a Number: ");
        double number = reader.nextDouble();
        System.out.printf("%.4f", number);*/

        /* 25. check if String is Null or Empty*/
        /*String str1 = "James Bond";
        String str2 = " ";
        if (isNullOrEmpty(str1)){
            System.out.println("First String is Null or Empty");
        } else {
            System.out.println("First String is Not Null or Empty");
        }

        if (isNullOrEmpty(str2)){
            System.out.println("Second String is Null or Empty");
        } else {
            System.out.println("Second String is Not Null or Empty");
        }*/

        /* check if String with Spaces is Null or Empty*/
        /*String str1 = "James Bond";
        String str2 = "     ";

        if (isNullOrEmpty(str1)){
            System.out.println("First String is Null or Empty");
        } else {
            System.out.println("First String is Not Null or Empty");
        }

        if (isNullOrEmpty(str2)){
            System.out.println("Second String is Null or Empty");
        } else {
            System.out.println("Second String is Not Null or Empty");
        }*/

        /* 26. Find ASCII value of a Character*/
        /*System.out.print("Enter a character: ");
        char ch = reader.next().charAt(0);
        int ascii = ch;
        System.out.println("The Ascii Value of " + ch + " is " + ascii);*/

        /* 27. Count Number of Digit in an Integer using While Loop*/
       /* System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        System.out.println("Number of Digit is " + count);*/

        /*using For Loop*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int count = 0;
        for (; number != 0; number /= 10){
            count++;
        }
        System.out.println("Number of Digit is " + count);*/

        /* 28. Display Armstrong Number between two intervals*/
        /*System.out.print("Enter Low Number: ");
        int lowNumber = reader.nextInt();
        System.out.print("Enter High Number: ");
        int highNumber = reader.nextInt();

        for (int number = lowNumber + 1; number < highNumber; number++){
            int result = 0;
            int values = 0;
            int originalNumber = number;

            while (originalNumber != 0){
                originalNumber /= 10;
                values++;
            }

            while (originalNumber != 0){
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, values);
                originalNumber /= 10;
            }

            if (result == originalNumber){
                System.out.print(number + ", ");
            }
        }
*/

        /* 29. Check Armstrong Number using While Loop*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int originalNumber, remainder;
        int result = 0;

        originalNumber = number;

        while (originalNumber != 0){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (number == result){
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is Not an Armstrong Number");
        }*/

        /*using For Loop*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int remainder, originalNumber;
        int result = 0;

        originalNumber = number;

        for (; originalNumber != 0; originalNumber /= 10){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
        }

        if (number == result){
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is Not an Armstrong Number");
        }*/

        /* 30. Make a Simple Calculator using Switch Case*/
        /*System.out.print("Enter First Number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Choose an Operation: ");
        char op = reader.next().charAt(0);
        System.out.print("Enter Second Number: ");
        int secondNumber = reader.nextInt();

        switch (op){
            case '+':
                int add = firstNumber + secondNumber;
                System.out.printf("Addition of %d and %d = %d", firstNumber, secondNumber, add);
                break;
            case '-':
                int sub = firstNumber - secondNumber;
                System.out.printf("Subtraction of %d and %d = %d", firstNumber, secondNumber, sub);
                break;
            case '*':
                int mul = firstNumber * secondNumber;
                System.out.printf("Multiplication of %d and %d = %d", firstNumber, secondNumber, mul);
                break;
            case '/':
                int div = firstNumber / secondNumber;
                System.out.printf("Division of %d and %d = %d", firstNumber, secondNumber, div);

                break;
            default:
                System.out.println("Operation does Not Exist");
        }*/

        /* 31. Count Number of Vowels and Consonant in a sentence*/
        /*String sentence = "By the Grace of God i am Set Free from Sexual Immorality";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if (ch >= 'a' && ch <= 'z'){
                consonants++;
            } else if (ch >= '0' && ch <= '9'){
                digits++;
            } else if (ch == ' '){
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);*/

        /* 32. Sort Elements in Lexicographical Order (Dictionary Order)*/
        /*String[] companies = {"Facebook", "Zoom", "Youtube", "Apple"};

        for (int i = 0; i < 3; i++){
            for (int j = i + 1; j < 4; j++){
                if (companies[i].compareTo(companies[j]) > 0){
                    String temp = companies[i];
                    companies[i] = companies[j];
                    companies[j] = temp;
                }
            }
        }
        System.out.println("Companies in the Lexico Order");
        for (int i = 0; i < 4; i++){
            System.out.println(companies[i]);
        }*/

        /* 33. To create Pascal Triangle*/
        /*System.out.print("Enter a Number: ");
        int rows = reader.nextInt();
        int coef = 1;

        for (int i = 0; i <= rows; i++){
            for (int space = 1; space < rows - i; space++){
                System.out.println(" ");
            }
            for (int j = 0; j < i; j++){
                if (j == 0 || i == 0){
                    coef = 1;
                } else {
                    coef = coef * (i - j + 1) / j;
                }
                System.out.printf("%4d", coef);
            }
            System.out.println();
        }*/

        /* 34. Factor of a Number*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i < number; i++ ){
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }*/

        /* 35. Check For an Armstrong Number Using Function*/
        /*System.out.print("Enter Low Number: ");
        int lowNumber = reader.nextInt();
        System.out.print("Enter High Number: ");
        int highNumber = reader.nextInt();

        for (int numb = lowNumber + 1; numb < highNumber; numb++){
            if (checkArmstrong(numb)){
                System.out.println(numb + " ");
            }
        }*/

        /* 36. Check whether a Number can be Expressed as Sum of Two Prime Numbers*/
        /*System.out.print("Enter a Number: ");
        int primeNumber = reader.nextInt();
        boolean flag = false;

        for (int i = 2; i < primeNumber / 2; i++){
            if (checkPrime(i)){
                if (checkPrime(primeNumber - i)){
                    System.out.printf("%d = %d + %d\n", primeNumber, i, primeNumber - i);
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println(primeNumber + " cannot be Expressed");
        }*/

        /* 37. Sum of Natural Numbers using Recursion*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        int sum = addNumber(number);
        System.out.println("The Sum is " + sum);*/

        /* 38.  Display Prime Number btw two numbers using function*/
        /*System.out.print("Enter a Low Number: ");
        int lowNumber = reader.nextInt();
        System.out.print("Enter a High Number: ");
        int highNumber = reader.nextInt();
        System.out.print("Prime Values are : ");
        for (; lowNumber < highNumber; lowNumber++){
            if (checkPrimeNumber(lowNumber)){
                System.out.print(lowNumber + " ");
            }
        }*/

        /* 39. Factorial of a Number using Recursion*/
        /*System.out.print("Enter a Number: ");
        int number = reader.nextInt();
        long bigFactorial = factorialNumber(number);
        System.out.println("The Factorial is " + bigFactorial);*/

        /* 40. GCD of Two numbers using recursive function*/
        /*System.out.print("Enter First Number: ");
        int number1 = reader.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = reader.nextInt();
        int hcfNumber = hcf(number1, number2);
        System.out.printf("The G.C.D of %d and %d is %d", number1, number2, hcfNumber);*/

        /* 41. calculate the Power using recursive function*/
       /* System.out.print("Enter a Base: ");
        int base = reader.nextInt();
        System.out.print("Enter a Exponent: ");
        int exponent = reader.nextInt();
        int result = powerRec(base, exponent);
        System.out.println("The Result is " + result);*/

        /* 42. Convert Binary Number to Decimal and vice-versa*/
       /*System.out.print("Enter a Binary Number: ");
        long binaryNumber = reader.nextInt();
        int decimal = convertBinaryToDecimal(binaryNumber);
        System.out.printf("%d in Binary = %d in Decimal", binaryNumber, decimal);*/

       /*Convert Decimal to Binary*/
        /*System.out.print("Enter Decimal Number: ");
        int decimalNumber = reader.nextInt();
        long binaryNumber = convertDecimalToBinary(decimalNumber);
        System.out.printf("%d in Decimal = %d in Binary", decimalNumber, binaryNumber);*/

        /* 43. Convert Octal to Decimal Number and Vice Versa*/
        /*System.out.print("Enter Octal Number: ");
        int decimalNumber = reader.nextInt();
        int octalNumber = convertDecimalToOctal(decimalNumber);
        System.out.printf("%d in Decimal = %d in Octal", decimalNumber, octalNumber);*/

        /* 44. Calculate the Average of an Array*/
        /*int[] numArray = {1, 9 ,2, 8, 3, 7, 4, 6, 5};
        int sum = 0;
        for (int num:numArray){
            sum += num;
        }
        System.out.println("The Sum is " + sum);
        int average = sum / numArray.length;
        System.out.println("The Average is " + average);*/

        /* 45. Find Largest Element in an Array*/
       /*int numArray[] = {1 ,2 ,3, 4, 5, 6, 7, 8, 9};
       int largest = numArray[0];
       for (int large: numArray){
           if (large > largest){
               largest = large;
           }
       }
        System.out.println("The Largest Number is " + largest);*/

        /* 46. Calculate Standard Deviation*/
        /*double[] numArray = {1, 2, 3, 4 ,5, 6, 7, 8, 9};
        double standardDeviationMode = standardDeviation(numArray);
        System.out.printf("The Standard Deviation is %.3f", standardDeviationMode);*/

        /* 47. Program to Add Matrix Using Multi-dimensional Arrays*/
        /*int rows = 2;
        int cols = 3;
        int[][] firstMatrix = {{1 ,4, 8}, {-5, 8 ,2}};
        int[][] secondMatrix = {{9, -2, 3}, {6, 0, 7}};
//        Adding The Two Matrix
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
//        Displaying Matrix
        System.out.println("The Matrix Value is ");
        for (int[] row : sum){
            for (int col : row){
                System.out.println(col + "  ");
            }
            System.out.println();
        }*/

       /* 48. Program to Multiply Matrix Using Multi-dimensional Arrays*/
        /*int rows = 2;
        int cols = 3;
        int[][] firstMatrix = {{3, 7, 1}, {9, 6, 2}};
        int[][] secondMatrix = {{10, 4, 8}, {0, 3, 5}};
//        Multiplying Two Matrix
        int[][] multiply = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                multiply[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
            }
        }
//            Display Matrix
        System.out.println("The Matrix value is ");
        for (int[] row : multiply){
            for (int col : row){
                System.out.println(col + "   ");
            }
            System.out.println();
        }
*/
        /* 49. Multiply Matrix using Multi-dimensional Array*/
       /*int r1 = 2, c1 = 2;
       int r2 = 3, c2 = 2;
       int[][] firstMatrix = {{7, 3, 0}, {2, 0, 5}};
       int[][] secondMatrix = {{8, 2}, {0, 7}, {3, 9}};
//       Multiplying Matrix
        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < c1; k++){
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
//        Displaying Matrix
        System.out.println("The Matrix is ");
        for (int[] row : product){
            for (int col : row){
                System.out.println(col + " ");
            }
            System.out.println();
        }*/

       /* 50. Multiply Matrix using Multi-dimensional Array using function*/
        /*int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = {{6, 2 ,6}, {9, 1, 2}};
        int[][] secondMatrix = {{2 ,9}, {7, 1}, {0, 3}};
        int[][] product = multiplyMatrix(firstMatrix, secondMatrix, r1, c2, c1);
        displayProduct(product);*/

        /* 51. Find Transpose of a Matrix*/
        /*int rows = 2;
        int cols = 3;
        int[][] matrix = {{1, 2, 3}, {7, 8, 9}};
//        Transpose the Matrix
        int[][] transpose = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                transpose[i][j] = matrix[i][j];
            }
        }
//        Display Transpose
        System.out.println("The Transpose of The Matrix is ");
        for (int[] row : transpose){
            for (int col : row){
                System.out.println(col + " ");
            }
            System.out.println();
        }*/

        /* 52. Program to Concatenate Two Arrays*/
         /*Using ArrayCopy*/
      /*int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int[] array2 = {11, 12 ,13, 14, 15, 16, 17, 18, 19, 20};
//      Get Array Length
        int array1Length = array1.length;
        int array2Length = array2.length;
//        Concat Array
        int[] result = new int[array1Length + array2Length];
//        Display
        System.arraycopy(array1, 0, result, 0, array1Length);
        System.arraycopy(array2, 0, result, array1Length, array2Length);
        System.out.println(Arrays.toString(result));*/

    }


    /*Multi-dimensional Array using function to multiply*/
    /*public static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix, int r1, int c2, int c1){
//        Multiply Matrices
        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < c1; k++){
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return product;
    }*/

    /*public static void displayProduct(int[][] product){
        System.out.println("The Product of Matrix is ");
        for (int[] row : product){
            for (int col : row){
                System.out.println(col + " ");
            }
            System.out.println();
        }
        System.out.println("End of Matrix");
    }*/

    /*Standard Deviation Function*/
    /*public static double standardDeviation(double numbArray[]){
        double sum = 0.0;
        double standardD = 0.0;
        int length = numbArray.length;

        for (double num : numbArray){
            sum += num;
        }
        double mean = sum / length;
        for (double numb : numbArray){
            standardD += Math.pow(numb - mean, 2);
        }
        return Math.sqrt(standardD);
    }*/


    /*Convert Octal To Decimal*/
    /*public static int convertDecimalToOctal(int number){
        int octalNumber = 0;
        int i = 1;

        while (number != 0){
            octalNumber += (number % 8) * i;
            number /= 8;
            i *= 10;
        }
        return octalNumber;
    }*/

    /* Convert Binary to Decimal Function*/
   /*public static int convertBinaryToDecimal(long number) {
       int decimalNumber = 0;
       int i = 0;
       long remainder;

       while (number != 0){
           remainder = number % 10;
           number /= 10;
           decimalNumber += remainder * Math.pow(2, i);
           i++;
       }
       return decimalNumber;
   }*/

   /* Convert Decimal To Binary Function*/
   /* public static long convertDecimalToBinary(int number){
        long binaryNumber = 0;
        int i = 1;
        int remainder;

        while (number != 0){
            remainder = number % 2;
            number /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }*/

    /*Power Recursive Function*/
   /*public static int powerRec(int base, int exponent){
       if (exponent != 0){
           return (base * powerRec(base, exponent - 1));
       } else {
           return 1;
       }
   }*/

    /*GCD Recursive Function*/
    /*public static int hcf(int number1, int number2){
        if (number2 != 0){
            return hcf(number2, number1 % number2);
        } else {
            return number1;
        }
    }*/


    /*Factorial Recursive Function*/
    /*public static long factorialNumber(int numb){
        if (numb >= 1){
            return numb * factorialNumber(numb - 1);
        } else {
            return 1;
        }
    }*/

    /*Check Prime Function*/
    /*public static boolean checkPrimeNumber(int primeNumber){
        boolean isPrimeNumber = true;
        for (int i = 2; i < primeNumber/2; i++){
            if (primeNumber % i == 0){
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }*/
    /*Sum of Natural Numbers (Recursion) Function*/
    /*public static int addNumber(int number){
        if (number != 0){
            return number + addNumber(number - 1);
        }
        return number;
    }*/

    /* Check Prime Number*/
   /*public static boolean checkPrime(int number){
       boolean isPrime = true;
       for (int i = 2; i < number/2; i++){
           if (number % i == 0){
               isPrime = false;
               break;
           }
       }
       return isPrime;*/

    /*Armstrong Method*/
    /*public static boolean checkArmstrong(int number){
        int value = 0;
        int result = 0;
        int originalNUmber = number;

        while (originalNUmber != 0){
            value++;
            originalNUmber /= 10;
        }

        originalNUmber = number;
        while (originalNUmber != 0){
            int remainder = originalNUmber % 10;
            result += Math.pow(remainder, value);
            originalNUmber /= 10;
        }

        if (number == result){
            return true;
        } else {
            return false;
        }
    }*/

    /*public static boolean isNullOrEmpty(String str){
        if (str != null && !str.isEmpty()){
            return false;
        }
        return true;
    }*/

    /*public static boolean isNullOrEmpty(String str){
        if (str != null && !str.trim().isEmpty()){
            return false;
        }
        return true;
    }*/

}