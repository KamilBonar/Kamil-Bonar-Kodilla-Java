package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User adam = new Millenials("Adam Nowak");
        User marta = new YGeneration("Marta Kot");
        User jan = new ZGeneration("Jan Kowalski");

        //When
        String adamSocialNetwork = adam.sharePost();
        System.out.println("Adam Nowak share posts on " + adamSocialNetwork);
        String martaSocialNetwork = marta.sharePost();
        System.out.println("Marta Kot share posts on " + martaSocialNetwork);
        String janSocialNetwork = jan.sharePost();
        System.out.println("Jan Kowalski share posts on " + janSocialNetwork);

        //Then
        Assertions.assertEquals("Facebook Publisher", adamSocialNetwork);
        Assertions.assertEquals("Twitter Publisher", martaSocialNetwork);
        Assertions.assertEquals("Snapchat Publisher", janSocialNetwork);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User anna = new Millenials("Anna Byk");

        //When
        String annaSocialNetwork = anna.sharePost();
        System.out.println("Anna Byk share posts on " + annaSocialNetwork);
        anna.setSocialPublisher(new SnapchatPublisher());
        annaSocialNetwork = anna.sharePost();
        System.out.println("Anna Byk now share posts on " + annaSocialNetwork);

        //Then
        Assertions.assertEquals("Snapchat Publisher", annaSocialNetwork);
    }
}