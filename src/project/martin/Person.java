package project.martin;

public class Person {
    private String name;
    private int money;
    
    public Person(String aName,int aMoney) {
        this.name = aName;
        money = aMoney;
    }
    
    public String meet(Person aPerson) {
        return "Hello " + aPerson.name + ", I am " + this.name;
    }
    

    public void give(int dollars, Person aPerson) {
    	aPerson.money += dollars;
    	this.money -= dollars;
    }

    public String getWallet() {
        return this.name + ": I have " + this.money + " dollars.";
    }
}
