import javax.annotation.processing.Completion;
import javax.jws.soap.SOAPBinding;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Mu");
        Pet pet2 = new Pet("Rex");
        Pet pet3 = new Pet("Vasya");
        Pet pet4 = new Pet("Petya");
        Pet pet5 = new Pet("Pocky");
        Pet pet6 = new Pet("Jack");
        Pet pet7 = new Pet("Sharik");
        Pet pet8 = new Pet("Max");
        Pet pet9 = new Pet("Black");
        Pet pet10 = new Pet("REd");
        Pet pet11 = new Pet("Vall");
        Pet pet12 = new Pet("Ball");
        Pet pet13 = new Pet("Gray");
        Pet pet14 = new Pet("Brown");
        Pet pet15 = new Pet("Pit");
        Pet pet16 = new Pet("Vasyliy");
        Pet pet17 = new Pet("Ara");
        Pet pet18 = new Pet("Masha");
        Pet pet19 = new Pet("Sasha");
        Pet pet20 = new Pet("Dasha");

        Car car1 = new Car("Renault", "Megane1", 1999, new Engine(2.3, "W"));
        Car car2 = new Car("Ford", "Focus", 2009, new Engine(2.5, "L"));
        Car car3 = new Car("Mitsubishi", "Lancer", 1989, new Engine(2.3, "L"));
        Car car4 = new Car("Mercedes", "E320", 2016, new Engine(4.3, "W"));
        Car car5 = new Car("Volvo", "v60", 2015, new Engine(2.5, "L"));
        Car car6 = new Car("BMW", "730", 2017, new Engine(3.3, "L"));
        Car car7 = new Car("Audi", "a8", 1993, new Engine(2.4, "W"));
        Car car8 = new Car("Renault", "Megane2", 2000, new Engine(2.8, "W"));
        Car car9 = new Car("Audi", "a6", 1600, new Engine(1.3, "W"));
        Car car10 = new Car("Ford", "Raptor", 2003, new Engine(2.2, "W"));
        Car car11 = new Car("Chery", "Amulet", 2008, new Engine(2.1, "L"));
        Car car12 = new Car("Mini", "2", 2009, new Engine(2.5, "L"));
        Car car13 = new Car("Smart", "first", 2008, new Engine(3.5, "W"));
        Car car14 = new Car("VW", "Golf", 2009, new Engine(3.8, "L"));
        Car car15 = new Car("Subaru", "Impresa", 2005, new Engine(3.0, "W"));


        ArrayList<Car> cars1 = new ArrayList<>();
        cars1.add(car1);
        cars1.add(car2);

        ArrayList<Car> cars2 = new ArrayList<>();
        cars2.add(car3);

        ArrayList<Car> cars3 = new ArrayList<>();
        cars3.add(car4);

        ArrayList<Car> cars4 = new ArrayList<>();


        ArrayList<Car> cars5 = new ArrayList<>();
        cars5.add(car5);

        ArrayList<Car> cars6 = new ArrayList<>();
        cars6.add(car6);


        ArrayList<Car> cars7 = new ArrayList<>();
        cars7.add(car7);
        cars7.add(car8);


        ArrayList<Car> cars8 = new ArrayList<>();


        ArrayList<Car> cars9 = new ArrayList<>();
        cars9.add(car9);


        ArrayList<Car> cars10 = new ArrayList<>();
        cars10.add(car10);


        ArrayList<Car> cars11 = new ArrayList<>();


        ArrayList<Car> cars12 = new ArrayList<>();
        cars12.add(car11);
        cars12.add(car12);


        ArrayList<Car> cars13 = new ArrayList<>();
        cars13.add(car13);

        ArrayList<Car> cars14 = new ArrayList<>();
        cars14.add(car14);
        cars14.add(car15);

        ArrayList<Car> cars15 = new ArrayList<>();


        ArrayList<Car> cars16 = new ArrayList<>();

        ArrayList<Car> cars17 = new ArrayList<>();


        ArrayList<Car> cars18 = new ArrayList<>();


        ArrayList<Car> cars19 = new ArrayList<>();


        ArrayList<Car> cars20 = new ArrayList<>();


        ArrayList<Pet> pets1 = new ArrayList<>();
        pets1.add(pet1);
        pets1.add(pet2);
        ArrayList<Pet> pets2 = new ArrayList<>();
        pets2.add(pet3);
        ArrayList<Pet> pets3 = new ArrayList<>();
        pets3.add(pet4);

        ArrayList<Pet> pets4 = new ArrayList<>();

        ArrayList<Pet> pets5 = new ArrayList<>();
        pets5.add(pet5);

        ArrayList<Pet> pets6 = new ArrayList<>();
        pets6.add(pet6);

        ArrayList<Pet> pets7 = new ArrayList<>();
        pets7.add(pet7);
        pets7.add(pet8);

        ArrayList<Pet> pets8 = new ArrayList<>();

        ArrayList<Pet> pets9 = new ArrayList<>();
        pets9.add(pet9);

        ArrayList<Pet> pets10 = new ArrayList<>();
        pets10.add(pet10);
        pets10.add(pet11);
        pets10.add(pet12);

        ArrayList<Pet> pets11 = new ArrayList<>();


        ArrayList<Pet> pets12 = new ArrayList<>();


        ArrayList<Pet> pets13 = new ArrayList<>();
        pets13.add(pet13);

        ArrayList<Pet> pets14 = new ArrayList<>();
        pets14.add(pet14);

        ArrayList<Pet> pets15 = new ArrayList<>();
        pets15.add(pet15);

        ArrayList<Pet> pets16 = new ArrayList<>();

        ArrayList<Pet> pets17 = new ArrayList<>();
        pets17.add(pet16);
        pets17.add(pet17);
        pets17.add(pet18);

        ArrayList<Pet> pets18 = new ArrayList<>();
        pets18.add(pet19);

        ArrayList<Pet> pets19 = new ArrayList<>();
        pets19.add(pet20);

        ArrayList<Pet> pets20 = new ArrayList<>();


        ArrayList<User> family1 = new ArrayList<>();
        family1.add(new User("Ira", "FGJSJK", "maried"));
        family1.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family2 = new ArrayList<>();
        family2.add(new User("Irad", "Jodsjfk", "maried"));
        family2.add(new User("Masha", "djflkd", "unmaried"));

        ArrayList<User> family3 = new ArrayList<>();
        family3.add(new User("Vova", "FGJSJK", "umaried"));
        family3.add(new User("Masha", "FGJSJK", "maried"));

        ArrayList<User> family4 = new ArrayList<>();
        family4.add(new User("Ira", "ghgfh", "maried"));
        family4.add(new User("Vira", "ghfddfh", "unmaried"));

        ArrayList<User> family5 = new ArrayList<>();
        family5.add(new User("Vasya", "FGJSJK", "maried"));
        family5.add(new User("Pit", "FGJSJK", "maried"));

        ArrayList<User> family6 = new ArrayList<>();
        family6.add(new User("Jenya", "FGJSJK", "maried"));
        family6.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family7 = new ArrayList<>();
        family7.add(new User("Ira3", "FGJSJdfgfdgK", "unmaried"));
        family7.add(new User("Vira2", "FGJSdfgfdgfJK", "maried"));

        ArrayList<User> family8 = new ArrayList<>();
        family8.add(new User("Ira", "FGJSJK", "maried"));
        family8.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family9 = new ArrayList<>();
        family9.add(new User("Ira", "FGJSJK", "unmaried"));
        family9.add(new User("Vira", "FGJSJK", "unmaried"));

        ArrayList<User> family10 = new ArrayList<>();
        family10.add(new User("Ira", "FGJSJK", "unmaried"));
        family10.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family11 = new ArrayList<>();
        family11.add(new User("Vira", "FGJSJK", "unmaried"));

        ArrayList<User> family12 = new ArrayList<>();
        family12.add(new User("Ira", "FGJSJK", "maried"));
        family12.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family13 = new ArrayList<>();
        family13.add(new User("Vova", "FGJSJK", "unmaried"));
        family13.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family14 = new ArrayList<>();
        family14.add(new User("Jack", "FGJSJK", "unmaried"));

        ArrayList<User> family15 = new ArrayList<>();
        family15.add(new User("Ira", "FGJSJK", "unmaried"));
        family15.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family16 = new ArrayList<>();
        family16.add(new User("Andr", "FGJSJK", "unmaried"));

        ArrayList<User> family17 = new ArrayList<>();
        family17.add(new User("Sasha", "FGJSJK", "maried"));
        family17.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family18 = new ArrayList<>();
        family18.add(new User("Iren", "FGJSJK", "maried"));
        family18.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family19 = new ArrayList<>();
        family19.add(new User("Ann", "FGJSJK", "unmaried"));
        family19.add(new User("Vira", "FGJSJK", "maried"));

        ArrayList<User> family20 = new ArrayList<>();
        family20.add(new User("Zoryan", "FGJSJK", "maried"));
        family20.add(new User("Vira", "FGJSJK", "unmaried"));


        User user1 = new User("Vova", "Matus",34, "Maried", cars1, pets1, family1);
        User user2 = new User("Joe", "Atlas", 45,"Unmaried", cars2, pets2, family2);
        User user3 = new User("Misha", "Vapus",76, "Maried", cars3, pets3, family3);
        User user4 = new User("Sasha", "Garus", 12,"Maried", cars4, pets4, family4);
        User user5 = new User("Yulia", "Apple", 21,"Maried", cars5, pets5, family5);
        User user6 = new User("Piter", "Affok", 15,"Unmaried", cars6, pets6, family6);
        User user7 = new User("Olya", "Maza",46, "Maried", cars7, pets7, family7);
        User user8 = new User("Jack", "Gasa",22, "Unmaried", cars8, pets8, family8);
        User user9 = new User("Masha", "Rasd", 18,"Maried", cars9, pets9, family9);
        User user10 = new User("Dasha", "Frefs",19, "Maried", cars10, pets10, family10);
        User user11 = new User("Julia", "Creg",25, "Maried", cars11, pets11, family11);
        User user12 = new User("Vova1", "Hgfgdf",45, "Maried", cars20, pets20, family20);
        User user13 = new User("Masha2", "Osdfldsf",31, "Maried", cars12, pets12, family12);
        User user14 = new User("Dasha2", "Markus",36, "Unmaried", cars13, pets13, family13);
        User user15 = new User("Piter2", "Shuls",18, "Maried", cars14, pets14, family14);
        User user16 = new User("Ihor", "Ivanov",11, "Unmaried", cars15, pets15, family15);
        User user17 = new User("Paul", "Petrov", 10,"Maried", cars16, pets16, family16);
        User user18 = new User("Fred", "Tumashov",90, "Unmaried", cars17, pets17, family17);
        User user19 = new User("Tim", "Kisilov",100, "Maried", cars18, pets18, family18);
        User user20 = new User("Jochan", "Baronov", 89,"Unmaried", cars19, pets19, family19);

        ArrayList<User> usersAll = new ArrayList<>();
        usersAll.add(user1);
        usersAll.add(user2);
        usersAll.add(user3);
        usersAll.add(user4);
        usersAll.add(user5);
        usersAll.add(user6);
        usersAll.add(user7);
        usersAll.add(user8);
        usersAll.add(user9);
        usersAll.add(user10);
        usersAll.add(user11);
        usersAll.add(user12);
        usersAll.add(user13);
        usersAll.add(user14);
        usersAll.add(user15);
        usersAll.add(user16);
        usersAll.add(user17);
        usersAll.add(user18);
        usersAll.add(user19);
        usersAll.add(user20);


        //stream:
        // сортуємо по року автомобіля по зростанню
        // filter тих хто молодше 21
        // 2 машина менше 2008 року
        // кількість членів сімї менше 2-ох

        List<User> collect = usersAll.stream().filter(user -> user.getCars().size() > 0).collect(Collectors.toList());
//        for (User user:collect
//             ) {
//            System.out.println(user);
//
//        }
        List<User> collect1 = collect.stream().sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                Iterator<Car> iterator = o1.getCars().iterator();
                Iterator<Car> iterator1 = o2.getCars().iterator();
                int carYear = iterator.next().getCarYear();
                int carYear1 = iterator1.next().getCarYear();

                return carYear - carYear1;
            }
        }).collect(Collectors.toList());
        System.out.println("Посортовані юзери по року машини");
        for (User u1:collect1
             ) {
            System.out.println(u1);//Посортовані юзери по року машин
        }

        List<User> collect3 = collect1.stream().filter(user -> user.getAge() <= 21).collect(Collectors.toList());
        System.out.println("Юзери з віком до 21-року");
        for (User u3:collect3
             ) {
            System.out.println(u3);
        }
        List<User> collect2 = collect1.stream().filter(user -> user.getCars().get(0).getCarYear() < 2000).collect(Collectors.toList());
        System.out.println("Тільки машини старші 21 року ");
        for (User u2:collect2
             ) {
            System.out.println(u2);

        }
        List<User> collect4 = usersAll.stream().filter(user -> user.getCars().size()>1).collect(Collectors.toList());
        List<User> collect7 = collect4.stream().filter(user -> user.getCars().get(1).getCarYear() < 2008).collect(Collectors.toList());
        System.out.println("Юзери в яких 2 машина до 2008 року");
        for (User u7:collect7
             ) {
            System.out.println(u7);

        }
        List<User> collect8 = usersAll.stream().filter(user -> user.getFamily().size() <= 1).collect(Collectors.toList());
        System.out.println("Юзер в якого сімя складається з 1 людини і менше");
        for (User u8:collect8
             ) {
            System.out.println(u8);

        }
    }}