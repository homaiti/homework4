public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");

        int age = 17;
        if(age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задача 2");
        double temp = 6;

        if(temp < 5)
        {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        else
        {
            System.out.println("На улице " + temp + " градусов можно идти без шапки");
        }
        System.out.println();

        System.out.println("Задача 3");

        int speed = 61;

        if(speed > 60)
        {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        else
        {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задача 4");

        int ageMan = 2;
        boolean ageTwoSix = ageMan >= 2 && ageMan <= 6;
        boolean ageSevenEighteen = ageMan >= 7 && ageMan < 18;
        boolean ageEighteenTwentyFour = ageMan >= 18 && ageMan < 24;
        String error = "";

        if(ageTwoSix)
        {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        }

        else if(ageSevenEighteen)
        {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
        }

        else if(ageEighteenTwentyFour)
        {
            System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете");
        }

        else
        {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему пора ходить на работу");
        }

        System.out.println();

        System.out.println("Задача 5");

        int yourAge = 4;
        boolean lessFiveYears = yourAge < 5;
        boolean moreFiveYearsLessFourteen = yourAge >= 5 && yourAge < 14;
        boolean moreFourteen = yourAge >= 14;
        boolean withAdult = true;

        if(lessFiveYears)
        {
            System.out.println("Если возраст ребенка равен " + yourAge +
                    ", то ему нельзя кататься на аттракционе");
        }
        else if (moreFiveYearsLessFourteen && withAdult)
        {
            System.out.println("Если возраст ребенка равен " + yourAge +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else
        {
            System.out.println("Если возраст ребенка равен " + yourAge +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println();

        System.out.println("Задача 6");

        int passCount = 52;
        int passMax = 102;
        int passSit = 60;
        int passStand = passMax - passSit;

        if(passCount < passSit)
        {
            System.out.println("В вагоне есть места " + (passSit - passCount) + " сидячих мест и "
                    + passStand + " стоячих мест");
        }
        else if (passCount > passSit && passCount < passMax)
        {
            System.out.println("В вагоне нет сидячих мест но есть "
                    + (passMax - passCount) + " стоячих мест");
        }
        else
        {
            System.out.println("Вагон уже полностью забит");
        }

        System.out.println();

        System.out.println("Задача 7");

        int one = 3;
        int two = 2;
        int three = 1;

        System.out.println("Даны три числа Первое: " + one + " Второе: " + two + " Третье: " + three);

        if (one > two && one > three )
        {
            System.out.println("Число " + one + " наибольшее из них");
        }
        else if (two > one && two > three)
        {
            System.out.println("Число " + two + " наибольшее из них");
        }
        else
        {
            System.out.println("Число " + three + " наибольшее из них");
        }




    }
}