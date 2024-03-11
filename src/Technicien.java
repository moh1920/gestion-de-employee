public class Technicien extends Employe{
private String specialite ;
public Technicien(){
}

    public Technicien(String nom, String prenom, Double salaire, int NCI, String specialite) {
        super(nom, prenom, salaire, NCI);
        this.specialite = specialite;
    }

    @Override
    public String decrisToi() {
        return super.decrisToi() +" specialite "+specialite;
    }

}
