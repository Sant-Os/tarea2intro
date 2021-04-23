
/**
 * Write a description of class Matematico here.
 * 
 * @author (Sn_efa) 
 * @version (1.0.3)
 */
public class Matematico{
    private double n1, n2, n3;
    private double    a, b;
    private String respuesta;
    public String indicarMayor(double n1,double n2, double n3){
        double mayor,menor,medio;
        String reporte;
        if (n1>=n2){
            if(n2>=n3){
                mayor=n1;
                medio=n2;
                menor=n3;
            }else{
                if(n1<=n3){
                    mayor=n3;
                    medio=n1;
                    menor=n2;
                }else{
                    mayor=n1;
                    medio=n3;
                    menor=n2;
                }
            }
           
        }else{
            if (n3>=n2){
                mayor=n3;
                medio=n2;
                menor=n1;
            }else{
                mayor=n2;
                if (n3>=n1){
                    medio=n3;
                    menor=n1;
                }else{
                    medio=n1;
                    menor=n3;
                }
            }
        }
        reporte="Mayor "+ mayor+",medio "+medio+",menor "+menor;
        return reporte;
        }      
        public double area(double a, double b){
        double area;
        area = a * b;
        return area;        
    }
    public double areaRectangulo(double a,double b){
        double area;
        if (a>0 && b>0){
            area= a*b;
        }else{
            area=0.0;
        }
        return area;
    }
    public double distanciaDosPuntos(Punto uno , Punto dos){
        double distanciaPuntos;
        distanciaPuntos = Math.sqrt(Math.pow(uno.getX() - dos.getX(),2) + (Math.pow(uno.getY() - dos.getY(),2))); 
        return distanciaPuntos;
    } 
    public String cuadrante(Punto punto){
        String cuadrante;
        if (punto.getX()!=0 && punto.getY()!=0){
            if (punto.getX()<0 && punto.getY()<0){
                  cuadrante="III Cuadrante";
            }else{
                if (punto.getX()<0){
                    cuadrante="II Cuadrante";
                }
                else{
                    cuadrante="IV Cuadrante";
                }if (punto.getX()>0 && punto.getY()>0){
                    cuadrante="I Cuadrante";
                }
            }
        }else{
            cuadrante="Eje";
        }
        return cuadrante;
    }
}