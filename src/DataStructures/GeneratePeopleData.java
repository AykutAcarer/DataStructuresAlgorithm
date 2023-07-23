package dataStructures;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratePeopleData {

    static class Person {
        String first_name;
        String last_name;
        String street;
        String house_number;
        String post_code;
        String state;
        String country;

        public Person(String first_name, String last_name, String street, String house_number,
                      String post_code, String state, String country) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.street = street;
            this.house_number = house_number;
            this.post_code = post_code;
            this.state = state;
            this.country = country;
        }
    }

    public static void main(String[] args) {
        int numPeople = 1000;
        List<Person> peopleData = generateData(numPeople);
        saveToJsonFile(peopleData, "people_data.json");
    }

    private static List<Person> generateData(int numPeople) {
        List<Person> peopleData = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numPeople; i++) {
            String firstName = generateRandomString(random, 6, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            String lastName = generateRandomString(random, 8, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            String street = generateRandomString(random, 10, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
            String houseNumber = String.valueOf(random.nextInt(100) + 1);
            String postCode = String.valueOf(10000 + random.nextInt(90000));
            String state = generateRandomString(random, 8, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            String country = "United States"; // You can add more countries for diversity

            Person person = new Person(firstName, lastName, street, houseNumber, postCode, state, country);
            peopleData.add(person);
        }

        return peopleData;
    }

    private static String generateRandomString(Random random, int length, String characters) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static void saveToJsonFile(List<Person> peopleData, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            StringBuilder jsonBuilder = new StringBuilder();
            jsonBuilder.append("{\n  \"people\": [\n");
            for (int i = 0; i < peopleData.size(); i++) {
                Person person = peopleData.get(i);
                String jsonEntry = String.format("    {\"first_name\": \"%s\", \"last_name\": \"%s\", \"street\": \"%s\", \"house_number\": \"%s\", \"post_code\": \"%s\", \"state\": \"%s\", \"country\": \"%s\"}",
                        person.first_name, person.last_name, person.street, person.house_number, person.post_code, person.state, person.country);
                jsonBuilder.append(jsonEntry);
                if (i < peopleData.size() - 1) {
                    jsonBuilder.append(",\n");
                } else {
                    jsonBuilder.append("\n");
                }
            }
            jsonBuilder.append("  ]\n}");
            fileWriter.write(jsonBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
