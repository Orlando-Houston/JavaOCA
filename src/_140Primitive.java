public class _140Primitive {
    public static void main(String[] args) {
        int Ivar =100;
        float fVar=100.100f;
        double dVar= 123;
        fVar = Ivar;
        // Ivar = fVar;
        //  fVar =dVar;
        dVar =fVar;
        dVar = Ivar;
        //  Ivar = dVar
//        Which three lines fail to compile
    }
}
