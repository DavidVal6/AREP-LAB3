package edu.eci.arep.lambda;

import java.io.IOException;


import edu.eci.arep.pr2.HTTPServer;

public class mySpark {

    public static void main(String[] args) throws IOException {
        HTTPServer.get("/hello", str -> "Hello " + str);
        HTTPServer.get("/upload", str -> HTTPServer.getFileRemaster(str));
        HTTPServer.get("/uploadPost",str -> HTTPServer.getFileRemaster(str));
        HTTPServer.getInstance().start(args);
    }
}
