public class PerroVirtual extends MascotaVirtual{

    public PerroVirtual(String nombre){
        super(nombre);
    }
    @Override
    public void jugar(){
        energia-=10;
        felicidad+=20;
        System.out.println(nombre + " jugó como un buen perro. 🐶 Felicidad aumentada mucho.")
    }
    
}
