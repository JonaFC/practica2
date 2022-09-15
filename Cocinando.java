public class Cocinando implements EstadoRobot{
 private Robot bender;

  public Cocinando(Robot bender){
    this.bender = bender;
  }

  public void cocinar(){

    if(bender.getOrdenEntregada()){
      System.out.println("Ya entregué tu orden, no hay nada más que cocinar.");
    }else{
      System.out.println("Ya estoy cocinando :D");
    }
  }

  public void atender(){
    System.out.println("ya te atendí.");

  }

  public void caminar(){
    System.out.println("¿Eres ciego? o por qué quieres que camine más si ya estoy en tu lugar.  :D");
  }

  public void suspender(){
    if(bender.getOrdenEntregada()==false){
      System.out.println("No puedo suspenderme si te estoy cocinando");
    }else{
      System.out.println("Buen provecho, procederé a suspenderme  XD ");
      bender.asignarNuevoEstado(bender.getSuspendido());
    }


  }
}
