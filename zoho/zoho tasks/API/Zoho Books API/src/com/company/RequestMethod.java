package com.company;

public class RequestMethod {
    private RequestMethod() {
    } // private constructor to prevent instantiation

    public static void get() {

        while(true) {
            System.out.println("\n0. Back ");
            System.out.print("\nEnter your choice: ");
            int choice = UserInput.getInt();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void post() {
        System.out.println("\n0. Back 1. Create a contact");
        System.out.print("\nEnter your choice: ");
        int choice = UserInput.getInt();

        switch (choice) {
            case 0:
                return;
            case 1:
                //PostFeatures.createContact();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void put(){
        System.out.println("\n0. Back");
        System.out.print("\nEnter your choice: ");
        int choice = UserInput.getInt();

        switch (choice) {
            case 0:
                return;
            case 1:
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }


    public static void delete() {
        System.out.println("\n0. Back");
        System.out.print("\nEnter your choice: ");
        int choice = UserInput.getInt();

        switch (choice) {
            case 0:
                return;
            case 1:
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
