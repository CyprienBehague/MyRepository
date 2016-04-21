package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String r="";
		int a=0;
				
		a=Integer.parseInt(arabe);		
				
		int modDix=a%10;
		int modCent=((a-modDix)%100)/10;
	//	int modMil=((a-modDix)%100);
			
	//	if(a>99){r=r+toRoman(modMil,"C","D","M");	}
		if(a>9){r=r+toRoman(modCent,"X","L","C"); }
		r=r+toRoman(modDix,"I","V","X");
		
		
		System.out.println(r);
		
		return r;

	}
	public String convertFromRoman(String roman) {
		return "1";
	}
	
	private String toRoman(int mod, String a, String b, String c){
		String r="";
		if(mod <=3){
			for(int i=0; i<mod;i++){
				r=r+a;
			}
		} else if (mod<=8 && mod>3){
			if(mod==4){r=r+a;}
			r=r+b;			
			for(int i=5;i<mod; i++){
				r=r+a;
			}
		} else { r=a+c; }
		
		return r;
	}
}
	

