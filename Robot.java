public class Robot{

  private boolean llegarDestino;
  private int proximidadDestino;
  private boolean ordenRecibida;
  private boolean ordenEntregada;

  private EstadoRobot estadoActual;

  private EstadoRobot caminando;
  private EstadoRobot atendiendo;
  private EstadoRobot cocinando;
  private EstadoRobot suspendido;

  public Robot(){
    llegarDestino = false;
    ordenRecibida = false;
    ordenEntregada = false;

    suspendido = new Suspendido(this);
    caminando = new Caminando(this);
    atendiendo = new Atendiendo(this);
    cocinando = new Cocinando(this);

    estadoActual = suspendido;

  }

  public void ingresarOrden(int ordenMenu){
    ordenRecibida = true;
    System.out.println("En seguida preparé tu orden");
  }

  public boolean getOrdenRecibida(){
    return ordenRecibida;
  }

  public boolean getOrdenEntregada(){
    return ordenEntregada;
  }

  public boolean getLlegarDestino(){
    return llegarDestino;
  }


  public EstadoRobot getEstadoActual(){
    return estadoActual;
  }

  public int getProximidadDestino(){
    return proximidadDestino;
  }
  public void setProximidadDestino(int proximidad){
    proximidadDestino+=proximidad;
  }
  public void setLlegarDestino(boolean sn){
    llegarDestino = sn;

  }

  public void resetProximidadDestino(){
    proximidadDestino=0;
  }

  public EstadoRobot getSuspendido(){
    return suspendido;
  }
  public EstadoRobot getCaminando(){
    return caminando;
  }
  public EstadoRobot getAtendiendo(){
    return atendiendo;
  }
  public EstadoRobot getCocinando(){
    return cocinando;
  }

  public void suspender(){
    estadoActual.suspender();
  }

  public void caminar(){
    estadoActual.caminar();
  }
  public void atender(){
    estadoActual.atender();
  }
  public void cocinar(){
    estadoActual.cocinar();
  }
  public void asignarNuevoEstado(EstadoRobot nuevoEstado){
    estadoActual = nuevoEstado;
  }



}
