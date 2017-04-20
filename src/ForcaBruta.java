/**
 * Algorítimo de busca em String  - Força Bruta
 * 
 * @author Guilherme Wenger
 *
 */

public class ForcaBruta {
	public static void main(String[] args) {
		String text = "abaadeccfrtghkagbbackaabbccddffghkaaaafdsfggggaabbcaabbccddffaeeaucddffaeabaadeccfrtghkagbbaaabbccddffaeeu ckaabbccddffghkaaaafdsfggggaabbccddffaeee";
		String word = "aabbccddffaeeu ";
		
		System.out.println(buscar(text, word));
	}
	
	public static String buscar(String t, String w){
		
		boolean achou = false;
		
		int i = 0;
		
		while((i <= (t.length()-w.length())) && !achou){			
			int aux = 0;
			
			while((aux < w.length()) && (t.charAt(i+aux) == w.charAt(aux))){				
				aux++;
			}
			
			if(aux == w.length()){
				achou = true;				
			}else{
				i++;
			}
			
		}
		
		if(achou){
			return "O padrão "+"\""+w+"\""+" foi encontrado no texto entre as posições "+i+" e "+(i+w.length());
		}else{
			return "O padrão "+"\""+w+"\""+" não foi encontrado no texto!";
		}
		
	}
	
}


