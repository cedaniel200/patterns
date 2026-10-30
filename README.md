# Patrones de diseño

![Java](https://img.shields.io/badge/Java-21-blue?style=flat-square&logo=openjdk&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit-5.14.4-25A162?style=flat-square&logo=junit5&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-9.6.1-02303A?style=flat-square&logo=gradle&logoColor=white)
[![License: Apache 2.0](https://img.shields.io/badge/License-Apache_2.0-blue?style=flat-square)](LICENSE)

Implementaciones mínimas de patrones de diseño en Java. Cada patrón vive en su propio paquete, con un
ejemplo pequeño y ejecutable en lugar de teoría: la clase `Run` (o `Main` en Strategy) imprime el
resultado por consola.

## Patrones incluidos

| Tipo | Patrón | Paquete | Ejemplo |
|---|---|---|---|
| Creacional | Abstract Factory | [`creational/abstractfactory`](src/main/java/com/cedaniel200/patterns/creational/abstractfactory) | Fábricas de casas de ladrillo, piedra, madera y modernas |
| Creacional | Builder | [`creational/builder`](src/main/java/com/cedaniel200/patterns/creational/builder) | Hamburguesas (`simple`) y jerarquía persona ↔ superhéroe ↔ villano (`inheritance`) |
| Creacional | Factory Method | [`creational/factorymethod`](src/main/java/com/cedaniel200/patterns/creational/factorymethod) | Agencia de viajes que crea buses o aviones |
| Creacional | Prototype | [`creational/prototype`](src/main/java/com/cedaniel200/patterns/creational/prototype) | Carpintero que clona sillas, sofás y mesas |
| Creacional | Singleton | [`creational/singleton`](src/main/java/com/cedaniel200/patterns/creational/singleton) | Instancia única, con variante para concurrencia |
| Comportamiento | Strategy | [`behavioral/strategy`](src/main/java/com/cedaniel200/patterns/behavioral/strategy) | Pizarra táctica que cambia entre 4-3-3, 4-4-2 y 4-5-1 |
| Estructural | Adapter | [`structural/adapter`](src/main/java/com/cedaniel200/patterns/structural/adapter) | Olla a presión como instrumento de percusión, por clase y por objeto |

## Estructura

```text
src/main/java/com/cedaniel200/patterns
├── creational/                 # creación de objetos
│   ├── abstractfactory/        # familias de fábricas y su modelo (House, Roof, Walls…)
│   ├── builder/
│   │   ├── simple/             # construcción paso a paso de una hamburguesa
│   │   └── inheritance/        # builders que heredan entre sí (Person, SuperHero, Villain)
│   ├── factorymethod/          # Transport + agencias que deciden qué transporte crear
│   ├── prototype/              # Furniture clonable y el carpintero que la duplica
│   └── singleton/              # Product y MultiThreadProduct
├── behavioral/
│   └── strategy/               # SoccerBoard y las formaciones tácticas intercambiables
└── structural/
    └── adapter/
        ├── clase/              # adaptador por herencia
        └── objeto/             # adaptador por composición
```

## Cómo ejecutarlo

Requiere JDK 21; el wrapper descarga Gradle 9.6.1.

```bash
./gradlew build
java -cp build/classes/java/main com.cedaniel200.patterns.behavioral.strategy.Main
```

Cada ejemplo tiene su propio punto de entrada. La clase se llama `Run` en casi todos los paquetes;
las excepciones son `behavioral.strategy.Main` y `creational.builder.simple.Director`:

| Patrón | Clase |
|---|---|
| Strategy | `behavioral.strategy.Main` |
| Abstract Factory | `creational.abstractfactory.Run` |
| Builder (simple) | `creational.builder.simple.Director` |
| Builder (herencia) | `creational.builder.inheritance.Run` |
| Factory Method | `creational.factorymethod.Run` |
| Prototype | `creational.prototype.Run` |
| Singleton | `creational.singleton.Run` |
| Adapter (clase) | `structural.adapter.clase.Run` |
| Adapter (objeto) | `structural.adapter.objeto.Run` |

También puedes abrir el proyecto en IntelliJ IDEA o VS Code y ejecutar la clase desde el IDE.

## Notas

- Cada paquete es independiente: puedes leerlo y ejecutarlo sin mirar los demás.
- El repositorio está en construcción; si ves algo raro, escribe a **cdanielmg200@gmail.com**.
