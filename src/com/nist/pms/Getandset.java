/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nist.pms;

/**
 *
 * @author Rishika Gupta
 */
public class Getandset {
    static private String id;
    static private String ownername;
    static private String petname;
    static private String phone;
    static private String age;
    static private String breed;
    static private String gender;
    static private String username;
    static private String password;
    
    // Getter
  public String getId() {
    return id;
  }

  // Setter
  public void setId(String newId) {
    this.id = newId;
  }
  
  public String getOwnerName(){
      return ownername;
  }
  public void setName(String fullName){
      this.ownername = fullName;
  }
   public String getPetName(){
      return petname;
  }
  public void setPetName(String petName){
      this.petname = petName;
  }
 
    public String getAge(){
      return age;
  }
  public void setAge(String Age){
      this.age = Age;
  }
    public String getBreed(){
      return breed;
  }
  public void setBreed(String Breed){
      this.breed = Breed;
  }
  public String getPhone(){
      return phone;
  }
  public void setPhone(String Phone){
      this.phone = Phone;
  }
  public String getGender(){
      return gender;
  }
  public void setGender(String Gender){
      this.gender = Gender;
  }
  public String getUsername(){
      return username;
  }
  public void setUsername(String Username){
      this.username = Username;
  }
  public String getPassword(){
      return password;
  }
  public void setPassword(String Password){
      this.password = Password;
  }
  

}
