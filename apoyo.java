/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dadosconestadistica;

import java.util.Scanner;

/**
 *
 * @author lab20
 */
public class apoyo {
    public static boolean verificar (int n){
        if ((n<10)|| (n>50)) return true;
        else return false;
       
        }
    public static int leer(){
        int n;
                Scanner en= new Scanner (System.in);
                
                do{
                    System.out.println("valor de n entre 10 y 50:");
                    n=en.nextInt();
                    if (verificar (n))
                        System.out.println("  valor incorrecto");
                } while (verificar(n));
                return n;
                    

                }
    public static int posicion(int v[], int va){
int pos=0;
while((pos <v.length)&& (va < v[pos])) pos++;
return pos;
                        }
    public static void insertar(int v[],int va, int p){
        for(int i=v.length-1;i>p;i--){
            v[i]=v[i-1];
            
        }
        v[p]=va;
    }

    public static int[] llenar(){
    int v[],valor,pos,tam;
    tam=leer();
    v=new int[tam];
    for (int i =0;i<v.length;i++){
        valor = (int)(6*Math.random()+1);
        pos=posicion(v,valor);
        insertar(v,valor,pos);
    }
    return v;
        
     }
    public static void mostrar(int v[]){
        for (int i=0; i<v.length ;i++) {
      System.out.printf("%3d",v[i]);
      
    }
        System.out.println("\n");
    }
    
    
  }




