package com.epam.training.task7;

public interface ConnectionProvider {
    Connection createConnection(String connectionString);
}
