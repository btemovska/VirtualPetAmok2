import java.util.Scanner;

public class PetApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amountToFeed;
        int amountToWater;
        String petToPlay;
        String petToWalk;
        int amountToWalk;
        int amountToOil;
        String dogToClean;
        int numOfBrooms;
        String catToClean;
        String needGloves;
        int numOfGloves;
        String petToAdopt;
        String newPetName;
        String newPetType;

        PetShelter petShelter = new PetShelter();
        OrganicCat orgCat = new OrganicCat("Lola", "Organic Cat", 1,1,20,30,10, 1);
        OrganicDog orgDog = new OrganicDog("Maxie", "Organic Dog", 1,1,30,40,10,1);
        RoboticCat roboCat = new RoboticCat("Julie", "Robotic Cat", 1,1,2);
        RoboticDog roboDog = new RoboticDog("Cooper", "Robotic Dog", 1,1,2);

        petShelter.addPet(orgCat);
        petShelter.addPet(orgDog);
        petShelter.addPet(roboCat);
        petShelter.addPet(roboDog);

        System.out.println("HI! Thank you for volunteering at the shelter today!");
        System.out.println();
        System.out.println("Here are our pets and their current status:");
        System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
        petShelter.showAllPets();

        System.out.println("How would you like to volunteer today?");
        System.out.println("press 1 to feed all Organic pets");
        System.out.println("press 2 to water all Organic pets");
        System.out.println("press 3 to play with Organic pet");
        System.out.println("press 4 to walk a Dog");
        System.out.println("press 5 to oil Robotic pets");
        System.out.println("press 6 to clean Organic Dog's cages");
        System.out.println("press 7 to clean Organic Cat's litter box");
        System.out.println("press 8 to adopt a pet");
        System.out.println("press 9 to admit a pet");
        System.out.println("press 10 to quit");

        String response = input.nextLine();

        while (!response.equals("10")) {

            if(response.equals("1")) {
                System.out.println("Enter the number of cups you want to feed:");
                amountToFeed = input.nextInt();
                petShelter.feedAllPets(amountToFeed);
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
                input.nextLine();
            } else if(response.equals("2")) {
                System.out.println("Enter the number of cups you want to water:");
                amountToWater = input.nextInt();
                petShelter.waterAllPets(amountToWater);
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
                input.nextLine();
            } else if(response.equals("3")) {
                System.out.println("Enter which pet you want to play with?");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllOrgPets();
                petToPlay = input.nextLine();
                petShelter.play(petToPlay);
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
            } else if(response.equals("4")) {
                System.out.println("Which pet would you be walking today?");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllOrgDogs();
                petToWalk = input.nextLine();
                System.out.println("And how long will you be walking " + petToWalk + "?");
                amountToWalk = input.nextInt();
                petShelter.walkAllOrgDogs(petToWalk, amountToWalk);
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
                input.nextLine();
            } else if(response.equals("5")) {
                System.out.println("Please add a number of oil drops to keep them running:");
                amountToOil = input.nextInt();
                petShelter.oilRoboPets(amountToOil);
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
                input.nextLine();
            } else if(response.equals("6")) {
                System.out.println("Which Organic Dog's cage will you be cleaning?");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllOrgDogs();
                dogToClean = input.nextLine();
                System.out.println("How many brooms will you be needing? Please enter a number");
                numOfBrooms = input.nextInt();
                petShelter.cleanOrganicDogCages(dogToClean, numOfBrooms);
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
                input.nextLine();
            } else if(response.equals("7")) {
                System.out.println("Which Organic Cat's litter box will you be cleaning?");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllOrgCats();
                catToClean = input.nextLine();
                System.out.println("Do you need gloves (yes/no)?");
                needGloves = input.nextLine();
                if(needGloves.equals("yes")) {
                    System.out.println("How many gloves do you need? Please enter a number.");
                    numOfGloves = input.nextInt();
                    petShelter.cleanOrganicCatLitterBox(catToClean, numOfGloves);
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                    petShelter.showAllOrgCats();
                    input.nextLine();
                } else if(needGloves.equals("no")) {
                    petShelter.cleanOrganicCatLitterBox(catToClean, 3);
                    System.out.println("Thank you for cleaning with bare hands!");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                    petShelter.showAllOrgCats();
                } else {
                }
            } else if(response.equals("8")) {
                System.out.println("What pet would you like to adopt?");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
                petToAdopt = input.nextLine();
                petShelter.removePet(petShelter.findPet(petToAdopt));
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                petShelter.showAllPets();
            } else if(response.equals("9")) {
                System.out.println("What is the name of the new pet joing our shelter?");
                newPetName = input.nextLine();
                System.out.println("What type of pet is it? (Organic Cat, organic Dog, Robotic Cat, Robotic Dog)?");
                newPetType = input.nextLine();
                if(newPetType.toLowerCase().equals("organic cat")) {
                    petShelter.addPet(new OrganicCat(newPetName, newPetType, 1,1,1,1,1,1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                    petShelter.showAllPets();
                } else if(newPetType.toLowerCase().equals("organic dog")) {
                    petShelter.addPet(new OrganicDog(newPetName, newPetType,1,1,1,1,1,1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                    petShelter.showAllPets();
                } else if(newPetType.toLowerCase().equals("robotic cat")) {
                    petShelter.addPet(new RoboticCat(newPetName, newPetType,1,1,1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                    petShelter.showAllPets();
                } else if(newPetType.toLowerCase().equals("robotic dog")) {
                    petShelter.addPet(new RoboticDog(newPetName, newPetType, 1,1,1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOilLevel");
                    petShelter.showAllPets();
                } else {
                }
            }
            System.out.println();
            System.out.println("How about an additional work?");
            System.out.println("press 1 to feed all Organic pets");
            System.out.println("press 2 to water all Organic pets");
            System.out.println("press 3 to play with Organic pet");
            System.out.println("press 4 to walk a Dog");
            System.out.println("press 5 to oil Robotic pets");
            System.out.println("press 6 to clean Organic Dog's cages");
            System.out.println("press 7 to clean Organic Cat's litter box");
            System.out.println("press 8 to adopt a pet");
            System.out.println("press 9 to admit a pet");
            System.out.println("press 10 to quit");

            response = input.nextLine();
        }
        System.out.println("Ciao, thank you for volunteering today");
    }
}
