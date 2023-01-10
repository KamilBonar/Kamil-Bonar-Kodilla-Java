package com.kodillagoodpatterns.challenges;

public class OrderDto {
    public User user;
    public boolean isBuyed;

    public OrderDto(User user, boolean isBuyed) {
        this.user = user;
        this.isBuyed = isBuyed;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsBuyed() {
        return isBuyed;
    }
}
