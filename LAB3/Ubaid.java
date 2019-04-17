class Ubaid
{
    private int employeeID;
    private String name;

    public void setEmployeeID(int employeeID)
    {

    //int len = employeeID.length();
        if(employeeID<=9999&&employeeID>=1000)
        {
            this.employeeID = employeeID;
            }else
    {
        System.out.println("The Employee ID should be of 4 digits only.");
        
    }
    }

    public void setName(String employeeName)
    {   int length=employeeName.length();
        if(length<3)
        {
            System.out.println("Your name cannot be less than 3 characters");
        }

        else{
            name=employeeName;
        }
    }

    public int getEID()
    {
        return employeeID;
    }

    public String getName()
    {
        return name;
    }

}