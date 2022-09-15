public class Suspendido implements EstadoRobot{
 private Robot bender;

  public Suspendido(Robot bender){
    this.bender = bender;
  }

  public void cocinar(){
    System.out.println("No puedo cocinar, estoy en modo suspendido.");
  }

  public void atender(){
    System.out.println("No puedo atender, estoy en modo suspendido.");

  }

  public void caminar(){
      bender.asignarNuevoEstado(bender.getCaminando());
      if(bender.getProximidadDestino()==0){
        System.out.println("Me has activado. En seguida voy a tu mesa");
      }else if(bender.getProximidadDestino()==1){
        System.out.println("Ya voy a mitad de camino, no te desesperes");
      }else if(bender.getProximidadDestino()==2){
        System.out.println("Dame 5, no seas gacho.");
      }

  }

  public void suspender(){
    System.out.println("Ya estoy supendido xd");

  }
}
