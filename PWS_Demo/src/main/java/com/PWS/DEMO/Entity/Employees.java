package com.PWS.DEMO.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getters and setters and tostring 
@AllArgsConstructor//builds constructor with all the arguments
@NoArgsConstructor//builds constructor with no the arguments
@Document("Employees")
public class Employees {
   @Id
    private long eid;
    private String name;
    private long Salary;
 
}
