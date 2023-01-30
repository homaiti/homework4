public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");

        int age = 17;
        if(age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else
        {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задача 2");
        double temp = 4;

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

        double speed = 61;

        if(speed > 60)
        {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        else
        {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();

    }
}