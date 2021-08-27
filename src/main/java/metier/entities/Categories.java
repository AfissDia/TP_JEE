//package metier.entities;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Entity;
////import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//@Entity
//public class Categories implements Serializable {
//	
//	@Id
//	@GeneratedValue (strategy=GenerationType.IDENTITY)
//	private Long IdCat;
//	private String NomCat;
//	
//	@Temporal(TemporalType.DATE)
//	private Date DateCat;
//	
//	//@OneToMany (mappedBy="categorie")
//	@OneToMany (mappedBy="categorie")
//	private List<Produit>produit;
//	
//	public Categorie() {
//		super();
//	}
//	public Categorie(String NomCat,Date DateCat) {
//		super();
//		this.NomCat=NomCat;
//		this.DateCat=DateCat;
//	}
//	public Long getIdCat() {
//		return IdCat;
//	}
//	public void setIdCat(Long idCat) {
//		IdCat = idCat;
//	}
//	public String getNomCat() {
//		return NomCat;
//	}
//	public void setNomCat(String nomCat) {
//		NomCat = nomCat;
//	}
//	public Date getDateCat() {
//		return DateCat;
//	}
//	public void setDateCat(Date dateCat) {
//		DateCat = dateCat;
//	}
//	public List<Produit> getProduit() {
//		return produit;
//	}
//	public void setProduit(List<Produit> produit) {
//		this.produit = produit;
//	}
//	
//
//}
