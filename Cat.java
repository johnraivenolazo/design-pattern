public class Cat implements Pet {
    private String breed;

    public String getBreed() {
        return breed;
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    @Override
    public String play() {
        return "Pouncing a dead rat";
    }

    public void setNoOfLives(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNoOfLives'");
    }
}