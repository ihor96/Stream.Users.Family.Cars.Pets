import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by okten29 on 8/31/18.
 */
public class User{

    private String name;
    private String surname;
    private int age;
    private String status;
    private ArrayList<Car> cars;
    private ArrayList<Pet> pets;
    private ArrayList<User> family;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", cars=" + cars +
                ", pets=" + pets +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(status, user.status) &&
                Objects.equals(cars, user.cars) &&
                Objects.equals(pets, user.pets) &&
                Objects.equals(family, user.family);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, age, status, cars, pets, family);
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, String surname, int age, String status, ArrayList<Car> cars, ArrayList<Pet> pets, ArrayList<User> family) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.status = status;
        this.cars = cars;
        this.pets = pets;
        this.family = family;
    }

    public User(String name, String surname, String status) {
        this.name = name;
        this.surname = surname;
        this.status = status;
    }

    public User(String name, String surname, String status, ArrayList<Car> cars, ArrayList<Pet> pets, ArrayList<User> family) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.cars = cars;
        this.pets = pets;
        this.family = family;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public ArrayList<User> getFamily() {
        return family;
    }

    public void setFamily(ArrayList<User> family) {
        this.family = family;
    }


}


