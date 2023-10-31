# java-spring-execercises


ITA:

All'interno di questa repository troverete vari esercizi riguardanti JAVA e SPRING.
Nello specifico frequentando un'academy basata sul backend, siamo partiti dalle basi del linguaggio java (in vari esercizi si inizierà appunto dai principali costrutti) e nello specifico:

- Gestione variabili, classi, con relativi concetti di astrazione, ereditarietà, polimorfismo e incapsulamento.
- Array built-in e differenza con le collection --> ArrayList, List, LinkedList ecc
- DBMS e MySql --> life cicle di creazione di un database con le relative interrogazioni/query di inserimento, modifica, cancellazione e lettura.
  Test e spiegazione delle varie JOIN di tabelle(Left, right, outer, inner), esempi pratici e applicati
- JDBC e interazione col DB, JAVA EE con relative servlet, esempi pratici e applicati anche qui
- Framework Spring  --> spiegazione dei suoi layer(Spring Core, Spring MVC, Spring Data ecc) ed esercizi (che troverete sotto) integrando Spring JPA e l'ORM Hibernate
- Spring JPA, tramite JPA abbiamo imparato e persistere i dati su un DB usando direttamente Spring
- ORM HIBERNATE, tramite esso e vari esempi, abbiamo mappato oggetti java in tabelle/query e altro direttamente dall'orm.

  
  Esercizi spiegati nello specifico, uno per uno che troverete nelle varie cartelle:

  Requisiti: un IDE e Java installato

- esVideoGiochi: JAVA VANILLA: questa app ti consentirà di gestire vari utenti e vari videogiochi, ovvero, avrai tutti i metodi crud da ambo i lati
  e potrai testare con mano anche le relazioni tra essi.
  Esercizio utile per imparare a gestire gli arraylist e come farli interagire con le varie classi.

- esPasticceria: JAVA VANILLA: questa app ti consentirà di gestire un negozio di pasticceria, ovvero avrai dei clienti, dei lavoratori a cui sarà associato un manager e un prodotto.
  E' consideradibile un upgrade dell'esercizio precedente, avendo più classi e più interazione tra di esse

- gestioneAuto: JAVA VANILLA: app di gestione auto, potrai gestire, interagire e cercare per targa o per altro, varie auto che potrai inserire, modificare, cancellare o cercare.

- ristorante: JAVA VANILLA: app di gestione di un ristorante, possiamo gestire tavoli e prenotazioni, in questo esercizio si troverà una divisione migliore degli elementi
  in pacchetti e useremo le interfacce.

- list: SPRING : questa è un app di "test", dove potremmo gestire da un controller i vari task, quindi abbiamo i CRUD's che potremmo testare
  direttamente con PostMan o chiamate API.

- provaHibernate : SPRING+ HIBERNATE: anche qui, testing abb usando hibernate e spring

- libreriaOnlineJPA: SPRING+ JPA: Possiamo definirlo come esercizio finale, dove possiamo gestire libri e autori legati tra di loro tramite una associazione @manytomany.
  Il lavoro è suddiviso in vari pacchetti e classi --> Entities, DTO's, repositories, services e controllers.
  Ognuno delle quali testabile, sia autori che libro saranno differenziati e ognuno avrà il proprio controller, service ecc ecc

  Nello specifico si parte dalle due classi DTO, Libro e Autore con i loro attributi e getter/setter
  Successivamente sono passato alla creazione delle entity di entrambe, con i loro attributi e annotations specifiche -->@Column sopra i vari campi,
  ed essendo una associazione @manytomany entrambi avranno un campo che punta ad una terza tabella che verrà creata da hibernate.
  Avremo due 


ENG:

In this repository, you will find various exercises related to JAVA and SPRING. Specifically, by attending a backend-focused academy, we started from the basics of the Java language (in various exercises, we will begin with the fundamental constructs) as follows:

Variable and class management, including the concepts of abstraction, inheritance, polymorphism, and encapsulation.
Built-in arrays and the difference with collections such as ArrayList, List, LinkedList, etc.
DBMS and MySql, covering the lifecycle of creating a database with related queries for insertion, modification, deletion, and retrieval. Testing and explanation of various table JOINs (Left, Right, Outer, Inner).
JDBC and interaction with the database, JAVA EE with related servlets.
Spring Framework, explaining its layers (Spring Core, Spring MVC, Spring Data, etc.) and exercises (which you will find below) integrating Spring JPA and the ORM Hibernate.
Exercises are explained in detail, one by one, which you will find in various folders:

esVideoGames: JAVA VANILLA: This app allows you to manage various users and video games, providing all the CRUD methods from both sides, allowing you to test the relationships between them. This exercise is useful for learning how to handle ArrayLists and how to make them interact with various classes.

esPatisserie: JAVA VANILLA: This app enables you to manage a pastry shop, including customers, workers associated with a manager, and products. It is considered an upgrade from the previous exercise, involving more classes and interactions between them.

gestioneAuto: JAVA VANILLA: This is an app for managing cars. You can manage, interact with, and search for various cars, which you can insert, modify, delete, or search.

ristorante: JAVA VANILLA: A restaurant management app that allows you to manage tables and reservations. In this exercise, there is a better division of elements into packages, and we use interfaces.

list: SPRING: This is a "test" app where we can manage various tasks from a controller, so we have CRUD operations that can be tested directly with Postman or API calls.

provaHibernate: SPRING + HIBERNATE: Here, we are testing using Hibernate and Spring.

libreriaOnlineJPA: SPRING + JPA: This can be considered a final exercise where we can manage books and authors linked through a @manytomany association. The work is divided into various packages and classes, including Entities, DTOs, repositories, services, and controllers. Each of these is testable, and authors and books are differentiated, each having its controller, service, etc.

