public class Main {
    public static void main(String[] args) {

        int ticket = 12120; // стоимость билета
        int mile = 20; // количество рублей для одной бонусной мили

        int bonus = ticket / mile; // количество бонусных миль

        System.out.println(" количество бонусных миль " + bonus);
    }
}
