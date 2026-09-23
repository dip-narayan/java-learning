package oop.day08;

/// Day 8 - Access Modifiers
/// Topic: Object-Oriented Programming - Access Modifiers
/// Description:
/// This program demonstrates the four access levels available
/// in Java and shows how they control access to classes, fields,
/// and methods.
/// Topics Covered:
/// - private
/// - default / package-private
/// - protected
/// - public
/// - Access from the same class
/// - Access through objects
/// - Access through inheritance
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day08AccessModifiers {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        DAY 8 - ACCESS MODIFIERS");
        System.out.println("==========================================");


        // ==========================================
        // 1. private ACCESS MODIFIER
        // ==========================================

        /*
         * private members can only be accessed directly
         * inside the class where they are declared.
         *
         * They cannot be accessed directly from another class.
         *
         * This is commonly used to achieve encapsulation.
         */

        System.out.println();
        System.out.println("1. private Access Modifier");
        System.out.println("------------------------------------------");

        PrivateExample privateExample = new PrivateExample();

        privateExample.displayPrivateData();

        /*
         * The following would cause a compilation error:
         *
         * privateExample.privateMessage;
         *
         * because privateMessage is private.
         */


        // ==========================================
        // 2. ACCESSING private DATA THROUGH METHODS
        // ==========================================

        /*
         * Private fields are commonly accessed through public
         * getter and setter methods.
         */

        System.out.println();
        System.out.println("2. Accessing private Data Through Methods");
        System.out.println("------------------------------------------");

        Account account = new Account(
                "ACC1001",
                "Dip"
        );

        System.out.println(
                "Account number = " + account.getAccountNumber()
        );

        System.out.println(
                "Account holder = " + account.getAccountHolder()
        );

        account.setAccountHolder("Dip Narayan");

        System.out.println(
                "Updated account holder = "
                        + account.getAccountHolder()
        );


        // ==========================================
        // 3. DEFAULT / PACKAGE-PRIVATE ACCESS
        // ==========================================

        /*
         * When no access modifier is specified, the member
         * has package-private access.
         *
         * It can be accessed by classes in the same package.
         *
         * It cannot be directly accessed from a different package.
         */

        System.out.println();
        System.out.println("3. Default / Package-Private Access");
        System.out.println("------------------------------------------");

        PackageExample packageExample = new PackageExample();

        packageExample.displayMessage();

        /*
         * This program is inside oop.day08.
         *
         * The PackageExample class is also inside oop.day08,
         * so package-private members can be accessed here.
         */


        // ==========================================
        // 4. protected ACCESS MODIFIER
        // ==========================================

        /*
         * protected members can be accessed:
         *
         * 1. Inside the same package.
         * 2. Through inheritance from a child class.
         */

        System.out.println();
        System.out.println("4. protected Access Modifier");
        System.out.println("------------------------------------------");

        ProtectedChild protectedChild = new ProtectedChild();

        protectedChild.displayProtectedData();


        // ==========================================
        // 5. public ACCESS MODIFIER
        // ==========================================

        /*
         * public members can be accessed from anywhere,
         * provided the class itself is accessible.
         */

        System.out.println();
        System.out.println("5. public Access Modifier");
        System.out.println("------------------------------------------");

        PublicExample publicExample = new PublicExample();

        System.out.println(
                "Public message = "
                        + publicExample.publicMessage
        );

        publicExample.displayPublicMessage();


        // ==========================================
        // 6. COMPARING ACCESS MODIFIERS
        // ==========================================

        /*
         * Access levels from most restricted to most accessible:
         *
         * private
         * default
         * protected
         * public
         *
         * private provides the most restricted access.
         * public provides the widest access.
         */

        System.out.println();
        System.out.println("6. Comparing Access Modifiers");
        System.out.println("------------------------------------------");

        System.out.println(
                "private   -> Same class only"
        );

        System.out.println(
                "default   -> Same package"
        );

        System.out.println(
                "protected -> Same package + subclasses"
        );

        System.out.println(
                "public    -> Accessible from anywhere"
        );


        // ==========================================
        // 7. ACCESS MODIFIERS WITH METHODS
        // ==========================================

        /*
         * Access modifiers can also be applied to methods.
         */

        System.out.println();
        System.out.println("7. Access Modifiers with Methods");
        System.out.println("------------------------------------------");

        MethodAccessExample methodExample =
                new MethodAccessExample();

        methodExample.publicMethod();

        /*
         * The following methods cannot be called directly
         * from this class because they have restricted access:
         *
         * methodExample.privateMethod();
         * methodExample.defaultMethod();
         *
         * protectedMethod() has protected access.
         */


        // ==========================================
        // 8. ACCESS MODIFIERS AND ENCAPSULATION
        // ==========================================

        /*
         * A common real-world design is:
         *
         * private fields
         * +
         * public methods
         *
         * This protects the internal state of an object while
         * providing controlled access to the outside world.
         */

        System.out.println();
        System.out.println("8. Access Modifiers and Encapsulation");
        System.out.println("------------------------------------------");

        User user = new User(
                "dip@example.com",
                "Java Developer"
        );

        user.displayUser();

        user.setRole("Backend Developer");

        System.out.println();
        System.out.println("After updating role:");

        user.displayUser();


        // ==========================================
        // 9. ACCESS MODIFIERS WITH INHERITANCE
        // ==========================================

        /*
         * A child class can access protected members inherited
         * from its parent class.
         *
         * private members are not directly accessible by the
         * child class.
         */

        System.out.println();
        System.out.println("9. Access Modifiers with Inheritance");
        System.out.println("------------------------------------------");

        ChildClass child = new ChildClass();

        child.displayParentData();


        // ==========================================
        // 10. DAY 8 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 8 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. private access modifier");
        System.out.println("2. default / package-private access");
        System.out.println("3. protected access modifier");
        System.out.println("4. public access modifier");
        System.out.println("5. Access modifiers with methods");
        System.out.println("6. Access modifiers with encapsulation");
        System.out.println("7. Access modifiers with inheritance");

        System.out.println();
        System.out.println("Day 8 completed!");
    }
}


// ==========================================
// PRIVATE EXAMPLE CLASS
// ==========================================

class PrivateExample {

    private String privateMessage =
            "This message is accessible only inside the class.";


    void displayPrivateData() {

        System.out.println(
                "Private message = " + privateMessage
        );
    }
}


// ==========================================
// ACCOUNT CLASS
// ==========================================

class Account {

    private String accountNumber;
    private String accountHolder;


    Account(
            String accountNumber,
            String accountHolder) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }


    // ==========================================
    // GETTER FOR ACCOUNT NUMBER
    // ==========================================

    public String getAccountNumber() {

        return accountNumber;
    }


    // ==========================================
    // GETTER FOR ACCOUNT HOLDER
    // ==========================================

    public String getAccountHolder() {

        return accountHolder;
    }


    // ==========================================
    // SETTER FOR ACCOUNT HOLDER
    // ==========================================

    public void setAccountHolder(String accountHolder) {

        this.accountHolder = accountHolder;
    }
}


// ==========================================
// PACKAGE-PRIVATE EXAMPLE
// ==========================================

class PackageExample {

    String message =
            "This member has package-private access.";


    void displayMessage() {

        System.out.println(
                "Package message = " + message
        );
    }
}


// ==========================================
// PROTECTED PARENT CLASS
// ==========================================

class ProtectedParent {

    protected String protectedMessage =
            "This message is protected.";


    protected void showProtectedMessage() {

        System.out.println(
                "Protected message = " + protectedMessage
        );
    }
}


// ==========================================
// PROTECTED CHILD CLASS
// ==========================================

class ProtectedChild extends ProtectedParent {

    void displayProtectedData() {

        /*
         * The child class can access the protected member
         * inherited from the parent class.
         */

        System.out.println(
                "Protected data = " + protectedMessage
        );

        showProtectedMessage();
    }
}


// ==========================================
// PUBLIC EXAMPLE CLASS
// ==========================================

class PublicExample {

    public String publicMessage =
            "This message is public.";


    public void displayPublicMessage() {

        System.out.println(
                "Public method executed successfully."
        );
    }
}


// ==========================================
// METHOD ACCESS EXAMPLE
// ==========================================

class MethodAccessExample {

    private void privateMethod() {

        System.out.println(
                "Private method."
        );
    }


    void defaultMethod() {

        System.out.println(
                "Default method."
        );
    }


    protected void protectedMethod() {

        System.out.println(
                "Protected method."
        );
    }


    public void publicMethod() {

        System.out.println(
                "Public method."
        );
    }
}


// ==========================================
// USER CLASS
// ==========================================

class User {

    private String email;
    private String role;


    User(
            String email,
            String role) {

        this.email = email;
        this.role = role;
    }


    // ==========================================
    // GETTER
    // ==========================================

    public String getEmail() {

        return email;
    }


    // ==========================================
    // GETTER
    // ==========================================

    public String getRole() {

        return role;
    }


    // ==========================================
    // SETTER
    // ==========================================

    public void setRole(String role) {

        this.role = role;
    }


    // ==========================================
    // DISPLAY METHOD
    // ==========================================

    public void displayUser() {

        System.out.println(
                "Email = " + email
        );

        System.out.println(
                "Role = " + role
        );
    }
}


// ==========================================
// PARENT CLASS FOR INHERITANCE
// ==========================================

class ParentClass {

    private String privateData =
            "Private parent data";

    protected String protectedData =
            "Protected parent data";

    public String publicData =
            "Public parent data";


    protected void displayProtectedData() {

        System.out.println(
                "Protected data = " + protectedData
        );
    }
}


// ==========================================
// CHILD CLASS
// ==========================================

class ChildClass extends ParentClass {

    void displayParentData() {

        /*
         * protected members can be directly accessed
         * by the child class.
         */

        System.out.println(
                "Protected data = " + protectedData
        );

        /*
         * public members can also be accessed.
         */

        System.out.println(
                "Public data = " + publicData
        );

        /*
         * The following would cause a compilation error:
         *
         * System.out.println(privateData);
         *
         * because privateData belongs only to ParentClass.
         */

        displayProtectedData();
    }
}