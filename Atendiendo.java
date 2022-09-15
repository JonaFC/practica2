public class Atendiendo  implements EstadoRobot{
 private Robot bender;

  public Atendiendo(Robot bender){
    this.bender = bender;
  }

  public void cocinar(){
    if(bender.getOrdenRecibida()){
      System.out.println("En seguida preparo tu orden ");
        bender.asignarNuevoEstado(bender.getCocinando());
    }else{
      System.out.println("todavia no recivo tu orden.");
    }


  }

  public void atender(){
    System.out.println("Ya te estoy atendiendo :D");

  }

  public void caminar(){
    System.out.println("¿Eres ciego? o por qué quieres que camine más si ya estoy en tu lugar.  :D");
  }

  public void suspender(){
    System.out.println("No puedo suspenderme si te estoy atendiendo");

  }


}
