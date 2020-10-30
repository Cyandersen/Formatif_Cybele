import java.util.Scanner;

/*
* Author: cy.andersen
* Date: Oct. 29, 2020
* Description:Ce programme calculera vos impôts en fonction de votre Revenu Brut, Contributions don de bienfaisance et revenu imposable, 
* il tient compte des restrictions et va Afficher le montant de l’impôt total à payer dans un mode uniforme. 
* Ce programme calculera vos impôts en fonction de la formule précise Impot basée sur des pourcentages
*/

public class ImpotCybèleAndersen
{

	public static void main(String[] args)
	{
		/* declarer les variables
		 * ====================
		 * Nom (Monsieur /Madame),
		 RevenuBrut, Contributionsdondebienfaisance, Revenuimposable, 
		 * Impôtàpayer
		 * ============
		 * Demander le Nom
		 * Questions
		 * Demander RevenuBrut
		 * Demander Contributionsdondebienfaisance
		 * Caluls
		 *=============
		 *caluler Revenuimposable
		 *Caluler Impôt
		 *Afficher
		 *============
		 *
		 */
		Scanner sc=new Scanner(System.in);
		//Déclaration des variables
		String nom, prenom, facture;
		double RevenuBrut,mContributionsdondebienfaisance,mRevenuimposable,mImpôtAPayer=0.00;
		//Récupération des données
		System.out.println("Donner le nom ");
		nom=sc.nextLine();
		System.out.println("Donner le prenom ");
		prenom=sc.nextLine();
		System.out.println("Donner le revenu brut ");
		RevenuBrut=sc.nextDouble();
		//Si le revenu brut est inférieur à 0
		if (RevenuBrut<0)
		do
		{
		System.out.println("Félicitations! Pas de impot a payer");
		System. exit(1);
		}while (RevenuBrut<0);
		if (RevenuBrut>0);
		
		System.out.println("Donner le Contributions don de bienfaisance ");
		mContributionsdondebienfaisance=sc.nextDouble();
		
		//Calcul la Revenue Imposable
		mRevenuimposable = RevenuBrut - mContributionsdondebienfaisance;
		
		if (mContributionsdondebienfaisance<0)
			//Quoi faire si le mContributionsdondebienfaisance est inferieur at 0
			do
			{
			System.out.println("Pas admisable, dons de charité ne peut pas etre negatif. Veuillez redonner Contributions don de bienfaisance qui est égal ou supérieur à 0:");
			mContributionsdondebienfaisance=sc.nextDouble();
			if (mContributionsdondebienfaisance> RevenuBrut*0.20)
				do
				{
				System.out.println("Pas admisable, dons de charité ne peut pas dépasser 20% du revenu brut. Seul le montant admissible sera pris en compte");
				mContributionsdondebienfaisance=RevenuBrut*0.20;
				}while (mContributionsdondebienfaisance>RevenuBrut*0.20);
			
			if (mContributionsdondebienfaisance<= RevenuBrut*0.20)
				mRevenuimposable = RevenuBrut - mContributionsdondebienfaisance;
			sc.close();
			}while (mContributionsdondebienfaisance<0);
		
		if (mContributionsdondebienfaisance> RevenuBrut*0.20)
			do
			{
			System.out.println("Pas admisable, dons de charité ne peut pas dépasser 20% du revenu brut. Seul le montant admissible sera pris en compte");
			mContributionsdondebienfaisance=RevenuBrut*0.20;
			}while (mContributionsdondebienfaisance>RevenuBrut*0.20);
		
		if (mContributionsdondebienfaisance<= RevenuBrut*0.20)
			mRevenuimposable = RevenuBrut - mContributionsdondebienfaisance;
		sc.close();
		
		//Calcul l'impot
		if(mRevenuimposable>210371)
			mImpôtAPayer=(mRevenuimposable-210371)*0.33+48718.69;
		else
			if(mRevenuimposable>=147667)
				mImpôtAPayer=(mRevenuimposable-147667)*0.29+30534.53;
			else
				if(mRevenuimposable>=95259)
					mImpôtAPayer=(mRevenuimposable-95259)*0.26+16908.45;
				else
					if(mRevenuimposable>=47630)
						mImpôtAPayer=(mRevenuimposable-47630)*0.205+7144.5;
					else
						mImpôtAPayer=mRevenuimposable*0.15;
		//Affichage de la facture
		
		facture="Facture pour: "+prenom +" "+ nom +"\n \n";
		facture=facture + "Merci d’avoir produit votre déclaration de revenus. D’après les informations fournies, nous avons calculé votre impôt de la manière suivante"+ "\n";
		facture=facture + "Revenu Brut: \t"+ RevenuBrut+ "$" + "\n";
		facture=facture + "Contributions don de bienfaisance: \t"+ mContributionsdondebienfaisance+" $" + "\n";
		facture=facture + "Revenu imposable: \t"+ mRevenuimposable+" $" + "\n";
		//Arrondi à la deuxième décimale pour pas avoir un numero infinitif ou trop long
		facture=facture + "Impôt A Payer (arrondi à la deuxième décimale): \t"+ Math.round(mImpôtAPayer*100.0) / 100.0+" $" + "\n";
		
		System.out.println(facture);
		
			
		
	}

}