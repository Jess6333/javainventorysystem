package databaseconnection;

public class User {
    private String userID;
    public String password;
    public String name;
    public String userType;
    public String email;
    public int phoneNum;
    
    public User(String userID,String password,String name,String userType,String email,int phoneNum)
    {
        this.userID=userID;
        this.name=name;
        this.password=password;
        this.userType=userType;
        this.email=email;
        this.phoneNum=phoneNum;
    }
    
    public String getUserID()
    {
        return userID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getUserType()
    {
        return userType;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public int getPhoneNum()
    {
        return phoneNum;
    }        
}
