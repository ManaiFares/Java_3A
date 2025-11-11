import java.util.Scanner;

public class ZooManagement  {

    //public int nbrCages=20;
    //public String zooName="my zoo";
    public int nbrCages;
    public String zooName;

    public static void main(String[] args) {
        ZooManagement z=new ZooManagement();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Enter zoo name: ");
            z.zooName=sc.nextLine();
        }while (z.zooName.equals(""));
        do {
            System.out.print("Enter cage number: ");
            z.nbrCages=sc.nextInt();
        }while(z.nbrCages<=0);
        System.out.print(z.zooName+" comporte "+z.nbrCages+" cages");
        //System.out.println("NbrCages :"+z.nbrCages+ "\nZoo name:"+z.zooName);

    }
}
