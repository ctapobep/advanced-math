package abstractalgebra.functions;

import abstractalgebra.reals.Real;

import java.math.BigDecimal;

public class Cos implements Function {

    public Real get(Real x) {
        return new Real(BigDecimal.valueOf(Math.cos(x.asDouble())));
    }
}
