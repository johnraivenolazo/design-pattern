import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Pet");
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nEnter your choice: ");
        int choice = input.nextInt();

        PetRecord petRecord = new PetRecord();
        Pet pet;

        while(true){
            switch(choice) {
                case 1:
                    pet = new Dog();
                    petRecord.setId("P001");
                    petRecord.setName("Bantay");
                    ((Dog) pet).setBreed("German Shepherd");
                    petRecord.setPet(pet);
                    System.out.println("Pet id is: " + petRecord.getId());
                    System.out.println("Pet name is: " + petRecord.getName());
                    System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
                    System.out.println("Pet communication sound: " + petRecord.getPet().makeSound());
                    System.out.println("Play mode: " + petRecord.getPet().play());
                    break;
                case 2:
                    pet = new Cat();
                    petRecord.setId("P001");
                    petRecord.setName("Muning");
                    ((Cat) pet).setNoOfLives(9);
                    petRecord.setPet(pet);
                    System.out.println("Pet id is: " + petRecord.getId());
                    System.out.println("Pet name is: " + petRecord.getName());
                    System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
                    System.out.println("Pet communication sound: " + petRecord.getPet().makeSound());
                    System.out.println("Play mode: " + petRecord.getPet().play());
                    break;
                case 3:
                    System.out.println("EXIT");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("\nChoose Pet");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
        }
    }
}
