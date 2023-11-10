public class Main {
    public static void main(String[] args) {
        Accounts Tom = new Accounts("Tom", "Thomson", 15, 5, 1995, "tombler@gmail.com", 1457541251, 75.4, 122, 7859);
        Accounts Bob = new Accounts("William", "Wilson", 22, 2, 2002, "bobler@gmail.com", 1274586946, 82.2, 101, 17859);
        Accounts Calvin = new Accounts("David", "Davidson", 5, 7, 1992, "davidsoner@gmail.com", 1981563141, 60.2, 127, 2357);
        Accounts John = new Accounts("John", "Johnathon", 27, 1, 2013, "johner@gmail.com", 2145758937, 110.5, 135, 1425);
        Accounts James = new Accounts("James", "Jameson", 2, 12, 1981, "jameson@gmail.com", 1427373976, 140.3, 92, 12358);
        Tom.printAccountInfo();
        Bob.printAccountInfo();
        Calvin.printAccountInfo();
        John.printAccountInfo();
        James.printAccountInfo();
        Tom.setSteps(5000);
        Calvin.setSecondName("Loran");
        System.out.println();
        Tom.printAccountInfo();
        Calvin.printAccountInfo();
    }
}
