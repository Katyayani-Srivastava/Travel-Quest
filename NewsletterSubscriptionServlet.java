package com.travel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/subscribe")
public class NewsletterSubscriptionServlet extends HttpServlet {
    private NewsletterSubscriberDAO subscriberDAO;

    @Override
    public void init() {
        subscriberDAO = new NewsletterSubscriberDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        if (email != null && !email.isEmpty()) {
            subscriberDAO.addSubscriber(email);
            response.getWriter().write("Subscription successful for email: " + email);
        } else {
            response.getWriter().write("Invalid email address.");
        }
    }
}
