public class Main {
    public static void main(String[] args) {
        ArregloDinamico<String> arregloDinamico = new ArregloDinamico<>();
        arregloDinamico.agrega("Arielin");
        arregloDinamico.agrega("Arielin2");
        arregloDinamico.agrega("Arielin3");
        arregloDinamico.agrega("Arielin4");
        arregloDinamico.agrega("Arielin5");



        //System.out.println(arregloDinamico);
/**
        ArregloDinamico<String> arregloDinamic = new ArregloDinamico<>(3);
        arregloDinamic.agrega("Ari1");
        arregloDinamic.agrega("Ari2");
        arregloDinamic.agrega("Ari3");
        //arregloDinamic.agrega("Ari4");

        /**
         * para usar eset tipo de iteradores
         * Iterator<T> it = ad.iterador();
         *  while(it.hasNext(){
         *      sout(t.next)
         *
         *
         *  Ahora para hacer que se imprima todo tenemos que hacer
         *  for(String s: aad)
         *  sout(s)
         */
;
        System.out.println(arregloDinamico);
    }
}
