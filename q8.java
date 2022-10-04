class Resource implements AutoCloseable 
{

    public Resource() 
    {
        System.out.println("Resource Created..");
    }

    public void Display() 
    {
        System.out.println("Display Method Called..");
    }

    @Override
    public void close() throws Exception 
    {
        System.out.println("Resource Closed..");
    }
}

class Question_8 
{
    public static void main(String[] args) throws Exception 
    {
        Resource res = new Resource();
        try (res) 
        {
            res.Display();
        }
    }
}
