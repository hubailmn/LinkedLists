# SinglyLinkedList

A small Java data structures exercise with generic linked list implementations and a demo program. It includes singly, doubly, and circularly linked lists built on reusable node classes.

## Features

- Generic `SinglyLinkedList` with addFirst, addLast, removeFirst, and removeLast
- Generic `DoublyLinkedList` using header and trailer sentinels
- Generic `CircularlyLinkedList` with a tail reference
- `Node` and `DoublyNode` helper classes
- Demo in `Main` using a simple `Student` object

## Requirements

- Java 8 or newer (no build tool required)

## Build & Run

```bash
javac -d out src/Main.java src/Student.java src/lists/*.java src/nodes/*.java
java -cp out Main
```

## Project structure

- `src/Main.java` — demo that exercises `SinglyLinkedList`
- `src/Student.java` — sample element type
- `src/lists/` — singly, doubly, and circularly linked list classes
- `src/nodes/` — node classes

## Notes

This is an educational exercise. The demo only uses the singly linked list; the other implementations are provided as additional practice.
