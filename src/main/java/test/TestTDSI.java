package test;

import java.util.List;

import metier.entities.Produit;
import tdsi.ProduitTdsiImpl;

public class TestTDSI {
	
	public static void main(String[] args) {
		ProduitTdsiImpl pdao= new ProduitTdsiImpl();
		
		Produit prod= pdao.save(new Produit("Bon",2800));
		System.out.println(prod);
		List<Produit> prods =pdao.produitsParMC("bn");
		for (Produit p : prods)
		System.out.println(p);
}
}