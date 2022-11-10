

class TemaTres {
    public static void main(String args[]) {
        System.out.println(suma(1, 2, 3));
        Coche coche = new Coche(3);
        System.out.println("El coche tiene " + coche.getPuertas() + " puertas");
        coche.aumentarPuerta(2);
        System.out.println("El coche tiene ahora " + coche.getPuertas() + " puertas");
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class Coche {
        private int puertas;
        public Coche(int puertas) {
            this.puertas = puertas;
        }

        public void aumentarPuerta(int puertas) {
            this.puertas += puertas;
        }

        public int getPuertas() {
            return this.puertas;
        }
    }
}