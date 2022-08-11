package com.company;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n0. Exit 1. GET 2. POST 3. DELETE");
            System.out.print("\nEnter your choice: ");
            int choice = UserInput.getInt();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    RequestMethod.get();
                    break;
                case 2:
                    RequestMethod.post();
                    break;
                case 3:
                    RequestMethod.delete();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
