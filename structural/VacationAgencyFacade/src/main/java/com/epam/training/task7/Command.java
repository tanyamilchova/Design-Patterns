package com.epam.training.task7;

public interface Command extends AutoCloseable {
    void executeQuery(String query, Object... params);
}
