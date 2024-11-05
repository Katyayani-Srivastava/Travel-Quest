package com.travel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewsletterSubscriber {
    public void subscribe(String email) {
        String sql = "INSERT INTO newsletter_subscribers (email) VALUES (?)";

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.executeUpdate();
            System.out.println("Subscription successful for email: " + email);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
