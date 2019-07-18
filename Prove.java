
public class Prove {
    /*
     * Consegna: Dichiarare 2 variabili x e y, assegnare loro dei valori a scelta, stampare il loro prodotto
     */
    public static void es2() {
        int x;
        int y;
        x = 7;
        y = 8;
        System.out.println(x * y); //stampa la variabile nel terminale
    }

    /*
     * Consegna: Stampare su terminale la scritta: Hello World!
     */
    public static void es3() {
        System.out.println("Hello World!"); //stampa la stringa su terminale
    }

    /*
     * Consegna: Dichiarare una variabile di nome "age", a cui va assegnato il valore 19,
     *     stampare su terminale la stringa: "Ciao, mi chiamo Pina e ho " + age + " anni!"
     */
    public static void es4() {
        int age = 19; //si puo' anche fare dichiarazione e assegnamento in una volta sola!
        //age = 19;
        System.out.println("Ciao, mi chiamo Pina e ho " + age + " anni!"); //stampa la stringa su terminale

    }

    /*
     * Consegna: Dichiarare due variabili di tipo intero 'a' e 'b', assegnando loro dei valori positivi a scelta,
     *     stampare su terminale:
     *     Variabile a = valore_variabile
     *     Variabile b = valore_variabile
     *     Sooma = valore_somma
     *     Prodotto = valore_prodotto
     */
    public static void es5() {
        int a = 12;
        int b = 21;
        System.out.println("Variabile a = " + a);
        System.out.println("Variabile b = " + b);
        System.out.println("Somma = " + (a + b));
        System.out.println("Prodotto = " + (a * b));
    }

    /*
     * Consegna: Dichiarare due variabili di tipo intero 'var1' e 'var2', assegnare loro dei valori a scelta.
     *     stampare "var1 > var2" se la prima variabile e' maggiore della seconda, altrimenti
     *     stampare "var2 > var1"
     */
    public static void es6() {
        int var1 = -6;
        int var2 = 8;

        if(var1 > var2) {
            //ramo condizione VERA
            System.out.println("var1 > var2");
        } else {
            //ramo condizione FALSA
            System.out.println("var2 > var1");
        }
    }

    /*
     * Consegna: Dichiarare 2 variabili di tipo booleano 'piove' e 'ha_Ombrello', assegnare loro dei valori booleani a scelta (true/false),
     *  stampare:
     *    "Goditi la giornata" se non piove
     *    "Prendi ombrello!" se piove e non ha l'ombrello
     */
    public static void es7() {
        boolean piove = false;
        boolean ha_Ombrello = false;

        if(piove) {
            if(!ha_Ombrello) {
                System.out.println("Prendi ombrello!");
            }
        } else {
            System.out.println("Goditi la giornata");
        }
    }

    /*
     * Consegna: Dichiarare una variabile di tipo intero 'x' e assegnarci un valore a scelta,
     * dichiarare una variabile di tipo booleano 'bool' e assegnarci un valore a scelta,
     *   se x < 0 : stampare "valore negativo non previsto!"
     *   se x == 0 : stampare "x vale zero, caso non previsto!"
     *   se x > 0 e x < 10: stampare l'opposto di bool ('!' per la negazione)
     *   altrimenti stampare il valore di bool
     */
    public static void es8() {
        int x = 0;
        boolean bool = false;

        if(x < 0) {
            System.out.println("valore negativo non previsto!");
        } else if(x == 0) {
            System.out.println("x vale zero, caso non previsto!");
        } else if(x < 10) {
            System.out.println(!bool);
        } else {
            System.out.println(bool);
        }
    }

    /*
     * Consegna: Dichiarare 3 variabili che rappresentano numeri con virgola (double) 'spazio_percorso', 'tempo _impiegato' e 'velocita',
     *   assegnare a 'spazio_percorso' e 'tempo_impiegato' valori (con virgola) a scelta, poi
     *   assegnare a 'velocita' il valore effettivo della velocita' (ricordando la formula v = s / t) in base ai dati conosciuti,
     *   infine stampare "La velocita' vale " + velocita
     */
    public static void es9() {
        double spazio_percorso = 16.4;
        double tempo_impiegato = 9.3;
        double velocita = 0;

        velocita = spazio_percorso / tempo_impiegato;

        System.out.println("La velocita' vale " + velocita);
    }

    /*
     * Consegna: Stampare su terminale i primi 20 numeri naturali
     */
    public static void es10() {
        //[0, 19]
        int counter = 0;

        while(counter < 20) {
            //blocco while, le istruzioni qui dentro vengono ripetute finche' la condizione non diventa FALSA
            System.out.println(counter);
            counter = counter + 1;
        }
    }

    /*
     * Consegna: Stampare su terminale i numedi da 19 a 0 (in ordine decrescente)
     */
    public static void es11() {
        int counter = 19;

        while(counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }
    }

    public static void main(String[] args) {
        //es2();
        //es3();
        //es4();
        //es5();
        //es6();
        //es7();
        //es8();
        //es9();
        //es10();
        es11();
    }
}

/*
* Output su terminale:
    System.out.println(nome_variabile); //stampa la variabile nel terminale
    System.out.println("ciao sono una stringa, un insieme di caratteri!"); //stampa la stringa su terminale

* Dichiarazione variabile:
    int nome_variabile; //variabile di tipo intero, ovvero numeri (con segno) interi (...-2, -1, 0, 1 , 2...)
    boolean nome_variabile; //variabile di tipo booleano, ovvero valori booleani VERO o FALSO
    double nome_variabile; //variabile di tipo double, ovvero numeri (con segno) con la virgola (...-1.5, 0.0, 12.9...)

* Assegnazione valore ad una variabile:
    nome_variabile = valore;

* Operazioni aritmetiche fra variabili:
    somma: variabile_risultato = nome_variabile_1 + nome_variabile_2
    prodotto: variabile_risultato = nome_variabile_1 * nome_variabile_2
    sottrazione: variabile_risultato = nome_variabile_1 - nome_variabile_2
    divisione: variabile_risultato = nome_variabile_1 / nome_variabile_2

* Costrutto if:
    if(condizione) {
        //ramo condizione VERA
    } else {
        //ramo condizione FALSA
    }

* Cicli:
    costrutto while():
      while(condizione) {
          //blocco while, le istruzioni qui dentro vengono ripetute finche' la condizione non diventa FALSA
      }
 */
