# Distributed-tracing

Le but de ce projet est de comparer les différentes technologies de Distributed Tracing et de tester l'interopérabilité des technologies entre elles.

L'idée est de suivre une trace depuis un front en AngularJS qui appelle une API REST sur un back en SpringBoot, lui-même s'appelant sur une autre API REST.

Vous retrouverez le code spécifique à chaque technologie dans les branches git correspondantes. 
Au 20/06 seule la branche Jaeger existe.

| Framework    | AngularJS | Java SpringBoot | Identifiant de traçabilité |
|:-------------|:---------:|:---------------:|:---------------------------|
| Jaeger       | KO        | OK              |uber-x-traceid              |

@TODO : 
- Rajouter un appel d'API dans un nouveau thread (le new Thread conserve-t-il la traçabilité ?)
- Rajouter le postage d'un message dans une queue RabbitMQ
