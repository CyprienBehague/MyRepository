package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String r="";
		int a=0;
		
		a=Integer.parseInt(arabe);		
		
		
		int modDix=a%10;
		return ""+toRomanModDix(modDix);

	}
	public String convertFromRoman(String roman) {
		return "1";
	}
	
	private String toRomanModDix(int modDix){
		String r="";
		if(modDix <=3){
			for(int i=0; i<modDix;i++){
				r=r+"I";
			}
		} else if (modDix<=8 && modDix>3){
			if(modDix==4){r=r+"I";}
			r=r+"V";			
			for(int i=5;i<=modDix; i++){
				r=r+"I";
			}
		} else { r="IX"; }
		
		System.out.println(r);
		return r;
	}
}
	

