package metier.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="PRODUIT")
public class Produit implements Serializable{
	
	@Id
	@Column (name="Id_produit")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idProduit;
	
	@Column (name="Nom_produit")
	private String nomProduit;
	private double prix;
	
	@ManyToOne
	private Categorie categorie;
	public Produit(String nomProduit, double prix,Long catId) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		Categorie cat = new Categorie();
		cat.setIdCat(catId);
		this.setCategorie(cat);
		}
	
	public Produit() {
		super();
		}
	public Produit(String nomProduit, double prix) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		}
	
	
	public Long getIdProduit() {
		return idProduit;
		}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
		}
	public String getNomProduit() {
		return nomProduit;
		}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
		}
	public double getPrix() {
		return prix;
		}
	public void setPrix(double prix) {
		this.prix = prix;
		}
	
	
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prix + "]";
	}
		
}
