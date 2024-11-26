## Scopo

Creare una libreria in grado di gestire le operazioni aritmetiche tra tempi. Il tempo è un' informazione che in questo esercizio vogliamo esprimere in ore e minuti.

## Procedimento
Troverai già lo scheletro di alcune classi. Lo scopo è costruire una classe Tempo concreta che implementi l'interfaccia Aritmetica declinata nel generico
Tempo (Aritmetica<Tempo>).

## Vincoli
Se l'operazione di sottrazione genera un tempo negativo, devi sollevare
l'eccezione TempoNegativoException. Se l'operazione di moltiplicazione o divisione viene eseguita tra oggetti entrambi non scalari (vedi proprietà scalare) devi sollevare l'eccezione TempoNotScalareException. In entrambe le operazioni solo uno dei due oggetti che vai a moltiplicare/dividere deve essere scalare, in particolare per quanto riguarda la divisione solo l'oggetto ricevuto come parametro deve essere scalare.

## Suggerimenti
Ragiona con calma prima di partire a scrivere codice. Prenditi il tempo necessario per comprendere la richiesta.


