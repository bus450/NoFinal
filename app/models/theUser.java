package models;

import java.util.*;

import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class theUser extends Model
{
	
	
	public String name;
    public theUser() {}   
    public theUser(String name) 
    {  	
    	this.name = name;
    	System.out.println(name);
    } 
    
    public static theUser connect(String name) {
        return find("byName", name).first();
    }
    public String toString() {
        return name;
    }
}

