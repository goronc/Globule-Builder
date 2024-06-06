class MoelleOsseuse{
    private GlobuleBuilder globuleBuilder;

    public void setGlobuleBuilder(GlobuleBuilder gb) {
        globuleBuilder = gb;
    }

    public Globule getGlobule() {
        return globuleBuilder.getGlobule();
    }

    public void constructGlobule() {
        globuleBuilder.createNewGlobule();
        globuleBuilder.buildNoyau();
        globuleBuilder.buildMembrane();
        globuleBuilder.buildCytoplasme();
    }
    
    }