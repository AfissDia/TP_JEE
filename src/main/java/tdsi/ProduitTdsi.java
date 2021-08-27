package tdsi;

//package dao;

import java.util.List;
import metier.entities.Produit;

public interface ProduitTdsi {
public Produit save(Produit p);
public List<Produit> produitsParMC(String mc);
public Produit getProduit(Long id); 
public Produit updateProduit(Produit p);
public void deleteProduit(Long id);
}