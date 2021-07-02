package entidades;





public final class Musica {
    
    private String nome;
    
    private int duracao;
    
    private Compositor compositor;
    
    private String genero;
    
    
    
    
    public Musica(){}

    public Musica(String nome, String compositor, String genero) {
        this.nome = nome;
        this.compositor = new Compositor(compositor);
        this.genero = genero;
                
    }
    
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getDuracao() {
        return duracao;
    }

    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    
    public Compositor getCompositor() {
        return compositor;
    }

    
    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }
    
    
    public String getGenero(){
        return this.genero;
    }
    
    
    public void setGenero(String genero){
        this.genero = genero;
    }

    
    
    
    
    
    
}
