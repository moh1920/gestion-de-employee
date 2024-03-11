public class Employe {
    protected String nom ;
protected String prenom ;
protected Double Salaire ;
protected int NCI ;

    public Employe() {
    }
    public Employe(int n){
        this.NCI = n ;
    }
    public  Employe(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
    public Employe(String nom, String prenom, Double salaire, int NCI) {
        this.nom = nom;
        this.prenom = prenom;
        Salaire = salaire;
        this.NCI = NCI;
    }
    public String decrisToi(){
        return "firtname is "+ nom +'\n'+"lastname "+ prenom ;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Double getSalaire() {
        return Salaire;
    }

    public int getNCI() {
        return NCI;
    }
}
