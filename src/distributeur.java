import java.util.ArrayList;
import java.util.Scanner;

public class distributeur {
    ArrayList< compte> clients=new ArrayList<compte>();
    Scanner sc=new Scanner(System.in);
    private static int temp;

    public void creationclient(){
        for (int i=0;i<50;i++){
            int j=1;
            int r=51;
            int m=500;
            clients.add(new compte(20000+m,500000-m,i,i,"bkh","djawed"+j));
            clients.add(new compte(500000-m,i,i,"hb"+j,"gjk"+j));
            clients.add(new compte(500000-m,i,i,"hb"+j,"gjk"+j));
            r++;
        }
        }

    public void menu() {
        int repeat=0;
        creationclient();
        System.out.println("bonjour bienvenu dans le distributeur automatique ");
        System.out.println("veillez vous connecter a votre compte");
         temp=authentifier();
        if (temp>=0){
            while (repeat==0){
            System.out.println("menu: ");
            System.out.println(" 1) afficher les details du compte ");
            System.out.println("  2) verser  une somme ");
            System.out.println("   3) retirer une somme");
            System.out.println("    4) virer une somme  ");
            int choix=sc.nextInt();
            switch (choix){
                case 1:affichedet();break;
                case 2:verser();break;
                case 3:retirer();break;
                case 4:virer();break;
            }
                System.out.println("voulez vous continuer ? oui (0) non(1)");
            repeat=sc.nextInt();
        }}



    }
    public int authentifier(){
        int i=0;
        System.out.println("tappez votre numero de compte ");
        int ncompte=sc.nextInt();
        System.out.println(clients.get(ncompte).getCode());
        if (ncompte>=0 && ncompte<clients.size()){
            System.out.println("tappez votre code");
            int code=sc.nextInt();
            if (code==clients.get(ncompte).getCode()){
                System.out.println("athentification reussie");
                return 1;
            }else {
                System.out.println( " code incorrect acces refusé");
                return -1;
            }
        }else {
            System.out.println("compte inexistant dhg");
            return -1;
        }

    }

    public void retirer(){
        int reste;
        affichedet();
        if (temp<51){
            System.out.println("de quel compte voulez vous retirer 1 euro    2 $");
            int  choix=sc.nextInt();
            if (choix==1){
                System.out.println("quelle somme voulez vous retirer ?");
                int somme=sc.nextInt();
                reste=clients.get(temp).getEuro()-somme;
                clients.get(temp).setEuro(reste);
                System.out.println("votre compte euro contient "+clients.get(temp).getEuro());
            }else if (choix==2){
                System.out.println("quelle somme voulez vous retirer ?");
                int somme=sc.nextInt();
                reste=clients.get(temp).getDollar()-somme;
                clients.get(temp).setDollar(reste);
                System.out.println("votre compte dollar contient "+clients.get(temp).getEuro());
            }else System.out.println("tappez 1 ou 2 !!");
        }else if(temp>100){
            System.out.println("quelle somme voulez vous retirer ?");
            int somme=sc.nextInt();
            reste=clients.get(temp).getEuro()-somme;
            clients.get(temp).setEuro(reste);
            System.out.println("votre compte dollar contient "+clients.get(temp).getDollar());

        }else{
            System.out.println("quelle somme voulez vous retirer ?");
            int somme=sc.nextInt();
            reste=clients.get(temp).getEuro()-somme;
            clients.get(temp).setEuro(reste);
            System.out.println("votre compte euro contient "+clients.get(temp).getEuro());

        }

    }
    public void verser(){
        affichedet();
        int reste;
        if (temp<51){
        System.out.println("de quel compte voulez vous verser 1 euro    2 $");
        int  choix=sc.nextInt();
        if (choix==1){
            System.out.println("quelle somme voulez vous verser?");
            int somme=sc.nextInt();
            reste=clients.get(temp).getEuro()+somme;
            clients.get(temp).setEuro(reste);
            System.out.println("votre compte euro contient "+clients.get(temp).getEuro());
        }else if (choix==2){
            System.out.println("quelle somme voulez vous verser ?");
            int somme=sc.nextInt();
            reste=clients.get(temp).getDollar()+somme;
            clients.get(temp).setDollar(reste);
        }else System.out.println("tappez 1 ou 2 !!");
        System.out.println("votre compte dollar contient "+clients.get(temp).getDollar()); }
    else {
            System.out.println("quelle somme voulez vous verser ?");
            int somme = sc.nextInt();
            reste = clients.get(temp).getEuro() - somme;
            clients.get(temp).setEuro(reste);
            System.out.println("votre compte  contient " + clients.get(temp).getEuro());

        }
    }
    public void virer(){
        affichedet();
        System.out.println("a quel compte voulez vous virer ? (tappez le num de compte)");
        int vir=sc.nextInt();
        if (vir>=50){
            System.out.println("combien voulez vous virer ?");
            int somme=sc.nextInt();
            clients.get(vir).setEuro(somme);
            System.out.println("virement effectué");
        }else{
            System.out.println("de quel compte voulez vous virer 1 euro    2 $");
            int  choix=sc.nextInt();
            if (choix==1){
                System.out.println("quelle somme voulez vous virer?");
                int somme=sc.nextInt();
                clients.get(vir).setEuro(somme);
            }else if (choix==2){
                System.out.println("quelle somme voulez vous virer ?");
                int somme=sc.nextInt();
                clients.get(vir).setDollar(somme);
        }



    }}
    public void affichedet(){
        if (temp<51){
        System.out.println("nom: "+clients.get(temp).getLastname()+" prenom: "+clients.get(temp).getFirstname()+" compte euro "+clients.get(temp).getEuro()+"euro"+"dollar"+clients.get(temp).getDollar()+" $");
    }else


        System.out.println("nom: " + clients.get(temp).getLastname()+ " prenom: " + clients.get(temp).getFirstname() + " compte euro " + clients.get(temp).getEuro() + "euro");}
    }


