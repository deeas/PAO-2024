Colectii
Collections Framework
În pachetul java.util (pachet standard din JRE) există o serie de clase pe care le veti găsi folositoare. Collections Framework contine clase si interfete utile pentru reprezentarea şi manipularea colecţiilor. Ea conţine:

interfeţe
implementări
algoritmi, metode de prelucrare (căutare, sortare) pe colecţii de obiecte oarecare.
Colecţiile oferă implementări pentru următoarele tipuri:

Set (multime - elemente neduplicate)
List (lista de elemente)
Map (perechi cheie-valoare)
Există o interfaţă - Collection, pe care o implementează majoritatea claselor ce desemnează colecţii din java.util.

De asemenea, in clasa Collections (atentie! a nu se confunda cele doua) gasim metode statice utile lucrului cu colectii.

Resurse
Interfata Collection: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Collection.html

Clasa Collections: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Collections.html

Collections Framework: https://docs.oracle.com/javase/tutorial/collections/index.html

Parcurgerea colectiilor
Colecţiile pot fi parcurse folosind:

iteratori (un obiect care permite traversarea unei colecţii şi modificarea acesteia in aceiasi iteratie - ex: ştergere de elemente. Pentru a obtine un iterator se apeleaza metoda iterator())
for-each (in spate, foloseste tot un iterator; nu putem sterge elemente din colectie cand o iteram folosind for-each, si apoi sa continuam iteratia)
Resurse
Interfata Iterator: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Iterator.html

Interfata list
din punct de vedere al structurii de date, reprezinta implementarea unui array sau a unei liste
contine metode de baza, de obicei bazate pe index: get, set, add, remove, size, etc.
Alături de List, este definită interfaţa ListIterator, ce extinde interfaţa Iterator cu metode de parcurgere în ordine inversă
Exemple de algoritmi ce pot fi utilizati pentru List (din clasa Collections):

sort (similar cu Arrays.sort(), foloseste strategia de sortare default in functie de tipul de obiect, insa poate fi suprascrisa folosind Comparable/Comparator - vezi Lab 4)
binarySearch
List are doua implementari standard:

1) ArrayList
   implementeaza o structura de date de tip array (vector) dinamic
   access la obiecte: O(1)
   se foloseste cand avem nevoie sa facem operatii de tip get
2) LinkedList
   implementeaza o lista dublu inlantuita
   accesul la un element nu se face în timp constant, fiind necesară o parcurgere a listei: O(n)
   operatiile de tip alterare (add, remove) sunt mai rapide decat la ArrayList
   se foloseste cand avem nevoie sa facem multe operatii de alterare (add, remove)
   Resure
   interfata List: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/List.html

interfata ListIterator: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/ListIterator.html

algoritmi pentru List: https://docs.oracle.com/javase/tutorial/collections/algorithms/index.html

clasa ArrayList: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/ArrayList.html

clasa LinkedList: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/LinkedList.html

Interfata Set
implementeaza o multime ce nu poate contine duplicate
contine metodele mostenite de la Collection
Exista 3 implementari standard pentru Set:

1) HashSet
   este implementat folosind o tabelă de dispersie (hash table)
   cea mai performantă implementare
   nu garanteaza pastrarea ordinii (2 iteratori diferiti pot parcurge acelasi HashSet in ordine diferita)
   Implementarile bazate pe hashcode (ex:HashSet), care se bazeazǎ pe o tabelǎ de dispersie, calculeazǎ codul de dispersie al elementelor pe baza metodei hashCode(), definitǎ în clasa Object.

De aceea, douǎ obiecte egale, conform funcţiei equals(), trebuie sǎ întoarcǎ acelaşi rezultat din hashCode.

2) LinkedHashSet
   este implementat folosind o tabelă de dispersie
   garanteaza pastrarea ordinii in care au fost adaugate la parcurgere (folosind o lista dublu inlantuita)
3) TreeSet
   este implementat folosind un arbore(Red-Black Tree)
   elementele aduagate sunt ordonate (sortate)
   Resurse:
   Interfata Set: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Set.html

Clasa HashSet: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/HashSet.html

Clasa LinkedHashSet: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/LinkedHashSet.html

Clasa TreeSet: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/TreeSet.html

Interfata Map
implementeaza o structura de tip pereche cheie-valoare
fiecare cheie este mapata la o singura valoare
cheile nu pot fi duplicate
Interfata Map.Entry modeleaza o pereche cheie-valoare. Are urmatoarele metode:

setValue(value)
getKey()
getValue()
Exista 3 implementari standard pentru Map.

1) HashMap
   este implementat folosind o tabelă de dispersie (hash table)
   cea mai performantă implementare
   nu garanteaza pastrarea ordinii
2) LinkedHashMap
   este implementat folosind o tabelă de dispersie
   garanteaza pastrarea ordinii in care au fost adaugate la parcurgere (folosind o lista dublu inlantuita)
3) TreeMap
   este implementat folosind un arbore(Red-Black Tree)
   elementele aduagate sunt ordonate (sortate) dupa chei
   Resurse:
   Interfata Map: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html

Interfata Map.Entry: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.Entry.html

Clasa HashMap: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashMap.html

Clasa LinkedHashMap: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedHashMap.html

Clasa TreeMap: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/TreeMap.html

Contractul equals - hashCode
daca se suprascrie equals(), trebuie suprascris si hashCode()
daca se foloseste o colectie ce are la baza hash-uri, trebuie suprascrise metodele equals() si hashCode()
Contract:

daca apelam hashCode() de mai multe ori pe acelasi obiect, ar trebui sa se intoarca intotdeauna aceiasi valoare
dacă obj1 equals obj2 => hashcode obj1 == hashcode obj2.
daca obj1 !equals obj2 => cele doua hashcodes nu trebuie neaparat sa fie diferite, totusi e recomandat sa fie diferite dpdv complexitate
Resources:
Contract equals - hashCode: https://www.baeldung.com/java-equals-hashcode-contracts

Alte interfete utile:
Queue
interfata ce defineste o coada, cu operatiile aferente
exemplu de implementare: PirorityQueue
Deque
interfata ce defineste o coada cu doua capete
extinde interfata Queue
avand doua capete, poate fi folosita atat ca si coada, cat si ca si stiva
exemple de implementari : ArrayDeque, LinkedList (pe lângă List, LinkedList implementează şi Deque)
Resurse:
interfata Queue: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Queue.html
interfata Deque: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Deque.html


Streams

stream = flux de elemente
java.util.stream
clasa: Stream
Instantierea unui stream
un stream poate fi creat dintr-o colecte / array
metode: Collection/Array.stream() ; Stream.of()
Stream.empty() : empty stream
Operatii pe stream-uri
Operatiile ce pot fi aplicate stream-urilor se impart in 2 categorii:

operatii terminale (returneaza un alt rezultat)
operatii intermediare (returneaza un stream)
Operatiile intermediare pot fi inlantuite.

Exemple de operatii intermediare:

map() : converteste fiecare element din stream
filter() : primeste un Predicate ca si parametru si filtreaza elementele stream-ului in functie de acesta
sorted() : sorteaza un stream
distinct() : returneaza elementele distincte din stream
flatMap() : Stream<Collection> -> Stream
Exemple de operatii terminale:

foreach() : aplica anumite operatii supra fiecarui element din stream
collect() : stocheaza elementele din stream intr-o colectie
match() : verifica un Predicate; returenaza boolean
count() : returneaza numarul de elemente din stream
reduce() : reduce elementele unui stream, folosind o functie; returneaza Optional
min(), max(), average()
Stream.generate()
primeste ca si parametru un Supplier pentru a genera elemente
limit - numar elemente