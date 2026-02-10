package com.epam.training.task7;

public interface Connection extends AutoCloseable {
    Command createCommand();
}
