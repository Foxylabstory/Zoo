package zoo;

public abstract class Animal {
    private String name;
    private String species;
    private double weight;
    protected abstract int age();

    protected Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }


    protected Animal(){
        this.species = species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }



    protected Animal(double weight){
        this.weight = weight;
    }
    protected void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(name);
        builder.append("\n Вид: ").append(species);
        builder.append("\n Возраст: ").append(age());
        builder.append("\n Вес: ").append(weight);
        return builder.toString();
    }
}
