package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List users = theUser.find("order by name desc").fetch();
        render(users);
    }
    public static void submitUser(String name){
    	
    	theUser user = new theUser(name).save();
    	System.out.println(name);
    	index();
    }

    
}