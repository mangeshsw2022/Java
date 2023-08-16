// palindrome number : 1234321
// palindrome number is the number that we write reverce that same as number .


class Palindrome 
{
    public void palindromeNumber(int num)
    {
        int revercNum=0;
        int count=0;
        for(int i=0;i<num;i++)
        {
            int lastNum = num%10;
            // lastNum *=10;
            revercNum = revercNum * 10;
            revercNum = revercNum + lastNum;
            count++;
            // int value += revercNum;
            num = num/10;   
            // System.out.println("reverceNum :"+revercNum);          
        }
        // System.out.println("count :"+count);
        // System.out.println("reverceNum :"+revercNum);
        // System.out.println("Num :"+num);
        int reverce = (revercNum*10)+num;
        
        if(num==reverce)    //given number and reverce number is same than this is palindrome number otherwise not this is palindrome number
        {
            System.out.println("this number is palindrome.");
        }
        else
        {
            System.out.println("this number is not palindrome.");
        }
    }
    public static void main(String[] args)
    {
        Palindrome p = new Palindrome();
        p.palindromeNumber(1211);
    }    
}
