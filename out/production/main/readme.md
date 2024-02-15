Hippolyte Guilloteau

IUT Nantes

BUT-2 groupe-1

R.312 automates et langages

<img src="../kotlin/image/logojpg.jpg" width="100">

# Modélisation et analyse à l'aide des automates

# Introduction

Dans ce markdown, vous retrouverez l'explication de 3 automates, 
un premier pour réaliser des smileys, 
un second pour la réalisation d'heure au format : `HH:MM` 
et enfin un automate permettant de vérifier qu'une adresse mail est valide. 
Vous trouverez ci-dessous des détails sur chaque automates, leur réalisation, 
quelles données sont valides ou non ainsi qu'une explication détaillé du code et de la manière d’exécuter ce dernier.

# Comment s'organise le code

# Comment l’exécuter

Se trouve dans le répertoire kotlin un fichier ```monAppli.jar``` pour lancer ce fichier, il vous suffit de vous placer dans le bon répertoire et de lancer la commande :
```java -jar monAppli.jar```
Un terminal va s'ouvrir vous demandant de choisir un nombre : 1 pour lancer le programme smiley, 2 pour l'heure, 3 pour l'adresse mail ou 99 pour stopper l'application.
Une fois un des programmes lancés, l'utilisateur doit entré une chaine de caractères et l'automate va lui renvoyer une réponse correct ou incorrecte en fonction de la chaine de caractère rentrée


# Les automates

**Smileys**

**Graphe d'automate**

<img src="../kotlin/image/graphe_smiley.svg">

L'automate smiley permet de dire si un smiley est valide ou non, voici la liste exhaustive des smileys valides.
````````

**Heure**

**Graphe d'automate**

<img src="../kotlin/image/graphe_heure.svg">

**Adresse électronique**

**Graphe d'automate**

<img src="../kotlin/image/graphe_adressemail.svg">


# Aides 
Afin de réaliser ce projet, je me suis aidé de Raphaël Silly pour l'architechture du projet.

ChatGPT m'a aidé à réaliser le Main.kt. 

J'ai utilisé l'outil en ligne Graphiz pour réaliser les graphes d'automates. 

Afin de savoir quelles adresses mails étaient valides j'ai utilisé la page wikipédia adresse électronique.
