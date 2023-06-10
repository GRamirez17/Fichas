package Fichas;

public class FuncionamientoFichas {
    private String nombre;
    private int rango;
    private boolean EsBomba;
    private boolean EsTierra;

    public FuncionamientoFichas(String nombre,int rango,boolean EsBomba,boolean EsTierra){
        this.nombre=nombre;
        this.rango=rango;
        this.EsBomba=EsBomba;
        this.EsTierra=EsTierra;
    }

    public String getNombre(){
        return nombre;
    }

    public int getRango(){
        return rango;
    }

    public boolean EsBomba(){
        return EsBomba;
    }

    public boolean EsTierra(){
        return EsTierra;
    }

    public void mover(){
        System.out.println(nombre+" se ha movido");
    }

    public boolean PuedeAtacar(FuncionamientoFichas FichaObjetivo){
        if(EsBomba&&(rango!=3||FichaObjetivo.getRango()!=3)){
            return false;
        }else if(FichaObjetivo.EsBomba()&&rango!=3){
            return false;
        }
        return true;
    }

    public void atacar(FuncionamientoFichas FichaObjetivo){
        if(PuedeAtacar(FichaObjetivo)){
            System.out.println(nombre+" atacó a "+FichaObjetivo.getNombre());
            if(rango>FichaObjetivo.getRango()){
                System.out.println(nombre+" destruyó a "+FichaObjetivo.getNombre());
            }else if(rango<FichaObjetivo.getRango()){
                System.out.println(nombre+" fue destruido por "+FichaObjetivo.getNombre());
            }else{
                System.out.println(nombre+" y "+FichaObjetivo.getNombre()+" se destruyeron mutuamente");
            }
        }
    }

