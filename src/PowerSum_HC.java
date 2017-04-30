import java.util.Scanner;

public class PowerSum_HC {
	static Integer solutions = 0;
	public static void main(String[] args)
    {
		Scanner scanner = new Scanner(System.in);
		
        int x = scanner.nextInt();
        int n = scanner.nextInt();
       
        process(0, x, 1, n);
        System.out.println(solutions);
        
        scanner.close();
    }

    private static void process(int currentSum, int targetSum, int currentNumber, int n)
    {
    	System.out.println("process called with : currentSum : "+currentNumber+" targetSum : "+targetSum+" currentNumber : "+currentNumber+" n : "+n);
        if (currentSum == targetSum)
        {
            solutions++;
            return;
        }

        for (int i = currentNumber; currentSum + (int)Math.pow(i, n) <= targetSum; i++)
            process(currentSum + (int)Math.pow(i, n), targetSum, i + 1, n);
    }
}
