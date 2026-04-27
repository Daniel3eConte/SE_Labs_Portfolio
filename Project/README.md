campUStrade 🎓🔄
campUStrade è una piattaforma di economia circolare e scambio di servizi progettata per gli studenti universitari. Il sistema permette agli utenti di scambiare competenze, favori e piccoli servizi (come ripetizioni o passaggi in auto) utilizzando un sistema di crediti virtuali interno, eliminando la necessità di transazioni monetarie reali all'interno del campus.

🚀 Funzionalità Principali
Sistema di Autenticazione: Accesso sicuro tramite credenziali universitarie (email e password).

Gestione Profili: Ogni studente ha un portafoglio di crediti virtuali e uno storico delle attività create.

Creazione Annunci: Gli utenti possono pubblicare servizi offrendo una descrizione, un prezzo in crediti e una categoria di appartenenza.

Categorizzazione: Navigazione semplificata tra le diverse tipologie di servizi (es. Studio, Trasporti, Supporto Tecnico).

🛠️ Tecnologie Utilizzate
Linguaggio: Java 17+

Paradigma: Object-Oriented Programming (OOP)

Metodologia di Sviluppo: Test-Driven Development (TDD) tramite JUnit.

IDE consigliato: IntelliJ IDEA

Modellazione: UML 2.0 (Class, Sequence, State, Activity e Use Case diagrams).

🏗️ Architettura del Software (Design)
Il progetto segue i principi dell'Ingegneria del Software per garantire manutenibilità e scalabilità:

Incapsulamento: Tutte le classi (Student, Activity, Category) utilizzano modificatori di accesso privati per proteggere l'integrità dei dati.

Associazioni Complesse: Gestione di relazioni 1:N tra Studenti/Categorie e Attività tramite l'uso di ArrayList.

Business Logic Decentralizzata: La logica di creazione degli oggetti è gestita internamente alle classi per ridurre l'accoppiamento (es. Student.createActivity()).

🧪 Test-Driven Development (TDD)
Per questo progetto è stata adottata la tecnica del Ping-Pong Pair Programming. Il ciclo di sviluppo segue rigorosamente il pattern:

🔴 RED: Scrittura di un test unitario fallimentare.

🟢 GREEN: Implementazione del codice minimo necessario per far passare il test.

🔵 REFACTOR: Ottimizzazione del codice mantenendo intatta la funzionalità.

📦 Struttura del Progetto
Plaintext
src/
 └── main/java/org/example/
      ├── Student.java    # Gestione utente, crediti e creazione servizi
      ├── Activity.java   # Rappresentazione del servizio/annuncio
      └── Category.java   # Organizzazione logica delle attività
💻 Esempio di Utilizzo (Snippet)
Java
// Creazione di uno studente e una categoria
Student mario = new Student("S123", "Mario Rossi", "mario@edu.pl", "securePass123", 100);
Category tutoring = new Category("Ripetizioni");

// Lo studente crea un'attività
mario.createActivity("Ripetizioni Java", 20, "Lezioni base di OOP", tutoring);

// Verifica dei crediti
System.out.println(mario.getCredits()); // Output: 100
👥 Autori
[Tuo Nome]

[Nome del tuo Collega]

Progetto realizzato per il corso di Ingegneria del Software - Łódź University of Technology (IFE).
