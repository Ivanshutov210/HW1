//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Задача 1.");
        int a = 1;
        byte b = 16;
        short c = 2200;
        long d = 123_212_421_123L;
        float e = 3.75f;
        double f = 4.346;
        System.out.printf("Значение переменной" + a);
        System.out.printf("Значение переменной" + b);
        System.out.printf("Значение переменной" + c);
        System.out.printf("Значение переменной" + d);
        System.out.printf("Значение переменной" + e);
        System.out.printf("Значение переменной" + f);

        System.out.print("Задача 2.");
        float g = 27.12f;
        long h = 987_678_965_549L;
        double i = 2.786;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        System.out.printf("Значение переменной" + g);
        System.out.printf("Значение переменной" + h);
        System.out.printf("Значение переменной" + i);
        System.out.printf("Значение переменной" + j);
        System.out.printf("Значение переменной" + k);
        System.out.printf("Значение переменной" + l);
        System.out.printf("Значение переменной" + m);

        System.out.print("Задача 3.");
        byte lyudmilasClass = 23;
        byte annasClass = 27;
        byte ekaterinasClass = 30;
        int threeClasses = lyudmilasClass + annasClass + ekaterinasClass;
        short paperForthreeClasses = 480;
        int sheetforaStdent = paperForthreeClasses / threeClasses;
        System.out.printf("На каждого ученика рассчитано" + sheetforaStdent + "листов бумаги.");

        System.out.print("Задача 4.");
        byte twoMinutes = 2;
        byte bottlesinTwoMnutes = 16;
        int bottlepermInute = bottlesinTwoMnutes / twoMinutes;
        byte twentymInutes = 20;
        byte sixtyMinutesinOneHour = 60;
        byte thereareTwentyFourHoursinOneDay = 24;
        short mintsinOneDay = (short) (sixtyMinutesinOneHour * thereareTwentyFourHoursinOneDay);
        int mintsintHoseDays = (mintsinOneDay + mintsinOneDay + mintsinOneDay);
        byte daysinaMonth = 30;
        int minutesperMonth = mintsinOneDay * daysinaMonth;
        short in20minutesBottles = (short) (twentymInutes * bottlepermInute);
        short per1dayBottles = (short) (mintsinOneDay * bottlepermInute);
        int per3dayBottles = (mintsintHoseDays * bottlepermInute);
        int per30dayBottles = (minutesperMonth * bottlepermInute);
        System.out.printf("За 20 минут машина произвела" + in20minutesBottles + "штук бутылок.");
        System.out.printf("За 1 день машина произвела" + per1dayBottles + "штук бутылок.");
        System.out.printf("За 3 дня машина произвела" + per3dayBottles + "штук бутылок.");
        System.out.printf("За 30  дней машина произвела" + per30dayBottles + "штук бутылок.");

        System.out.print("Задача 5.");
        byte allthePaint = 120;
        byte whitePaintforOneClass = 2;
        byte brownPaintforOneClass = 4;
        int totaClasses = allthePaint / (brownPaintforOneClass + whitePaintforOneClass);
        int white = totaClasses * whitePaintforOneClass;
        int brown = totaClasses * brownPaintforOneClass;
        System.out.printf("В школе, где" + totaClasses + "классов, нужно" + white + "банок белой краски и" + brown + "банок коричневой краски");

        System.out.print("Задача 6.");
        short bananas = 5 * 80;
        short milk = 105 * 2;
        short iseCream = 100 * 2;
        short eggs = 70 * 4;
        int grams = bananas + milk + iseCream + eggs;
        float Kg = grams / 1000f;
        System.out.printf("Вес завтрака состовляет" + grams + "грам и" + Kg + "килограм");

        System.out.print("Задача 7.");
        short loseaGram = 7 * 1000;
        short firstResetGram = 250;
        short secondResetGram = 500;
        byte lose250aDay = (byte) (loseaGram / firstResetGram);
        byte lose500aDay = (byte) (loseaGram / secondResetGram);
        System.out.printf("количесво дней для похудения при потере 250 грамм в день" + lose250aDay);
        System.out.printf("количесво дней для похудения при потере 500 грамм в день" + lose500aDay);
        int average = (lose500aDay + lose250aDay) / 2;
        System.out.printf("Среднее колличество дней для похудения." + average);

        System.out.print("Задача 8.");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float salaryIncreaseMasha = (float) (67760 * 0.1);
        float salaryIncreaseDenis = (float) (83690 * 0.1);
        float salaryIncreaseKritina = (float) (76230 * 0.1);
        int newSalaryMasha = (int) (masha + salaryIncreaseMasha);
        int newSalaryDenis = (int) (denis + salaryIncreaseDenis);
        int newSalaryKristina = (int) (kristina + salaryIncreaseKritina);
        float mashaYear = masha * 12;
        float denisYear = denis * 12;
        float kristinaYear = kristina * 12;
        int mashaA = (int) (mashaYear - newSalaryMasha);
        int denisA = (int) (denisYear - newSalaryDenis);
        int kristinaA = (int) (kristinaYear - newSalaryKristina);
        System.out.print("Маша теперь получает" + newSalaryMasha + "рублей. Годовой доход вырос на" + mashaA + "рублей.");
        System.out.print("Динис теперь получает" + newSalaryDenis + "рублей. Годовой доход вырос на" + denisA + "рублей.");
        System.out.print("Кристина теперь получает" + newSalaryKristina + "рублей. Годовой доход вырос на" + kristinaA + "рублей.");

    }
}