package zoo.biologicalSpesies;

import zoo.Animal;

public class Birds extends Animal {

    int birthYear;
    int currentYear = 2020;

    public Birds(String name, String species, int birthYear, double weight){
        super(name);
        this.setSpecies(species);
        this.setWeight(weight);
        this.birthYear = birthYear;
        System.out.println();

    }

    @Override
    public int age() {
        return currentYear - birthYear; // ну нужно было что то посчитать
    }


}
