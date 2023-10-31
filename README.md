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
  Avremo due repository per differenziare le classi, che estendono JPA repository e all'interno possiamo scrivere i metodi per le eventuali query.
  Anche qui, due services che richiamano tramite @autowired le repository, e qui facciamo la logica di business, prendiamo gli elementi dalle tabelle e li sistemiamo
  nei DTO e viceversa.
  Infine, due controller con relativi endpoint per testare.


ENG:

Within this repository, you will find various exercises related to JAVA and SPRING. Specifically, attending a backend-focused academy, we started from the basics of the Java language (in several exercises, we will begin with the fundamental constructs) and, specifically:

Variable management, classes, with their related concepts of abstraction, inheritance, polymorphism, and encapsulation.

Built-in arrays and the difference from collections --> ArrayList, List, LinkedList, etc.

DBMS and MySql --> the life cycle of creating a database with related insert, update, delete, and read queries. Testing and explanation of various table JOINs (Left, right, outer, inner), practical and applied examples.

JDBC and DB interaction, JAVA EE with related servlets, practical and applied examples here as well.

Spring Framework --> explanation of its layers (Spring Core, Spring MVC, Spring Data, etc.) and exercises (which you will find below) integrating Spring JPA and the Hibernate ORM.

Spring JPA, through JPA, we have learned to persist data in a database directly using Spring.

ORM HIBERNATE, through it and various examples, we have mapped Java objects into tables/queries and more directly from the ORM.

Exercises explained specifically, one by one, which you will find in various folders:

Requirements: An IDE and Java installed.

esVideoGiochi: JAVA VANILLA: This app will allow you to manage various users and video games, meaning you will have all the CRUD methods on both sides and can test the relationships between them. This exercise is useful for learning how to manage ArrayLists and how to make them interact with various classes.

esPasticceria: JAVA VANILLA: This app will allow you to manage a pastry shop, meaning you will have customers, workers associated with a manager, and a product. It's considered an upgrade of the previous exercise, involving more classes and interactions among them.

gestioneAuto: JAVA VANILLA: Car management app; you can manage, interact with, and search for various cars by plate or other criteria that you can insert, modify, delete, or search.

ristorante: JAVA VANILLA: Restaurant management app, where you can manage tables and reservations. In this exercise, you will find a better division of elements into packages, and we will use interfaces.

list: SPRING: This is a "test" app, where we can manage various tasks from a controller, meaning we have CRUD operations that we can test directly with Postman or API calls.

provaHibernate: SPRING + HIBERNATE: Again, testing using Hibernate and Spring.

libreriaOnlineJPA: SPRING + JPA: We can define this as a final exercise, where we can manage books and authors linked through a @manytomany association. The work is divided into various packages and classes: Entities, DTOs, repositories, services, and controllers. Each of these is testable, both authors and books will be differentiated, each having its controller, service, etc.

Specifically, we start with two DTO classes, Libro and Autore, with their attributes and getters/setters. Then, we move on to creating the entities for both, with their attributes and specific annotations - @Column above various fields. Since it's a many-to-many association, both will have a field pointing to a third table created by Hibernate. We have two repositories to differentiate the classes, extending JPA repository, and we can write methods for potential queries inside them. Here too, there are two services that call the repositories through @Autowired, where we handle the business logic, retrieving elements from the tables and arranging them in the DTOs and vice versa. Finally, two controllers with their respective endpoints for testing.

