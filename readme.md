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