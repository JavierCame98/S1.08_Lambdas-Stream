# S1.08_Lambdas-Stream

## Statement of the exercise
Exercici 1
A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.

Exercici 2
Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.

Exercici 3
Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

Exercici 4
Fer la mateixa impressió del punt anterior, però mitjançant method reference.

Exercici 5
Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.

Exercici 6
Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.

Exercici 7
Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.

Exercici 8
Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.

## Features

Filtering collections using lambda expressions.
Transforming data with map() and filter().
Sorting collections using Comparator and Streams.
Using lambda expressions for iteration.
Applying method references for cleaner code.
Creating and using custom Functional Interfaces.
Writing declarative and expressive Java code.

## Technologies

Backend: Java 8+
API: Java Streams & Lambda Expressions
Testing (optional): JUnit 5

## Installation & Execution

Clone the repository
Open the project
Import the project into your preferred IDE (IntelliJ IDEA, Eclipse, or VS Code).
Run the application
Execute the main() method to see the lambda and stream operations in action.

## Demo

Console output demonstrating:
Filtered lists
Sorted results
Lambda execution
Functional Interface behavior

## Diagrams & Technical Decisions

Streams are used instead of loops to improve readability and express intent.
Lambda expressions reduce boilerplate code.
Method references are applied when lambdas can be simplified.
Functional Interfaces encapsulate behavior and enable flexible design.
Mixed-type lists are normalized before sorting to avoid type checks.
