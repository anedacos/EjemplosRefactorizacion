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
    
    public String descripcion(String tipoCabello, String colorCabello, String colorPiel, String tipoRopa){
        return "Esta muñeca tiene un cabello de tipo "+tipoCabello+", de color "+ colorCabello+", con un color de piel "
                + colorPiel+", y su tipo de ropa "+tipoDeRopa;
    }
         
    public void mostrarMaterial(){
        System.out.println("material: "+this.material);
    }
    
}
