package com.coffeepoweredcrew.simplefactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post createPost(String type){
        switch (type){
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            case "blog":
                return new BlogPost();
            default:
                throw new IllegalArgumentException("Not recognized argument");
        }
    }

}
