public class Ejercicio {
    public static void main(String[] args) {
        
        boolean[] criba = new boolean[1000];
        criba[0] = true;
        criba[1] = true;
        for(int i = 2; i < 1000; i++){
            if(!criba[i]){
                for( int j = 2*i; j< 1000; j = j +i){
                    criba[j]= true;
                } 
            }  
        }

        int k = 0;
        int suma = 0;
        for(int i = 0; i < 1000; i++){
            if(k ==50 ){
                break;
            }
            if(!criba[i]){
                suma += i;
                k++;
            }
            
        }
        System.out.println(suma);


    }
}
