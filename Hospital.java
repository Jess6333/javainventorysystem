package databaseconnection;
public class Hospital {
    private String hospitalCode;
    private String hospitalName;
    private String email;
    private String address;
    private String contactPerson;
    private int phoneNum;
    
    
    public Hospital(String hospitalCode,String hospitalName,String email,String address,String contactPerson,int phoneNum)
    {
        this.hospitalCode=hospitalCode;
        this.hospitalName=hospitalName;
        this.address=address;
        this.contactPerson=contactPerson;
        this.email=email;
        this.phoneNum=phoneNum;
    }
    
    public String gethospitalCode()
    {
        return hospitalCode;
    }
    
    public String gethospitalName()
    {
        return hospitalName;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getContactPerson()
    {
        return contactPerson;
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
