import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room () {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }    
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person retObj = this.persons.get(0);
        
        for (Person prs : this.persons) {
            if (retObj.getHeight() > prs.getHeight()) {
                retObj = prs;
            }
        }
        return retObj;
    }
    
    // *********************************************************
    public Person take() {
        Person shortPerson = shortest();
        this.persons.remove(shortPerson);
        return shortPerson;
    }
}
