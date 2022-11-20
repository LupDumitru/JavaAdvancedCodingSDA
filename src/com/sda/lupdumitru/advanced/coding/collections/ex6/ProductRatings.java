package com.sda.lupdumitru.advanced.coding.collections.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRatings {
   private final String name;
   private final List<Integer> ratings=new ArrayList<>();

    public ProductRatings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRatings() {
        return ratings;
    }
    public void addRating(int rating){
        if(rating>=1 && rating<=6){
            ratings.add(rating);
        }else {
            throw new IllegalArgumentException("Invalid rating "+rating);
        }
    }
    public double averageRating(){
        if(ratings.size()==0){
            return 0;
        }
        double sum=0;
        for(int rating:ratings){
            sum+=rating;
        }
        return sum/ratings.size();
    }
    public double averageRatingWithSteams(){
        return ratings.stream().collect(Collectors.averagingDouble(rating->rating));

    }
}
