package main.java;

public interface Filter<T> {

    T execute(T input);

}

