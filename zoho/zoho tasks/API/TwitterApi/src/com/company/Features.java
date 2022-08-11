package com.company;

public class Features {
    private Features() {
    } // Prevents instantiation of this class

    public static void tweetsLookup(){  // 3 - tweet id, 3,3,3 - tweet ids
        System.out.println("Note: In the case of multiple tweet ids to be passed, separate them with a comma without spaces!");
        System.out.print("\nEnter a tweet ID: ");
        String tweetId = UserInput.getString_synchronized();
        String url = EndPoints.TweetsLookup.getUrl();
        System.out.print("\nAdditional parameters (optional): (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';

        url += "?ids=" + tweetId;

        if(choice){
            url += tweetLookup_additionalParameters();
        }

        String response = RequestHandler.handleRequest(url, "GET");

        Response_Handler.prettyJsonString(response);

    }

    public static void usersLookup(){  // // 6253282,1225933934,2244994945 - user ids  // twitterdev,twitterapi,adsapi - screen names

        System.out.println("Note: In the case of multiple user ids to be passed, separate them with a comma without spaces!");
        System.out.print("\nEnter a user ID or screen name : ");
        String userTag = UserInput.getString_synchronized();
        String url = EndPoints.UsersLookup.getUrl();
        System.out.print("\nAdditional parameters (optional): (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';

        if(userTag.matches("[0-9,]+")) {
            url += "?ids=" + userTag;
        } else {
            url += "/by?usernames=" + userTag;
        }

        if(choice){
            url += usersLookup_additionalParameters();
        }

        String response = RequestHandler.handleRequest(url, "GET");

        Response_Handler.prettyJsonString(response);
    }

    public static String tweetLookup_additionalParameters(){
        String queryString = "";

        System.out.print("Want to add time of creation (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';
        queryString = choice ? (queryString + "&tweet.fields=created_at") : queryString;

        System.out.print("Want to add author id (y/n)? : ");
        choice = UserInput.getString_synchronized().charAt(0) == 'y';
        queryString = choice ? (queryString + "&expansions=author_id,attachments.media_keys&user.fields=created_at,profile_image_url&media.fields=media_key,type,url") : queryString;

        return queryString;
    }

    public static String usersLookup_additionalParameters(){
        String queryString = "";

        System.out.print("Want to add time of creation (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';
        queryString = choice ? (queryString + "&user.fields=created_at,profile_image_url") : queryString;

        System.out.print("Want to add author id (y/n)? : ");
        choice = UserInput.getString_synchronized().charAt(0) == 'y';
        queryString = choice ? (queryString + "&expansions=pinned_tweet_id&tweet.fields=author_id,created_at") : queryString;

        return queryString;
    }

    public static void followingLookup(){  //140494020 - user id, 140494020 - user id // hariprakash_k - screen names
        System.out.print("\nEnter a user ID or user name : ");
        String userTag = UserInput.getString_synchronized();

        String url = EndPoints.FollowingLookup.getUrl();

        if(!userTag.matches("[0-9,]+")) {
            userTag = userName_to_userId(userTag);
        }

        url += "/" + userTag + "/following";


        System.out.print("\nAdditional parameters (optional): (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';
        if(choice){
            url += followingLookup_additionalParameters();
        }


        String response = RequestHandler.handleRequest(url, "GET");
        Response_Handler.prettyJsonString(response);
    }

    public static String followingLookup_additionalParameters(){

        String queryString = "?";
        System.out.print("Want to add time of creation (y/n)? : ");
        boolean choice1 = UserInput.getString_synchronized().charAt(0) == 'y';
        queryString = choice1 ? (queryString + "user.fields=created_at") : queryString;

        System.out.print("Want to add author id (y/n)? : ");
        boolean choice2 = UserInput.getString_synchronized().charAt(0) == 'y';
        queryString = choice1 && choice2 ? (queryString + "&") : queryString;
        queryString = choice2 ? (queryString + "expansions=pinned_tweet_id&tweet.fields=author_id,created_at") : queryString;

        return queryString;
    }

    public static void followersLookup(){  //140494020 - user id, 140494020 - user id // hsh_k - screen names
        System.out.print("\nEnter a user ID or user name : ");
        String userTag = UserInput.getString_synchronized();

        String url = EndPoints.FollowersLookup.getUrl();

        if(!userTag.matches("[0-9,]+")) {
            userTag = userName_to_userId(userTag);
        }

        url += "/" + userTag + "/followers";

        System.out.print("\nAdditional parameters (optional): (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';
        if(choice){
            url += followingLookup_additionalParameters();
        }

        String response = RequestHandler.handleRequest(url, "GET");
        Response_Handler.prettyJsonString(response);
    }

    public static void likedTweetsLookup(){
        System.out.print("\nEnter a user ID or user name : ");
        String userTag = UserInput.getString_synchronized();
        String url = EndPoints.LikedTweetsLookup.getUrl();
        System.out.print("\nAdditional parameters (optional): (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';

        if(!userTag.matches("[0-9,]+")) {
            userTag = userName_to_userId(userTag);
        }

        url += "/" + userTag + "/liked_tweets";

        String response = RequestHandler.handleRequest(url, "GET");
        Response_Handler.prettyJsonString(response);
    }

    public static void likingUsersLookup(){
        String userTag = UserInput.getString_synchronized();
        String url = EndPoints.LikingUsersLookup.getUrl();
        System.out.print("\nAdditional parameters (optional): (y/n)? : ");
        boolean choice = UserInput.getString_synchronized().charAt(0) == 'y';

        if(!userTag.matches("[0-9,]+")) {
            userTag = userName_to_userId(userTag);
        }
        url += "/" + userTag + "/liking_users";
        String response = RequestHandler.handleRequest(url, "GET");
        Response_Handler.prettyJsonString(response);
    }

    public static String userName_to_userId(String userName){
        String url = EndPoints.UsersLookup.getUrl();
        url += "/by?usernames=" + userName;
        String response = RequestHandler.handleRequest(url, "GET");
        return Response_Handler.getUserId(response);
    }

    public static void postTweet(){
        System.out.print("\nEnter a tweet : ");
        String tweet = UserInput.getString_synchronized();
        String url = EndPoints.PostTweet.getUrl();
        RequestHandler.setPostMethod("TWEET_POST");
        RequestHandler.setText(tweet);
        String response = RequestHandler.handleRequest(url, "POST");
        Response_Handler.prettyJsonString(response);
        RequestHandler.setText(null);
        RequestHandler.setPostMethod(null);
    }

    public static void postFollow(){
        System.out.print("\nEnter a user ID or user name : ");
        String userTag = UserInput.getString_synchronized();
        String url = EndPoints.PostFollow.getUrl();
        RequestHandler.setPostMethod("FOLLOW_POST");

        if(!userTag.matches("[0-9,]+")) {
            userTag = userName_to_userId(userTag);
        }
        url += "/" + "1555612232163004416" + "/following";
        RequestHandler.setTargetUserIid(userTag);

        String response = RequestHandler.handleRequest(url, "POST");
        Response_Handler.prettyJsonString(response);
        RequestHandler.setTargetUserIid(null);
    }

    public static void postLike(){
        System.out.print("\nEnter a tweet ID : ");
        String tweetId = UserInput.getString_synchronized();
        String url = EndPoints.PostLike.getUrl();
        RequestHandler.setPostMethod("LIKE_POST");
        RequestHandler.setTargetTweetId(tweetId);
        url += "/1555612232163004416/likes";
        String response = RequestHandler.handleRequest(url, "POST");
        Response_Handler.prettyJsonString(response);
        RequestHandler.setPostMethod(null);
        RequestHandler.setTargetTweetId(null);
    }

    public static void deleteTweet(){
        System.out.print("\nEnter a tweet ID : ");
        String tweetId = UserInput.getString_synchronized();
        String url = EndPoints.DeleteTweet.getUrl() + "/" + tweetId;
        RequestHandler.setDeleteMethod("TWEET_DELETE");

        System.out.print("\nAre you sure you want to delete this tweet (y/n)? : ");
        boolean choice = Character.toLowerCase(UserInput.getString_synchronized().charAt(0)) == 'y';

        if(choice){
            String response = RequestHandler.handleRequest(url, "DELETE");
            Response_Handler.prettyJsonString(response);
        }else{
            System.out.println("\nTweet not deleted");
        }
        RequestHandler.setDeleteMethod(null);
    }

    public static void deleteFollowing(){
        System.out.print("\nEnter a user ID or user name : ");
        String userTag = UserInput.getString_synchronized();
        String url = EndPoints.DeleteFollowing.getUrl();
        RequestHandler.setDeleteMethod("FOLLOW_DELETE");

        if(!userTag.matches("[0-9,]+")) {
            userTag = userName_to_userId(userTag);
        }
        url += "/" + "1555612232163004416" + "/following/" + userTag;

        String response = RequestHandler.handleRequest(url, "DELETE");
        Response_Handler.prettyJsonString(response);
    }

    public static void deleteLike(){
        System.out.print("\nEnter a tweet ID : ");
        String tweetId = UserInput.getString_synchronized();
        String url = EndPoints.DeleteLike.getUrl();
        RequestHandler.setDeleteMethod("LIKE_DELETE");
        url += "/1555612232163004416/likes/" + tweetId;
        String response = RequestHandler.handleRequest(url, "DELETE");
        Response_Handler.prettyJsonString(response);
        RequestHandler.setDeleteMethod(null);
    }
}
