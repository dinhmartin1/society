package project.martin;

public class Society {

    public static void main(String[] args) {
        Person alice = new Person("Alice", 10);
        Person bob = new Person("Bob", 0);
        String meeting = alice.meet(bob);
        System.out.println(meeting);
        System.out.println(bob.meet(alice));

        alice.give(2, bob);
        alice.give(3, bob);
        bob.give(3, alice);
        System.out.println(alice.getWallet());
        System.out.println(bob.getWallet());

    }
}
