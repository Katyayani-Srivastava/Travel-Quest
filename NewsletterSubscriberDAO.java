package com.travel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewsletterSubscriberDAO {
    public void addSubscriber(String email) {
        String sql = "INSERT INTO newsletter_subscribers (email) VALUES (?)";

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.executeUpdate();
            System.out.println("Subscription successful for email: " + email);
        } catch (SQLException e) {
            System.out.println("Error subscribing email: " + email);
            e.printStackTrace();
        }
    }
}
