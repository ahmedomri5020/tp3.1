public class Main {
    public static void main(String[] args) {
        AgenceM a=new AgenceM(3);

        vehicule v=new vehicule("clio","classique",2000,20000);
        vehicule w=new vehicule("mercedes","Fantôme", 2008, 60000);
        vehicule x=new vehicule("KIA","Picanto", 1999, 35000);
        a.ajoutveh(w);
        a.ajoutveh(x);
        a.ajoutveh(v);
        a.decris();
        System.out.println("-------------------------------");
        a.selection("mercedes");
        System.out.println("-------------------------------");
        a.selection(40000.00);
        System.out.println("-------------------------------");
        int ancien=a.tab[0].getannee();
        int indice=0;
        for(int i=1;i< a.nb;i++){
            if(a.tab[i].getannee()<ancien){
                ancien=a.tab[i].getannee();
                indice=i;
            }
        }
        System.out.println(a.tab[indice]);

    }}