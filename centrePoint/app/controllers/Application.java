package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void addEvent(String eventName)
    {
    	String name = "ewName";
    	render();
    
    }
    
    public static void getEvent(String name)
    {
    	Event getE = Event.find("byName", name);
    	render("Application.index", getE);
    
    }
    
    public static void postEvent(
    	String inputTitle,
    	String inputCategory,
    	String inputDescription,
    	String inputStartTime)
    {
    	Event newE = new Event(inputTitle, inputCategory, inputDescription, inputStartTime);
    	newE.save();	
    	render("@Application.index");
    }
}