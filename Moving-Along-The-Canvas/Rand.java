import java.util.Random;

public class Rand
{
    Random r = new Random();
    
    public void Rand()
    {
     int i = 0, x;
     
     while (i<=100) {
            x = r.nextInt(10);
            System.out.println(x);
            i++;
        }
     
    }
    
    public void Rand2() 
    {
     double a = 0, f;
     
     while (a<=40) {
            f = r.nextDouble()+1;
            System.out.println(f);
            a++;
        }
    }
    
    public void sumRandom() //I don't like it to return something for double checking my jokes:)))))
    {
        int sum=0;
        for(int i=0; i<100; i++)
        {
          int randomint = 2 + r.nextInt(4);
          System.out.println(randomint);
          sum = sum + randomint ;
        }
         System.out.println("Sum = " + sum);
    }
    
    public void averageRandom() //I don't like it to return something for double checking my jokes:)))))
    {
        int sum=0;
        double a;
        for(int i=0; i<40; i++)
        {
          int randomint = r.nextInt(10);
          System.out.println(randomint);
          sum = sum + randomint;
        }
         System.out.println("Sum = " + sum);
         a = (double)sum/40;
         System.out.println("Average = " + a);
    }
    
    public void generate10() //I don't like it to return something for double checking my jokes:)))))
    {
        for(int i=0; i<10; i++)
        {
          int randomint = 5 + r.nextInt(6);
          System.out.print(randomint);
          System.out.println(randomint);
        }
    }
}