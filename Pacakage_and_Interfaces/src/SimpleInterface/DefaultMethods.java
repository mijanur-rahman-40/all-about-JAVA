package SimpleInterface;

interface MyIF {
// This is a "normal" interface method declaration.
// It does NOT define a default implementation.

    int getNumber();
// This is a default method. Notice that it provides
// a default implementation.

    default String getString() {
        return "Default String";
    }
}
// Implement MyIF.

class MyIFImp implements MyIF {
// Only getNumber() defined by MyIF needs to be implemented.
// getString() can be allowed to default.

    @Override
    public int getNumber() {
        return 100;
    }
}

class MyIFImp2 implements MyIF {
// Here, implementations for both getNumber( ) and getString( ) are provided.

    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "This is a different string.";
    }

}

// Use the default method.
class DefaultMethodDemo {

    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();
        // Can call getNumber(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println(obj.getNumber());
        // Can also call getString(), because of default
        // implementation:
        System.out.println(obj.getString());
    }
}
