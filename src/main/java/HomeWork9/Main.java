package HomeWork9;

import com.sun.net.httpserver.HttpServer;
import HomeWork9.model.UserHandler;
import HomeWork9.controller.IUserController;
import HomeWork9.controller.UserControllerList;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
        IUserController userStorage = new UserControllerList();
        server.createContext("/user", new UserHandler(userStorage));
        server.start();
        System.out.println("Server started on port 8081");

    }
}