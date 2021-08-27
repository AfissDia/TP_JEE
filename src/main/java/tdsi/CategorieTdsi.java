package tdsi;

import java.util.List;

import metier.entities.Categorie;

public interface CategorieTdsi {

	public Categorie save(Categorie cat);
	public Categorie getCategorie(Long id);
	public Categorie updateCategorie(Categorie cat);
	public void deleteCategorie(Long id);
	public List<Categorie>getAllCategorie();
}
