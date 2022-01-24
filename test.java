package pageFactory;

public class test {
public static void main(String [] args){

    String id  = "7607035041081";
    int []numbers = new int[13];
    int []numbers2 = new int[7];
    String even_numbers="";
    String uneven_numbers="";
    int sumOfNUmbers2=0;
    int step4=0;
    int step5=0;
    int [] step2Array = new int[6];
    //Step 1
    for(int i = 0; i < id.length(); i++ )
    {
        numbers[i] = Integer.parseInt(id.substring(i,i+1));
    }
    for (int c=numbers.length-2; c >= 0; c=c-2) {

        even_numbers = numbers[c] + even_numbers;
    }
    for (int c=numbers.length-1; c >= 0; c=c-2) {

        uneven_numbers = numbers[c] + uneven_numbers;

    }
    for(int i = 0; i < uneven_numbers.length()-1; i++ )
    {
        numbers2[i] = Integer.parseInt(uneven_numbers.substring(i,i+1));
        System.out.println("uneven numbers 2 answer :" + numbers2[i]);
        sumOfNUmbers2=numbers2[i]+sumOfNUmbers2;
    }
    System.out.println("Sum of step 1 answer : " + sumOfNUmbers2);
    System.out.println("Even numbers  answer :" + even_numbers);
    //STE 2
    int step2 = Integer.parseInt(even_numbers) *2;
    System.out.println("uneven numbers 2 answer :" + numbers2[0]);
    //STEP 3
    String step2Answer = String.valueOf(step2);
    int [] step3Numbers = new int[step2Answer.length()];
    int sumOfNUmbers=0;

    for(int i = 0; i < step2Answer.length(); i++ )
    {
        step3Numbers[i] = Integer.parseInt(step2Answer.substring(i,i+1));

        sumOfNUmbers=step3Numbers[i]+sumOfNUmbers;
    }
    //System.out.println("Step 3 answer " + step3Numbers);
    System.out.println("Sum of numbers answer : " + sumOfNUmbers);
    for (int i=0;i<step3Numbers.length;i++)
    {
        step3Numbers[i] = numbers[i];
    }
step4=sumOfNUmbers2+sumOfNUmbers;
    System.out.println("Step 4 answer :" +step4);
    step5=10-Integer.parseInt(String.valueOf(step4).substring(1));
    System.out.println("Step 5 answer :" +step5);
    
}
}
