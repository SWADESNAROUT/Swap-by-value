public class Passing
{
    int x, y;
 /* Passing(int i, int j)
   {
       x =i;
       y =j;

   }*/
 Passing(int x, int y)
  {
      this.x =x;
      this.y =y;

  }

}
   class Notmain
   {
       public static void main(String args[])
       {
           Passing t = new Passing(10,20);
           swap(t);
           System.out.print(t.x + " ");
           System.out.println(t.y );
       }

            public static void swap(Passing t)
        {
            int temp =  t.x;
            t.x = t.y;
            t.y = temp;

        }

   }



