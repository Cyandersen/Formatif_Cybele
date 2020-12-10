/*
* Author: cy.andersen
* Date: Dec. 10, 2020
* Description:
*/

public class Formative1
{
    static int [] arr = new int [] {1, 2, 10, 5, 6};  

	public static void main(String[] args)
	{
		System.out.println("La somme des élément est " + summ());}

	static int summ()
	{
        int sum = 0;  
        for (int i = 0; i < arr.length; i++) {  
            sum = sum + arr[i];  
	}
	return sum;


	}
}
