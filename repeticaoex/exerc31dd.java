package repeticaoex;

import java.util.Scanner;
public class exerc31dd {
	
	public static void main(String[] args) {
		int va = 1, va2 = 1, va3 = 1, i;
		
		i = 0;
        
        while (i <=19){
            va = va + va2  + va3;
            va2 = va - va2  - va3;
            va3 = va - va2 - va3;
            System.out.println(va);
            i++;
        }

	}

}
