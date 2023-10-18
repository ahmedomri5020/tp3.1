public class vehicule {
    private int num;
    private String marque;
    private String model;
    private int annee;
    private double price;
    static int count;
    vehicule(String marque,String model,int annee,double prix){
        count++;
        this.num=count;
        this.marque=marque;
        this.model=model;
        this.annee=annee;
        this.price=prix;
    }
    void decrisVeh(){
        System.out.println("num=" + num + ", marque='" + marque + '\'' +
                        ", model='" + model + '\'' +
                        ", annee=" + annee +
                        ", price=" + price);
    }
    void setmarque(String marque){
    this.marque=marque;
    }
    void setprice(double price){
        this.price=price;
    }
    String getmarque(){
        return this.marque;
    }
    double getprice(){
        return this.price;
    }
    int getcount(){
        return this.count;
    }
    int getannee(){
        return this.annee;
    }
    @Override
    public String toString() {
        return "vehicule{" +
                "num=" + num +
                ", marque='" + marque + '\'' +
                ", model='" + model + '\'' +
                ", annee=" + annee +
                ", price=" + price +
                '}';
    }
}
