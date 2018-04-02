package classes;

public class Worker {

    private String name;
    private String surname;
    private String passportNumber;

    public Worker(String name, String surname, String passportNumber){
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

}
