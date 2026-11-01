public class Sales {
    public static void main (String[] args) {
        int sales[] = {1200,2500,1800,3000,2200,2700,3500,2000,4000,3800,2600,3100,};
        int max=sales[0];
        int min=sales[0];
        for (int i=1;i<sales.length;i++)
        {
            if (sales [i]>max)
                max=sales[i];
            if (sales[i]<min)
                min=sales[i];
        }
        System.out.println("Maximum Sales="+max);
        System.out.println("Minimum Sales="+min);
      }
}
