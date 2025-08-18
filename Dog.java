public class Dog implements Pet {
    private String breed;

    public String getBreed() {
        return breed;
    }

    @Override
    public String makeSound() {
        return "aw aw";
    }

    @Override
    public String play() {
        return "catch and fetch";
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    }