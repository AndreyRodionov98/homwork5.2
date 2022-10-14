public class Main {
    public static void main(String[] args){

// Задание 1.1
        System.out.println("Задание 1.1");




        int savings = 15000;
        int total = 0;
        int month = 0;
        while (total<2_459_000) {

            total = total/100 + total;
            total = total + savings;
            month = month + 1;

           System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");}






        // Задание 1.2
        System.out.println("Задание 1.2");

       int i = 0;

        while(i<10 ){
            i++;
            System.out.println(i);}

        for (int a = 10; a >0; a--){
            System.out.println(a);
        }

// Задание 1.3
        System.out.println("Задание 1.3");



        int people = 12_000_000;
        int birthRate = people/1000*17;
        int die = people/1000*8;
        int year = 0;
        while (year<10){
            year++;
            people= people+birthRate-die;
            System.out.println("Год "+ year + " численность населения составляет " + people);}



        // Задание 2.1
        System.out.println("Задание 2.1");



        int Total= 0;
        int Saving = 15000;
       int Year = 0;

        for ( ;Total< 12_000_000;Year++){

            Total = (Total/100*7) + Total;
            Total = Total + Saving;


                System.out.println( " Через " + Year  +" лет " + Total) ;}




        // Задание 2.2
        System.out.println("Задание 2.2");



        int totalSum= 0;
        int saving = 15000;
        int years = 0;

        for (totalSum=0 ;totalSum< 12_000_000;years++){

            totalSum = (totalSum/100*7) + totalSum;
            totalSum = totalSum + saving;
            if (years%6==0)
            {


            System.out.println( " Через " + years  +" лет " + totalSum) ;}}






        // Задание 2.3
        System.out.println("Задание 2.3");



        int sum= 0;
        int savings1 = 15000;


        for (int months=0 ;months<=108;months++){

        sum = (sum/100*7) + sum;
        sum = sum + savings1;
        if (months%6==0)


             {


                System.out.println( " Через " + months  +" месяцев " + sum) ;}}


// Задание 2.4
        System.out.println("Задание 2.4");


        int firstFriday=5;

        for ( int currentFriday= firstFriday ; currentFriday<=31;currentFriday+=7 ){

                System.out.println("Сегодня пятница"+currentFriday+"-е число. Необходимо подготовить отчет");}


// Задание 3.1
        System.out.println("Задание 3.1");



        int currentYear= 2022;
        int beginning= currentYear -200;
        int ending= currentYear+100;
        for (int a = beginning;a <ending;a+=79){
            System.out.println(a);}

        // Задание 3.2
        System.out.println("Задание 3.2");



        for (int e = 1; e<10;e++){
            System.out.println("2*"+ e +"="+2*e);}





    }









}
