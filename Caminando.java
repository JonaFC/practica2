public class Caminando implements EstadoRobot{
 private Robot bender;

  public Caminando(Robot bender){
    this.bender = bender;
  }

  public void cocinar(){
    if(bender.getLlegarDestino()==false){
      System.out.println("No puedo cocinar, estoy caminando >:v ");
    }else{
      System.out.println("No puedo cocinar, aun no te atiendo.");
    }

  }

  public void atender(){
    if(bender.getLlegarDestino()){
      System.out.println("¿Qué desea ordenar?");
      bender.resetProximidadDestino();
      bender.asignarNuevoEstado(bender.getAtendiendo());
    }else{
      System.out.println("Aun no llego a tu mesa,espera por favor");
    }

  }

  public void caminar(){
    bender.setProximidadDestino(1);
    if(bender.getProximidadDestino()==1){
      System.out.println("Ya voy a mitad de camino, no te desesperes");
    }else if(bender.getProximidadDestino()==2){
      System.out.println("Dame 5, no seas gacho.");
    }else{
      bender.setLlegarDestino(true);
      System.out.println("Ya estoy en tu mesa :D ");
    }
  }

  public void suspender(){
    if(bender.getLlegarDestino()==false){
      System.out.println("Pasaré a modo suspendido. zZz");
      bender.asignarNuevoEstado(bender.getSuspendido());
    }else{
      System.out.println("No puedo suspenderme, ya estoy en tu mesa");
    }

  }


}
