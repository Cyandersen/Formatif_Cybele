/*
* Author: cy.andersen
* Date: Nov. 18, 2020
* Description:
*/
package com.edu.tfs;

public class Methode1
{

	public static void main(String[] args)
	{
	String ami="John";
	saluerAmi(ami);
	
	int somme=addition(12,14);
	System.out.println(somme);

	//saluer();	

	}
	//methode sans argument et qui ne retourne rein
	public static void saluer()
	{
		System.out.println("Bonjour");

	}
	//methode avec argument et qui ne retourne rein

	static void saluerAmi(String nom)
	{
		//nom="Paul";
		System.out.println("Bonjour " + nom);

	}
	//methode avec argument et qui retourne int
	static int addition(int a, int b)
	{
		int resultat=a+b;
		return resultat;
	}

}
