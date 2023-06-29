package com.example.exceptions;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception{ // extends Exception class
public InvalidAgeException() { 
	super("Invalid Age");
}
InvalidAgeException (String message){
super (message);
}

@Override
public String getMessage() {

// TODO Auto-generated method stub 
	return "You have to wait to become 18 years old citizen";

}
}