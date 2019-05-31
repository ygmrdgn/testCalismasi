package testCalismasi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class hespalaTesting {
	hesapla Veys=new hesapla();
	
	@Test
	public void hespalaTestEt() {
	assertEquals( 1,Veys.topla(1, 0));
	}
	
	@Test
	public void hespalaTestEt1() {
	assertEquals( 0,Veys.carp(1, 0));
	}
	
	@Test
	public void hespalaTestEt2() {
	 assertEquals( 1,Veys.bolme(5, 5));	
	}
	
	@Test
	public void elemanTest() {
	entity a=new entity("veysel","sebu");
	assertEquals( a,Veys.kayitEkle(a));
	}
}
