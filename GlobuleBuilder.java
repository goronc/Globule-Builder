abstract class GlobuleBuilder {
    
    protected Globule globule;

    public Globule getGlobule() {
        return globule;
    }

    public void createNewGlobule() {
        globule = new Globule();
    }

    public abstract void buildNoyau();
    public abstract void buildMembrane();
    public abstract void buildCytoplasme();

    }