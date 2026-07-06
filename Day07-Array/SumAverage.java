public class SumAverage
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to sum and average!") ;
       int numArr[]=ArrayUtility.inputArray();
        long sum=sum(numArr);
        double average=average(numArr);
        System.out.println("Sum of array= "+sum);
        System.out.println("Average of array = "+average);
    }
    public static long sum(int[] numArr)
    {
        int i=0;
        long sum=0;
        while(i<numArr.length)
        {
            sum+=numArr[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] numArr)
    {
        double sum = sum(numArr);
        return sum / numArr.length;
    }
}
