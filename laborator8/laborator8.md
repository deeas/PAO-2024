# Fluxuri I/O

- used to process input & to produce output
- package: **java.io**

Un **stream** reprezinta un flux de date

Tipuri de stream-uri:
- InputStream: folosit pentru a citi date
- OutputStream: folosit pentru a scrie date

#### Byte Streams

- 8 bit (octet)
- clase: FileInputStream/FileOutputStream
- utile daca vrem sa procesam date in format binar (ex: imagini)

#### Character Streams

- 16 bit (character)
- clase: FileReader/FileWriter
- in spate, foloseste tot FileInputStream/FileOutputStream
- utile daca vrem sa procesam caractere Unicode

#### File

- permite operații specifice fișierelor și directoarelor, precum creare, ștergere, mutare etc., mai puțin operații de citire/scriere.

Metode uzuale ale clasei File:
- String getAbsolutePath() – returnează calea absolută a unui fișier;
- String getName() – returnează numele unui fișier;
- boolean createNewFile() – creează un nou fișier, iar dacă fișierul există deja metoda returnează false;
- File[] listFiles() – listeaza fisierele dintr-un director

#### DataInputStream & DataOutputStream

- permit citirea și scrierea datelor la nivel de tipuri de date primitive
- clase: DataInputStream/DataOutputStream


#### Fluxuri I/O folosind buffer

- numar mare de accesari => probleme de performanta
Clase: 
-  BufferedReader, BufferedWriter – fluxuri de procesare la nivel de buffer de caractere
-  BufferedInputStream, BufferedOutputStream – fluxuri de procesare la nivel de buffer de octeți


# Interfete functionale

Incepand cu Java 8 => suport pentru programare functionala

_Lambda_ este un concept din programarea functionala si reprezinta o functie anonima

**Interfata functionala** => interfete ce contin fix o metoda abstracta.
Acestea pot fi implementate folosind expresii lambda.
Acestea au fost introduse pentru a reduce numarul de linii de cod scrise, si pentru a permite
pasarea functiilor ca si parametru altor metode.

- package: _java.util.function_ - interfete functionale uzuale, predefinite 

#### Function

- primeste un parametru si intoarce un rezultat
- metoda abstracta: apply(Object)

#### BiFunction

- primeste 2 parametrii si intoarce un rezultat
- metoda abstracta: apply(Object, Object); 

- IntFunction, DoubleFunction, IntToDoubleFunction, IntToLongFunction, 
  DoubleToIntFunction,
  DoubleToLongFunction, LongToDoubleFunction, and LongToIntFunction.
  
#### Predicate

- primeste un parametru si returneaza Boolean
- metoda abstracta: test(Object)
- BiPredicate: primeste 2 parametrii

#### Supplier:

- nu primeste nici un parametru si returneaza un rezultat
- metoda abstracta: get()
- IntSupplier, DoubleSupplier, BooleanSupplier, LongSupplier

#### Consumer:

- primeste un parametru si nu returneaza nimic (void)
- metoda abstracta: accept(Object)
- IntConsumer, LongConsumer, DoubleConsumer, BiConsumer, ObjtIntConsumer,
  ObjLongConsumer, ObjDoubleconsumer
  
#### UnaryOperator

- primeste un parametru si returneaza un rezultat de acelasi tip
- metoda abstracta: apply(Object)
- IntUnaryOperator, DoubleUnaryOperator, LongUnaryOperator

#### BinaryOperator

- primeste 2 parametrii si returneaza un rezultat de acelasi tip
- metoda abstracta: apply(Object, Object)
- IntBinaryOperator, LongBinaryOperator, DoubleBinaryOperator

#### Interfete functionale custom

- @FunctionalInterface
- compilatorul va arunca o eroare in cazul in care avem mai mult de o metoda abstracta