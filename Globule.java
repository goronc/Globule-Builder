class Globule {
    private String noyau = "";
    private String membrane = "";
    private String cytoplasme = "";    

    public void setNoyau(String noyau){
        this.noyau = noyau;
    }

    public void setMembrane(String membrane) {
        this.membrane = membrane;
    }
    public void setcytoplasme(String cytoplasme) {
        this.cytoplasme = cytoplasme;
    }

    @Override
    public String toString() {
        return "Globule [Noyau=" + this.noyau + ", Membrane=" + this.membrane + ", Cytoplasme=" + this.cytoplasme + "]";
    }
    
    }
    