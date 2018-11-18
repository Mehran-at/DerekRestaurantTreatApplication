
//Derek is having dinner with his friends and wants to treat them to celebrate that he got a job as developer. However, he’s not sure whether he’s got enough money to do it. In order to figure it out he needs to cover the following points:
//        - Ask himself how much money he has in his wallet.
//        - Ask himself how many friends are having dinner with him.
//        - Ask all his friends one by one how much money they have to pay.
//        - Decide whether he’s got enough money to invite them or not and say it.
//Develop the following code:
//        a. Define a method to ask Derek how much money he has.
//        b. Define a method that asks all his friends and calculates the total money that they have to pay.
//        c. Write the code that Derek uses to say if he can invite his friends or not.
//        Hints:
//        >Try to separate every sub-problem in methods so they become easier to solve.
//        >Assume nobody needs cents that night.
//        >No need to validate for negative numbers or any other hocus-pocus.
import java.util.Scanner;

public class DerekRestaurantTreatApplication {
    public static void main(String[] args) {
        Integer money = getMoney();
        Integer debt = getFriendsDebt();
        concludeWhetherDerekCanTreatHisFriends(money, debt);
    }
    private static Integer getMoney() {
        System.out.println("How much money do I have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static Integer getFriendsDebt() {
        Scanner scanner = new Scanner(System.in);
        Integer numberOfFriends = getNumberOfFriends();
        Integer debt = 0;
        for (int times = 0; times < numberOfFriends; times++) {
            System.out.println("How much do you have to pay?");
            Integer money = scanner.nextInt();
            debt = debt + money;
        }
        return debt;
    }
    public static Integer getNumberOfFriends() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many friends are here?");
        return scanner.nextInt();
    }
    private static void concludeWhetherDerekCanTreatHisFriends(Integer money, Integer debt) {
        boolean canInvite = money >= debt;
        if (!canInvite) {
            System.out.println("Sorry mates, I can't invite you today.");
            return;
        }
        System.out.println("You're all invited!");
        Integer myDebt = getMyDebt();
        canInvite = money >= debt + myDebt;
        if (!canInvite) {
            System.out.println("Sorry mates, I miscalculated! I can't invite you today.");
        }
    }
    private static Integer getMyDebt() {
        System.out.println("How much money do I have to pay?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}