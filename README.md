L’objectif de cette corbeille est de réaliser un petit jeu vidéo. Il s’agit de programmer un combat de 2 avions (d’où le nom : DogFight). 
- Chaque avion est piloté par un joueur 
- Chaque joueur dispose de 5 touches pour contrôler son avion 
  - Haut, Bas, Droite et Gauche pour modifier la direction de l’avion 
  - Tir pour lancer un missile 
- Chaque avion se déplace tout le temps à la même vitesse, les joueurs n’ont donc pas la main sur cette donnée 
- Le  ciel  est  une  sphère,  lorsqu’un  avion  traverse l’écran  par  un  bord  il  ressort  par  le  bord opposé. Un avion peut donc se retrouver coupé en deux. 
- La  modification  de  la  direction  se  fait  instantan
ément  et  en  angle  droit  (pas  de  virage  ou 
décélération) 
- La réserve de missile est infinie 
- Les missiles traversent eux aussi les bords de l’écran 
- Les missiles ont une durée de vie limitée 
- Un  avion  touché  par  un  missile  est  immédiatement détruit,  y  compris  s’il  s’agit  d’un  missile qu’il a lui-même tiré 
- La partie se termine dès qu’un avion est détruit 
- Dans le ciel, il y a des nuages 
  - Eux aussi se déplacent 
  - Certains cachent les avions, d’autres non 
  - Aucun nuage ne bloque le passage des missiles ou des avions 
