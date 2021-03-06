package org.webrtc.web;

import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectPageServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Logger log = Logger.getLogger(ConnectPageServlet.class.getName());

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String[] key = req.getParameterValues("from");
        if (key != null && key.length > 0) {
            String[] values = key[0].split("/");
            String room_key = values[0];
            String user = values[1];
            log.info("User " + user + " connected to room " + room_key);
        }
    }
}
