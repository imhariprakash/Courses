public interface MyIF {
    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getNumber();
    // This is a default method. Notice that it provides
    // a default implementation.
    default String getString() {//default is must
        return "Default String";
    }
}

// Implement MyIF.
