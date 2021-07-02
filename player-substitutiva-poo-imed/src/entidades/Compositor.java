
package entidades;

public class Compositor {
    
    private String compositor;
    
    
    
    public Compositor(){}
    
    
    
    public Compositor(String nome) {
        this.compositor = nome;
    }
    
    public String getCompositor() {
        return this.compositor;
    }
    
    public void seCompositor(String compositor){
        this.compositor = compositor;
    }
    
}
