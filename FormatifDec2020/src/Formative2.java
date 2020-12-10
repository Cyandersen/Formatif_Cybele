import java.util.Scanner;

/*
* Author: cy.andersen
* Date: Dec. 10, 2020
* Description:
*/

public class Formative2
{
	public static void main(String[] args)
	{ int[] number = {1, 3, 5, 7, 9, 120};
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Donner l’élément rechercher");
    int element = sc.nextInt();
   sc.close();

    if(contains(number, element)){
        System.out.println(element + " est présent dans ce tableau");}
        else {
        	System.out.println(element + " n'est pas présent dans ce tableau");
    }

}
	public static boolean contains(final int[] array, final int element) {
    boolean result = false;

    for(int i : array){
        if(i == element){
            result = true;
            break;
        }
    }

    return result;
}

}