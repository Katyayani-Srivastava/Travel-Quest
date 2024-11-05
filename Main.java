package com.travel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email to subscribe to the newsletter: ");
        String email = scanner.nextLine();

        NewsletterSubscriber subscriber = new NewsletterSubscriber();
        subscriber.subscribe(email);

        scanner.close();
    }
}
