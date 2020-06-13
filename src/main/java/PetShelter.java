import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

    Map<String, Pets> shelter = new HashMap<>();
    Map<String, OrganicPets> orgShelter = new HashMap<>();
    Map<String, RoboticPets> roboShelter = new HashMap<>();

    public Pets findPet(String petName) {
        return shelter.get(petName);
    }

    public void addPet(Pets pet) {
        shelter.put(pet.getPetName(), pet);
    }

    public void removePet(Pets pet) {
        shelter.remove(pet.getPetName(), pet);
    }

    public Collection<Pets> getAllPets() {
        return shelter.values();
    }

    public void feedAllPets(int amount){
        for(Pets pet: shelter.values()) {
            if(pet instanceof OrganicPets) {
                ((OrganicPets) pet).feed(amount);
            }
        }
    }

    public void waterAllPets(int amount){
        for(Pets pet: shelter.values()) {
            if(pet instanceof OrganicPets) {
                ((OrganicPets) pet).water(amount);
            }
        }
    }

    public void play(String petName) {
        OrganicPets playPet = (OrganicPets) findPet(petName);
        playPet.play(1);
    }

    public void showAllPets() {  //organic or robotic (all)
        for(Map.Entry<String, Pets> entry: shelter.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public void showAllDogs() {
        for(Pets pet: shelter.values()) {
            if(pet instanceof Walking) {
                System.out.println(pet);
            }
        }
    }

    public void oilRoboPets(int amount){
        for(Pets pet: shelter.values()) {
            if(pet instanceof RoboticPets) {
                ((RoboticPets) pet).oilRoboPets(amount);
            }
        }
    }

    public void showAllOrgPets() {
        for(Pets pet: shelter.values()) {
            if(pet instanceof OrganicPets) {
                System.out.println(pet);
            }
        }
    }

    public void showAllOrgDogs() {
        for(Pets pet: shelter.values()) {
            if(pet instanceof OrganicDog) {
                System.out.println(pet);
            }
        }
    }

    public void showAllOrgCats() {
        for(Pets pet: shelter.values()) {
            if(pet instanceof OrganicCat) {
                System.out.println(pet);
            }
        }
    }

    public void cleanOrganicDogCages(String petName, int amount) {
        OrganicDog cleanDog = (OrganicDog) findPet(petName);
        cleanDog.cleanDogCage(amount);
    }

    public void cleanOrganicCatLitterBox(String petName, int amount) {
        OrganicCat cleanCat = (OrganicCat) findPet(petName);
        cleanCat.cleanLitterBox(amount);
    }

    public void walkAllOrgDogs(String petName, int amount) {
        OrganicDog walkOrgDog = (OrganicDog) findPet(petName);
        walkOrgDog.walking();
    }

    public void walkAllRoboDogs(String petName, int amount) {
        RoboticDog walkRoboDog = (RoboticDog) findPet(petName);
        walkRoboDog.walking();
    }
}
