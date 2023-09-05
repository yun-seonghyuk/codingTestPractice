package phon;


import java.util.*;

public class Main {

    private static class Person{
        public final String name;
        private final List<PhoneNumber> numbers;

        private Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }
        public void addPhoneNumber(PhoneNumber number){
            numbers.add(number);
        }

        public boolean hasPhoneNumber(PhoneNumber number){
            return numbers.contains(number);
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }

    }

    private static class PhoneNumber{
        public final String phoneNumber;

        private PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]","");
        }
        @Override
        public boolean equals(Object o){
            if(!(o instanceof PhoneNumber)) return false;
            return phoneNumber.equals(((PhoneNumber) o).phoneNumber);
        }
        @Override
        public String toString(){
            return "PhoneNumber{" + "phoneNumber='" + phoneNumber + '\'' + '}';
        }
    }

    private static class PhoneBook{
        private final Set<Person> people;

        private PhoneBook(){
            people = new HashSet<>();
        }

        public void addPerson(Person person){
            people.add(person);
        }

        public Person search(PhoneNumber number){
            return people.stream().filter(p -> p.hasPhoneNumber(number)).findFirst().orElse(null);
        }
        @Override
        public String toString() {
            return "PhoneBook{" +
                    "people=" + people +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person person = new Person("윤성혁");
        person.addPhoneNumber(new PhoneNumber("010-3487-6544"));
        person.addPhoneNumber(new PhoneNumber("010-2579-6544"));

        Person person2 = new Person("김철수");
        person2.addPhoneNumber(new PhoneNumber("010-2468-0246"));

        Person person3 = new Person("김영희");
        person3.addPhoneNumber(new PhoneNumber("010-1357-9135"));

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPerson(person);
        phoneBook.addPerson(person2);
        phoneBook.addPerson(person3);
        System.out.println(phoneBook.search(new PhoneNumber("01034876544")));
        System.out.println(phoneBook.search(new PhoneNumber("01034876542")));

        System.out.println(phoneBook);
    }
}
