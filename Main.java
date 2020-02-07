package Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args ) throws NullPointerException, IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Person> map = new LinkedHashMap<>();
        String[] input;

        while (!Arrays.equals(input = rd.readLine().split(" "), new String[]{"End"})) {
            map.putIfAbsent(input[0], new Person(input[0]));
            Person person = map.get(input[0]);

            switch (input[1]) {
                case "company":
                    person.getCompanies().push(new Company(input[2], input[3], Double.parseDouble(input[4])));
                    break;

                case "car":
                    person.getCars().push(new Car(input[2], input[3]));
                    break;

                case "pokemon":
                    person.getPokemons().add(new Pokemon(input[2], input[3]));
                    break;

                case "parents":
                    person.getParents().add(new Parent(input[2], input[3]));
                    break;

                case "children":
                    person.getChildren().add(new Child(input[2], input[3]));
                    break;
            }
        }

        String name = rd.readLine();

        if (map.containsKey(name))
            System.out.println(map.get(name));
    }
}