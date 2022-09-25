public class Person {

    private String[] name;
    private int cnic;
    private int number;
    private String gender;

public Person( String[] name, int cnic, int number, String gender ){
    this.cnic = cnic;
    this.gender = gender;
    this.number = number;
    this.name = name;
}

    public int getCnic() {
        return cnic;
    }

    public int getNumber() {
        return number;
    }

    public String getGender() {
        return gender;
    }
    public String[] getName(){
        return name;
    }

}
