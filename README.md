
2.  
    d) Mit Strategie können wir mit gleichem Objekt verschiede Sensoren verwenden

    e) Da sich die Strategien vom Sensor zu Sensor unterscheiden, jedoch sie immer wieder die gleiche Methode "measure" verwenden,
        können wir diese unter einer Klasse Thermometer "einkapseln"
     
3.  
    c) Ja, die Reihenfolge ist relevant, als erstes wird der Wert rechts berechnet
    d) Dekorierer verändern nicht die Struktur des ursprünglichen Objekts und können damit das Objekt sehr gut erweitern.
        Man könnte neue Methoden implementieren, die die Dekoration ersetzen. Das macht das System etwas mehr komplezierter.
        
    e) - Dekorierer umhüllen das Originalobjekt und implementieren dieselbe Schnittstelle, wodurch sie austauschbar sind
       - Strategien geben dem objekt die möglichkeit verschiedene funktionsimplementierungen anzugeben
    f)
   Open/Closed Principle: Klassen sollten für Erweiterungen offen, aber für Änderungen geschlossen sein
   Single Responsibility Principle: Eine Klasse sollte nur einen Grund zur Änderung haben
    
4. 
    d) ein Beobachter ermöglicht uns die Veränderung des Wertes zu empfangen und ggf neue Funktionalität(zbMethoden) zu starten
    e) Open-Closed Principle, Program to an Interface, not an implementation
5. 
    a)encapsulation ( Thermometer ), abstraction (Interfaces), inheritance( Alle Sensoren vererben Sensor, alle Beobachter vereben TemperatureObserver)
    polymorphism ( Wird hier durch Vererbung und Überschreibung der Methoden erreicht )
    b) Merkmale: Objekte, Klassen und Methoden
    Vererbung
    Kapselung
    Funktionen mit Parametern
    Punktnotation
    Klassenbibliotheken
    c) Verwendeten Entwurfsmuster helfen uns dabei, den Realismus aufrechtzuerhalten
    d) Überwiegend imperativ (bsp Thermometer)