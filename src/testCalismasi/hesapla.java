package testCalismasi;

import java.util.ArrayList;
import java.util.List;

public class hesapla {

	List <entity> veysel=new ArrayList();
	
	
	public entity kayitEkle(entity a) {
		//System.out.println(a.getAd());
		veysel.add(a);
		return veysel.get(veysel.size()-1);
		
	}
	
	public int topla(int a ,int b) {
		return a+b;
	}

	public int bolme(int a ,int b) {
		return a/b;
	}

	public int carp(int a, int b) {
		return a*b;
	}
	
	
	
}
