public class WildAnimal extends Animal{

    private String habitat;

    public WildAnimal(String name, String type, int age, String habitat) {
        super(name, type, age);
        setHabitat(habitat);
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
}
