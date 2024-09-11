public class Problem2{
    public static void main(String[] args)
    {
        int theNumber = 678;
        int firstNum = (theNumber/100); 
        int secondNum = (theNumber/10)%10;
        int finalNum = (theNumber%10);
        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(finalNum);
        
        //Alternative intended solution
        System.out.println(theNumber/100);
        System.out.println(theNumber/10%10);
        System.out.println(theNumber%10);
    }
}
