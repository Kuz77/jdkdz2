package org.example.server;

public interface Repository {
    void save(String text);
    String read();
}
