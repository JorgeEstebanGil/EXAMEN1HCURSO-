
public class ElementosRepetidos {

    static int A=3;
    static int B=30;
    static int vectorA[]=new int[A];
    static int vectorB[]=new int[B];
    static int elemA=0;
    static int elemB=0;
    static int z=0;
    
        static void llenaArreglo(){
        // Llenamos un array con valores aleatorios
        for(int i=0;i<vectorA.length;i++){
            vectorA[i]=(int)(Math.random()*10+1);
        }
 
        // Llenamos un segundo array con valores aleatorios
        for(int i=0;i<vectorB.length;i++){
            vectorB[i]=(int)(Math.random()*10+1);
        }
 
    }
 
    static void compara(){
        // recorremos los valores del array A
        for(int i=0;i<vectorA.length;i++){
            // recorremos los valores del array B
            for(int j=0;j<vectorB.length;j++){
                // Cada valor del array A lo comparemos con todos los valores
                // del array B
                if(vectorA[i]==vectorB[j])
                    elemA++;
            }
            System.out.println("El elemento "+vectorA[i]+" se presenta "+elemA+" veces en B");
            elemA=0;
        }
    }
 
    static void imprimir(){
        for(int i=0;i<vectorA.length;i++){
            System.out.print("A"+"["+i+"]= "+vectorA[i]+"\n");
        }
        for(int i=0;i<vectorB.length;i++){
            System.out.print("B"+"["+i+"]="+vectorB[i]+"\n");
        }
    }
    
    public static void main(String[] args) {
        llenaArreglo();
        imprimir();
        compara();
    }
    
}
