package com.company;

public class RequestMethod {
    private RequestMethod() {
    } // private constructor to prevent instantiation

    public static void get() {

        while(true) {
            System.out.println("\n0. Back 1. TweetsLookup 2. UsersLookup 3. FollowingLookup 4. FollowersLookup 5. LikedTweetsLookup 6. LikingUsersLookup");
            System.out.print("\nEnter your choice: ");
            int choice = UserInput.getInt();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    Features.tweetsLookup();
                    break;
                case 2:
                    Features.usersLookup();
                    break;
                case 3:
                    Features.followingLookup();
                    break;
                case 4:
                    Features.followersLookup();
                    break;
                case 5:
                    Features.likedTweetsLookup();
                    break;
                case 6:
                    Features.likingUsersLookup();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void post() {
        System.out.println("\n0. Back 1. PostTweet 2. PostFollow 3. PostLike");
        System.out.print("\nEnter your choice: ");
        int choice = UserInput.getInt();

        switch (choice) {
            case 0:
                return;
            case 1:
                Features.postTweet();
                break;
            case 2:
                Features.postFollow();
                break;
            case 3:
                Features.postLike();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }


    public static void delete() {
        System.out.println("\n0. Back 1. DeleteTweet 2. DeleteFollow 3. DeleteLike");
        System.out.print("\nEnter your choice: ");
        int choice = UserInput.getInt();

        switch (choice) {
            case 0:
                return;
            case 1:
                Features.deleteTweet();
                break;
            case 2:
                Features.deleteFollowing();
                break;
            case 3:
                Features.deleteLike();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
