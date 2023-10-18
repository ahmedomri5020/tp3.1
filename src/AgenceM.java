public class AgenceM {
    vehicule[] tab;
    int max;
    int nb;

    AgenceM(int max){
        tab=new vehicule[max];
        this.max=max;
    }
    public void decris() {
        for (int i = 0; i < nb; i++) {
            tab[i].decrisVeh();
        }
    }
    void ajoutveh(vehicule v){
        if(nb<max)
        {
            tab[nb]=v;
                nb++;

        }
    }
    void selection(int n){
        if(n>0 && n<nb && tab[n]!= null){
        System.out.println(tab[n]);}
        else{
            System.out.println("La case est vide ! ERREUR");
        }
    }
    void selection(String marque){
        boolean exist=false;
    for(int i=0;i<this.nb;i++){
        if(tab[i].getmarque()==marque){
            System.out.println(tab[i]);
            exist=true;
    }}
        if(exist=false){
            System.out.println("N'existe pas ");
        }

    }
    void selection(double px){
        boolean exist=false;
        for(int i=0;i<this.nb;i++){
            if(tab[i].getprice()<px){
                System.out.println(tab[i]);
                exist=true;
            }
        }
        if(exist==false){
            System.out.println("N'existe pas ");
        }
    }

}
