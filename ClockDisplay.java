
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay hora;
    private NumberDisplay minuto;

    /**
     * Constructor for objects of class NumberDisplay.
     * Set the limit at which the display rolls over.
     */
    public ClockDisplay()
    {
          hora = new NumberDisplay(24);
          minuto = new NumberDisplay(60);
    }

 /**
 * Fija un tiempo determinado en horas y minutos
 */
 public void fijarTiempoReloj(int nuevaHora,int nuevoMinutos)
 {
     hora.setValue(nuevaHora);
     minuto.setValue(nuevoMinutos);
            
  }
    
 /**
 * Avanza un minuto
 */
   
// public void avanzarMinuto(){
    // minuto.increment();
    //    if(minuto.getValor() == 0)
    
    
 }

