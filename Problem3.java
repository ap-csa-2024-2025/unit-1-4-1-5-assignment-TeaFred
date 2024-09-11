public class Problem3{
    public static void main(String[] args)
    {
        int theNumber = 5678;
        int firstNum = (theNumber/1000); 
        int secondNum = (theNumber/100)%10;
        int thirdNum = (theNumber/10%10);
        int finalNum = (theNumber%10);
        System.out.println(finalNum);   
        System.out.println(thirdNum); 
        System.out.println(secondNum);
        System.out.println(firstNum);  
    }
}
