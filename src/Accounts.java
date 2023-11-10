public class Accounts {
    private String firstName;
    private String secondName;
    private int birthDate;
    private int birthMonth;
    private int birthYear;
    private String mail;
    private int telephoneNumber;
    private double weight;
    private int pressure;
    private int steps;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getMail() {
        return mail;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public double getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        this.age = 2020 - birthYear;
        return age;
    }

    public Accounts(String firstName, String secondName, int birthDate, int birthMonth, int birthYear, String mail, int telephoneNumber, double weight, int pressure, int steps) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.mail = mail;
        this.telephoneNumber = telephoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }


    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.printf("First Name: %s, Second Name: %s, Birth Date: %s.%s.%s, Mail: %s, Telephone number: %s, Weight: %s, Pressure: %s, Steps: %s, Age: %s. \n", firstName, secondName, birthDate, birthMonth, birthYear, mail, telephoneNumber, weight, pressure, steps, getAge());
    }
}
