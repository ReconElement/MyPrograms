package javadev.array;

interface face {
}

class boy1 implements face {
}

class boy2 implements face {
}

class boy3 implements face {
}

public class array4 {
    face array[] = new face[] { new boy1(), new boy2(), new boy3(), null };
}
