package phon;


import java.util.ArrayList;
import java.util.List;

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
        public String toString(){
            return "PhoneNumber{" + "phoneNumber='" + phoneNumber + '\'' + '}';
        }
    }



    public static void main(String[] args) {
        Person person = new Person("윤성혁");
        person.addPhoneNumber(new PhoneNumber("010-3487-6544"));
        person.addPhoneNumber(new PhoneNumber("010 3487 6544"));
        person.addPhoneNumber(new PhoneNumber("01034876544"));
        System.out.println(person);
    }
}
