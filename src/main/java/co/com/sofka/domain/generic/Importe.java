package co.com.sofka.domain.generic;


import java.util.Objects;

public class Importe implements ValueObject<Double> {
    private final Double importe;

    public Importe(Double importe){
        try{
            if(importe<0){
                throw new IllegalArgumentException("Datos ingresados incorrectos");
            }else{
                this.importe=importe;
            }
        }catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @Override
    public Double value() {
        return importe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Importe that = (Importe) o;
        return Objects.equals(importe, that.importe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importe);
    }
}
