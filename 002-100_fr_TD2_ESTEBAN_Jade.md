# TD 2

## Exercice 1
Avec ce facteur de pondération moyen :
Entrée utilisateur = 4
Sortie utilisateur = 5
Requêtes utilisateur = 4
Fichiers utilisateur = 10
Interface externe = 7

Calculer le nombre de fonctions non ajustées (UFC)
Entrée utilisateur = 50
Sortie utilisateur = 40
Requêtes utilisateur = 35
Fichiers utilisateur = 6
Interface externe = 4

## Réponse 

UFC=4*50+5*40+4*35+10*6+7*4=628

## Exercice 2

```
  int i=0;
  for (i=0; i<10; i++){
    String result="";
    if (i%2){
      result = "even";
    } else {
      result = "odd";	
    }
    System.out.println(i+":"+result);
  }
```
Décrire, calculer et vérifier les 3 mesures de contrôle des flux

## Réponse 

### 1. Première méthode :

V(F) = e - n + 2

Où :
- e : nombre d'arêtes (transitions entre les nœuds, y compris pour la sortie),
- n : nombre de nœuds (comprenant notamment :
Initialisation de i,
Initialisation de la boucle for,
Initialisation de result,
Condition dans l'if,
Bloc pour les nombres pairs,
Fin du if,
Condition dans le else,
Bloc pour les nombres impairs,
Fin du else,
Retour avec System.out.println,
Sortie de la boucle for).

Dans notre exemple :
- e = 12 (les transitions entre les blocs),
- n = 11 (les nœuds du graphe).

Ainsi, on a :
V(F) = 12 - 11 + 2 = 3

### 2. Deuxième méthode :
V(F) = 1 + d

Où :
- d : nombre de nœuds décisionnels (nœuds où une décision est prise, comme une condition `if` ou une boucle).

Dans notre exemple, les nœuds décisionnels sont :
- La condition `i < 10` dans la boucle `for`,
- La condition `i % 2` dans l'instruction `if`.

Ainsi, on a :
V(F) = 1 + 2 = 3

### 3. Troisième méthode :
V(F) = r

Où :
- r : le nombre de régions dans le graphe de flux de contrôle.

Chaque région correspond à une partie du graphe pouvant être parcourue sans franchir de décision. Dans ce cas :
- La boucle `for` crée une région,
- L'instruction `if-else`crée deux régions supplémentaires avec la bifurcation.

Ainsi, on a:
V(F) = 3


Les trois méthodes donnent le même résultat : la complexité cyclomatique de ce code est 3.

## Exercice 3

Avec pour objectif "Analyser le processus de développement logiciel pour évaluer la productivité et l'efficacité des équipes", appliquer la méthode GQM.
Vous définissez des questions et un arbre de métriques.

## Réponse 

### 1. Définition de l'objectif (Goal)
- Objectif :  
Analyser le processus de développement logiciel pour évaluer la productivité et l'efficacité des équipes.

* Point de vue : Gestion de projet / Responsable technique
* Contexte : Projets de développement logiciel en équipe
* Focalisation : Productivité, efficacité, qualité du processus

### 2. Questions liées à l'objectif

Ces questions peuvent être réparties en deux catégories principales : Productivité et Efficacité.

#### A. Productivité
1. Q1 : Combien de fonctionnalités ont été développées sur une période donnée (par sprint, par mois, etc.) ?
2. Q2 : Quelle est la vitesse de livraison des tâches par rapport aux estimations initiales (vélocité) ?
3. Q3 : Quelle proportion des tâches est livrée dans les délais par rapport aux prévisions ?
4. Q4 : Quel est le ratio entre le temps passé à développer (coder) et celui passé à corriger des défauts ou déboguer ?
5. Q5 : Quelle est la répartition entre le développement de nouvelles fonctionnalités et la correction des bugs ?

#### B. Efficacité
6. Q6 : Combien de défauts sont détectés lors des tests par rapport à ceux trouvés en production ?
7. Q7 : Quelle est la qualité du code produit (en termes de lignes de code, complexité cyclomatique, duplications) ?
8. Q8 : Quelle est la couverture des tests automatisés par rapport aux exigences fonctionnelles et aux scénarios possibles ?
9. Q9 : Quel est le taux de satisfaction des utilisateurs finaux vis-à-vis des fonctionnalités livrées ?
10. Q10 : Quel est le temps moyen entre la détection d'un problème et sa résolution ?

### 3. Métriques associées aux questions

#### A. Productivité
1. Q1 : Nombre de fonctionnalités livrées par sprint (ou par mois).
2. Q2 : Vélocité moyenne par sprint (ratio tâches terminées/points d'estimation).
3. Q3 : Pourcentage de tâches respectant les délais prévus.
4. Q4 : Ratio du temps de développement / correction (heures passées).
5. Q5 : Nombre de tâches liées à des bugs par rapport aux nouvelles fonctionnalités (nouvelles tâches vs tâches bugs).

#### B. Efficacité
6. Q6 : Nombre de défauts détectés en phase de tests / Nombre de défauts en production.
7. Q7 : Complexité cyclomatique, nombre de lignes de code, taux de duplication.
8. Q8 : Pourcentage de couverture des tests automatisés (tests unitaires, tests d'intégration).
9. Q9 : Taux de satisfaction des utilisateurs (feedback, sondages).
10. Q10 : Temps moyen de résolution des problèmes (en heures ou jours).

### Arbre de métriques GQM


               Objectif
                   |
      Analyser le processus de développement
                   |
        -------------------------------
       |                               |
   Productivité                      Efficacité
       |                               |
   Questions                         Questions
       |                               |
1. Fonctionnalités par période      6. Défauts en test / production
2. Vélocité par sprint              7. Qualité du code
3. Respect des délais               8. Couverture des tests
4. Ratio dév/débogage               9. Satisfaction utilisateur
5. Tâches bugs/nouvelles            10. Temps de résolution
      |                               |
  Métriques                         Métriques
      |                               |
- Nombre de fonctionnalités       - Défauts détectés (tests/prod)
- Vélocité moyenne                - Complexité cyclomatique(Sonar)
- % Tâches respectant les délais  - % de couverture de tests
- Ratio temps dév/correction      - Taux de satisfaction
- Tâches bugs/nouvelles           - Temps moyen de résolution