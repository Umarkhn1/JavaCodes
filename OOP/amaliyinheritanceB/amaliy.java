package OOP.amaliyinheritanceB;

public class amaliy {
    public static void main(String[] args) {
        PC pc = new PC("MSI",220,512,"I5 12");
        pc.display();
        System.out.println("\n");
        Laptop laptop =new Laptop("Victus",150,256,"RYZEN 5");
        laptop.display();
        System.out.println("\n");
        Subwoofer subwoofer =  new Subwoofer("JBL",120,100);
        subwoofer.display();
        System.out.println("\n");
        Loudspeaker loudspeaker = new Loudspeaker("JBL",150,50);
        loudspeaker.display();
    }
}
