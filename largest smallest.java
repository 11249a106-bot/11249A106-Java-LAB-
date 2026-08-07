public class largest smallest
{
 public state void main(string[]args)
  {
   int a[]=new int[]{23,34,13,64,72,90,10,15,9,27};
   int sum=0;
   int min=a[0];
   int max=
   a[0];
   for (int i=1;i<a,length;i++)
   { 
     if (a[i]>max)
      {
        max=a[i];
      }
      if (a[i]<min)
      {
       min =a[i];
      }
       sum=sum+a[i];
  }
  system.out.println("The sum is:"+sum);
  system.out.println("Largest Number in a given array is:"+max);
  system.out.println("Smallest Number in a given array is:"+min);
 }
}