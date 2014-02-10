package vasquezj;

import java.util.Scanner;

public class jleiv 
{

	public static void main(String args[])
	{
		Scanner mi_Scanner=new Scanner(System.in);
		for(int i=0;i<3; i=i+1)
		{
			System.out.print("ingrese nota");
			int nota = mi_Scanner.nextInt();
			if(nota>=90)
			{
				System.out.print("excelencia");
			}else if(nota>=80)
			{
				System.out.print("sobresaliente");
				
			}else if (nota>60)
			{	
				System.out.print("aprobado");
			}else
			{
				System.out.print("reprobado");
			
			}
		}
	}
}

