package classes;

public class Worker {

    private String name, surname, passportNumber ;

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

    public void setName(String name) {
        this.name = name;
    }

   /* public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }*/
}
