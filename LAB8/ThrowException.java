class ThrowException
{
    public static void main(String[] args)
    
    {
        try{
        String str = null;
        System.out.println(str.length());
        }
        catch(Exception nullException)
        {
            System.out.println("null");
        }
    }
}