import java.util.Arrays;

public class Equipe {
    Employe[] employes ;
    public Equipe() {
        employes =new Employe[4];
    }
    public void remplireEquipe(Employe e){
        if(employes.length<=4){
            for (int i = 0; i < 4; i++) {
                if (employes[i] == null) {
                    employes[i] = e;
                }
            }
            System.out.printf("add sucesufull");
        }else {
            System.out.printf("add erreur");
        }
    }
    public void affichageEquipe(){
        for(Employe e :employes){
            e.decrisToi();
        }
    }


}
