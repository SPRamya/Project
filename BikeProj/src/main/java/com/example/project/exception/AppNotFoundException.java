package com.example.project.exception;

public class AppNotFoundException extends RuntimeException {
public AppNotFoundException(int id)
{
	super("Could not found the app with id"+id);
}
}
