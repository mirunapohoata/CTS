package clase;

public interface MijlocTransport extends Cloneable{ //cloneable face shallow copy
      MijlocTransport copiaza() throws CloneNotSupportedException;
}
