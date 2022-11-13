package main.java;

import main.java.Filter;

public class ToLowerCaseFilter implements Filter<String> {
    public String execute(String input){
        return input.toLowerCase();
    }
}
