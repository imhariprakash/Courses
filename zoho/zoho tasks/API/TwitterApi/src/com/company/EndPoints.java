package com.company;

public enum EndPoints {
    TweetsLookup("/tweets"),
    UsersLookup("/users"),
    FollowingLookup("/users"),
    LikedTweetsLookup("/users"),
    LikingUsersLookup("/tweets"),
    PostTweet("/tweets"),
    FollowersLookup("/users"),
    PostFollow("/users"),
    PostUnfollow("/follows"),
    PostFavorite("/favorites"),
    PostUnfavorite("/favorites"),
    DeleteTweet("/tweets"),
    DeleteFollowing("/users"),
    DeleteFollower("/users"),
    DeleteFavorite("/favorites"),
    PostLike("/users"), DeleteLike("/users");
    private final String BASE_URL = "https://api.twitter.com/2";
    private final String url;

    EndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return (BASE_URL + url);
    }

}
