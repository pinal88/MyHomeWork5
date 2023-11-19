package myhomeworkpackage5;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("parent Class Television");
        Television t =new Television();
        t.turnonswitch();
        t.starttvbutton();
        t.watchmovieonnetflix();
        t.finishmovie();
        t.turnofftv();
        t.switchoff();
        t.SizeOfElectronicdevices();
        t.TypeOfElectronicdevices();
        t.UseOfElectronicdevices();
        t.TimeLimitOfElectronicdevices();


        System.out.println("Child Class Panasonic");
        Panasonic p =new Panasonic();
        p.turnonswitch();
        p.starttvbutton();
        p.watchmovieonnetflix();
        p.finishmovie();
        p.turnofftv();
        p.switchoff();

        System.out.println("Child Class SONY");
        SONY s =new SONY();
        s.turnonswitch();
        s.starttvbutton();
        s.watchmovieonnetflix();
        s.finishmovie();
        s.turnofftv();
        s.switchoff();

        System.out.println("Child Class Samsung");
        Samsung sa =new Samsung();
        sa.turnonswitch();
        sa.starttvbutton();
        sa.watchmovieonnetflix();
        sa.finishmovie();
        sa.turnofftv();
        sa.switchoff();

        System.out.println("Child Class Mobile");
        Mobile m =new Mobile();
        m.SizeOfElectronicdevices();
        m.TypeOfElectronicdevices();
        m.UseOfElectronicdevices();
        m.TimeLimitOfElectronicdevices();

    }
}
