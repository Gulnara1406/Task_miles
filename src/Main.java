public class Main {
    public static void main(String[] args) {
        int value = 5000; // стоимость билета
        int mile = 20;    // кол-во рублей для бонусной мили

        int bonus_miles = value / mile;

        System.out.println("Количество бонусных миль начисленных за билет: " + bonus_miles);
        }
    }
