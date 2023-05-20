public class Worker {

    private final String name;
    private final String surname;
    private final String patronymic;
    private String position;
    private String email;
    private int age;
    private long phoneNumber;
    private double salary;


    public Worker(String name, String surname, String patronymic, String position, String email,
                  int age, long phoneNumber, double salary){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Worker(String name, String surname,String patronymic, String position, String email,
                  double salary){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.salary = salary;
    }
}
