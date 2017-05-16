/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author dinker
 */

    
public class connect{
    static Connection C =null;
    connect() 
    {
          try{
              Class.forName("com.mysql.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital","root","abc123");
          }
          catch(Exception e)
          {
              System.out.println("hello");
          }
    }
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection C;
            C = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital","root","abc123");
            Statement stmt=C.createStatement();
          //stmt.executeUpdate("Create table appointdetails(Name text,DOB text,Gender text,Address text,State text,Pincode int,Contact int,DoctorName text,Timings text,RoomNo int,Charges int)");
            //stmt.executeUpdate("Create table patient(Name text,DOB text,Gender text,Address text,State text,City text,Pincode int,BloodGroup text,Contact int)");
            //stmt.executeUpdate("Create table doctor(Name text,DOB text,Gender text,Address text,Qualification text,Specialization text,Contact int)");
            //stmt.executeUpdate("Create table logindoc(LoginID int,Password text)");
            //stmt.executeUpdate("Create table logindoc(LoginID int,Password text)");
            //stmt.executeUpdate("Create table medicine(Name text,InStock int,Manufacture text,Expiry text)");
           // stmt.executeUpdate("Create table roomdetails(RoomNo int,Type text,Charges text)");
           // stmt.executeUpdate("Create table warddetails(WardNo int,Type text,NoOfbeds int,Charges text)");
          //  stmt.executeUpdate("Create table docleave(Name text,Department text,Designation text,Address text,Contact int,LeaveFrom int,LeaveTo int,Days int,Reason text,Type text,Sign text)");              
        } 
        catch(Exception e)
        {
          System.out.println(e);
        }
    }
    
}
