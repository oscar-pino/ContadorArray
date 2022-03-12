
import java.util.Arrays;
import java.util.Scanner;

public class ContadorDinamico {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] arreglo = {2,1,4,5,2,4,5,8,9,1,2,22,1,35,2,35,1,2,3,1,35};
		
		contador(arreglo);
	}
 	
	public static void contador(int[] array) {
	
		System.out.println("\nla longitud del array entrante es: "+array.length);
		
		Arrays.sort(array);
		int max = 0;
		int min = array[1];		
		
		for(int n : array) {
			
			if(n>max)
				max = n;
			
			
			if(n<min)
				min = n;
			
		}
		
		int[] cont = new int[getMax(array)+1];
		
		for(int i : array)
			cont[i]++;
		
		String res = "";
		
		for(int j = 0; j < getMax(array)+1; j++) {			
			
			res+=j+" : "+cont[j]+"\n";
		}
		System.out.println(res); 
	}	
	
	public static int getMax(int[] array) {
		
		int max = 0;
		
		for(int x : array)
			if(x>max)
				max=x;
		
		return max;
	} 
}
	