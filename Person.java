package Task6;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private ArrayDeque<Company> companies = new ArrayDeque<>();
    private ArrayDeque<Car> cars = new ArrayDeque<>();
    private List<Pokemon> pokemons = new ArrayList<>();
    private List<Parent> parents = new ArrayList<>();
    private List<Child> children = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    private String getName() { return System.lineSeparator() + this.name; }

    public ArrayDeque<Company> getCompanies() {
        return this.companies;
    }

    public ArrayDeque<Car> getCars() {
        return this.cars;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    private String getPokemonsString() {
        return System.lineSeparator() + this.getPokemons().stream().map(Pokemon::toString).collect(Collectors.joining(System.lineSeparator()));
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    private String getParentString() {
        return this.getParents().size() > 0 ?
                System.lineSeparator() + this.getParents().stream().map(Parent::toString).collect(Collectors.joining(System.lineSeparator())) : "";
    }

    public List<Child> getChildren() {
        return this.children;
    }

    private String getChildrenString() {
        return this.getChildren().size() > 0 ?
                System.lineSeparator() + this.getChildren().stream().map(Child::toString).collect(Collectors.joining(System.lineSeparator())) : "";
    }

    private String getCompany() {
        return this.getCompanies().size() > 0 ? System.lineSeparator() + this.getCompanies().pop().toString() : "";
    }

    private String getCar() {
        return this.getCars().size() > 0 ? this.getCars().pop().toString() : "";
    }

    @Override
    public String toString() {
        return String.format("%s" +
                        "%nCompany:%s" +
                        "%nCar:%s" +
                        "%nPokemon:%s" +
                        "%nParents:%s" +
                        "%nChildren:%s",
                this.getName(), this.getCompany(), this.getCar(), this.getPokemonsString(), this.getParentString(), this.getChildrenString());
    }
}