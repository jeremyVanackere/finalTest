# finalTest

Le mot-clef final sur une variable ne concerne que la compilation.
Le compilateur va soit en faire une constante (si la valeur peut être déterminé à la compilation), soit simplement vérifier que la variable ne sera initialisé qu'une seule fois.

Mais cela n'a aucun impact sur le bytecode généré, et il ne peut donc pas y avoir de différence à l'exécution (tant qu'on n'est pas dans le cas de la constante bien sûr).


Malgré tout je recommande l'utilisation de final sur les variables, lorsque c'est possible, pour un code plus propre.

https://www.developpez.net/forums/d1419882/java/general-java/langage/gains-performance-lies-l-utilisation-cle-final/
