public class Main {
    public static void main(String[] args){
        MoelleOsseuse moelleOsseuse = new MoelleOsseuse();
        Globule globuleRouge;
        Globule globuleBlanc;

        moelleOsseuse.setGlobuleBuilder(new GlobuleRougeBuilder());
        moelleOsseuse.constructGlobule();
        globuleRouge = moelleOsseuse.getGlobule();

        System.out.println(globuleRouge);

        moelleOsseuse.setGlobuleBuilder(new GlobuleBlancBuilder());
        moelleOsseuse.constructGlobule();
        globuleBlanc = moelleOsseuse.getGlobule();

        System.out.println(globuleBlanc);
    }
}
