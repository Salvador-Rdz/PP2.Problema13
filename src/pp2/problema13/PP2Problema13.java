/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema13;
import java.util.*;

/**
 *
 * @author Enano
 */
public class PP2Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        float average; float[] number;
        String abvAvg, belAvg;
        //Resolución
        number=getInf();
        average=getAver(number);
        abvAvg=getAbvAvg(average, number);
        belAvg=getBelAvg(average, number);
        print (average, abvAvg, belAvg);
    }
    public static float[] getInf() //Se recibe la información
    {
        float[] numbers=new float [30];
        for(int i=0;i<numbers.length;i++)
        {
            Scanner in =new Scanner (System.in);
            System.out.println("Ingrese el número "+(i+1)+" :"); //Se pide el número del 1 al 30. (0+1) Para que no afecte el array
            numbers[i]=in.nextFloat();            
        }
        return numbers;
    }
    public static float getAver(float [] num)   //Se consigue el promedio.
    {
        float average=0;
        for(int i=0;i<num.length;i++)
        {
            average=average+num[i];             //Se suman todos los números
        }
        average=average/num.length;             //Se dividen entre el total de números
        return average;
    }
    public static String getAbvAvg (float average, float []num) //Se consiguen los números arriba del promedio.
    {
        String abvAvg="";
        for (int i=0;i<num.length;i++)   //Se recorre el arreglo
        {
            if(num[i]>average)           //Se verifica si el número esta arriba del promedio que se saco.
            {
                abvAvg=abvAvg+num[i]+", ";  //Se concatena a una cadena que guarde los números que estan arriba del promedio
            }
        }
        return abvAvg;
    }
    public static String getBelAvg (float average, float []num)
    {
        String belAvg="";
        for (int i=0;i<num.length;i++)  //Se recorre el arreglo
        {
            if(num[i]<average)          //Se verifica si el número esta abjo del promedio que se saco.
            {
                belAvg=belAvg+num[i]+", ";  //Se concatena a una cadena que guarde los números que estan abajo del promedio
            }
        }
        return belAvg;
    }
    public static void print (float average, String abvAvg, String belAvg)  //Se imprime el promedio, y los números.
    {
        System.out.println("El promedio de esos 30 números es: "+average);  
        System.out.println("Los números que estan arriba del promedio son: "+abvAvg);
        System.out.println("Los números que estan abajo del promedio son: "+belAvg);
    }
}
