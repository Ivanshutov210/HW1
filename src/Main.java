//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Задача 1.");
        int a = 1;
        byte b = 16;
        short c = 2200;
        long d =  123_212_421_123L;
        float e = 3.75f;
        double f  = 4.346;
        System.out.printf("Значение переменной" + a );
        System.out.printf("Значение переменной" + b );
        System.out.printf("Значение переменной" + c );
        System.out.printf("Значение переменной" + d );
        System.out.printf("Значение переменной" + e );
        System.out.printf("Значение переменной" + f );

        System.out.print("Задача 2.");
        float g = 27.12f;
        long  h = 987_678_965_549L;
        double i = 2.786;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        System.out.printf("Значение переменной" + g );
        System.out.printf("Значение переменной" + h );
        System.out.printf("Значение переменной" + i );
        System.out.printf("Значение переменной" + j );
        System.out.printf("Значение переменной" + k );
        System.out.printf("Значение переменной" + l );
        System.out.printf("Значение переменной" + m );

        System.out.print("Задача 3.");
        byte Lyudmilasclass =  23;
        byte Annasclass = 27;
        byte Ekaterinasclass = 30;
        int Threeclasses = Lyudmilasclass + Annasclass + Ekaterinasclass;
        short Paperforthreeclasses = 480;
        int Sheetforastdent = Paperforthreeclasses /  Threeclasses;
        System.out.printf("На каждого ученика рассчитано" + Sheetforastdent + "листов бумаги.");

        System.out.print("Задача 4.");
        byte twominutes = 2;
        byte bottlesintwominutes = 16;
        int  bottleperminute = bottlesintwominutes / twominutes;
        byte twentyminutes = 20;
        byte sixtyminutesinonehour = 60;
        byte therearetwentyfourhoursinoneday = 24;
        short mintsinoneday = (short) (sixtyminutesinonehour * therearetwentyfourhoursinoneday);
        int mintsinthosedays = (mintsinoneday + mintsinoneday + mintsinoneday);
        byte daysinamonth   = 30;
        int minutespermonth = mintsinoneday * daysinamonth ;
        short in20minutesbottles = (short) (twentyminutes * bottleperminute);
        short per1daybottles = (short) (mintsinoneday * bottleperminute);
        int  per3daybottles = (mintsinthosedays *  bottleperminute);
        int per30daybottles = (minutespermonth *  bottleperminute);
        System.out.printf("За 20 минут машина произвела" + in20minutesbottles + "штук бутылок.");
        System.out.printf("За 1 день машина произвела" + per1daybottles + "штук бутылок.");
        System.out.printf("За 3 дня машина произвела" + per3daybottles + "штук бутылок.");
        System.out.printf("За 30  дней машина произвела" + per30daybottles + "штук бутылок.");

        System.out.print("Задача 5.");
        byte Allthepaint = 120;
        byte Whitepaintforoneclass = 2;
        byte Brownpaintforoneclass = 4;
        int Totaclasses = Allthepaint /(Brownpaintforoneclass + Whitepaintforoneclass);
        int white = Totaclasses *  Whitepaintforoneclass;
        int brown = Totaclasses * Brownpaintforoneclass;
        System.out.printf("В школе, где" + Totaclasses + "классов, нужно" +  white + "банок белой краски и" + brown + "банок коричневой краски");

        System.out.print("Задача 6.");
        short Bananas = 5 * 80;
        short milk = 105 * 2;
        short iseCream = 100 * 2;
        short eggs = 70 * 4;
        int grams = Bananas + milk + iseCream +  eggs;
        float Kg = grams / 1000f;
        System.out.printf("Вес завтрака состовляет" + grams + "грам и" + Kg + "килограм");

        System.out.print("Задача 7.");
        short loseagram = 7 * 1000;
        short firstresetgram = 250;
        short secondresetgram = 500;
        byte lose250aday = (byte)(loseagram / firstresetgram);
        byte lose500aday =(byte) (loseagram / secondresetgram);
        System.out.printf("количесво дней для похудения при потере 250 грамм в день"+ lose250aday);
        System.out.printf("количесво дней для похудения при потере 500 грамм в день"+ lose500aday);
        int average = (lose500aday + lose250aday) / 2;
        System.out.printf("Среднее колличество дней для похудения." + average);

        System.out.print("Задача 8.");
        int Masha = 67760;
        int Denis= 83690;
        int Kristina = 76230;
        float salaryincreaseMasha = (float)(67760 * 0.1);
        float salaryincreaseDenis = (float)(83690 * 0.1);
        float salaryincreaseKritina = (float)(76230 * 0.1);
        int newsalaryMasha = (int)(Masha + salaryincreaseMasha);
        int newsalaryDenis = (int)(Denis + salaryincreaseDenis);
        int newsalaryKristina = (int)(Kristina + salaryincreaseKritina);
        float mashaYear = Masha * 12;
        float denisYear = Denis * 12;
        float kristinaYear = Kristina * 12;
        int masha = (int) (mashaYear - newsalaryMasha);
        int denis = (int) (denisYear - newsalaryDenis);
        int kristina = (int) (kristinaYear - newsalaryKristina);
        System.out.print("Маша теперь получает" + newsalaryMasha + "рублей. Годовой доход вырос на" + masha + "рублей.");
        System.out.print("Динис теперь получает" + newsalaryDenis + "рублей. Годовой доход вырос на" + denis + "рублей.");
        System.out.print("Кристина теперь получает" + newsalaryKristina + "рублей. Годовой доход вырос на" + kristina + "рублей.");
    }
}