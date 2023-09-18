# Pseudocode Luas dan Keliling Persegi Panjang #

Deklarasi int panjang, lebar, luas, keliling

print "nilai panjang"\
input nilai panjang\
print "nilai lebar"\
input nilai lebar

luas = panjang * lebar\
keliling = 2 * panjang + lebar

print "luas" dan "keliling

# Flowchart Luas Persegi Panjang #

```mermaid
flowchart TD;
    A([Mulai])-->B{{int panjang, lebar, luas, keliling}}
    B-->C[/panjang, lebar/]
    C-->D(luas = panjang * lebar dan keliling = 2 * panjang + lebar)
    D-->E[/luas, keliling/]
    E-->F([selesai])
```
    import java.util.Scanner;

    public class PersegiPanjang {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int panjang, lebar, luas, keliling;

            System.out.println("Masukkan Nilai Panjang");
            panjang=input.nextInt();
            System.out.println("\nMasukkan Nilai Lebar");
            lebar=input.nextInt();

            luas= panjang * lebar;
            keliling= 2 * panjang + lebar;

            System.out.println("\nHasil Luas Adalah = " +luas);
            System.out.println("Hasil Keliling Adalah = " +keliling);
        }
    }


# Pseudocode Luas dan Keliling Lingkaran #

Deklarasi double pi, jari-jari, luas, keliling\
input nilai pi = 3.14

print "nilai jari-jari"\
input nilai jari-jari

luas = pi * jari-jari * jari jari\
keliling = 2 * pi * jari-jari

print "luas" dan "keliling"

# Flowchart Luas dan Keliling Persegi Lingkaran #

```mermaid
flowchart TD;
    A([Mulai])-->B{{double pi, jari-, luas, keliling}}
    B-->C[/jari-jari/]
    C-->D(luas = pi * jari-jari dan keliling = 2 * pi * jari-jari)
    D-->E[/luas, keliling/]
    E-->F([selesai])
```

    import java.util.Scanner;

    public class Lingkaran {
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
        
            double jari_jari, luas, keliling;
            double pi = 3.14;

            System.out.println("Masukkan Nilai Jari-Jari");
            jari_jari=input.nextDouble();
        
            luas = pi * jari_jari * jari_jari;
            keliling = 2 * pi * jari_jari;

            System.out.println("\nHasil Luas Adalah = " +luas);
            System.out.println("Hasil Keliling Adalah = " +keliling);
        }
    }


# Pseudocode Luas Segitiga #

Deklarasi double alas, tinggi, sisi, luas, keliling

print "alas"\
input nilai alas
print "tinggi"
input nilai tinggi

luas = 0.5 * alas * tinggi
keliling = sisi * 3

print "luas" dan "keliling"

# Flowchart Luas dan Keliling Segitiga #

```mermaid
flowchart TD;
    A([Mulai])-->B{{double alas, tinggi, sisi, luas, keliling}}
    B-->C[/alas, tinggi, sisi/]
    C-->D(luas = 0.5 * alas * tinggi dan keliling = 3 * sisi)
    D-->E[/luas, keliling/]
    E-->F([selesai])
```

    import java.util.Scanner;

    public class Segitiga {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
        
            double alas, tinggi, sisi, luas, keliling;

            System.out.println("Masukkan Nilai Alas");
            alas=input.nextDouble();
            System.out.println("Masukkan Nilai Tinggi");
            tinggi=input.nextDouble();
            System.out.println("Masukkan Nilai Sisi");
            sisi=input.nextDouble();
        
            luas = 0.5 * alas * tinggi;
            keliling = sisi * 3;

            System.out.println("\nHasil Luas Adalah = " +luas);
            System.out.println("Hasil Keliling Adalah = " +keliling);
        }
    }
