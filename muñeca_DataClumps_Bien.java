package tareadiseño;

/**
 *
 * @author Anthony
 */
public class muñeca extends juguetes {
    private String tipoCabello, colorCabello,colorPiel;
    public String tipoDeRopa;
    
    public muñeca(){    
        System.out.println("Esto es una muñeca");
        this.tipoCabello="";
        this.colorCabello="";
        this.colorPiel="";
        this.tipoDeRopa="";
    }
    
    public muñeca(String tipoCabello, String colorCabello,String colorPiel,String tipoRopa){
        this.tipoCabello=tipoCabello;
        this.colorCabello=colorCabello;
        this.colorPiel=colorPiel;
        this.tipoDeRopa=tipoRopa;
        
    }
    
     public String descripcion(muñeca m){
        return "Esta muñeca tiene un cabello de tipo "+m.tipoCabello+", de color "+ m.colorCabello+", con un color de piel "
                + m.colorPiel+", y su tipo de ropa "+m.tipoDeRopa;
    }
         
    public void mostrarMaterial(){
        System.out.println("material: "+this.material);
    }
    
}
