public class App {
    public static void main(String[] args) throws Exception 
    {
        for(int i = 0; i < 10; i++) 
        {

            for(int j = 0; j < i; j++) 
            {
                System.out.print('*'); // will iterate i number of times
            }
        
            System.out.println(); // creates a new line
        }
    }
}
